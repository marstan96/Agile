package agileassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

public class nandosMenu extends JFrame{
    
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
    
    public nandosMenu(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        p1.setLayout(new GridLayout(6,2));
        
        add(p2, BorderLayout.WEST);
        p2.setLayout(new GridLayout(4,2));
        
        add(p3, BorderLayout.CENTER);
        p3.setLayout(new GridLayout(3,2));
        
        add(p4, BorderLayout.EAST);
        p4.setLayout(new GridLayout(3,2));
        
        add(p5, BorderLayout.SOUTH);
        
        p1.setBorder(new TitledBorder("BURGERS AND WRAPS"));
        p1.add(new JLabel("Menu Item"));
        p1.add(new JLabel("Price (RM)"));
        p1.add(new JLabel("Quantity"));
        p1.add(new JLabel("Chicken Wrap"));
        p1.add(new JLabel("18.00"));
        p1.add(qty1);
        p1.add(new JLabel("Chicken Breast Burger"));
        p1.add(new JLabel("18.00"));
        p1.add(qty2);
        p1.add(new JLabel("Chicken Caesar Wrap"));
        p1.add(new JLabel("17.00"));
        p1.add(qty3);
        p1.add(new JLabel("Chicken Pita"));
        p1.add(new JLabel("17.00"));
        p1.add(qty4);
        p1.add(new JLabel("Veggie Burger"));
        p1.add(new JLabel("17.00"));
        p1.add(qty5);
        
        p2.setBorder(new TitledBorder("SIDES"));
        p2.add(new JLabel("Menu Item"));
        p2.add(new JLabel("Price (RM)"));
        p2.add(new JLabel("Quantity"));
        p2.add(new JLabel("Coleslaw"));
        p2.add(new JLabel("5.00"));
        p2.add(qty6);
        p2.add(new JLabel("Garlic Bread"));
        p2.add(new JLabel("5.00"));
        p2.add(qty7);
        p2.add(new JLabel("Chargrilled Veg"));
        p2.add(new JLabel("5.00"));
        p2.add(qty8);
        
        p3.setBorder(new TitledBorder("SALAD"));
        p3.add(new JLabel("Menu Item"));
        p3.add(new JLabel("Price (RM)"));
        p3.add(new JLabel("Quantity"));
        p3.add(new JLabel("Algarve Salad"));
        p3.add(new JLabel("16.00"));
        p3.add(qty9);
        p3.add(new JLabel("Caesar Salad"));
        p3.add(new JLabel("14.00"));
        p3.add(qty10);
        
        p4.setBorder(new TitledBorder("DESSERTS"));
        p4.add(new JLabel("Menu Item"));
        p4.add(new JLabel("Price (RM)"));
        p4.add(new JLabel("Quantity"));
        p4.add(new JLabel("Red Velvet Cake"));
        p4.add(new JLabel("10.00"));
        p4.add(qty11);
        p4.add(new JLabel("Caramel Cheesecake"));
        p4.add(new JLabel("10.00"));
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
