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
public class Matriz {
    
    public static void main(String[] args) {
    
        int matriz[][] = new int[5][4];
        
        //preenchendo a matriz com valores randômicos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            
                matriz[i][j] = (int)(Math.random()*100);
            
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            
                System.out.print(matriz[i][j]+"\t");
                
            }
            System.out.println("\n");
            
        }
    }
}
