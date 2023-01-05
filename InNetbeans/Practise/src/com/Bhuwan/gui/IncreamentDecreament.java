
package com.Bhuwan.gui;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IncDec extends Frame implements ActionListener{
    Button exit,inc,dec;
    int num = 0;
    public IncDec(String title){
        super(title);
        exit = new Button("Close Frame");
        inc = new Button("Increament Me");   
        dec = new Button("Decreament Me");
        setLayout(new FlowLayout());
        add(exit);
        add(inc);
        add(dec);
        exit.addActionListener(this);
        inc.addActionListener(this);
        dec.addActionListener(this);
        
        setBounds(100,100,400,400);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource() == inc)
//            setTitle(String.valueOf(++num));
//        else if(ae.getSource() == dec){
//            setTitle(String.valueOf(--num));
//        }
//         else{
//           System.exit(0);
//         }
        if(ae.getSource() == exit){
            System.exit(0);
        }
        else{
            num = (ae.getSource() == inc)?++num:--num;
            setTitle(String.valueOf(num));
        }
        
    }
    
}

public class IncreamentDecreament {
     public static void main(String[] args) {
        IncDec cm = new IncDec("0");
    }
}
