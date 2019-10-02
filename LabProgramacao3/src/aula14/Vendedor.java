/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Quemuel
 */
public class Vendedor extends Funcionario implements Empregado{
    
   private double totalvendas;
   
   public Vendedor(){
       this("",0,0);
   }
    
   public Vendedor(String nome, double salario, double totalvendas){
       super(nome,salario);
       this.totalvendas = totalvendas;
   }
   
   @Override
   public double getSalario(){
       return super.salario + (super.salario*COMISSAO);
   }
   
   @Override
   public String getNome(){
       return super.nome + " (VENDEDOR)";
   }
}
