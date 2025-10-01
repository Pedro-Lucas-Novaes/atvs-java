package atvT;

import java.util.Scanner;


class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String codigo;

    
    public Produto(String nome, double preco, int quantidade, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    
    public void exibirDetalhes() {
        System.out.println("\n=== DETALHES DO PRODUTO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Em Estoque: " + quantidade + " unidades");
        System.out.println("Código: " + codigo);
    }
}


public class AtvT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[3];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("\n=== Cadastro do Produto " + (i + 1) + " ===");

            System.out.print("Digite o nome do Produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do Produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Digite o código do Produto: ");
            String codigo = scanner.nextLine();

            
            produtos[i] = new Produto(nome, preco, quantidade, codigo);
        }

        
        System.out.println("\n======= LISTA DE PRODUTOS CADASTRADOS =======");
        for (Produto p : produtos) {
            p.exibirDetalhes();
        }

        scanner.close();
    }
}
