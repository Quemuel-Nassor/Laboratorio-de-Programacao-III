
package gerenciador_de_venda_de_passagens;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Passageiro {
    
    //atributos de Passageiro
    private String nome;
    private String CPF;
    
    //métodos da classe Passageiro

    //construtor sobrecarregado com validação de entrada
    public Passageiro(String nome, String CPF) {
        setNome(nome);
        setCPF(CPF);
    }

    public void setNome(String nome) {
        if(nome.length() <= 50 && nome.length() > 0){
            this.nome = nome;
        }else if(nome.length() > 50){
            setNome(JOptionPane.showInputDialog(null,"O nome digitado é muito longo, tente novamente!"));
        }else if(nome.length() == 0){
            setCPF(JOptionPane.showInputDialog(null,"O nome não pode estar vazio, tente novamente!"));                
        }
    }

    public void setCPF(String CPF) {
        if(CPF.length() == 14 && CPF.length() != 0){
            this.CPF = CPF;
        }else if(nome.length() != 14 || nome.length() != 0){
            setCPF(JOptionPane.showInputDialog(null,"O CPF digitado não é válido, tente novamente!"));
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "    CPF: " + getCPF()+"\n\n";
    }
}
