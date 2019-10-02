/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova_final_lab_3;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 828461
 */
public class FormPrincipal extends javax.swing.JFrame {
    
    //estrutura de dados para troca entre os JInternarFrame
    protected static List<Pedido> pedidos = new ArrayList<>();
    
    
    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
        configurarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemSeparador = new javax.swing.JPopupMenu.Separator();
        menuItemSair = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        menuItemVisualizarPedidos = new javax.swing.JMenuItem();
        menuItemCadastrarPedido = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");
        menuArquivo.add(menuItemSeparador);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        barraMenu.add(menuArquivo);

        menuVenda.setText("Venda");

        menuItemVisualizarPedidos.setText("Pedido");
        menuItemVisualizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarPedidosActionPerformed(evt);
            }
        });
        menuVenda.add(menuItemVisualizarPedidos);

        menuItemCadastrarPedido.setText("Visualizar");
        menuItemCadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarPedidoActionPerformed(evt);
            }
        });
        menuVenda.add(menuItemCadastrarPedido);

        barraMenu.add(menuVenda);

        menuAjuda.setText("Ajuda");

        menuItemSobre.setText("Sobre");
        menuAjuda.add(menuItemSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemVisualizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarPedidosActionPerformed
        abrirFormulario(new FormPedidoVenda());
    }//GEN-LAST:event_menuItemVisualizarPedidosActionPerformed

    private void menuItemCadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarPedidoActionPerformed
        abrirFormulario(new FormVisualizarPedidos());
    }//GEN-LAST:event_menuItemCadastrarPedidoActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

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
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuItemCadastrarPedido;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JPopupMenu.Separator menuItemSeparador;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenuItem menuItemVisualizarPedidos;
    private javax.swing.JMenu menuVenda;
    // End of variables declaration//GEN-END:variables
    private void configurarFormulario(){
        this.setTitle("Gerenciamento de Oficina");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void abrirFormulario(JInternalFrame f){
        if(areaTrabalho.getAllFrames().length == 0){
            areaTrabalho.add(f);
            centralizarFormulario(f);
            f.setVisible(true);
        }else{
            JOptionPane.showConfirmDialog(rootPane,"Você precisa fechar a janela atual antes de abrir uma nova janela!");
        }
    }
    
    private void centralizarFormulario(JInternalFrame f){
        Dimension d = f.getDesktopPane().getSize();
        f.setLocation(
                (d.width-f.getSize().width)/2,
                (d.height-f.getSize().height)/2
        );
    }
}
