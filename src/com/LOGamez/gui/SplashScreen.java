/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.gui;

import com.LOGamez.graphics.Texture;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Boss Let's Play
 * @editor Nicholas Wright
 */
public class SplashScreen extends JWindow {
    
    /**Attributes*/
    
    /**borderLayout variable of SplashScreen*/
    private BorderLayout borderLayout;
    
    /**imgLabel variable of SplashScreen*/
    private JLabel imgLabel;
    
    /**southPanel variable of SplashScreen*/
    private JPanel southPanel;
    
    /**southFlow variable of SplashScreen*/
    private FlowLayout southFlow;
    
    /**progressBar variable of SplashScreen*/
    private JProgressBar progressBar;
    
    /**imgIcon variable of SplashScreen*/
    private ImageIcon imgIcon;
    
    /**imgIcon1 variable of SplashScreen*/
    private ImageIcon imgIcon1;
    
    
    /**Links*/
    
    
    /**Constructor*/
    
    
    /**
     * SplashScreen Constructor
     * 
     */
    public SplashScreen(Texture tex1, Texture tex2){
        System.out.println("SplashScreen: New SplashScreen created");
        
        this.imgIcon = new ImageIcon(tex1.getImage());
        this.imgIcon1 = new ImageIcon(tex2.getImage());
        borderLayout = new BorderLayout();
        imgLabel = new JLabel();
        southPanel = new JPanel();
        southFlow = new FlowLayout();
        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        try {
            init();
        } catch(Exception e){
        }
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     */
    private void init() throws Exception {
        System.out.println("SplashScreen: Initiating SplashScreen . . .");
        
        imgLabel.setIcon(imgIcon);
        getContentPane().setLayout(borderLayout);
        southPanel.setLayout(southFlow);
        southPanel.setBackground(Color.BLACK);
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        //getContentPane().add(southPanel, BorderLayout.SOUTH);
        //southPanel.add(progressBar, null);
        pack();
    }

    
    /**
     * setMaxProgress(int maxProgress)
     * 
     * @param maxProgress
     */
    public void setMaxProgress(int maxProgress){
        System.out.println("SplashScreen: Setting Max Progress: "+maxProgress);
        
        progressBar.setMaximum(maxProgress);
    }
    
    
    /**
     * setProgress(int progress)
     * 
     * @param progress
     */
    public void setProgress(int progress){
        double percentage = ((double) progress / (double) progressBar.getMaximum()) * 100;
        String num = String.format("%.0f", percentage);
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                if(progress == 2500) imgLabel.setIcon(imgIcon1);
                progressBar.setValue(progress);
                progressBar.setString("Loading: " + num + "%");
            }
        });
    }
}
