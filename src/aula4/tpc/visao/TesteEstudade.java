
package aula4.tpc.visao;

import aula4.tpc.modelo.Estudante;
import javax.swing.JOptionPane;

/**
 *
 * @author José Seie
 */
public class TesteEstudade {
    
        
    public static void main(String[] args) {
        
        Estudante e = new Estudante ();
        
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String idadeStr = JOptionPane.showInputDialog("Digite a idade");
        String nuitStr = JOptionPane.showInputDialog("Digite o nuit");
        
        int idade = Integer.parseInt(idadeStr);
        int nuit=Integer.parseInt(nuitStr);
        
        e.setNome(nome);
        e.setIdade(idade);
        e.setNuit(nuit);
        
        JOptionPane.showMessageDialog(null, e.toString());
        
        
        
    }
    
    public static void teste(){
        
    }
    
    
    
    
    
    
    
}

