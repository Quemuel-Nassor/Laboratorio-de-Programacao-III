/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Calculo_resistencias {
    
    public static void main (String args[]){
        
        int i;
        double r[] = new double[4];
        double req = 0, rmaior = 0, rmenor = 0;
        
        
        for(i=0;i<=3;i++){
            
            r[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor da "+ (i+1) +"ª resistência\n"));
            
            if(i == 0){
                
                rmenor = r[i];
                
            }
            
            if(r[i] < rmenor){

                rmenor = r[i];

            }
            if(rmaior < r[i]){
                
                rmaior = r[i];
                  
            }  
            
            
            req += r[i];
            
        }
        
        JOptionPane.showMessageDialog(null,"O valor da resistência equivalente é: "+ req +"\nA resistência de maior valor é: "+ rmaior +"\nA resistência de menor valor é: "+ rmenor);
        
        
    }
    
}
