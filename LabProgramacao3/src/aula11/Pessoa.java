/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Quemuel
 */
public class Pessoa {
    
    //atributos
    private String nome;
    private String endereco;
    
    //construtor padrão
    public Pessoa(){
        this("","");
    }

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nEndereco: " + getEndereco() + "\n";
    }
    
    
}
