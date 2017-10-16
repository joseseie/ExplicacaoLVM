package explicacao.poo.aula3;

/**
 *
 * @author José Seie
 */
public class Metodos {
    
    //metodos sem retorno- sem/com parametros
    //metodos sem parametros
    //modificador do metodo
    /*
    Exercicio: metodo 1. sem modificador: Ola.
    //Metodo 2. com modificador: alo.
    */
    
    
    private int teste;
    
    // void=sem retorno
    public void teste(String nome,int idade){
        System.out.println("Nome recebido: "+nome+", idade recebida: "+idade);
    }
    
    void ola(){
        System.out.println("Ola.");
    }
    
    public void alo(){
        System.out.println("Alo.");
    }
    
    
    //metodos com retorno
    
    public int calcularIdade(int anoDeNascimento) {
        
        return 2017 - anoDeNascimento;
        
    }
    
    
    
    
}
