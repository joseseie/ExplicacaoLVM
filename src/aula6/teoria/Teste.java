package aula6.teoria;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.Scanner;

/**
 *
 * @author SUMBURANE CLAUD
 */
public class Teste {

    public static void main(String[] args) throws IOException {
    
        
        // Criamos um ficheiro
        FileWriter ficTeste = new FileWriter("D:\\Arquivos\\testeAgora.txt");

        
        // Da um nome a operacao (Escrever)
        
        PrintWriter gravarArq = new PrintWriter(ficTeste);
       
                
      for (int i=1; i<=10; i++) {
        gravarArq.printf("| %2d X %d = %2d |%n", i, 9, (i*9));
        
      }

        

        ficTeste.close();
 

        System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n");

    }

}
