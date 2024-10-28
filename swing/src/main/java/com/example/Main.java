package com.example;

import java.awt.Rectangle;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Creating the stuff
		JFrame f = new JFrame("Title");
		JPanel p = new JPanel();
		JButton b = new JButton("Press me");
		JButton b2 = new JButton("Dont press me");

		// Adding the buttons to the panel and frame
        b.setBounds(new Rectangle(10,10, 100,50));
        p.setLayout(null);
		p.add(b);
		p.add(b2);
		f.setContentPane(p);

		// Showing the Frame
		f.show();
    }
}
