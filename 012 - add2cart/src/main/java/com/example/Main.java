package com.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    private static int itemCount = 0; // Variable to track the number of items in the cart
    public static void main(String args[]) {
        JFrame f = new JFrame("ONLINE SHOPPING");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Home");
        JMenu m2 = new JMenu("Shop");
        JMenu m3 = new JMenu("Offers");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        JMenuItem mi1 = new JMenuItem("Winter Sale");
        JMenuItem mi2 = new JMenuItem("Festival Sale");
        m3.add(mi1);
        m3.add(mi2);
        f.add(mb, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setBackground(Color.BLUE);
        p.setLayout(new GridLayout(0, 1)); // Vertical layout

        // User input section
        JPanel userInputPanel = new JPanel();
        userInputPanel.setLayout(new GridLayout(3, 2)); // 3 rows, 2 columns

        // Product section
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(0, 1)); // Vertical layout

        String[] products = {"T-shirt - 15 AED", "Jeans - 25 AED", "Shoes - 30 AED"};
        for (String product : products) {
            JPanel itemPanel = new JPanel();
            JLabel itemLabel = new JLabel(product);
            JButton addButton = new JButton("Add to Cart");

            // Add action listener to the button
            addButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //JOptionPane.showMessageDialog(f, "Item added to cart: " + product);
                    itemCount++;
                    JOptionPane.showMessageDialog(f, "Item added to cart! Total items: " + itemCount); 
                }
            });

            itemPanel.add(itemLabel);
            itemPanel.add(addButton);
            productPanel.add(itemPanel);
        }

        p.add(productPanel);

        f.getContentPane().add(p, BorderLayout.CENTER);
        f.setVisible(true);
    }
}
