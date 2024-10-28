package com.example;

import javax.swing.*;
import java.awt.*;

//  public class Main {
//      public static void main(String[] args) {
//          JFrame frame = new JFrame("Product Display");
//          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          frame.setSize(255, 345);
//          frame.setVisible(true);
//          frame.setLayout(new FlowLayout());
//          JLabel label2 = new JLabel("Product Name:");
//          frame.add(label2);
//          JLabel productName = new JLabel("iPhone 15");
//          frame.add(productName);
//          JLabel label3 = new JLabel("Product Price:");
//          frame.add(label3);
//          JLabel productPrice = new JLabel("$1000");
//          frame.add(productPrice);
//          JLabel label4 = new JLabel("Product Description:");
//          frame.add(label4);
//          JLabel productDescription = new JLabel("Very good product by Apple. Made in China.");
//          frame.add(productDescription);
//          JLabel label5 = new JLabel("Product Image:");
//          frame.add(label5);
//          JLabel productImage = new JLabel("Image");
//          frame.add(productImage);
//          JLabel label6 = new JLabel("Product Quantity:");
//          frame.add(label6);
//          JLabel productQuantity = new JLabel("100");
//          frame.add(productQuantity);
//          JButton button = new JButton("Add Product");
//          frame.add(button);
//          JLabel label7 = new JLabel("Product Category:");
//          frame.add(label7);
//          JComboBox productCategory = new JComboBox();
//          productCategory.addItem("Electronics");
//          productCategory.addItem("Clothing");
//          productCategory.addItem("Books & Literature");
//          productCategory.addItem("Automotive");
//          productCategory.addItem("Health & Beauty");
//          productCategory.setSelectedItem("Electronics");
//          frame.add(productCategory);
//      }
//  }


 //Question 1
 public class Main {
     public static void main(String[] args) {
         JFrame frame = new JFrame("User Credentials");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(255, 345);
         frame.setVisible(true);
         frame.setLayout(new FlowLayout());
         JLabel label = new JLabel("Please register to create a new account");
         frame.add(label);
         JLabel label2 = new JLabel("Username:");    
         frame.add(label2);
         JTextField username = new JTextField(25);
         frame.add(username);
         JLabel emailLabel = new JLabel("Email:");
         frame.add(emailLabel);
         JTextField email = new JTextField(25);
         frame.add(email);
         JLabel passwordLabel = new JLabel("Password:");
         frame.add(passwordLabel);
         JTextField password = new JTextField(25);
         frame.add(password);
         JLabel label5 = new JLabel("Confirm Password:");
         frame.add(label5);
         JTextField confirmPassword = new JTextField(25);
         frame.add(confirmPassword);
         JCheckBox checkBox = new JCheckBox("Remember me");
         frame.add(checkBox);
         JButton button = new JButton("Register");
         frame.add(button);
     }
 }