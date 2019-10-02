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
public class Televisor {
    
    private int volume;
    private int canal;
    
    public void setVolume(int volume){
        
        if(volume <= 100 && volume >=0){

            this.volume = volume;
            
        }else{
            
            System.out.println("O valor informado não é válido.");
            
        }
    }
    
    public void Canal(int canal){
        
        if(1 <= canal && canal <= 500){
            
            this.canal = canal;
            
        }else{
            
            System.out.println("O canal informado não é válido.");
            
        }
    }
    
    public int getCanal(){
        
        return this.canal;
        
    } 
    
    public int getVolume(){
        
        return this.volume;
        
    }
    
    public void aumentarVolume(){
        
        setVolume(getVolume()+1);
        
    }
    
    public void diminuirVolume(){
        
        setVolume(getVolume()-1);
        
    }
    
    public void trocarCanal(int canal){
        
        Canal(canal);
        
    }
    
    @Override
    public String toString(){
        
        return "Canal: " + getCanal() + "\nVolume: " + getVolume() + "\n";
    }
}
