package com.Other.SwingDemo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo1 {
    public static void main (String[] args) {
        JFrame frame = new JFrame("Square Calculator ");
        frame.setVisible(true);
        frame.setBounds(500,250,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading,name,result;
        JTextField number;
        JButton square;



        frame.setLayout(null);
        heading = new JLabel("Square number generator");
        heading.setBounds(75,25,200,20);
        name = new JLabel("Enter a number : ");
        name.setBounds(50,50,100,20);
        number = new JTextField();
        number.setBounds(160,50,100,20);
        square = new JButton("Square");
        square.setBounds(100,80,100,20);
        result = new JLabel();
        result.setBounds(50,120,200,20);







        frame.add(heading);
        frame.add(name);
        frame.add(number);
        frame.add(square);
        frame.add(result);

        class Listner implements ActionListener{
            @Override
            public void actionPerformed (ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                result.setText("Square of " + num + " is " + Math.pow(num,2));
            }
        }
        square.addActionListener(new Listner());



    }

}
