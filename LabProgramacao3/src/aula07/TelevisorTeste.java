/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author Quemuel
 */
public class TelevisorTeste {
    
    public static void main(String[] args) {
        
        Televisor tv = new Televisor(); 
        
        tv.Canal(123);
        tv.setVolume(45);
        System.out.println(tv);
        
        tv.aumentarVolume();
        tv.diminuirVolume();
        System.out.println(tv);
        
        for (int i = 0; i < 20; i++) {
            
            tv.diminuirVolume();
            
        }
        
        System.out.println(tv);
        
        tv.trocarCanal(999);
        System.out.println(tv);
        
        tv.setVolume(10000);
        System.out.println();
    }
}
