package com.Other.SwingDemo;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AreaOFCircleTest {

    public static void main (String[] args) {

            JFrame frame = new JFrame("CircleAreaCalculator");
            frame.setBounds(300,300,300,300);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            //declearing layout
            JLabel radiusL,title;
            JTextField radiusTF,outputTF;
            JButton generator;

            title = new JLabel("Area Calculator");
            radiusL = new JLabel("Enter radius : ");
            radiusTF = new JTextField();
            generator = new JButton("Generator");
            outputTF = new JTextField();

            title.setBounds(100,50,100,20);
            radiusL.setBounds(50,120,100,20);
            radiusTF.setBounds(160,120,100,20);
            generator.setBounds(110,170,120,30);
            outputTF.setBounds(50,220,200,20);
            frame.setLayout(null);


            frame.add(title);
            frame.add(radiusL);
            frame.add(radiusTF);
            frame.add(generator);
            frame.add(outputTF);


            class Gen implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e){
                    int num = Integer.parseInt(radiusTF.getText());
                    double radius = Math.PI * Math.pow(num,2);
                    outputTF.setText(String.valueOf(radius));
                }
            }

            Gen gen = new Gen();
            generator.addActionListener(gen);

    }

}