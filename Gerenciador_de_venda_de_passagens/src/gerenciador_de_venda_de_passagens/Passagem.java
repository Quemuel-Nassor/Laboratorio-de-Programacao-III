/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador_de_venda_de_passagens;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Passagem { 
    
    //atributos de Passagem
    public int codigo_passagem;
    protected Passageiro passageiro;
    protected Cidade cidade_origem;
    protected Cidade cidade_destino;
    public int poltrona;
    protected String data;
    
    public Passagem(int count, int poltrona, Onibus veiculo,String data){
        this.codigo_passagem = count;
        setPoltrona(poltrona,veiculo);
        setData(data);
    }
    
    //construtor sobrecarregado para preencher a poltrona
    public Passagem(int count, Passageiro passageiro, Cidade origem,int poltrona, Cidade destino, Onibus veiculo){
        setCidade_destino(destino);
        setCidade_origem(origem);
        setPassageiro(passageiro);
        this.codigo_passagem = count;
        setPoltrona(poltrona, veiculo);
    }

    public int getCodigo_passagem() {
        return codigo_passagem;
    }

    public void setCodigo_passagem(int codigo_passagem) {
        this.codigo_passagem = codigo_passagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(data.length() != 0 ) {
            this.data = data;
        } else {
            setData(JOptionPane.showInputDialog(null,"A data não pode estar vazia, por favor tente novamente! "));
        }
    }
    
    
    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Cidade getCidade_origem() {
        return cidade_origem;
    }

    public void setCidade_origem(Cidade cidade_origem) {
        this.cidade_origem = cidade_origem;
    }

    public Cidade getCidade_destino() {
        return cidade_destino;
    }

    public void setCidade_destino(Cidade cidade_destino) {
        this.cidade_destino = cidade_destino;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona( int poltrona, Onibus veiculo) {
        int temp = veiculo.setPoltrona(poltrona,true,veiculo);
        if(temp == 0){
            this.poltrona = poltrona;
        }else{
            while(temp == 1){
               this.poltrona = (Integer.parseInt(JOptionPane.showInputDialog(null,"Esta poltrona está ocupada por favor selecione outra: ")));
               temp = veiculo.setPoltrona(this.poltrona,true,veiculo);
            }
        }
    }
    
    @Override
    public String toString() {
        return "Codigo :" + codigo_passagem + "             Poltrona: " + getPoltrona() + "\nData da viagem: " + getData() + "\n\nPassageiro: " + getPassageiro() + "Origem: " + getCidade_origem() + "Destino: "+ getCidade_destino() + "\n\n\n";
    }
}
