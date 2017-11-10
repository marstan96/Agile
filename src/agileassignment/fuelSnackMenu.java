package agileassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

public class fuelSnackMenu extends JFrame{
    
    private JTextField qty1 = new JTextField(1);
    private JTextField qty2 = new JTextField(1);
    private JTextField qty3 = new JTextField(1);
    private JTextField qty4 = new JTextField(1);
    private JTextField qty5 = new JTextField(1);
    private JTextField qty6 = new JTextField(1);
    private JTextField qty7 = new JTextField(1);
    private JTextField qty8 = new JTextField(1);
    private JTextField qty9 = new JTextField(1);
    private JTextField qty10 = new JTextField(1);
    private JTextField qty11 = new JTextField(1);
    private JTextField qty12 = new JTextField(1);
    
    private JButton btnReset = new JButton("RESET");
    
    public fuelSnackMenu(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        p1.setLayout(new GridLayout(7,2));
        
        add(p2, BorderLayout.WEST);
        p2.setLayout(new GridLayout(3,2));
        
        add(p3, BorderLayout.CENTER);
        p3.setLayout(new GridLayout(4,2));
        
        add(p4, BorderLayout.EAST);
        p4.setLayout(new GridLayout(2,2));
        
        add(p5, BorderLayout.SOUTH);
        
        p1.setBorder(new TitledBorder("BURGERS"));
        p1.add(new JLabel("Menu Item"));
        p1.add(new JLabel("Price (RM)"));
        p1.add(new JLabel("Quantity"));
        p1.add(new JLabel("Lamb Supreme"));
        p1.add(new JLabel("21.00"));
        p1.add(qty1);
        p1.add(new JLabel("Dory Fillet"));
        p1.add(new JLabel("14.00"));
        p1.add(qty2);
        p1.add(new JLabel("Aloha Chicken"));
        p1.add(new JLabel("16.00"));
        p1.add(qty3);
        p1.add(new JLabel("Mini Tower"));
        p1.add(new JLabel("25.00"));
        p1.add(qty4);
        p1.add(new JLabel("Cheese Burger"));
        p1.add(new JLabel("14.00"));
        p1.add(qty5);
        p1.add(new JLabel("Blue Cheese Deluxe"));
        p1.add(new JLabel("18.00"));
        p1.add(qty6);
        
        p2.setBorder(new TitledBorder("WRAPS"));
        p2.add(new JLabel("Menu Item"));
        p2.add(new JLabel("Price (RM)"));
        p2.add(new JLabel("Quantity"));
        p2.add(new JLabel("Tempura Chicken Wrap"));
        p2.add(new JLabel("14.00"));
        p2.add(qty7);
        p2.add(new JLabel("Grilled Chicken Wrap"));
        p2.add(new JLabel("14.00"));
        p2.add(qty8);
        
        p3.setBorder(new TitledBorder("PASTA"));
        p3.add(new JLabel("Menu Item"));
        p3.add(new JLabel("Price (RM)"));
        p3.add(new JLabel("Quantity"));
        p3.add(new JLabel("Bolognese"));
        p3.add(new JLabel("14.00"));
        p3.add(qty9);
        p3.add(new JLabel("Carbonara"));
        p3.add(new JLabel("14.00"));
        p3.add(qty10);
        p3.add(new JLabel("Aglio Olio"));
        p3.add(new JLabel("12.00"));
        p3.add(qty11);
        
        p4.setBorder(new TitledBorder("FRIED"));
        p4.add(new JLabel("Menu Item"));
        p4.add(new JLabel("Price (RM)"));
        p4.add(new JLabel("Quantity"));
        p4.add(new JLabel("Cheese Fries"));
        p4.add(new JLabel("8.00"));
        p4.add(qty12);
        
        p5.add(btnReset);
        p5.add(new JButton("SUBMIT"));
        
        btnReset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                qty1.setText("");
                qty2.setText("");
                qty3.setText("");
                qty4.setText("");
                qty5.setText("");
                qty6.setText("");
                qty7.setText("");
                qty8.setText("");
                qty9.setText("");
                qty10.setText("");
                qty11.setText("");
                qty12.setText("");
            }
        });
    }
    
}
