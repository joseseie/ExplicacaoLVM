
package explicacao.poo.aula3;

/**
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
