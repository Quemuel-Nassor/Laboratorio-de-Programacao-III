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
public class Brinquedo {
    
    //atributos
    private String nome;
    private String faixaEtaria;
    private double preco;
            
    //métodos construtores
    public Brinquedo(){
        this.nome = "";
        this.preco = 0;
        this.faixaEtaria = "";
    }

    public Brinquedo(String nome) {
        this.nome = nome;
    }

    public Brinquedo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void Mostrar(Brinquedo objeto){
        
        System.out.println(objeto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        
        if(faixaEtaria.equals("acima de 10") || faixaEtaria.equals("6 a 10") || faixaEtaria.equals("3 a 5") || faixaEtaria.equals("0 a 2")){
            this.faixaEtaria = faixaEtaria;
        }else{
            System.out.println("O valor informado não é válido");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    @Override
    public String toString() {
        return "Brinquedo{" + "nome=" + nome + ", faixaEtaria=" + faixaEtaria + ", preco=" + preco + '}';
    }
}
