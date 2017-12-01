package agileassignment;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddMenu extends javax.swing.JFrame {

    List<Menus> menus = new ArrayList<Menus>();
    
    public AddMenu() { 
        initComponents();
        id.setText("M1011");

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
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Price : ");

        id.setEditable(false);
        id.setColumns(10);

        name.setColumns(10);

        price.setColumns(10);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setText("Create Menu");

        jLabel2.setText("Menu ID : ");

        jLabel3.setText("Name : ");

        jLabel4.setText("Type : ");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dessert", "Beverage", "Rice", "Noodles" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(price)
                            .addComponent(name)
                            .addComponent(id)
                            .addComponent(type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submit)
                            .addComponent(jLabel1))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        JOptionPane.showMessageDialog(null, "Successful Created", "Thank You", JOptionPane.INFORMATION_MESSAGE);
        ViewMenu frame = new ViewMenu();
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
        clear();
    }//GEN-LAST:event_submitActionPerformed

    public void clear() {
        id.setText("M1012");
        name.setText("");
        type.setSelectedIndex(0);
        price.setText("");
    }
    
    public static void main(String args[]) {
        
        AddMenu frame = new AddMenu();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox<String> type;
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
