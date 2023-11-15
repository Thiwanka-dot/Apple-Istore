package apple.istore;

import javax.swing.JOptionPane;

public class Login2 extends javax.swing.JFrame {

    public Login2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabelLOGIN = new javax.swing.JLabel();
        jLabelEmployeeID = new javax.swing.JLabel();
        jTextFieldEmployeeID = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jCheckBoxShowPassword = new javax.swing.JCheckBox();
        jButtonLOGIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(102, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pngwing.com.png"))); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));

        jLabelLOGIN.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelLOGIN.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLOGIN.setText("LOGIN");

        jLabelEmployeeID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelEmployeeID.setText("Employee ID");

        jTextFieldEmployeeID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldEmployeeID.setForeground(new java.awt.Color(102, 102, 102));

        jLabelUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelUsername.setText("Username");

        jTextFieldUsername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(102, 102, 102));

        jLabelPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPassword.setText("Password");

        jPasswordFieldPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(102, 102, 102));

        jCheckBoxShowPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBoxShowPassword.setText("Show Password");
        jCheckBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPasswordActionPerformed(evt);
            }
        });

        jButtonLOGIN.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLOGIN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLOGIN.setText("LOGIN");
        jButtonLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLOGINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelLOGIN))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxShowPassword)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelPassword)
                                .addComponent(jLabelEmployeeID)
                                .addComponent(jTextFieldEmployeeID)
                                .addComponent(jLabelUsername)
                                .addComponent(jTextFieldUsername)
                                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButtonLOGIN)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabelLOGIN)
                .addGap(49, 49, 49)
                .addComponent(jLabelEmployeeID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButtonLOGIN)
                .addGap(57, 57, 57))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordActionPerformed
        if (jCheckBoxShowPassword.isSelected()){
            jPasswordFieldPassword.setEchoChar((char)0);
        }
        else {
            jPasswordFieldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowPasswordActionPerformed

    private void jButtonLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLOGINActionPerformed
        String empID = jTextFieldEmployeeID.getText();
        String username = jTextFieldUsername.getText();
        String password = jPasswordFieldPassword.getText();
        
        if (empID.equals("")&&username.equals("")&&password.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Employee ID, Username and Password!");
        }
        else if(!(empID.equals(""))&&username.equals("")&&password.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Username and Password!");
        }
        else if(empID.equals("")&&!(username.equals(""))&&password.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Employee ID and Password!");
        }
        else if(empID.equals("")&&username.equals("")&&!(password.equals(""))){
            JOptionPane.showMessageDialog(this, "Enter Employee ID and Username!");
        }
        else if(!(empID.equals(""))&&!(username.equals(""))&&password.equals("")){
            JOptionPane.showMessageDialog(this, "Enter Password!");
        }
        else if(!(empID.equals(""))&&username.equals("")&&!(password.equals(""))){
            JOptionPane.showMessageDialog(this, "Enter Username!");
        }
        else if(empID.equals("")&&!(username.equals(""))&&!(password.equals(""))){
            JOptionPane.showMessageDialog(this, "Enter Employee ID!");
        }
        else{  
            JOptionPane.showMessageDialog(this, "All Text Fields are entered!");
            
            WorkSpace WorkSpaceFrame = new WorkSpace();
            WorkSpaceFrame.setVisible(true);
            WorkSpaceFrame.pack();
            WorkSpaceFrame.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonLOGINActionPerformed

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
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButtonLOGIN;
    private javax.swing.JCheckBox jCheckBoxShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelLOGIN;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmployeeID;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
