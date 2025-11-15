/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author ender
 */
public class aluno {
    
    String nome;
    
    
     public aluno() {

        while (true) {

            nome = JOptionPane.showInputDialog(null, "Insira o nome completo do aluno:");

            
            if (nome == null) {
                JOptionPane.showMessageDialog(null, "Você preferiu cancelar a ação. Encerrando.");
                System.exit(0);
            }

            
            if (nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O nome não pode ficar em branco!");
                continue;
            }

            
            break;
        }
    }
}
