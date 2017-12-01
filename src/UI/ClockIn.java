/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;

/**
 *
 * @author renmi
 */
public class ClockIn extends javax.swing.JFrame {
        private ArrayList<String> clockIn = new ArrayList<String>();
//        private ArrayList<String> clockOut = new ArrayList<String>();
        private Date now = new Date();
    /**
     * Creates new form ClockIn
     */
    public ClockIn() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlbStaffName = new javax.swing.JLabel();
        jcbStaffId = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaClock = new javax.swing.JTextArea();
        jbtClockIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtClockOut = new javax.swing.JButton();
        jlbPassword = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbStaffName.setText("Staff ID: ");

        jcbStaffId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Please select]", "ST001", "ST002", "ST003" }));
        jcbStaffId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStaffIdActionPerformed(evt);
            }
        });

        jtaClock.setColumns(20);
        jtaClock.setRows(5);
        jScrollPane1.setViewportView(jtaClock);

        jbtClockIn.setText("CLOCK IN");
        jbtClockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClockInActionPerformed(evt);
            }
        });

        jLabel2.setText("STAFF CLOCK IN");

        jbtClockOut.setText("CLOCK OUT");
        jbtClockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClockOutActionPerformed(evt);
            }
        });

        jlbPassword.setText("Password:");

        jtfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbStaffName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel1))
                                    .addComponent(jcbStaffId, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jbtClockOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtClockIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addComponent(jlbStaffName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtClockIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtClockOut)
                    .addComponent(jlbPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbStaffIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStaffIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbStaffIdActionPerformed

    private void jbtClockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClockInActionPerformed
        clockIn.add(jcbStaffId.getSelectedItem().toString());
        if(jcbStaffId.toString().equals("ST001") || jtfPassword.getText().equals("ST001"))
        {
        jtaClock.setText(null);
        jtaClock.setText("Alex had clock in at "+now);
        clockIn.add("Alex");
        }
        else if(jcbStaffId.toString().equals("ST002") || jtfPassword.getText().equals("ST002"))
        {
        jtaClock.setText(null);
        jtaClock.setText("Edward had clock in at "+now);
        clockIn.add("Edward");
        }
        else if(jcbStaffId.toString().equals("ST003") || jtfPassword.getText().equals("ST003"))
        {
        jtaClock.setText(null);
        jtaClock.setText("John had clock in at "+now);
        clockIn.add("John");
        }
        else
            jtaClock.setText("Password and ID does not fit");
    }//GEN-LAST:event_jbtClockInActionPerformed

    private void jbtClockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClockOutActionPerformed
//        String staffName = jcbStaffName.getSelectedItem().toString();
//        if(clockIn.contains(""+staffName))
//        clockIn.remove(staffName);
//        clockOut.add(staffName);
//        jtaClock.setText(null);
//        jtaClock.setText(""+staffName+"had clock out at "
//        +now);
        
    }//GEN-LAST:event_jbtClockOutActionPerformed

    private void jtfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClockIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClockIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtClockIn;
    private javax.swing.JButton jbtClockOut;
    private javax.swing.JComboBox<String> jcbStaffId;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbStaffName;
    private javax.swing.JTextArea jtaClock;
    private javax.swing.JTextField jtfPassword;
    // End of variables declaration//GEN-END:variables
}
