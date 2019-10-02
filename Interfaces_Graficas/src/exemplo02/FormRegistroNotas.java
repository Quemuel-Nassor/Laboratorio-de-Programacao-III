package exemplo02;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;


public class FormRegistroNotas extends javax.swing.JFrame {

    
    
    
    public FormRegistroNotas() {
        this.setUndecorated(true);
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

        lblRegistro = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        spSeparador = new javax.swing.JSeparator();
        txtQtdeNotas = new javax.swing.JTextField();
        lblInformacoes = new javax.swing.JLabel();
        lblQtdeNotas = new javax.swing.JLabel();
        txtSomaTotal = new javax.swing.JTextField();
        lblMaiorValor = new javax.swing.JLabel();
        lblMenorValor = new javax.swing.JLabel();
        txtMenorValor = new javax.swing.JTextField();
        lblSomaTotal = new javax.swing.JLabel();
        txtMaiorValor = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registro de Notas Fiscais");

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValor.setText("Valor R$");

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorKeyReleased(evt);
            }
        });

        txtQtdeNotas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblInformacoes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInformacoes.setText("Informações sobre as Notas");

        lblQtdeNotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQtdeNotas.setText("Qtde. de Notas");

        txtSomaTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblMaiorValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaiorValor.setText("Maior valor R$:");

        lblMenorValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMenorValor.setText("Menor valor R$:");

        txtMenorValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblSomaTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSomaTotal.setText("Soma Total R$:");

        txtMaiorValor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSair.setText("sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spSeparador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInformacoes, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblValor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQtdeNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQtdeNotas)
                                .addComponent(lblMenorValor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMaiorValor)
                                .addComponent(lblSomaTotal)
                                .addComponent(txtSomaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtMenorValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMaiorValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblRegistro)
                .addGap(18, 18, 18)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInformacoes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeNotas)
                    .addComponent(lblSomaTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdeNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSomaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenorValor)
                    .addComponent(lblMaiorValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenorValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaiorValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyReleased
      
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            try {
                double valor = Double.parseDouble(txtValor.getText().replace(',', '.'));
                
                int qtde = 0;
                if (txtQtdeNotas.getText().isEmpty()){
                    qtde = 1;
                }else{
                    qtde = Integer.parseInt(txtQtdeNotas.getText()) + 1 ;
                }
                txtQtdeNotas.setText(Integer.toString(qtde));
                
                double soma = 0;
                if (txtSomaTotal.getText().isEmpty()){
                    soma = valor;
                }else{
                    soma = Double.parseDouble(txtSomaTotal.getText().replace(',', '.'))+valor;
                }
                txtSomaTotal.setText(String.format("%.2f",soma));
                
                double maior = 0;
                if (txtMaiorValor.getText().isEmpty()){
                    maior = valor;
                }else{
                    maior = Double.max(
                        Double.parseDouble(txtMaiorValor.getText().replace(',', '.')),
                        valor
                    );
                }
                txtMaiorValor.setText(String.format("%.2f",maior));
                
                double menor = 0;
                if (txtMenorValor.getText().isEmpty()){
                    menor = valor;
                }else{
                    menor = Double.min(
                        Double.parseDouble(txtMenorValor.getText().replace(',', '.')),
                        valor
                    );
                }
                txtMenorValor.setText(String.format("%.2f",menor));
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "O valor da nota fiscal não é válido.");
            }
            txtValor.setText("");
            txtValor.requestFocus();
        }
    }//GEN-LAST:event_txtValorKeyReleased

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(
            null, 
            "Deseja sair da aplicação?",
            "Registro de Notas",
            JOptionPane.YES_NO_OPTION
        );
        
        if (resp == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistroNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistroNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JLabel lblMaiorValor;
    private javax.swing.JLabel lblMenorValor;
    private javax.swing.JLabel lblQtdeNotas;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblSomaTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JSeparator spSeparador;
    private javax.swing.JTextField txtMaiorValor;
    private javax.swing.JTextField txtMenorValor;
    private javax.swing.JTextField txtQtdeNotas;
    private javax.swing.JTextField txtSomaTotal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables


    private void configurarFormulario(){
        this.setTitle("Registro de Notas Fiscais");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        txtQtdeNotas.setEditable(false);
        txtSomaTotal.setEditable(false);
        txtMaiorValor.setEditable(false);
        txtMenorValor.setEditable(false);
        
    }

}