package com.example;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
 
public class SwingControlDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public SwingControlDemo(){
      prepareGUI();
   }
   public static void main(String[] args){
      SwingControlDemo  swingControlDemo = new SwingControlDemo();      
      swingControlDemo.showImageIconDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(1280,720);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(100,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   // Returns an ImageIcon, or null if the path was invalid. 
   
   // private static ImageIcon createImageIcon(String path,
   //    String description) {
   //    java.net.URL imgURL = SwingControlDemo.class.getResource(path);
      
   //    if (imgURL != null) {
   //       return new ImageIcon(imgURL, description);
   //    } else {            
   //       System.err.println("Couldn't find file: " + path);
   //       return null;
   //    }
   // }
   private static ImageIcon createImageIcon(String path, String description) {
    File file = new File(path);
    if (file.exists()) {
        return new ImageIcon(path, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}
   private void showImageIconDemo(){
      headerLabel.setText("Control in action: ImageIcon"); 
      ImageIcon icon = createImageIcon("C:/Users/adamhuzefa/OneDrive - Manipal Education (MENA) FZ LLC/0 - Projects/EDP-Java/imageicontest/src/main/resources/19f6fcb7dd11e27f70df4dc65476413a.png","Java");
   
      JLabel commentlabel = new JLabel("", icon,JLabel.CENTER);
      int width = commentlabel.getWidth();
      int height = commentlabel.getHeight();
      Image image = icon.getImage(); 
      Image newimg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);  
      icon = new ImageIcon(newimg);  
      commentlabel.setIcon(icon);
      controlPanel.add(commentlabel);
      mainFrame.setVisible(true);  
}
}