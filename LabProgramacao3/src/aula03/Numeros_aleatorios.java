/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Quemuel
 */
public class Numeros_aleatorios {
    
    public static void main(String args[]){
        
        double n1 = Math.random()*100;
        int n2 = (int)n1;
        
        System.out.println("n1 = "+ n1);
        System.out.println(String.format("n1 = %.2f", n1));
        System.out.println("n2 = "+ n2);
    }
}
