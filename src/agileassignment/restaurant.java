package agileassignment;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class restaurant extends javax.swing.JFrame {

    public restaurant() {
        initComponents();
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sushiKingButton = new javax.swing.JButton();
        nandosButton = new javax.swing.JButton();
        sakaeSushiButton = new javax.swing.JButton();
        huiLauShanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Please select one restaurant");

        sushiKingButton.setText("SUSHI KING");
        sushiKingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sushiKingButtonActionPerformed(evt);
            }
        });

        nandosButton.setText("NANDO'S");
        nandosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nandosButtonActionPerformed(evt);
            }
        });

        sakaeSushiButton.setText("SAKAE SUSHI");
        sakaeSushiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sakaeSushiButtonActionPerformed(evt);
            }
        });

        huiLauShanButton.setText("HUI LAU SHAN HEALTHY DESSERT");
        huiLauShanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huiLauShanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sushiKingButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(huiLauShanButton, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
            .addComponent(sakaeSushiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nandosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sushiKingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sakaeSushiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nandosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(huiLauShanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sushiKingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sushiKingButtonActionPerformed
        sushiKingMenu sushiKing = new sushiKingMenu();
        sushiKing.setVisible(true);
        sushiKing.pack();
        sushiKing.setLocationRelativeTo(null);
        sushiKing.setTitle("SUSHI KING");
        
    }//GEN-LAST:event_sushiKingButtonActionPerformed

    private void sakaeSushiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sakaeSushiButtonActionPerformed
        sakaeSushiMenu sakaeSushi = new sakaeSushiMenu();
        sakaeSushi.setVisible(true);
        sakaeSushi.pack();
        sakaeSushi.setLocationRelativeTo(null);
        sakaeSushi.setTitle("SAKAE SUSHI");
    }//GEN-LAST:event_sakaeSushiButtonActionPerformed

    private void nandosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nandosButtonActionPerformed
        nandosMenu nandosMenu = new nandosMenu();
        nandosMenu.setVisible(true);
        nandosMenu.pack();
        nandosMenu.setLocationRelativeTo(null);
        nandosMenu.setTitle("NANDO'S");
       }//GEN-LAST:event_nandosButtonActionPerformed

    private void huiLauShanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huiLauShanButtonActionPerformed
        huiLauShanMenu HuiLauShanMenu = new huiLauShanMenu();
        HuiLauShanMenu.setVisible(true);
        HuiLauShanMenu.pack();
        HuiLauShanMenu.setLocationRelativeTo(null);
        HuiLauShanMenu.setTitle("HUI LAU SHAN HEALTHY DESSERT"); 
    }//GEN-LAST:event_huiLauShanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                restaurant frame =new restaurant();
        frame.setTitle("SELECT RESTAURANT");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton huiLauShanButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nandosButton;
    private javax.swing.JButton sakaeSushiButton;
    private javax.swing.JButton sushiKingButton;
    // End of variables declaration//GEN-END:variables
}
