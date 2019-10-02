package gerenciador_de_venda_de_passagens;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Quemuel
 */
public class Gerenciador_de_venda_de_passagens {
    public static void main(String[] args) {
       
        //variáveis de controle e listas de cadastro
        String u = "";
        int codigo_passagem = 1110, i = 0, verificador = 0, busca = 0;
        ArrayList<Passageiro>passageiros = new ArrayList();
        ArrayList<Cidade>cidades = new ArrayList();
        ArrayList<Passagem>passagens = new ArrayList();
        
        Onibus executivo = new Onibus();
        
        //Loop do menu principal
        while(!u.equals("0")){
            
            //menu de opções
            i = 0;
            verificador = 0;
            u = JOptionPane.showInputDialog(null,"Gerenciador de Vendas\n\n"+
                                "Selecione uma opção:\n" +
                                "1 Cadastrar Passageiro\n" +
                                "2 Cadastrar Cidade\n" +
                                "3 Vender Passagem\n" +
                                "4 Cancelar Passagem\n" +
                                "5 Listar Passageiros\n" +
                                "6 Listar Cidades\n" +
                                "7 Listar Passagens Vendidas\n" +
                                "8 Sobre\n" +
                                "0 Sair");
            
            switch(u){
                //cadastrar passageiro
                case "1":{
                    passageiros.add(new Passageiro(JOptionPane.showInputDialog(null,"Informe o nome completo do passageiro: "),JOptionPane.showInputDialog(null,"Informe o CPF do passageiro: ")));
                    break;
                }
                //cadastrar cidades
                case "2":{
                    cidades.add(new Cidade(JOptionPane.showInputDialog(null,"Informe o nome da cidade: "),JOptionPane.showInputDialog(null,"Informe o estado ao qual a cidade pertence: ")));
                    break;
                }
                //vender passagem
                case "3":{
                    Passagem nova = new Passagem(codigo_passagem,Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma poltrona entre 0 e 45: ")),executivo,JOptionPane.showInputDialog(null,"Informa a data da viagem no formato dd/mm/aa: "));
                    busca = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o índice da cidade de origem: "));
                    for(Cidade local : cidades) {
                            if(i == busca){
                                nova.setCidade_origem(local);
                                verificador += 1;
                                break;
                            }
                            i++;
                    }
                    i = 0;
                    
                    busca = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o índice da cidade de destino: "));
                    for(Cidade local : cidades) {
                            if(i == busca){
                                nova.setCidade_destino(local);
                                verificador += 1;
                                break;
                            }
                            i++;
                    }
                    i = 0;
                    
                    busca = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o índice do cadastro do passageiro: "));
                    for(Passageiro individuo : passageiros) {
                            if(i == busca){
                                nova.setPassageiro(individuo);
                                verificador += 1;
                                break;
                            }
                            i++;
                    }
                   
                    if(verificador == 3){
                        passagens.add(nova);
                    }
                    codigo_passagem++;
                    break;
                }
                //cancelar passagem
                case "4":{
                    int remover  = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o código da passagem que precisa ser removida: "));
                    for(Passagem cancelar : passagens) {
                        if(cancelar.codigo_passagem == remover){
                            executivo.poltrona[cancelar.poltrona] = false;
                            passagens.remove(cancelar);
                        }
                    }
                    break;
                }
                //listar passageiros cadastrados
                case "5":{
                    String lista_passageiro = "";
                    for(Passageiro individuo : passageiros) {
                        lista_passageiro += "Indice: " + i;
                        lista_passageiro += individuo;
                        i++;
                    }
                    JOptionPane.showMessageDialog(null,lista_passageiro);
                    break;
                }
                //listar cidades cadastradas
                case "6":{
                    String lista_cidade = "";
                    for(Cidade local : cidades){
                        lista_cidade += "Indice: " + i;
                        lista_cidade += local;
                        i++; 
                    }
                    JOptionPane.showMessageDialog(null,lista_cidade);
                    break;
                }
                //listar passagens vendidas
                case "7":{
                    String lista_passagem = "";
                    for(Passagem bilhete : passagens) {
                        //System.out.println(bilhete);
                        lista_passagem += bilhete;
                    }
                    JOptionPane.showMessageDialog(null,lista_passagem);
                    break;
                }
                //sobre
                case "8":{
                    JOptionPane.showMessageDialog(null,"Desenvolvedor: Quemuel Alves Nassor \n\nCódigo de matrícula: 828461\n\nDúvidas, sujestões ou bugs envie um email para: Quemuelalp@hotmail.com\n\nEste software é gratuito, a cópia e distribuição de partes ou todo seu código fonte é permitida apenas para fins educacionais!\n\nData da entrega: 22/04/2019");
                    break;
                }
                //feedback default
                default:{
                    if(!u.equals("0"))
                        JOptionPane.showMessageDialog(null,"Opção inválida");
                }
                codigo_passagem++;
            }
        }      
    }
}
