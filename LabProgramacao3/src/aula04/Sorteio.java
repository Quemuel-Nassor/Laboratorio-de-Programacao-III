/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Sorteio {
    
    public static void main(String[] args) {
        
        String itens[] = {"Relógio","Bola","Camiseta","Caneta","Chaveiro","Caneca","Faqueiro","Livro de receitas","100,00 R$","Vale-compras"};
     
        int controle = 0,i;
                
        while(controle != 1){
            
            i = (int)(Math.random()*9);
            JOptionPane.showMessageDialog(null,"O item sorteado foi: "+itens[i]);
            controle = JOptionPane.showConfirmDialog(null,"Deseja sortear novamente? ");
            
        }
    }
}
