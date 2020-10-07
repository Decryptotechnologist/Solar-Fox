/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.gui;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Ghomez
 */
public class StatusBar extends JLabel {

    /**Attributes*/
    
    /**status variable of StatusBar*/
    static String status;
    
    
    /**Links*/
    
    
    
    /**Constructor*/
    
    /**
     * StatusBar Constructor
     * 
     * @param msg - status message of StatusBar
     * @param loc - location of StatusBar
     * @param border - border of StatusBar
     */
    public StatusBar(String msg, int loc, Border border){
        super(msg, loc);
        System.out.println("StatusBar: New StatusBar created");
        
        this.setBorder(border);
        this.setFont(null);
        this.setForeground(Color.red);
        this.setBackground(Color.gray);
        this.setOpaque(true);
    }
    
    /**Public Protocol*/
    
    
    /**
     * getStatus()
     * 
     * @return status
     */
    public static String getStatus(){
        return status;
    }
    
    
    /**
     * setStatus(String msg)
     * 
     * @param msg
     */
    public static void setStatus(String msg){
        status = msg;
    }
    
}
