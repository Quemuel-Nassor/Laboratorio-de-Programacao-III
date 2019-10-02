/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author 828461
 */
public class Funcionario {
    
    private String nome;
    private String funcao;
    private double salario;
    
    //construtor padrão
    public Funcionario(){
        
        System.out.println("Construtor padrão");
        this.nome = "NAO DEFINIDO";
        this.funcao = "NAO DEFINIDO";
        this.salario = 0;
    }
    
    //construtor sobrecarregado
    public Funcionario(String nome){
            
        this.nome = nome;
        this.funcao = "";
        this.salario = 0;
        
    }
        
     public Funcionario(String nome, String funcao){
            
        this.nome = nome;
        this.funcao = funcao;
        this.salario = 0;
        
    }
     
     public Funcionario(String nome, String funcao, double salario){
            
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
        
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", funcao=" + funcao + ", salario=" + salario + '}';
    }
    
    
}
