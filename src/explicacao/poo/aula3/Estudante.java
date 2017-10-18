/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explicacao.poo.aula3;

/**
 *
 * @author José Seie
 */
public class Estudante {
    //modificadores de acesso;
    //public
    //private
    //protected
    
    
   private String nomeCompleto;
   private String nome;
   private String apelido;
   private int idade;

   
   //O que sao metodos - Representam uma accao de ccada objecto
   //Quais os tipos- 2 tipos; metodos com retorno e sem retorno
   // sem retorno- 
   //Criacao de metodos
   
   
   
    public Estudante(String nomecompleto, String nome, String apelido, int idade) {
        this.nomeCompleto = nomecompleto;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }

    public String getNomecompleto() {
        return nomeCompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomeCompleto = nomecompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
         
   
    
}
