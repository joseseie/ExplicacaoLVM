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
public class Gerente {
    
  String nome;
  String niut;
  double salario;
  int senha;
  int numeroDeFuncionariosGerenciados;
    
  
  public boolean autentica(int senha) {
    if (this.senha == senha) {
      System.out.println("Acesso Permitido!");
      return true;
    } else {
      System.out.println("Acesso Negado!");
      return false;
    }
  }
  
  // Métodos
    
}
