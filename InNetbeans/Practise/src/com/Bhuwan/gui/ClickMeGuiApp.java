
package com.Bhuwan.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ClickMe extends Frame implements ActionListener{
    Button exit,clickMe;
    int num = 0;
    public ClickMe(String title){
        super(title);
        exit = new Button("Close Frame");
        clickMe = new Button("Click Me");        
        setLayout(new FlowLayout());
        add(exit);
        add(clickMe);
        exit.addActionListener(this);
        clickMe.addActionListener(this);
        
        setBounds(100,100,400,400);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit)
            System.exit(0);
        else{
            setTitle(String.valueOf(++num));
        }
    }
    
}

public class ClickMeGuiApp {
    public static void main(String[] args) {
        ClickMe cm = new ClickMe("0");
    }
}
