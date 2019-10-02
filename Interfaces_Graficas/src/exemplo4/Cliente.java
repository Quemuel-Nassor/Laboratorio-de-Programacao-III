/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo4;

import java.io.Serializable;

/**
 *
 * @author 828461
 */
public class Cliente implements Serializable{
    private String id;
    private String nome;
    private String sexo;
    private String escolaridade;
    private String profissao;
    private String telefone;
    private String telefonecelular;
    private String email;

    public Cliente() {
    }

    public Cliente(String id, String nome, String sexo, String escolaridade, String profissao, String telefone, String telefonecelular, String email) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.telefone = telefone;
        this.telefonecelular = telefonecelular;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefonecelular() {
        return telefonecelular;
    }

    public void setTelefonecelular(String telefonecelular) {
        this.telefonecelular = telefonecelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
