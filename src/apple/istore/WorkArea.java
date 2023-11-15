package apple.istore;

public class WorkArea extends javax.swing.JFrame {

    public WorkArea() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelWorkArea = new javax.swing.JLabel();
        jButtonCreateUA = new javax.swing.JButton();
        jButtonViewProducts = new javax.swing.JButton();
        jButtonStockDetails = new javax.swing.JButton();
        jButtonAddProducts = new javax.swing.JButton();
        jButtonSearchProducts = new javax.swing.JButton();
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
            .addGap(0, 140, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 140, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabelWorkArea.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelWorkArea.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWorkArea.setText("Work Area");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabelWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jButtonCreateUA.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCreateUA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonCreateUA.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCreateUA.setText("Create User Accounts");
        jButtonCreateUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateUAActionPerformed(evt);
            }
        });

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

        jButtonAddProducts.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAddProducts.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonAddProducts.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddProducts.setText("Add Products");
        jButtonAddProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProductsActionPerformed(evt);
            }
        });

        jButtonSearchProducts.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSearchProducts.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSearchProducts.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearchProducts.setText("Search Products");
        jButtonSearchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchProductsActionPerformed(evt);
            }
        });

        jButtonEXIT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonEXIT.setText("EXIT");
        jButtonEXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEXITMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonStockDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCreateUA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSearchProducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonViewProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEXIT)
                .addContainerGap())
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButtonAddProducts)
                .addGap(18, 18, 18)
                .addComponent(jButtonViewProducts)
                .addGap(18, 18, 18)
                .addComponent(jButtonSearchProducts)
                .addGap(18, 18, 18)
                .addComponent(jButtonStockDetails)
                .addGap(18, 18, 18)
                .addComponent(jButtonCreateUA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButtonEXIT)
                .addContainerGap())
        );

        jPanel1.add(Left);
        Left.setBounds(140, 0, 660, 500);

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

    private void jButtonCreateUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateUAActionPerformed
        NewAccount NewAccountFrame = new NewAccount();
        NewAccountFrame.setVisible(true);
        NewAccountFrame.pack();
        NewAccountFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonCreateUAActionPerformed

    private void jButtonAddProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProductsActionPerformed
        Products ProductsFrame = new Products();
        ProductsFrame.setVisible(true);
        ProductsFrame.pack();
        ProductsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonAddProductsActionPerformed

    private void jButtonViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewProductsActionPerformed
        View ViewFrame = new View();
        ViewFrame.setVisible(true);
        ViewFrame.pack();
        ViewFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonViewProductsActionPerformed

    private void jButtonSearchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchProductsActionPerformed
        Search SearchFrame = new Search();
        SearchFrame.setVisible(true);
        SearchFrame.pack();
        SearchFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonSearchProductsActionPerformed

    private void jButtonStockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStockDetailsActionPerformed
        StockDetails StockDetailsFrame = new StockDetails();
        StockDetailsFrame.setVisible(true);
        StockDetailsFrame.pack();
        StockDetailsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonStockDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(WorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButtonAddProducts;
    private javax.swing.JButton jButtonCreateUA;
    private javax.swing.JButton jButtonEXIT;
    private javax.swing.JButton jButtonSearchProducts;
    private javax.swing.JButton jButtonStockDetails;
    private javax.swing.JButton jButtonViewProducts;
    private javax.swing.JLabel jLabelWorkArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
