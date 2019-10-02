/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador_de_petshop;

/**
 *
 * @author quemu
 */
public class Login {
    
    private String usr;
    private String psw;
    private String rsp;

    public Login() {
    }

    public Login(String usr, String psw, String rsp) {
        this.setUsr(usr);
        this.setPsw(psw);
        this.setRsp(rsp);
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        if(!usr.isEmpty()){
            this.usr = usr;
        }
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
       if(!psw.isEmpty()){
            this.psw = psw;
       }
    }

    public String getRsp() {
        return rsp;
    }

    public void setRsp(String rsp) {
        if(!rsp.isEmpty()){
            this.rsp = rsp;
        }
    }
    
    
}
