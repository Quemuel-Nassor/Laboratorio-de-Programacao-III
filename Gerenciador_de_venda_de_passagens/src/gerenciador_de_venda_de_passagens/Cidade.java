
package gerenciador_de_venda_de_passagens;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Cidade {
    
    //atributos de Cidade
    private String cidade;
    private String estado;
    
    //métodos da classe Cidade
    
    //construtor sobrecarregado
    public Cidade(String cidade, String estado){
        setCidade(cidade);
        setEstado(estado);
    }

    public void setCidade(String cidade) {
        if(cidade.length() <= 30 && cidade.length() != 0){
            this.cidade = cidade;
        }else if(cidade.length() > 30 || cidade.length() == 0){
            setCidade(JOptionPane.showInputDialog(null,"O nome da cidade é inválido, tente novamente!"));
        }
    }

    public void setEstado(String estado) {
        if(estado.length() <=3 && cidade.length() != 0){
            this.estado = estado;
        }else if(estado.length() > 3 || cidade.length() == 0){
            setEstado(JOptionPane.showInputDialog(null,"O estado informado é inválido, tente novamente!"));
        }
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "\nCidade: " + getCidade() + "    Estado: " + getEstado() + "\n\n";
    }
    
    
    
}
