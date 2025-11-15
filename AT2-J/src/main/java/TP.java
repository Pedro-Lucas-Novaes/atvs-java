
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ender
 */
public class TP {
    
     private ArrayList<Double> TP = new ArrayList<>();
     private String nome;
     
     
    public TP(String nome){
        this.nome = nome;
    }
     
    public ArrayList<Double> Media(){
        for(int i = 1; i <= 3; i++){
            String input = JOptionPane.showInputDialog(null, "insira a TP" + i + ":");
            
        if(input == null){
            JOptionPane.showMessageDialog(null, "Você preferiu sair. Operação cancelada.");
            System.exit(0);
        }
            
            double nota = Double.parseDouble(input);
            TP.add(nota);
        }
        
        
        double soma = 0;
        for (double tp : TP) {
            soma += tp;
        }
        double media = soma / TP.size();
    
        
        
       String mensagem = "Aluno:\n" + nome + "\n";
       
       
        
         mensagem += "\nNotas inseridas:\n";
        for(int i = 0; i < TP.size(); i++){
            mensagem += "TP" + (i + 1) + ": " + TP.get(i) + "\n";
        }
        
        mensagem += "\nMédia final: " + String.format("%.2f", media);
        
        JOptionPane.showMessageDialog(null, mensagem);
        
        
        if(media < 6){
            JOptionPane.showMessageDialog(null, "Reprovado");
        }else if(media >= 6 && media <= 9){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "Ótimo Aproveitamento");
        }
        
        return TP;
    }
}
