package apple.istore;

import javax.swing.JOptionPane;

public class Products extends javax.swing.JFrame {
    
    public Products() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabelAddProducts = new javax.swing.JLabel();
        jLabelProductCode = new javax.swing.JLabel();
        jTextFieldProductCode = new javax.swing.JTextField();
        jLabelProductName = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabelProductPrice = new javax.swing.JLabel();
        jTextFieldProductPrice = new javax.swing.JTextField();
        jLabelProductQuantity = new javax.swing.JLabel();
        jTextFieldProductQuantity = new javax.swing.JTextField();
        jButtonSAVE = new javax.swing.JButton();
        jButtonBACK = new javax.swing.JButton();
        jLabelProductType = new javax.swing.JLabel();
        jTextFieldProductType = new javax.swing.JTextField();

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

        jLabelAddProducts.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelAddProducts.setForeground(new java.awt.Color(102, 102, 102));
        jLabelAddProducts.setText("Add Products");

        jLabelProductCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelProductCode.setText("Product Code");

        jTextFieldProductCode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldProductCode.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldProductCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductCodeActionPerformed(evt);
            }
        });

        jLabelProductName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelProductName.setText("Product Name");

        jTextFieldProductName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldProductName.setForeground(new java.awt.Color(102, 102, 102));

        jLabelProductPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelProductPrice.setText("Product Price");

        jTextFieldProductPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldProductPrice.setForeground(new java.awt.Color(102, 102, 102));

        jLabelProductQuantity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelProductQuantity.setText("Product Quantity");

        jTextFieldProductQuantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldProductQuantity.setForeground(new java.awt.Color(102, 102, 102));

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

        jLabelProductType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelProductType.setText("Product Type");

        jTextFieldProductType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldProductType.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelProductPrice)
                    .addComponent(jLabelProductName)
                    .addComponent(jLabelProductCode)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductType)
                    .addComponent(jTextFieldProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductQuantity)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jTextFieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSAVE))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jTextFieldProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBACK)))
                        .addGap(43, 43, 43)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAddProducts)
                .addGap(151, 151, 151))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelAddProducts)
                .addGap(43, 43, 43)
                .addComponent(jLabelProductCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelProductType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelProductPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSAVE))
                .addGap(18, 18, 18)
                .addComponent(jLabelProductQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBACK))
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void jButtonBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBACKActionPerformed
        WorkArea WorkAreaFrame = new WorkArea();
        WorkAreaFrame.setVisible(true);
        WorkAreaFrame.pack();
        WorkAreaFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonBACKActionPerformed

    private void jButtonSAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSAVEActionPerformed
        if (jTextFieldProductCode.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Product Code", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (jTextFieldProductName.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Product Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (jTextFieldProductType.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Product Type", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (jTextFieldProductPrice.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Product Price", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (jTextFieldProductQuantity.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Enter the Product Quantity", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            AddProducts myObj = new AddProducts();
            myObj.setProductCode(jTextFieldProductCode.getText().toString());
            myObj.setProductName(jTextFieldProductName.getText().toString());
            myObj.setProductType(jTextFieldProductType.getText().toString());
            myObj.setProductPrice(Integer.valueOf(jTextFieldProductPrice.getText().toString()));  
            myObj.setProductQuantity(Integer.valueOf(jTextFieldProductQuantity.getText().toString()));
            myObj.Add(myObj);
        }
                
    }//GEN-LAST:event_jButtonSAVEActionPerformed

    private void jTextFieldProductCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductCodeActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }  
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButtonBACK;
    private javax.swing.JButton jButtonSAVE;
    private javax.swing.JLabel jLabelAddProducts;
    private javax.swing.JLabel jLabelProductCode;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabelProductPrice;
    private javax.swing.JLabel jLabelProductQuantity;
    private javax.swing.JLabel jLabelProductType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldProductCode;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldProductPrice;
    private javax.swing.JTextField jTextFieldProductQuantity;
    private javax.swing.JTextField jTextFieldProductType;
    // End of variables declaration//GEN-END:variables
}
