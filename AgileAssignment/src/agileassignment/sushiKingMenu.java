package agileassignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class sushiKingMenu extends JFrame{
    
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
    
    private JButton btnReset = new JButton("RESET");
    
     public sushiKingMenu(){
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        
        add(p1, BorderLayout.NORTH);
        p1.setLayout(new GridLayout(9,2));
        add(p2, BorderLayout.WEST);
        p2.setLayout(new GridLayout(4,2));
        add(p3, BorderLayout.CENTER);
        p3.setLayout(new GridLayout(4,2));
        add(p4, BorderLayout.SOUTH);
       
        p1.setBorder(new TitledBorder("SUSHI"));
        p1.add(new JLabel("Menu Item"));
        p1.add(new JLabel("Price (RM)"));
        p1.add(new JLabel("Quantity"));
        p1.add(new JLabel("Tamago"));
        p1.add(new JLabel("2.00"));
        p1.add(qty1);
        p1.add(new JLabel("Inari"));
        p1.add(new JLabel("3.00"));
        p1.add(qty2);
        p1.add(new JLabel("Unagi Slide"));
        p1.add(new JLabel("6.00"));
        p1.add(qty3);
        p1.add(new JLabel("Ebi Ten"));
        p1.add(new JLabel("6.00"));
        p1.add(qty4);
        p1.add(new JLabel("Surimi Scallop"));
        p1.add(new JLabel("4.00"));
        p1.add(qty5);
        p1.add(new JLabel("Golden Ball"));
        p1.add(new JLabel("4.00"));
        p1.add(qty6);
        p1.add(new JLabel("Chuka lidako Gunkan"));
        p1.add(new JLabel("4.00"));
        p1.add(qty7);
        p1.add(new JLabel("Tori Karaage Gunkan"));
        p1.add(new JLabel("3.00"));
        p1.add(qty8);
        
        p2.setBorder(new TitledBorder("TSUMAMI"));
        p2.add(new JLabel("Menu Item"));
        p2.add(new JLabel("Price (RM)"));
        p2.add(new JLabel("Quantity"));
        p2.add(new JLabel("Chuka lidako"));
        p2.add(new JLabel("5.00"));
        p2.add(qty9);
        p2.add(new JLabel("Edamame"));
        p2.add(new JLabel("5.00"));
        p2.add(qty10);
        p2.add(new JLabel("Kurage"));
        p2.add(new JLabel("5.00"));
        p2.add(qty11);
        
        p3.setBorder(new TitledBorder("TEMAKI"));
        p3.add(new JLabel("Menu Item"));
        p3.add(new JLabel("Price (RM)"));
        p3.add(new JLabel("Quantity"));
        p3.add(new JLabel("California Temaki"));
        p3.add(new JLabel("5.00"));
        p3.add(qty12);
        p3.add(new JLabel("Soft Shell Crab Temaki"));
        p3.add(new JLabel("5.00"));
        p3.add(qty13);
        p3.add(new JLabel("Unagi Temaki"));
        p3.add(new JLabel("5.00"));
        p3.add(qty14);
        
        p4.add(btnReset);
        p4.add(new JButton("SUBMIT"));
        
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
            }
        });
     }
    
}
