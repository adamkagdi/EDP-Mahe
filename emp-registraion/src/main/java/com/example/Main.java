package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Employee Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        
        // Add form elements
        panel.add(new JLabel("First Name:"));
        JTextField firstNameField = new JTextField();
        panel.add(firstNameField);
        
        panel.add(new JLabel("Last Name:"));
        JTextField lastNameField = new JTextField();
        panel.add(lastNameField);
        
        panel.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField();
        panel.add(usernameField);
        
        panel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordField);
        
        panel.add(new JLabel("Contact:"));
        JTextField contactField = new JTextField();
        panel.add(contactField);
        
        // Add submit button
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);
        
        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usernameField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Username is required!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Handle form submission
                    JOptionPane.showMessageDialog(frame, "Form submitted successfully!");
                }
            }
        });
        
        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
