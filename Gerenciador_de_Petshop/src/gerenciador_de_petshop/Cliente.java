/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador_de_petshop;

/**
 *
 * @author 828461
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String email;
    private String CPF;
    private String cel;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String email, String CPF, String cel) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setEmail(email);
        this.setCPF(CPF);
        this.setCel(cel);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(!endereco.isEmpty()){
            this.endereco = endereco;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.isEmpty()){
            this.email = email;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        if(!CPF.isEmpty()){
            this.CPF = CPF;
        }
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        if(!cel.isEmpty()){
            this.cel = cel;
        }
    }

    @Override
    public String toString() {
        return "Cliente:\t" + "nome=" + getNome() + ", endereco=" + getEndereco() + ", email=" + getEmail() + ", CPF=" + getCPF() + ", cel=" + getCel();
    }
    
}
