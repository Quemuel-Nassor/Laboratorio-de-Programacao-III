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
public class Atendimento {
    private String cliente;
    private String data;
    private String categoria;
    private double valor;

    public Atendimento() {
    }

    public Atendimento(String cliente, String data, String categoria, double valor) {
        this.setCliente(cliente);
        this.setData(data);
        this.setCategoria(categoria);
        this.setValor(valor);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if(!cliente.isEmpty()){
            this.cliente = cliente;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.isEmpty()){
            this.data = data;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(!categoria.isEmpty()){
            this.categoria = categoria;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor != 0){
            this.valor = valor;
        }
        
    }

}
