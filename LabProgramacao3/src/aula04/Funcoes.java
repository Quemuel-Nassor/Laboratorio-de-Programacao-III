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
public class Funcoes {
    
    public static void main(String[] args) {
     
        double vet[] = new double[10];
        gerarNumeros(vet);
        System.out.println("Soma "+ somarVetor(vet));
        exibeVetor(vet);
    }
    
    //gerar número aleatórios
    public static void gerarNumeros(double vet[]){
        
        for (int i = 0; i < vet.length; i++) {
            
            vet[i] = Math.random()*1000;
            
        }
    }
    
    //método(função) para somar os valores do vetor
    public static double somarVetor(double vet[]){
        
        double soma = 0;
        
        for (int i = 0; i < vet.length; i++) {
            
            soma += vet[i];
            
        }
        
        return soma;
    
    }
    
    public static void exibeVetor(double v[]){
        
        for (int i = 0; i < v.length; i++) {
           
            System.out.println("vetor[" + i +"] = " + v[i]);
          
        }
    }
}
