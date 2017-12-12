package agileassignment;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;

public class ViewMenu extends javax.swing.JFrame {

    List<Menus> menus = new ArrayList<Menus>();
    String s = "";
    char type;
    int number;

    public ViewMenu() {
        initComponents();
        Menus menu = new Menus();
        menu.setMenuID("M1001");
        menu.setMenuName("Mango Romance");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(16.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1002");
        menu.setMenuName("Mango Tripe Delight");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(14.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1003");
        menu.setMenuName("Mango Sago");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(12.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1004");
        menu.setMenuName("Mango Crystal Jelly");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(12.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1005");
        menu.setMenuName("Mango Chewy Ball");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(15.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1006");
        menu.setMenuName("D24 Durian Mochi");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(20.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1007");
        menu.setMenuName("Mango Pancake");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(9.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1008");
        menu.setMenuName("Deluxe Mango Mochi");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(14.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1009");
        menu.setMenuName("Watermelon Honey Jelly");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(9.00);
        menus.add(menu);

        menu = new Menus();
        menu.setMenuID("M1010");
        menu.setMenuName("Healthy Mango Yakult");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(11.00);
        menus.add(menu);
        
        menu = new Menus();
        menu.setMenuID("M1011");
        menu.setMenuName("Coco Cake");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(10.00);
        menus.add(menu);
        
        menu = new Menus();
        menu.setMenuID("M1012");
        menu.setMenuName("Banana Cak");
        menu.setMenuType("Dessert");
        menu.setMenuPrice(12.00);
        menus.add(menu);
        showUserTable();
    }

    public void showUserTable() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < menus.size(); i++) {
            row[0] = menus.get(i).getMenuID();
            row[1] = menus.get(i).getMenuName();
            row[2] = menus.get(i).getMenuType();
            row[3] = String.format("%.2f", menus.get(i).getMenuPrice());

            model.addRow(row);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        mt = new javax.swing.JLabel();
        menuType = new javax.swing.JComboBox<>();
        n = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        menuID = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        price = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        errorName = new javax.swing.JLabel();
        errorPrice = new javax.swing.JLabel();
        errorPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        id.setEditable(false);
        id.setColumns(8);

        mt.setText("Menu Type : ");

        menuType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dessert", "Beverage", "Rice", "Noodles" }));

        n.setText("Name :");

        p.setText("Price (RM) :");

        menuID.setText("Menu ID : ");

        name.setColumns(8);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Menu ID", "Menu Name", "Menu Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        price.setColumns(8);

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(menuID, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(update)
                        .addGap(14, 14, 14)
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(errorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(menuType, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(errorName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuID)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mt)
                    .addComponent(menuType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update)
                            .addComponent(delete)
                            .addComponent(back)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(errorPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String menuID = id.getText();
        String menuName = name.getText();
        int num = menuType.getSelectedIndex();
        String type="";
        if(num == 0)
        {
            type = "Dessert";
        }
        else if(num == 1)
        {
            type = "Beverage";
        }
        else if(num == 2)
        {
            type = "Rice";
        }
        else if(num == 3)
        {
            type = "Noodles";
        }
        
        String prices = price.getText();
        
        //Refresh JTable data
        TableModel model = jTable.getModel();
        model.setValueAt(menuID, 11, 0);
        model.setValueAt(menuName, 11, 1);
        model.setValueAt(type, 11, 2);
        model.setValueAt(prices, 11, 3);
        JOptionPane.showMessageDialog(null, "Successful Updated", "Thank You", JOptionPane.INFORMATION_MESSAGE);
        clear();

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed


    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // Display selected row in JTextFields
        int i = jTable.getSelectedRow();
        TableModel model = jTable.getModel();
        id.setText(model.getValueAt(i, 0).toString());
        name.setText(model.getValueAt(i, 1).toString());
        String type = (model.getValueAt(i, 2).toString());
        if (type.charAt(0) == 'D') {
            number = 0;
        } else if (type.charAt(0) == ('B')) {
            number = 1;
        } else if (type.charAt(0) == 'N') {
            number = 2;
        } else if (type.charAt(0) == 'R') {
            number = 3;
        }
        menuType.setSelectedIndex(number);
        price.setText(model.getValueAt(i, 3).toString());

    }//GEN-LAST:event_jTableMouseClicked

    public void clear() {
        id.setText("");
        name.setText("");
        price.setText("");


    }

    public Boolean checkingPrice() {
        Boolean f = false;
        String checkPrice = price.getText();

        try {
            Double price = Double.parseDouble(checkPrice);
            errorPrice.setText("OK !");
            errorPrice.setForeground(Color.GREEN);
            f = true;
        } catch (Exception ex) {
            errorPrice.setText("Must number");
            errorPrice.setForeground(Color.RED);
            f = false;
        }

        return f;
    }

    public static void main(String args[]) {
        ViewMenu frame = new ViewMenu();
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel errorName;
    private javax.swing.JLabel errorPhoto;
    private javax.swing.JLabel errorPrice;
    private javax.swing.JTextField id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel menuID;
    private javax.swing.JComboBox<String> menuType;
    private javax.swing.JLabel mt;
    private javax.swing.JLabel n;
    private javax.swing.JTextField name;
    private javax.swing.JLabel p;
    private javax.swing.JTextField price;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private static class Menus {

        private String menuID;
        private String menuName;
        private String menuType;
        private double menuPrice;

        public Menus() {

        }

        public String getMenuID() {
            return menuID;
        }

        public void setMenuID(String menuID) {
            this.menuID = menuID;
        }

        public String getMenuName() {
            return menuName;
        }

        public void setMenuName(String menuName) {
            this.menuName = menuName;
        }

        public String getMenuType() {
            return menuType;
        }

        public void setMenuType(String menuType) {
            this.menuType = menuType;
        }

        public double getMenuPrice() {
            return menuPrice;
        }

        public void setMenuPrice(double menuPrice) {
            this.menuPrice = menuPrice;
        }

    }
}
