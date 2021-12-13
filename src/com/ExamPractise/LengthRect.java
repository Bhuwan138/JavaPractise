package com.ExamPractise;

import javax.swing.*;
import java.awt.event.*;

public class LengthRect {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Rectangle Calculator");
        frame.setBounds(30,50,350,220);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel title = new JLabel("Area Calculator");
        JLabel length = new JLabel("Enter the value of Length : ");
        JTextField lengthTF = new JTextField();
        JLabel breadth = new JLabel("Enter the value of Breadth : ");
        JTextField breadthTF = new JTextField();
        JButton calculate = new JButton("Calculate");
        JLabel result = new JLabel("Area of Rectangle is : ");
        JTextField resultTF = new JTextField();


        frame.add(title);
        frame.add(length);
        frame.add(lengthTF);
        frame.add(breadth);
        frame.add(breadthTF);
        frame.add(calculate);
        frame.add(result);
        frame.add(resultTF);

        title.setBounds(110,10,170,20);
        length.setBounds(10,25,170,20);
        lengthTF.setBounds(190,25,100,20);
        breadth.setBounds(10,50,170,20);
        breadthTF.setBounds(190,50,100,20);
        calculate.setBounds(110,80,150,20);
        result.setBounds(10,105,170,20);
        resultTF.setBounds(190,105,100,20);


        class Calc implements ActionListener {
            @Override
            public void actionPerformed (ActionEvent e) {
                double a = Double.parseDouble(lengthTF.getText());
                double b = Double.parseDouble(breadthTF.getText());
                double sum = a*b;
                resultTF.setText(""+sum);
            }
        }

        Calc cal = new Calc();
        calculate.addActionListener(cal);
    }
}
