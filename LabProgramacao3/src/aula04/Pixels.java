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
public class Pixels {
    
    public static void main(String[] args) {
        
        double janela[][] = new double[10][10];
        String tela = "";
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                janela[i][j] = Math.round(Math.random()*255); 
                tela += janela[i][j]+"\t";

            }
            tela += "\n\n";
        }
       System.out.print(tela);
    }
}
