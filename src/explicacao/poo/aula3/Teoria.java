
package explicacao.poo.aula3;

/**
 * TPC desta aula: Criar nas classes dadas como TPC pelo @Claudio Sumburane:
 * - 6 metodos:
 * - 3 metodos diferentes, sem retorno e com numero de parametros diferentes.
 * - 3 metodos diferentes, com retorno e com numero de parametros diferentes.
 * 
 * @author José Seie
 * @author Marcia
 * @author Laimaze
 * @author Vania
 * 
 * @version 1.0
 * 
 */
public class Teoria {

    
    public static void main(String[] args) {
       
        Metodos m = new Metodos();
        
//        m.alo();
        m.teste("vania", 10);
        
        m.teste("marcia", 12);
                
                
        //Chamamento de metodos com retorno;
        
        int idade = m.calcularIdade(2007);
        
        System.out.println("Idade da pesssoa: "+idade);
                
    }
    
}
