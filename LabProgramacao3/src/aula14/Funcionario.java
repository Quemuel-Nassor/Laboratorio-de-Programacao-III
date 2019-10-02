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
public class Funcionario {

    protected String nome;
    protected double salario;

    
    public Funcionario(){
        this("",0);
    }
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + getNome() + ",\nSalario: " + String.format("%.2f",getSalario());
    }
}
