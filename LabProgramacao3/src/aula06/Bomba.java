/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Quemuel
 */
public class Bomba {
    
    public boolean status;
    
    
    public void ligar(int segundos){
        System.out.println("Bomba ligada");
        for (int i = 1; i <= segundos; i++) {
            try{
                Thread.sleep(1000);//aguarda 1 segundo
            }catch (Exception e){
                
            }
            System.out.println("A bomba será desligada em : " +(segundos-i)+ " segundos");   
        }
        desligar();
        System.out.println("Bomba desligada");
    }
    
    public void desligar(){
        this.status = false;
    }
}
