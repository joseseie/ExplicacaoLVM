/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula4.modelo;

/**
 *
 * @author SUMBURANE CLAUD
 */
public class Funcionario {
    
  private String nome;
  private String nuit;
  private double salario;
  private String cor;
  
  
  /**
   * Metodo calcular salario anual....
   * Precisamos do salario mensal (Paramentro)
   * @return 
   */
  
  protected double calcularSalAnual(double salMensal){
      
     double salAnual = salMensal*12;
      
     return salAnual; 
      
  }
  
/**
 * Metodo com retorno
 * Retorna o nome
 * @return 
 */  
  public String getNome(){
      return this.nome;
  }
  
 
  /**
   * Metodo sem retorno
   * Inserir nome
   */
  public void setNome(String nome){
      this.nome = nome;
  }
  
  
  
  
  
  /**
   * Metodo que mostra a cor 
   * 
   * 
   */
  
  public String corBanheira(){
      return this.cor;
  }
  
  /**
   * 
   * Inserir a cor
   * 
   */
  public void setCor(String cor){
      
      this.cor=cor;
      
  }
  
  
  /**
   * Calcular a area do retangulo
 
   */
  
  
  
  
  
  
  /**
   * Faca um metodo que imprime a mensagem ola <Nome> 
   * 
   * <Nome> deve ser recebido por parametro
   * 
   * REcebe por parametro o @nome
   * 
   * Imprime uma mensagem
   * 
   * Concatenacao ou juncao de dois textos (strings) +
   * 
   */
  
  public void saudacao(String nome){
  
      System.out.println("Ola " + nome);
      
  }
  
  
  
  
  
  
  
  
  
  }
