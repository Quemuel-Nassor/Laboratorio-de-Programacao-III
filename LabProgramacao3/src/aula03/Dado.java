/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Dado {
    
    public static void main(String args[]){
        
        double vlu = 0;
        int total = 0;
        String vlr = "";
        
        for(int i = 0;i < 3;i++){
            
             vlu = (double)Math.random()*6+1;
             //System.out.println(vlu-1);
             vlr += "Rodada " + (i+1) + " valor = "+ (int)vlu + "\n";
             total += (int)vlu;
        }
        vlr += "Total = "+ total;
        JOptionPane.showMessageDialog(null,vlr);
           
    }
}
