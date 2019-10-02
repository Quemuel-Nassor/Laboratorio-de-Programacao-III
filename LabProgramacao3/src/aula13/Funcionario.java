/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Quemuel
 */
public abstract class Funcionario {
    
    protected String nome;
    protected double salario;
    
    public Funcionario(){
        this("",0);
    }
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    //métodos abstratos
    public abstract String getNome();
    public abstract double getSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + ",\nSalario: " + String.format("%.2f",getSalario());
    }
}
