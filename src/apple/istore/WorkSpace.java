package apple.istore;

public class WorkSpace extends javax.swing.JFrame {

    public WorkSpace() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonViewProducts = new javax.swing.JButton();
        jButtonStockDetails = new javax.swing.JButton();
        jButtonProductDetails = new javax.swing.JButton();
        jButtonEXIT = new javax.swing.JButton();

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
        Left.setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Work Space");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jButtonViewProducts.setBackground(new java.awt.Color(102, 102, 102));
        jButtonViewProducts.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonViewProducts.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewProducts.setText("View Products");
        jButtonViewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewProductsActionPerformed(evt);
            }
        });

        jButtonStockDetails.setBackground(new java.awt.Color(102, 102, 102));
        jButtonStockDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonStockDetails.setForeground(new java.awt.Color(255, 255, 255));
        jButtonStockDetails.setText("Search Stock Details");
        jButtonStockDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStockDetailsActionPerformed(evt);
            }
        });

        jButtonProductDetails.setBackground(new java.awt.Color(102, 102, 102));
        jButtonProductDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonProductDetails.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProductDetails.setText("Search Product Details");
        jButtonProductDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductDetailsActionPerformed(evt);
            }
        });

        jButtonEXIT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonEXIT.setText("EXIT");
        jButtonEXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEXITMouseClicked(evt);
            }
        });
        jButtonEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jButtonViewProducts))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jButtonStockDetails))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jButtonProductDetails)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEXIT)))
                .addContainerGap())
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButtonViewProducts)
                .addGap(63, 63, 63)
                .addComponent(jButtonStockDetails)
                .addGap(55, 55, 55)
                .addComponent(jButtonProductDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButtonEXIT)
                .addContainerGap())
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

    private void jButtonViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewProductsActionPerformed
        View2 View2Frame = new View2();
        View2Frame.setVisible(true);
        View2Frame.pack();
        View2Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonViewProductsActionPerformed

    private void jButtonStockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStockDetailsActionPerformed
        StockDetails2 StockDetails2Frame = new StockDetails2();
        StockDetails2Frame.setVisible(true);
        StockDetails2Frame.pack();
        StockDetails2Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonStockDetailsActionPerformed

    private void jButtonProductDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductDetailsActionPerformed
        Search2 Search2Frame = new Search2();
        Search2Frame.setVisible(true);
        Search2Frame.pack();
        Search2Frame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonProductDetailsActionPerformed

    private void jButtonEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEXITActionPerformed

    private void jButtonEXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonEXITMouseClicked

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
            java.util.logging.Logger.getLogger(WorkSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkSpace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButtonEXIT;
    private javax.swing.JButton jButtonProductDetails;
    private javax.swing.JButton jButtonStockDetails;
    private javax.swing.JButton jButtonViewProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
