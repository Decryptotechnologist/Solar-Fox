/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.utils;

import com.LOGamez.solarfox.*;
import java.awt.*;

/**
 * @author Ghomez
 * 
 */
public class Fonts {
   
    
    /**Public Protocol*/ 
    
    
    /**
    * drawString(Graphics g, Font f, Color c, String text, int x, int y)
    * 
    * 
    * @param g
    * @param f
    * @param c
    * @param text
    * @param x
    * @param y
    */
    public static void drawString(Graphics g, Font f, Color c, String text, int x, int y){
        g.setColor(c);
        g.setFont(f);
        g.drawString(text, x, y);
    }

    
    /**
    * drawString(Graphics g, Font f, Color c, String text)
    * 
    * 
    * @param g
    * @param f
    * @param c
    * @param text
    */
    public static void drawString(Graphics g, Font f, Color c, String text){
        FontMetrics fm = g.getFontMetrics(f);
        int x = SolarFox.getMainWidth() - fm.stringWidth(text) / 2;// Horizontal centre
        int y = ((SolarFox.getMainHeight() - fm.getHeight()) / 2) + fm.getAscent();// Vertical centre
        drawString(g, f, c, text, x, y);
    }
    
    
    /**
    * drawString(Graphics g, Font f, Color c, String text, double x)
    * 
    * 
    * @param g
    * @param f
    * @param c
    * @param text
    * @param x
    */
    public static void drawString(Graphics g, Font f, Color c, String text, double x){
        FontMetrics fm = g.getFontMetrics(f);
        int y = ((SolarFox.getMainHeight() - fm.getHeight()) / 2) + fm.getAscent();// Vertical centre
        drawString(g, f, c, text, (int) x, y);
    }
    
    
    /**
    * drawString(Graphics g, Font f, Color c, String text, int y)
    * 
    * 
    * @param g
    * @param f
    * @param c
    * @param text
    * @param y
    */
    public static void drawString(Graphics g, Font f, Color c, String text, int y){
        FontMetrics fm = g.getFontMetrics(f);
        int x = SolarFox.getMainWidth() - fm.stringWidth(text) / 2;// Horizontal centre
        drawString(g, f, c, text, x, y);
    }
    
}
