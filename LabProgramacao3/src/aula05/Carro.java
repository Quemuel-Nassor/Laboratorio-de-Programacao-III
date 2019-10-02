/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Quemuel
 */
public class Carro {
   
    //Atributos da classe
    public String fabricante;
    public String modelo;
    public int anofabricacao;
    public int velocidade;
    
    //Métodos da classe
    public void ligar(){
        System.out.println(modelo + " Ligado");
    }
    
    public void desligar(){
        System.out.println(modelo + " Desligado");
    }
    
    //Retornar dados dos atributos no formato String
    @Override
    public String toString(){
        return
                "Fabricante: " + fabricante +
                "\nModelo: " + modelo +
                "\nAno de fabricação: " + anofabricacao +
                "\nVelocidade: " + velocidade +  "\n";
                
    }
}
