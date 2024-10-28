package com.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;

// public class Main{
//     public static void main(String[] args) {
//      BufferedImage myImage = null;
//      try {
//          myImage = ImageIO.read(new File("./wallpaper.jpg"));
//      } catch (IOException e) {
//          e.printStackTrace();
//      }
//      ImageIcon icon = new ImageIcon(myImage);
//      // Create a JLabel to display the image
//      JLabel label = new JLabel(icon);
//      JFrame frame = new JFrame("Image Display");
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.getContentPane().add(label);
//      frame.pack();
//      frame.setVisible(true);
//     }
// }

 public class Main{
     public static void main(String args[]) {
     //Creating the Frame
     JFrame frame = new JFrame("Support Chatbox");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(800, 800);
     //Creating the panel at bottom and adding components
     JPanel panel = new JPanel(); // the panel is not visible in output
     JLabel label = new JLabel("Enter Text");
     JTextField tf = new JTextField(10); // accepts upto 10 characters
     JButton send = new JButton("Send");
     panel.add(label); // Components Added using Flow Layout
     panel.add(tf);
     panel.add(send);
     // Text Area at the Center
     JTextArea ta = new JTextArea();
     //Adding Components to the frame.
     frame.getContentPane().add(BorderLayout.SOUTH, panel);
     frame.getContentPane().add(BorderLayout.CENTER, ta);
     frame.setVisible(true);
     }
     }