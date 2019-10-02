/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador_de_petshop;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 828461
 */
public class FormCadastrarUsuario extends javax.swing.JFrame {
    List<Login> logins = new ArrayList();
    /**
     * Creates new form FormCadastrar
     */
    public FormCadastrarUsuario() {
        initComponents();
        configurarCadastrarUsuario();
        //leitura do arquivo Json que armazena as senhas, usuários e respostas de perguntas de segurança
        try {
            JsonReader reader = new JsonReader(new FileReader(System.getProperty("user.home") + "\\Desktop\\Usuarios.json"));
            
            reader.beginArray();
            while(reader.hasNext()){
                Login lg = new Gson().fromJson(reader,Login.class);
                logins.add(lg);
            }
        } catch (Exception e) {
            System.out.println("ERRO: "+e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsr = new javax.swing.JLabel();
        txtUsr = new javax.swing.JTextField();
        lblPsw = new javax.swing.JLabel();
        txtRsp = new javax.swing.JTextField();
        lblRsp = new javax.swing.JLabel();
        btnSalvarUsuario = new javax.swing.JButton();
        txtPsw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsr.setText("Usuário");

        txtUsr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPsw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPsw.setText("Senha");

        txtRsp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblRsp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRsp.setText("Qual o nome do seu primeiro animal de estimação?");

        btnSalvarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvarUsuario.setText("salvar");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        txtPsw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarUsuario))
                    .addComponent(lblRsp, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(txtRsp)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsr))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPsw))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsr)
                    .addComponent(lblPsw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPsw))
                .addGap(18, 18, 18)
                .addComponent(lblRsp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        int flag = 0;
        Login novo = new Login(txtUsr.getText(),txtPsw.getText(),txtRsp.getText());
        if(logins.isEmpty()){
            flag = 1;
        }
        for(Login lgi : logins){
            flag = 0;
            if(novo.getUsr().equals(lgi.getUsr()) && novo.getPsw().equals(lgi.getPsw())){
                JOptionPane.showMessageDialog(null,"Verifique as informações do cadastro","Usuário e senha inválidos!", JOptionPane.INFORMATION_MESSAGE);
                txtPsw.setText("");
                txtRsp.setText("");
                txtUsr.setText("");
                break;
            }else{
                flag = 1;
            }
        }
        if(flag == 1){
            logins.add(novo);
            txtPsw.setText("");
            txtRsp.setText("");
            txtUsr.setText("");
        }
        //gravando no arquivo Json que armazena as senhas, usuários e respostas de perguntas de segurança
        try{
            JsonWriter writer = new JsonWriter(new FileWriter(System.getProperty("user.home") + "\\Desktop\\Usuarios.json"));
            
            writer.beginArray();
            for (Login lg: logins) {
                new Gson().toJson(lg,Login.class,writer);
            }
            writer.endArray();
            writer.close();
            
        }catch(Exception e){
            System.out.println("ERRO: "+ e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso!");
        this.dispose();
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JLabel lblPsw;
    private javax.swing.JLabel lblRsp;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JTextField txtRsp;
    private javax.swing.JTextField txtUsr;
    // End of variables declaration//GEN-END:variables
    public void configurarCadastrarUsuario(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //posicionamento do formulario
        this.setLocationRelativeTo(null);

        //redimensionamento
        this.setResizable(false);
    }
}
