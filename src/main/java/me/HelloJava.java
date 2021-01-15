package me;

import javax.swing.*;
import java.awt.*;

public class HelloJava {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Hello, Java!");
        ImageIcon icon = new ImageIcon("/Users/anasharm/Downloads/dad-and-son.jpg");
        final JLabel label = new JLabel("Pic", icon, JLabel.CENTER);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(icon.getIconWidth(), icon.getIconHeight());
        frame.setVisible(true);
    }

}
