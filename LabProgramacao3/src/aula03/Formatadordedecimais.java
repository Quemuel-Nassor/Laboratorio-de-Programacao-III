/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.text.DecimalFormat;

/**
 *
 * @author Quemuel
 */
public class Formatadordedecimais {
    
    public static void main(String args[]){
     
        double num = Math.random()*10000;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        System.out.println(df.format(num));
        System.out.println("num = "+ num);
        
    }
}
