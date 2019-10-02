/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador_de_petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author quemu
 */
public class FormPrincipal extends javax.swing.JFrame {
    public static List<Cliente> clientes = new ArrayList();
    
    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        configurarPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnCadCliente = new javax.swing.JButton();
        btnCadAtendimento = new javax.swing.JButton();
        btnCadUsuario = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        btnLstClientes = new javax.swing.JButton();
        btnBscAtendimento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnCadCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cliente.png"))); // NOI18N
        btnCadCliente.setText("Cadastrar cliente");
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });

        btnCadAtendimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadastrar.png"))); // NOI18N
        btnCadAtendimento.setText("Novo atendimento");
        btnCadAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAtendimentoActionPerformed(evt);
            }
        });

        btnCadUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/usuário.png"))); // NOI18N
        btnCadUsuario.setText("Cadastrar usuário");
        btnCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadUsuarioActionPerformed(evt);
            }
        });

        btnSobre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/atenção.png"))); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnLstClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLstClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Lista.png"))); // NOI18N
        btnLstClientes.setText("Listar clientes");
        btnLstClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstClientesActionPerformed(evt);
            }
        });

        btnBscAtendimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBscAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/pesquisar.png"))); // NOI18N
        btnBscAtendimento.setText("Pesquisar atendimento");
        btnBscAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBscAtendimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBscAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLstClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCliente)
                    .addComponent(btnLstClientes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadAtendimento)
                    .addComponent(btnBscAtendimento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadUsuario)
                    .addComponent(btnSobre))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLstClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstClientesActionPerformed
       FormListarClientes clientes = new FormListarClientes();
       clientes.setVisible(true);
    }//GEN-LAST:event_btnLstClientesActionPerformed
    
    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        FormSobre sobre = new FormSobre();
        sobre.setVisible(true);
        //this.setVisible(false);
        
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnBscAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBscAtendimentoActionPerformed
        FormPesquisarAtendimento atendimentos = new FormPesquisarAtendimento();
        atendimentos.setVisible(true);
    }//GEN-LAST:event_btnBscAtendimentoActionPerformed

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        FormCadastrarCliente cliente = new FormCadastrarCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCadAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAtendimentoActionPerformed
        FormCadastrarAtendimento atendimento = new FormCadastrarAtendimento();
        atendimento.setVisible(true);
    }//GEN-LAST:event_btnCadAtendimentoActionPerformed

    private void btnCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadUsuarioActionPerformed
        FormCadastrarUsuario usuario = new FormCadastrarUsuario();
        usuario.setVisible(true);
    }//GEN-LAST:event_btnCadUsuarioActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        FormLogin login = new FormLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBscAtendimento;
    private javax.swing.JButton btnCadAtendimento;
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnCadUsuario;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLstClientes;
    private javax.swing.JButton btnSobre;
    // End of variables declaration//GEN-END:variables
    
    private void configurarPrincipal(){
        
        //posicionamento do formulario
        this.setLocationRelativeTo(null);

        //redimensionamento
        this.setResizable(false);
    }
}