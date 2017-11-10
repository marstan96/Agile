package agileassignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class restaurant extends JFrame{
    
    private JLabel restaurant= new JLabel("Please select one restaurant");
    private JButton restaurant1 = new JButton("Sushi King");
    private JButton restaurant2 = new JButton("Sakae Sushi");
    private JButton restaurant3 = new JButton("Kenny Rogers Roasters");
    private JButton restaurant4 = new JButton("Nando's");
    private JButton restaurant5 = new JButton("Hui Lau Shan Healthy Dessert");
    private JButton restaurant6 = new JButton("Fuel Snack");
    
    public restaurant(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(7,1));
        add(p1, BorderLayout.CENTER);
        
        p1.add(restaurant);
        p1.add(restaurant1);
        p1.add(restaurant2);
        p1.add(restaurant3);
        p1.add(restaurant4);
        p1.add(restaurant5);
        p1.add(restaurant6);
        
        restaurant1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sushiKingMenu sushiKing = new sushiKingMenu();
                sushiKing.setVisible(true);
                sushiKing.pack();
                sushiKing.setTitle("SUSHI KING");
            }
        });
        
        restaurant2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sakaeSushiMenu sakaeSushi = new sakaeSushiMenu();
                sakaeSushi.setVisible(true);
                sakaeSushi.pack();
                sakaeSushi.setTitle("SAKAE SUSHI");
            }
        });
        
        restaurant3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                kennyRogersRoasterMenu kennyRogers = new kennyRogersRoasterMenu();
                kennyRogers.setVisible(true);
                kennyRogers.pack();
                kennyRogers.setTitle("KENNY ROGERS ROASTER");
            }
        });
        
        restaurant4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nandosMenu nandos = new nandosMenu();
                nandos.setVisible(true);
                nandos.pack();
                nandos.setTitle("NANDO'S");
            }
        });
        
        restaurant5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                HuiLauShanMenu HuilauShan = new HuiLauShanMenu();
                HuilauShan.setVisible(true);
                HuilauShan.pack();
                HuilauShan.setTitle("HUI LAU SHAN HEALTHY DESSERT");
            }
        });
        
        restaurant6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fuelSnackMenu fuelSnack = new fuelSnackMenu();
                fuelSnack.setVisible(true);
                fuelSnack.pack();
                fuelSnack.setTitle("FUEL SNACK");
            }
        });
    }
    
    public static void main(String[] args) {
        restaurant frame =new restaurant();
        frame.setSize(300,500);
        frame.setTitle("SELECT RESTAURANT");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
