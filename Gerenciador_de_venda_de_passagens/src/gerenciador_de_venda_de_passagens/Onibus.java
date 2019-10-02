
package gerenciador_de_venda_de_passagens;

/**
 *
 * @author Quemuel
 */
public class Onibus {
    
    //definição do número máximo de poltronas
    public final int MAX_POLTRONAS = 45;
    
    //atributos de Onibus
    protected boolean poltrona[] = new boolean[MAX_POLTRONAS];
    
    //metodos da classe onibus
    
    //construtor sobrecarregado
    public Onibus(){ 
        for (int i = 0; i < MAX_POLTRONAS; i++) {
            poltrona[i] = false;
        }
    }

    public int setPoltrona(int i, boolean poltrona, Onibus veiculo) {
        if(i <= MAX_POLTRONAS && i > 0 ){
            if(veiculo.poltrona[i] == false){
                this.poltrona[i] = poltrona;
            }else{
                return 1;
            }
        }
        return 0;
    }
   
    public String getPoltrona(int i) {
        if(poltrona[i] == true){
            return "Ocupada";
        }else if(poltrona[i] == false){
            return "Vazia";
        }
        return null;
    }
    
    @Override
    public String toString(){
        for (int i = 1; i < MAX_POLTRONAS; i++) {
            return "\nPoltrona: " + i;
        }
        return null;
    }

}
