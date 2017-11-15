package agileassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

public class kennyRogersRoasterMenu extends JFrame{
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
    
    private JButton btnReset = new JButton("RESET");
    
    public kennyRogersRoasterMenu(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        p1.setLayout(new GridLayout(6,2));
        
        add(p2, BorderLayout.WEST);
        p2.setLayout(new GridLayout(3,2));
        
        add(p3, BorderLayout.CENTER);
        p3.setLayout(new GridLayout(3,2));
        
        add(p4, BorderLayout.EAST);
        p4.setLayout(new GridLayout(3,2));
        
        add(p5, BorderLayout.SOUTH);
        
        p1.setBorder(new TitledBorder("KENNY'S CHICKEN MEALS"));
        p1.add(new JLabel("Menu Item"));
        p1.add(new JLabel("Price (RM)"));
        p1.add(new JLabel("Quantity"));
        p1.add(new JLabel("Kenny's Quarter Meal"));
        p1.add(new JLabel("19.00"));
        p1.add(qty1);
        p1.add(new JLabel("Kenny's Half Meal"));
        p1.add(new JLabel("28.00"));
        p1.add(qty2);
        p1.add(new JLabel("Kenny's Chicken and Garden Meal"));
        p1.add(new JLabel("21.00"));
        p1.add(qty3);
        p1.add(new JLabel("Kenny's Chicken and Pasta Meal"));
        p1.add(new JLabel("22.00"));
        p1.add(qty4);
        
        p2.setBorder(new TitledBorder("PASTA MEAL"));
        p2.add(new JLabel("Menu Item"));
        p2.add(new JLabel("Price (RM)"));
        p2.add(new JLabel("Quantity"));
        p2.add(new JLabel("Chicken Macaroni Cheese"));
        p2.add(new JLabel("16.00"));
        p2.add(qty5);
        p2.add(new JLabel("Beef Bolognaise Spaghetti"));
        p2.add(new JLabel("16.00"));
        p2.add(qty6);
        
        p3.setBorder(new TitledBorder("SALAD"));
        p3.add(new JLabel("Menu Item"));
        p3.add(new JLabel("Price (RM)"));
        p3.add(new JLabel("Quantity"));
        p3.add(new JLabel("Chicken Caesar Salad"));
        p3.add(new JLabel("16.00"));
        p3.add(qty7);
        p3.add(new JLabel("Roasted Chicken Salad Meal"));
        p3.add(new JLabel("16.00"));
        p3.add(qty8);
        
        p4.setBorder(new TitledBorder("FRUIT JUICE"));
        p4.add(new JLabel("Menu Item"));
        p4.add(new JLabel("Price (RM)"));
        p4.add(new JLabel("Quantity"));
        p4.add(new JLabel("Mango Fruit Juice"));
        p4.add(new JLabel("8.00"));
        p4.add(qty9);
        p4.add(new JLabel("Orange Fruit Juice"));
        p4.add(new JLabel("8.00"));
        p4.add(qty10);
        
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
            }
        });
    }
    
    
}
