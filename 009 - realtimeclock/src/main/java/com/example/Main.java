package com.example;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Current Time");
        JLabel timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 48));
        timeLabel.setForeground(Color.BLACK);
        timeLabel.setBackground(Color.WHITE);
        timeLabel.setOpaque(true);

        frame.add(timeLabel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                int second, minute, hour;
                Calendar date = Calendar.getInstance();
                second = date.get(Calendar.SECOND);
                minute = date.get(Calendar.MINUTE);
                hour = date.get(Calendar.HOUR_OF_DAY); // Use HOUR_OF_DAY for 24-hour format

                String currentTime = String.format("%02d : %02d : %02d", hour, minute, second);
                timeLabel.setText(currentTime);
            }
        }, 0, 1000); // Update every second
    }
}
