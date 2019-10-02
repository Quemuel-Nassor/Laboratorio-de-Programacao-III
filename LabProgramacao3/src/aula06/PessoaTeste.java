/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa individuo1 = new Pessoa();
        Pessoa individuo2 = new Pessoa();
        Pessoa individuo3 = new Pessoa();
        Pessoa individuo4 = new Pessoa();
        
       individuo1.altura = 1.56;
       individuo1.nome = "João";
       individuo1.peso = 93.2;
       
       individuo2.altura = 1.56;
       individuo2.nome = "Elza";
       individuo2.peso = 122.45;
       
       individuo3.altura = 1.56;
       individuo3.nome = "Nick";
       individuo3.peso = 83.64;

       individuo4.altura = 1.56;
       individuo4.nome = "Sérgio";
       individuo4.peso = 60;

       JOptionPane.showMessageDialog(null,individuo1.nome +"\n"+ individuo1.toString());
       JOptionPane.showMessageDialog(null,individuo2.nome +"\n"+ individuo2.toString());
       JOptionPane.showMessageDialog(null,individuo3.nome +"\n"+ individuo3.toString());
       JOptionPane.showMessageDialog(null,individuo4.nome +"\n"+ individuo4.toString());
       
    }
}
