package me;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloJava2 {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Hello Java 2!");
        frame.add(new HelloComponent2("Hello, Java!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

class HelloComponent2 extends JComponent implements MouseMotionListener {

    private final String message;
    private int messageX = 125;
    private int messageY = 125;

    public HelloComponent2(String message) {
        this.message = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics graphics) {
        graphics.drawString(this.message, this.messageX, this.messageY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.messageX = e.getX();
        this.messageY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
