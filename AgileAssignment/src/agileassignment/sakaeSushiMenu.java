package agileassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

public class sakaeSushiMenu extends JFrame{
    
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
    
    public sakaeSushiMenu(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        add(p1, BorderLayout.WEST);
        p1.setLayout(new GridLayout(7,2));
        add(p2, BorderLayout.EAST);
        p2.setLayout(new GridLayout(7,2));
        add(p3, BorderLayout.SOUTH);
        
        
        p1.setBorder(new TitledBorder("SUSHI MORIAWASE"));
        p1.add(new JLabel("Menu Item"));
        p1.add(new JLabel("Price (RM)"));
        p1.add(new JLabel("Quantity"));
        p1.add(new JLabel("Mentai Zukushi"));
        p1.add(new JLabel("11.00"));
        p1.add(qty1);
        p1.add(new JLabel("Sachi Set"));
        p1.add(new JLabel("22.00"));
        p1.add(qty2);
        p1.add(new JLabel("Salmon Zukushi"));
        p1.add(new JLabel("23.00"));
        p1.add(qty3);
        p1.add(new JLabel("Salmon Treasures"));
        p1.add(new JLabel("28.00"));
        p1.add(qty4);
        p1.add(new JLabel("Fuku Set"));
        p1.add(new JLabel("35.00"));
        p1.add(qty5);
        p1.add(new JLabel("Golden BallSalmon Trio Mayo"));
        p1.add(new JLabel("13.00"));
        p1.add(qty6);
        
        p2.setBorder(new TitledBorder("NIGIRI SUSHI"));
        p2.add(new JLabel("Menu Item"));
        p2.add(new JLabel("Price (RM)"));
        p2.add(new JLabel("Quantity"));
        p2.add(new JLabel("Salmon"));
        p2.add(new JLabel("6.00"));
        p2.add(qty7);
        p2.add(new JLabel("Mini Tempura Prawn"));
        p2.add(new JLabel("6.00"));
        p2.add(qty8);
        p2.add(new JLabel("Crabstick"));
        p2.add(new JLabel("4.00"));
        p2.add(qty9);
        p2.add(new JLabel("Abalone"));
        p2.add(new JLabel("6.00"));
        p2.add(qty10);
        p2.add(new JLabel("Sausage"));
        p2.add(new JLabel("2.00"));
        p2.add(qty11);
        p2.add(new JLabel("Corn Mentaiyaki"));
        p2.add(new JLabel("6.00"));
        p2.add(qty12);
        
        p3.add(btnReset);
        p3.add(new JButton("SUBMIT"));
        
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
