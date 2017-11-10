package agileassignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.TitledBorder;

public class HuiLauShanMenu extends JFrame{
    
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
    private JTextField qty13 = new JTextField(1);
    private JTextField qty14 = new JTextField(1);
    private JTextField qty15 = new JTextField(1);
    private JTextField qty16 = new JTextField(1);
    private JTextField qty17 = new JTextField(1);
    
    private JButton btnReset = new JButton("RESET");
    
    public HuiLauShanMenu(){
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        p1.setLayout(new GridLayout(6,2));
        
        add(p2, BorderLayout.WEST);
        p2.setLayout(new GridLayout(5,2));
        
        add(p3, BorderLayout.CENTER);
        p3.setLayout(new GridLayout(5,2));
        
        add(p4, BorderLayout.EAST);
        p4.setLayout(new GridLayout(5,2));
        
        add(p5, BorderLayout.SOUTH);
        
        p1.setBorder(new TitledBorder("MANGO MANIA"));
        p1.add(new JLabel("Menu Item"));
        p1.add(new JLabel("Price (RM)"));
        p1.add(new JLabel("Quantity"));
        p1.add(new JLabel("Mango Romance"));
        p1.add(new JLabel("16.00"));
        p1.add(qty1);
        p1.add(new JLabel("Mango Triple Delight"));
        p1.add(new JLabel("14.00"));
        p1.add(qty2);
        p1.add(new JLabel("Mango Sago"));
        p1.add(new JLabel("12.00"));
        p1.add(qty3);
        p1.add(new JLabel("Mango Crystal Jelly"));
        p1.add(new JLabel("12.00"));
        p1.add(qty4);
        p1.add(new JLabel("Mango Chewy Ball"));
        p1.add(new JLabel("15.00"));
        p1.add(qty5);
        
        p2.setBorder(new TitledBorder("SWEET BITES"));
        p2.add(new JLabel("Menu Item"));
        p2.add(new JLabel("Price (RM)"));
        p2.add(new JLabel("Quantity"));
        p2.add(new JLabel("D24 Durian Mochi"));
        p2.add(new JLabel("20.00"));
        p2.add(qty6);
        p2.add(new JLabel("Mango Pancake"));
        p2.add(new JLabel("9.00"));
        p2.add(qty7);
        p2.add(new JLabel("Deluxe Mango Mochi"));
        p2.add(new JLabel("14.00"));
        p2.add(qty8);
        p2.add(new JLabel("Silky Mango Pudding"));
        p2.add(new JLabel("7.00"));
        p2.add(qty9);
        
        p3.setBorder(new TitledBorder("FRUITY BEVERAGE"));
        p3.add(new JLabel("Menu Item"));
        p3.add(new JLabel("Price (RM)"));
        p3.add(new JLabel("Quantity"));
        p3.add(new JLabel("Watermelon Honey Jelly"));
        p3.add(new JLabel("9.00"));
        p3.add(qty10);
        p3.add(new JLabel("Healthy Mango Yakult"));
        p3.add(new JLabel("11.00"));
        p3.add(qty11);
        p3.add(new JLabel("Mango Cocont Pandan Jelly"));
        p3.add(new JLabel("11.00"));
        p3.add(qty12);
        p3.add(new JLabel("Monin Peach Cider"));
        p3.add(new JLabel("9.00"));
        p3.add(qty13);
        
        p4.setBorder(new TitledBorder("BLOSSOM TEA"));
        p4.add(new JLabel("Menu Item"));
        p4.add(new JLabel("Price (RM)"));
        p4.add(new JLabel("Quantity"));
        p4.add(new JLabel("Berries Passion Apple Tea"));
        p4.add(new JLabel("12.00"));
        p4.add(qty14);
        p4.add(new JLabel("Jasmine Aloe Vera Tea"));
        p4.add(new JLabel("12.00"));
        p4.add(qty15);
        p4.add(new JLabel("Peppermint Ginger Honey Tea"));
        p4.add(new JLabel("12.00"));
        p4.add(qty16);
        p4.add(new JLabel("Rosehip Aloe Vera Pear Tea"));
        p4.add(new JLabel("12.00"));
        p4.add(qty17);
        
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
                qty13.setText("");
                qty14.setText("");
                qty15.setText("");
                qty16.setText("");
                qty17.setText("");
            }
        });
    }
    
}
