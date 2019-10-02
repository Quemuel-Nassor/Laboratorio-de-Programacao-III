/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Quemuel
 */
public class Vetor {
   
    //psvm + tab
    public static void main(String[] args) {
     
        double vet[] = new double[10];
        
        //fori + tab
        for (int i = 0; i < vet.length; i++) {
           
            vet[i] = Math.random()*1000;
            
        }
        
        //sout + tab
        System.out.println("Tamanho"+ vet.length);
        
        for(double valor: vet){
            
            System.out.println(valor);
            
        }
    }
}
