/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerlogin.swing;

import User.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author respect
 */
public class demo extends javax.swing.JFrame {

    /**
     * Creates new form demo
     */
    public demo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parent = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        GirisPanel = new javax.swing.JLabel();
        LogEmailVeyaSif = new javax.swing.JLabel();
        LogPass = new javax.swing.JLabel();
        txtLogEmailKadi = new javax.swing.JTextField();
        txtLogPass = new javax.swing.JPasswordField();
        btnGirisYap = new javax.swing.JButton();
        btnKayitYap = new javax.swing.JButton();
        LoginErrMsg = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        LogEmailVeyaSif1 = new javax.swing.JLabel();
        LogPass1 = new javax.swing.JLabel();
        btnKayitOl = new javax.swing.JButton();
        txtRegEmail = new javax.swing.JTextField();
        regErrMsg = new javax.swing.JLabel();
        btnZatenKayitliyim = new javax.swing.JButton();
        txtRegPass = new javax.swing.JPasswordField();
        GirisPanel1 = new javax.swing.JLabel();
        LogEmailVeyaSif2 = new javax.swing.JLabel();
        txtRegKAdi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Parent.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(204, 255, 255));

        GirisPanel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        GirisPanel.setText("Giriş paneli");

        LogEmailVeyaSif.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogEmailVeyaSif.setText("Email veya Kullanıcı adı : ");

        LogPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogPass.setText("Şifre :");

        btnGirisYap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGirisYap.setText("Giriş yap");
        btnGirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisYapActionPerformed(evt);
            }
        });

        btnKayitYap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKayitYap.setText("Kayıtlı değilim");
        btnKayitYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitYapActionPerformed(evt);
            }
        });

        LoginErrMsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(loginLayout.createSequentialGroup()
                                    .addComponent(LogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLogPass, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(loginLayout.createSequentialGroup()
                                    .addComponent(LogEmailVeyaSif)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtLogEmailKadi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(loginLayout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(GirisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(loginLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(btnGirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(btnKayitYap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(GirisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogEmailVeyaSif, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogEmailKadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogPass)
                    .addComponent(txtLogPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGirisYap)
                    .addComponent(btnKayitYap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Parent.add(login, "card2");

        register.setBackground(new java.awt.Color(204, 204, 255));

        LogEmailVeyaSif1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogEmailVeyaSif1.setText("Email : ");

        LogPass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogPass1.setText("Şifre :");

        btnKayitOl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKayitOl.setText("Kayıt ol");
        btnKayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitOlActionPerformed(evt);
            }
        });

        regErrMsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnZatenKayitliyim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnZatenKayitliyim.setText("Kayıtlıyım");
        btnZatenKayitliyim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZatenKayitliyimActionPerformed(evt);
            }
        });

        GirisPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        GirisPanel1.setText("Register Ekranı");

        LogEmailVeyaSif2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogEmailVeyaSif2.setText("Kullanıcı adı :");

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogEmailVeyaSif2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegKAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(regErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(registerLayout.createSequentialGroup()
                            .addComponent(LogPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtRegPass, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(registerLayout.createSequentialGroup()
                            .addComponent(LogEmailVeyaSif1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtRegEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(registerLayout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(btnKayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(btnZatenKayitliyim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(registerLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(GirisPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogEmailVeyaSif2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegKAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(GirisPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(53, 53, 53)
                    .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LogEmailVeyaSif1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRegEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LogPass1)
                        .addComponent(txtRegPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(55, 55, 55)
                    .addGroup(registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKayitOl)
                        .addComponent(btnZatenKayitliyim))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        Parent.add(register, "card3");

        getContentPane().add(Parent);
        Parent.setBounds(0, 0, 491, 401);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKayitYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitYapActionPerformed
        Parent.removeAll();
        Parent.add(register);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_btnKayitYapActionPerformed

    private void btnZatenKayitliyimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZatenKayitliyimActionPerformed
        Parent.removeAll();
        Parent.add(login);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_btnZatenKayitliyimActionPerformed

    private void btnKayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitOlActionPerformed
        if(txtRegEmail.getText().isEmpty() || txtRegKAdi.getText().isEmpty() || String.valueOf(txtRegPass.getPassword()).isEmpty()) {
            regErrMsg.setText("Tüm alanları doldurunuz.");
            txtRegEmail.setText("");
            txtRegKAdi.setText("");
            txtRegPass.setText("");
            return;
        }
        register reg = new register();
        try {
            reg.newUser(txtRegEmail.getText(), txtRegKAdi.getText(), String.valueOf(txtRegPass.getPassword()));
            regErrMsg.setText("Başarıyla kayıt olundu.");
        } catch (SQLException e) {
            regErrMsg.setText("Bağlantı oluşurken sorun oluştu.");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnKayitOlActionPerformed

    private void btnGirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisYapActionPerformed
        if(txtLogEmailKadi.getText().isEmpty() || String.valueOf(txtLogPass.getPassword()).isEmpty()) {
            LoginErrMsg.setText("Tüm alanları doldurunuz.");
            txtLogEmailKadi.setText("");
            txtLogPass.setText("");
            return;
        }
        login log = new login();
        try {
            if(log.loginUser(txtLogEmailKadi.getText(), String.valueOf(txtLogPass.getPassword()))) {
                LoginErrMsg.setText("Giriş başarıyla yapıldı.");
            } else {
                LoginErrMsg.setText("Bilgiler yanlış!");
            }
        } catch(SQLException e) {
            LoginErrMsg.setText("Bağlantı oluşurken sorun çıktı.");
        }
    }//GEN-LAST:event_btnGirisYapActionPerformed

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
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GirisPanel;
    private javax.swing.JLabel GirisPanel1;
    private javax.swing.JLabel LogEmailVeyaSif;
    private javax.swing.JLabel LogEmailVeyaSif1;
    private javax.swing.JLabel LogEmailVeyaSif2;
    private javax.swing.JLabel LogPass;
    private javax.swing.JLabel LogPass1;
    private javax.swing.JLabel LoginErrMsg;
    private javax.swing.JPanel Parent;
    private javax.swing.JButton btnGirisYap;
    private javax.swing.JButton btnKayitOl;
    private javax.swing.JButton btnKayitYap;
    private javax.swing.JButton btnZatenKayitliyim;
    private javax.swing.JPanel login;
    private javax.swing.JLabel regErrMsg;
    private javax.swing.JPanel register;
    private javax.swing.JTextField txtLogEmailKadi;
    private javax.swing.JPasswordField txtLogPass;
    private javax.swing.JTextField txtRegEmail;
    private javax.swing.JTextField txtRegKAdi;
    private javax.swing.JPasswordField txtRegPass;
    // End of variables declaration//GEN-END:variables
}
