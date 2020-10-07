/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.gui;

import com.LOGamez.graphics.Texture;

/**
 *
 * @author Boss Let's Play
 * @editor Nicholas Wright
 */
public class SplashScreenDriver {

    /**Attributes*/
    
    
    /**Links*/
    
    /**screen boolean of SplashScreenDriver*/
    public SplashScreen screen;
    
    
    /**Constructor*/
    
    
    /**
     * SplashScreenDriver Constructor
     * 
     */
    public SplashScreenDriver() {
        System.out.println("SplashScreenDriver: New SplashScreenDriver created");
        
        screen = new SplashScreen(new Texture("/menu/splash_Publisher0a"), new Texture("/menu/splash_Author2c"));
        screen.setLocationRelativeTo(null);
        screen.setMaxProgress(5000);
        //screen.setSize(640, 480);
        screen.setVisible(true);
        
        for(int i = 0; i <= 5000; i++){
            for(int j = 0; j <= 50000; j++){
                String t = "ewf" + (i + j); 
            }
            screen.setProgress(i);
        }
        screen.setVisible(false);
    }
    
}
