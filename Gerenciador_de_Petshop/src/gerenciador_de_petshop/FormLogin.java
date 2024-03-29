/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador_de_petshop;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author quemu
 */
public class FormLogin extends javax.swing.JFrame {
    //lista de usuários
    List<Login> logins = new ArrayList();
    /**
     * Creates new form FormPrincipal
     */
    public FormLogin() {
        initComponents();
        configurarLogin();
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

        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRecuperar_senha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenha.setText("Senha");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnRecuperar_senha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRecuperar_senha.setText("Esqueci minha senha");
        btnRecuperar_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperar_senhaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRecuperar_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecuperar_senha)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRecuperar_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperar_senhaActionPerformed
        String security_question;
        int flag = 0;
        
        //loop de verificação da resposta informada
        while(flag == 0){
            while((security_question = JOptionPane.showInputDialog(null,"Responda a seguinte pergunta de segurança:\nQual o nome do seu primeiro animal de estimação?")).isEmpty()){
                JOptionPane.showMessageDialog(null,"A resposta está em branco!","\nSenha inválida!", JOptionPane.WARNING_MESSAGE);
            }
        
            for (Login item : logins) {
                if((item.getUsr()).equals(txtUsuario.getText()) && (item.getRsp()).equals(security_question)){
                    JOptionPane.showMessageDialog(null,"Sua senha de acesso é: " + item.getPsw());
                    flag = 1;
                }
            }
            if(flag == 0){
                JOptionPane.showMessageDialog(null,"A resposta está incorreta!","\nSenha inválida!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRecuperar_senhaActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        login();
    }//GEN-LAST:event_btnLoginKeyPressed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRecuperar_senha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void configurarLogin(){
        
        this.setTitle("Petshop");
        //posicionamento do formulario
        this.setLocationRelativeTo(null);

        //redimensionamento
        this.setResizable(false);

        //foco do cursor no JTextField txtUsuario
        txtUsuario.requestFocus();
        //dica do botão
        btnLogin.setToolTipText("clique no botão para entrar no sistema");
        btnRecuperar_senha.setToolTipText("clique no botão para recuperar a senha de acesso");
    }
    
    private void login(){
        String user = txtUsuario.getText();
        String password = new String(txtSenha.getPassword());
        
        //login admin
        if((user.equals("admin") && password.equals("admin"))){
            FormPrincipal main_form = new FormPrincipal();
            main_form.setVisible(true);
            this.dispose();
        //login demais usuários
        }else{
            if(!logins.isEmpty()){
                for (Login lg : logins) {
                    if(user.equals(lg.getUsr()) && password.equals(lg.getPsw())){
                        FormPrincipal main_form = new FormPrincipal();
                        main_form.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"Verifique as informações e tente novamente.","Login",JOptionPane.ERROR_MESSAGE);
                        txtSenha.setText("");
                        txtSenha.requestFocus();
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,"Não existem usuários cadastrados,utilize o login padrão.","Login",JOptionPane.INFORMATION_MESSAGE);
                txtUsuario.setText("");
                txtSenha.setText("");
                txtUsuario.requestFocus();
            }
        }
    }
}
