
package gerenciador_de_venda_de_passagens;

import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Poltrona {
    
    //atributos de Poltrona
    private int numero;
    private boolean condicao;
    
    //métodos da classe Poltrona
   
    //construtor sobrecarregado
    public Poltrona(int numero, boolean condicao){
        setNumero(numero);
        setCondicao(condicao);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 45 && numero > 0){
            this.numero = numero;
        }else if(numero > 45 || numero < 0){
            setNumero(Integer.parseInt(JOptionPane.showInputDialog(null,"A poltrona informada não existe, tente novamente")));
        }
    }

    public boolean isCondicao() {
        return condicao;
    }

    public void setCondicao(boolean condicao) {
        if(condicao == true || condicao == false){
            this.condicao = condicao;
        }else if(condicao != true || condicao != false){
            JOptionPane.showMessageDialog(null,"Poltrona só pode manter dois estados: vazia ou ocupada!");
        }
    }

    @Override
    public String toString() {
        return "\nNumero: " + getNumero() + "    Condicao: " + isCondicao() + "\n";
    }
}
