/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Quemuel
 */
public class Pessoa {
    
    //atributos da classe pessoa
    public String nome;
    public double peso;
    public double altura;
    
    //métodos da classe pessoa
    public double imc(){
        return this.peso/(Math.pow(altura,2));       
    }
    
    //this.variavel -> referencia um atributo de um 
     
    @Override 
    public String toString(){
      return String.format("Peso: %.2f\nAltura: %.2f\nIMC: %.2f",this.peso,this.altura,imc());  
    }
}
