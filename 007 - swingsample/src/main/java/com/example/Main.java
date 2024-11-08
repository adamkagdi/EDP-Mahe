package com.example;
import javax.swing.*;
import java.awt.*;

// example 1
/* 
 public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
} 
*/

// example 2
/*
 public class Main{
    public static void main(String args[]){
    JFrame frame = new JFrame("My First GUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    JButton button1 = new JButton("Press");
    frame.getContentPane().add(button1);
    frame.setVisible(true);
    }
    } 
*/
// example 3

public class Main{
    public static void main(String args[]) {
    //Creating the Frame
    JFrame frame = new JFrame("Chat Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    //Creating the MenuBar and adding components
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("FILE");
    JMenu m2 = new JMenu("Help");
    mb.add(m1);
    mb.add(m2);
    JMenuItem m11 = new JMenuItem("Open");
    JMenuItem m22 = new JMenuItem("Save as");
    m1.add(m11);
    m1.add(m22);
    //Creating the panel at bottom and adding components
    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Enter Text");
    JTextField tf = new JTextField(10); // accepts upto 10 characters
    JButton send = new JButton("Send");
    JButton reset = new JButton("Reset");
    JCheckBox confirm = new JCheckBox("Confirm");
    // adding drop down box
    String[] request = {"Help Desk", "IT Department", "Transport Department"};
    JComboBox requestlist = new JComboBox(request);
    requestlist.setSelectedIndex(1);
    panel.add(label); // Components Added using Flow Layout
    panel.add(tf);
    panel.add(requestlist);
    panel.add(confirm);
    panel.add(send);
    panel.add(reset);
    // Text Area at the Center
    JTextArea ta = new JTextArea();
    //Adding Components to the frame.
    frame.getContentPane().add(BorderLayout.SOUTH,
    panel);
    frame.getContentPane().add(BorderLayout.NORTH,
    mb);
    frame.getContentPane().add(BorderLayout.CENTER,
    ta);
    frame.setVisible(true);
    }
    } 