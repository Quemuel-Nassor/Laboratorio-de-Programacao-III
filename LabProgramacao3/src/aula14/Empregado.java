/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Quemuel
 */
public interface Empregado {
    
    //constantes
    public final double GRATIFICACAO = 500.00;
    public final double COMISSAO = 0.02;
    
    //métodos abstratos
    public abstract String getNome();
    public abstract double getSalario();
    
    
    
}
