
package com.Bhuwan.gui;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

public class MyFrame {
    public static void main(String[] args) {
        Frame fr = new Frame();
        fr.setVisible(true);
        fr.setBounds(50,50,500,300);
        Date d = new Date();
        String str = d.toString();
        fr.setTitle(str);
        //Color forgroundColor = new Color(150,50,50);
        Color backgroundColor = new Color(45,150,210);
        fr.setBackground(backgroundColor);
        
        
    }

  
}
