/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author BorD
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelUsuário = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelGoogle = new javax.swing.JLabel();
        jLabelFacebook = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelEsqueci = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelLogo.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(0, 102, 102));
        jLabelLogo.setText("HEALTHY");
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(110, 60, 90, 20);

        jLabelUsuário.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelUsuário.setForeground(new java.awt.Color(0, 102, 102));
        jLabelUsuário.setText("Usuário");
        getContentPane().add(jLabelUsuário);
        jLabelUsuário.setBounds(80, 90, 70, 40);

        jLabelSenha.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSenha.setText("Senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(80, 140, 60, 40);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(80, 340, 160, 20);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(80, 170, 160, 30);

        jButtonEntrar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jButtonEntrarComponentAdded(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(130, 280, 63, 23);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(100, 490, 130, 23);

        jLabelGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/google.png"))); // NOI18N
        getContentPane().add(jLabelGoogle);
        jLabelGoogle.setBounds(100, 400, 90, 50);

        jLabelFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/facebook.png"))); // NOI18N
        getContentPane().add(jLabelFacebook);
        jLabelFacebook.setBounds(190, 400, 48, 50);

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Entrar com:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 370, 80, 14);

        jTextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(80, 120, 160, 30);

        jLabelEsqueci.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEsqueci.setText("Esqueci minha senha");
        getContentPane().add(jLabelEsqueci);
        jLabelEsqueci.setBounds(100, 240, 140, 20);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teladeFndo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 0, 320, 569);

        setSize(new java.awt.Dimension(336, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
            cadastro tela = new cadastro();
            tela.setVisible(true);
                   
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEntrarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jButtonEntrarComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEntrarComponentAdded

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelEsqueci;
    public javax.swing.JLabel jLabelFacebook;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelGoogle;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuário;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
