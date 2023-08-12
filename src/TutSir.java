//package com.spring23.c6;

import javax.swing.*;
import java.awt.*;

public class TutSir {

    public static void main(String[] args) {
        TutSir guiTest = new TutSir();
        guiTest.createFrame();
    }

    public void createFrame(){
        JFrame frame = new JFrame("Class C6");
        frame.setSize(900, 600);
//        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setSize(400, 300);

        BorderLayout layout1 = new BorderLayout();
        panel.setLayout(layout1);

        JLabel label1 = new JLabel("North");
        JLabel label2 = new JLabel("East");
        JLabel label3 = new JLabel("Center");
        JLabel label4 = new JLabel("West");
        JLabel label5 = new JLabel("South");

        label1.setBackground(Color.CYAN);
        label1.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setOpaque(true);
        label3.setBackground(Color.orange);
        label3.setOpaque(true);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setBackground(Color.YELLOW);
        label4.setOpaque(true);
        label5.setBackground(Color.black);
        label5.setOpaque(true);
        label5.setForeground(Color.white);
        label5.setOpaque(true);

        panel.add(label1, layout1.PAGE_START);
        panel.add(label2, layout1.LINE_START);
        panel.add(label3, layout1.CENTER);
        panel.add(label4, layout1.LINE_END);
        panel.add(label5, layout1.PAGE_END);

        frame.add(panel);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}