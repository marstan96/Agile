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

        jtfMenuID = new javax.swing.JTextField();
        menuType = new javax.swing.JLabel();
        menuItem = new javax.swing.JComboBox<>();
        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        menuID = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jtfPrice = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        errorName = new javax.swing.JLabel();
        errorPrice = new javax.swing.JLabel();
        errorPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfMenuID.setEditable(false);
        jtfMenuID.setColumns(8);

        menuType.setText("Menu Type : ");

        menuItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dessert", "Beverage", "Rice", "Noodles" }));

        name.setText("Name :");

        price.setText("Price (RM) :");

        menuID.setText("Menu ID : ");

        jtfName.setColumns(8);

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

        jtfPrice.setColumns(8);

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
                    .addComponent(menuType, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(menuID, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(errorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(errorName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfMenuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 85, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuID)
                    .addComponent(jtfMenuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuType)
                    .addComponent(menuItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(price)
                        .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update)
                            .addComponent(delete)
                            .addComponent(back)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(errorPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

       
                

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        

    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
        
    }//GEN-LAST:event_jTableMouseClicked

    public void clear() {
        jtfMenuID.setText("");
        jtfName.setText("");
        jtfPrice.setText("");
        errorName.setText("");
        errorPrice.setText("");

    }

    public Boolean checkingPrice() {
        Boolean f = false;
        String checkPrice = jtfPrice.getText();

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
        frame.setTitle("View Menu(Manager)");
        frame.pack();
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jtfMenuID;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JLabel menuID;
    private javax.swing.JComboBox<String> menuItem;
    private javax.swing.JLabel menuType;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
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

    }}
