/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova_final_lab_3;

/**
 *
 * @author 828461
 */
public class Pedido {
    private String cliente;
    private String vendedor;
    private String produto;
    private String qtd;
    private String valor;
    
    

    public Pedido() {
    }

    public Pedido(String cliente, String vendedor, String produto, String qtd, String valor) {
        this.setCliente(cliente);
        this.setVendedor(vendedor);
        this.setProduto(produto);
        this.setQtd(qtd);
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

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        if(!vendedor.isEmpty()){
            this.vendedor = vendedor;
        }
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        if(!produto.isEmpty()){
            this.produto = produto;
        }
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        if(!qtd.isEmpty()){
            this.qtd = qtd;
        }
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        if(!valor.isEmpty()){
            this.valor = valor;
        }
    }

       
}
