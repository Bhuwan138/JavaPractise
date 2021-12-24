
package com.Bhuwan.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrame2 extends Frame implements ActionListener{
    Button exit,redColor,blueColor,greenColor;
    MyFrame2(String title){
        super(title);
        
        exit = new Button("Exit");
        redColor = new Button("Change Frame to Red Color");
        blueColor = new Button("Change Frame to Blue Color");
        greenColor = new Button("Change Frame to Green Color");
        setLayout(new FlowLayout());
        add(exit);
        add(redColor);
        add(blueColor);
        add(greenColor);      
        exit.addActionListener(this);
        redColor.addActionListener(this);
        blueColor.addActionListener(this);
        greenColor.addActionListener(this);
        setBounds(50,50,500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit)
            System.exit(0);
        else if(ae.getSource() == redColor){
            setBackground(Color.RED);
        } 
        else if(ae.getSource()== blueColor){
            setBackground(Color.BLUE);
        }
        else if(ae.getSource() == greenColor){
            setBackground(Color.GREEN);
        }
    }
    
    
}

public class UseMyFrame2 {
    public static void main(String[] args) {
        MyFrame2 mf2 = new MyFrame2("Bhuwan Frame");
    }
}
