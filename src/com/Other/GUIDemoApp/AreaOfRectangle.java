package com.Other.GUIDemoApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;

public class AreaOfRectangle {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Area of Rectangle");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,300);
//        frame.setLocation(250,200);
        frame.setBounds(250,200,300,300);

        JLabel lengthL,bredthL,resultL,titleL;
        JTextField lengthTA, bredthTA, resultTA;
        JButton calculate;

        titleL = new JLabel("Area Calculator");
        lengthL = new JLabel("Enter Length : ");
        lengthTA = new JTextField();

        bredthL = new JLabel("Enter Bredth : ");
        bredthTA = new JTextField();

        calculate = new JButton("Calculate");


        resultL = new JLabel("Area of Rectangle : ");
        resultTA = new JTextField();

        frame.add(titleL);
        frame.add(lengthL);
        frame.add(lengthTA);
        frame.add(bredthL);
        frame.add(bredthTA);
        frame.add(calculate);
        frame.add(resultL);
        frame.add(resultTA);

        titleL.setBounds(90,20,180,40);
        lengthL.setBounds(20,70,100,20);
        lengthTA.setBounds(140,70,120,20);

        bredthL.setBounds(20,93,100,20);
        bredthTA.setBounds(140,93,120,20);

        calculate.setBounds(75,140,100,30);

        resultL.setBounds(20,190,120,20);
        resultTA.setBounds(140,190,120,20);



        class Generate implements ActionListener{
            public void actionPerformed(ActionEvent e){
               Double l =  Double.parseDouble(lengthTA.getText());
               Double b =  Double.parseDouble(bredthTA.getText());
               Double area = l*b;
               resultTA.setText(String.valueOf(area));
            }
        }

        Generate generate = new Generate();
        calculate.addActionListener(generate);



    }
}
