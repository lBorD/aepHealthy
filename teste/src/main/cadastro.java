package main;

import javax.swing.JOptionPane;

public class cadastro extends javax.swing.JFrame {

    public cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelDN = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelSenha2 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAno = new javax.swing.JComboBox<>();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldSenha2 = new javax.swing.JPasswordField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelLogoCadastro = new javax.swing.JLabel();
        jLabelFundoCadastro = new javax.swing.JLabel();

        jDialog1.setTitle("Cadastro efetuado com sucesso!");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextFieldNome.setToolTipText("digite o seu primeiro nome");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(70, 100, 210, 30);

        jTextFieldSobrenome.setToolTipText("digite seu sobrenome");
        jTextFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSobrenome);
        jTextFieldSobrenome.setBounds(70, 150, 210, 30);

        jTextFieldEmail.setToolTipText("digite seu e-mail");
        getContentPane().add(jTextFieldEmail);
        jTextFieldEmail.setBounds(70, 320, 210, 30);

        jLabelCadastro.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabelCadastro.setForeground(new java.awt.Color(0, 102, 102));
        jLabelCadastro.setText("Cadastro");
        getContentPane().add(jLabelCadastro);
        jLabelCadastro.setBounds(100, 30, 130, 40);

        jLabelSobrenome.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelSobrenome.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSobrenome.setText("Sobrenome");
        getContentPane().add(jLabelSobrenome);
        jLabelSobrenome.setBounds(70, 130, 140, 20);

        jLabelNome.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(0, 102, 102));
        jLabelNome.setText("Nome");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(70, 70, 110, 25);

        jLabelDN.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelDN.setText("Data de nascimento");
        getContentPane().add(jLabelDN);
        jLabelDN.setBounds(40, 190, 200, 25);

        jLabelEmail.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 102, 102));
        jLabelEmail.setText("Email");
        getContentPane().add(jLabelEmail);
        jLabelEmail.setBounds(70, 290, 60, 30);

        jLabelSenha.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSenha.setText("Confirme a senha");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(70, 410, 200, 25);

        jLabelSenha2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabelSenha2.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSenha2.setText("Senha");
        getContentPane().add(jLabelSenha2);
        jLabelSenha2.setBounds(70, 350, 80, 25);

        jComboBoxDia.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(jComboBoxDia);
        jComboBoxDia.setBounds(40, 220, 60, 20);

        jComboBoxMes.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" }));
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMes);
        jComboBoxMes.setBounds(100, 220, 100, 20);

        jComboBoxAno.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "1900", "1901", "1902", "1903", "1904", "1905\t", "1906", "1907\t", "1908\t", "1909\t", "1910\t", "1911\t", "1912\t", "1913\t", "1914\t", "1915\t", "1916\t", "1917\t", "1918\t", "1919\t", "1920\t", "1921\t", "1922\t", "1923\t", "1924\t", "1925\t", "1926\t", "1927\t", "1928", "1929", "1930", "1931\t", "1932\t", "1933\t", "1934\t", "1935", "1936", "1937\t", "1938\t", "1939\t", "1940\t", "1941\t", "1942\t", "1943\t", "1944", "1945", "1946\t", "1947\t", "1948\t", "1949\t", "1950\t", "1951\t", "1952\t", "1953\t", "1954\t", "1955\t", "1956\t", "1957\t", "1958\t", "1959\t", "1960\t", "1961\t", "1962\t", "1963\t", "1964", "1965\t", "1966\t", "1967\t", "1968\t", "1969\t", "1970\t", "1971\t", "1972\t", "1973\t", "1974\t", "1975\t", "1976\t", "1977", "1978\t", "1979\t", "1980\t", "1981\t", "1982\t", "1984\t", "1985\t", "1986\t", "1987\t", "1988\t", "1989\t", "1990\t", "1991\t", "1992\t", "1993\t", "1994\t", "1995\t", "1996\t", "1997\t", "1998\t", "1999\t", "2000\t", "2001", "2002", "2003\t", "2004\t", "2005\t", "2006\t", "2007\t", "2008\t", "2009\t", "2010\t", "2011\t", "2012\t", "2013\t", "2014\t", "2015\t", "2016\t", "2017\t", "2018\t", "2019\t", "2020\t", "2021", " " }));
        jComboBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAno);
        jComboBoxAno.setBounds(200, 220, 90, 20);

        jPasswordFieldSenha.setToolTipText("digite a senha novamente");
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(70, 440, 210, 30);

        jPasswordFieldSenha2.setToolTipText("digite sua senha");
        getContentPane().add(jPasswordFieldSenha2);
        jPasswordFieldSenha2.setBounds(70, 380, 210, 30);

        jButtonVoltar.setBackground(new java.awt.Color(0, 204, 204));
        jButtonVoltar.setForeground(new java.awt.Color(0, 102, 102));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/seta.png"))); // NOI18N
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(10, 10, 20, 30);

        jButtonCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCadastrar.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(80, 500, 160, 35);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(60, 260, 200, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(60, 550, 200, 20);

        jLabelLogoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/logoSemNome_1.png"))); // NOI18N
        getContentPane().add(jLabelLogoCadastro);
        jLabelLogoCadastro.setBounds(230, 0, 85, 70);

        jLabelFundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teladeFndo1.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoCadastro);
        jLabelFundoCadastro.setBounds(0, 0, 320, 569);

        setSize(new java.awt.Dimension(336, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
       // Enviar ao banco o mesNascUsuario
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void jComboBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoActionPerformed
       // Enviar ao banco o anoNascUsuario
    }//GEN-LAST:event_jComboBoxAnoActionPerformed
    
    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
           StringBuilder mensagem = new StringBuilder();
           mensagem.append("Cadastrado com sucesso!");
           JOptionPane.showMessageDialog(null, mensagem);
           
           // enviar ao banco o cadastro
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // Obter o Nome do usuario
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeActionPerformed
        // Obter o Sobrenome do usuario
    }//GEN-LAST:event_jTextFieldSobrenomeActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelDN;
    private javax.swing.JLabel jLabelEmail;
    public javax.swing.JLabel jLabelFundoCadastro;
    private javax.swing.JLabel jLabelLogoCadastro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenha2;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}
