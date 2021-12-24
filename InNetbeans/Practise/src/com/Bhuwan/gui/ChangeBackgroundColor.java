package com.Bhuwan.gui;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class ChangeColor extends Frame implements ActionListener{
    Button exit,changeColor;
    Random r;
    ChangeColor(String title){
        super(title);
        
        exit = new Button("Exit");
        changeColor = new Button("Change Color");
       
        setLayout(new FlowLayout());
        add(exit);
        add(changeColor);
            
        exit.addActionListener(this);
        changeColor.addActionListener(this);
        r = new Random();
        setBounds(50,50,500,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit)
            System.exit(0);
        else{
            int red = r.nextInt(256);
            int green = r.nextInt(256);
            int blue = r.nextInt(256);
            setBackground( new Color(red,green,blue));
        } 
        
    }
} 


    

public class ChangeBackgroundColor {
    public static void main(String[] args) {
        ChangeColor ch = new ChangeColor("Change Color App");
    }
}
