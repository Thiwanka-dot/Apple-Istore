package apple.istore;

import javax.swing.JOptionPane;

public class NewAccount extends javax.swing.JFrame {

    public NewAccount() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabelCreateUA = new javax.swing.JLabel();
        jLabelFullName = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelEmployeeCode = new javax.swing.JLabel();
        jTextFieldEmployeeCode = new javax.swing.JTextField();
        jButtonSAVE = new javax.swing.JButton();
        jButtonBACK = new javax.swing.JButton();
        jCheckBoxShowPassword = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(102, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(200, 500));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 200, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCreateUA.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelCreateUA.setForeground(new java.awt.Color(102, 102, 102));
        jLabelCreateUA.setText("Create User Accounts");

        jLabelFullName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelFullName.setText("Full Name");

        jTextFieldFullName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldFullName.setForeground(new java.awt.Color(102, 102, 102));

        jLabelUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelUsername.setText("Username");

        jTextFieldUsername.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabelPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelPassword.setText("Password");

        jPasswordFieldPassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(102, 102, 102));

        jLabelEmployeeCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelEmployeeCode.setText("Employee Code");

        jTextFieldEmployeeCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldEmployeeCode.setForeground(new java.awt.Color(102, 102, 102));

        jButtonSAVE.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSAVE.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonSAVE.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSAVE.setText("SAVE");
        jButtonSAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSAVEActionPerformed(evt);
            }
        });

        jButtonBACK.setBackground(new java.awt.Color(102, 102, 102));
        jButtonBACK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonBACK.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBACK.setText("BACK");
        jButtonBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBACKActionPerformed(evt);
            }
        });

        jCheckBoxShowPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBoxShowPassword.setText("Show Password");
        jCheckBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsername)
                            .addComponent(jLabelEmployeeCode)
                            .addComponent(jLabelFullName)
                            .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmployeeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxShowPassword)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabelCreateUA))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jButtonSAVE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonBACK)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelCreateUA)
                .addGap(44, 44, 44)
                .addComponent(jLabelEmployeeCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmployeeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelFullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSAVE)
                    .addComponent(jButtonBACK))
                .addGap(41, 41, 41))
        );

        jPanel1.add(Left);
        Left.setBounds(200, 0, 600, 500);

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

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jButtonBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBACKActionPerformed
        WorkArea WorkAreaFrame = new WorkArea();
        WorkAreaFrame.setVisible(true);
        WorkAreaFrame.pack();
        WorkAreaFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonBACKActionPerformed

    private void jButtonSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSAVEActionPerformed
        if (jTextFieldEmployeeCode.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Employee Code", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (jTextFieldFullName.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Full Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (jTextFieldUsername.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Username", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (jPasswordFieldPassword.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Password", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Employee myObj = new Employee();
            myObj.setEmployeeID(jTextFieldEmployeeCode.getText().toString());
            myObj.setFullName(jTextFieldFullName.getText().toString());
            myObj.setUsername(jTextFieldUsername.getText().toString());
            myObj.setPassword(jPasswordFieldPassword.getText().toString());
            myObj.SAVE(myObj);
        }
        
    }//GEN-LAST:event_jButtonSAVEActionPerformed

    private void jCheckBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordActionPerformed
        if (jCheckBoxShowPassword.isSelected()){
            jPasswordFieldPassword.setEchoChar((char)0);
        }
        else {
            jPasswordFieldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButtonBACK;
    private javax.swing.JButton jButtonSAVE;
    private javax.swing.JCheckBox jCheckBoxShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCreateUA;
    private javax.swing.JLabel jLabelEmployeeCode;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmployeeCode;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
