/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class CarroTest {
    
    public static void main(String[] args) {
    
        //instanciar(criar) objetos
        Carro fusca = new Carro();
        fusca.fabricante = "VW";
        fusca.modelo = "Fusca";
        fusca.anofabricacao = 1970;
        fusca.velocidade = 85;
        
        Carro corsa = new Carro();
        corsa.fabricante = "GM";
        corsa.modelo = "Corsa Sedan";
        corsa.anofabricacao = 2002;
        corsa.velocidade = 98;
        
        fusca.ligar();
        corsa.ligar();
        fusca.desligar();
        corsa.desligar();
        
        JOptionPane.showMessageDialog(null,fusca.toString());
        JOptionPane.showMessageDialog(null,corsa.toString());
    }
}
