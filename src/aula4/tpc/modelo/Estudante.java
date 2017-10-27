
package aula4.tpc.modelo;

/**
 *
 * @author José Seie
 */
public class Estudante {
    
private String nome;     
private int nuit;     
private int idade;   

    public Estudante(String nome, int nuit, int idade) {
        this.nome = nome;
        this.nuit = nuit;
        this.idade = idade;
    }

    public Estudante() {
    }

    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", nuit=" + nuit + ", idade=" + idade + '}';
    }


    
    
 
    
}
