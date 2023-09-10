package com.LOGamez.menu;

import com.LOGamez.audio.Sound;
import com.LOGamez.graphics.Texture;
import com.LOGamez.SolarFox2023.*;
import java.util.Random;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 * StartMenu objects represent one Enemy4 object 
 * (above the first top-most row of enemies), 
 * there are 1 of them at any one time randomly 
 * through-out the game each with their own 
 * collision Rectangle
 * 
 * @author(s) Ghomez
 */
public class StartMenu extends Menu {
    
    /**Attributes*/
    
    /**SMfirstTick variable of StartMenu*/
    private boolean SMfirstTick = true;
    
    /**SMTimer variable of StartMenu*/
    private int SMTimer = 500;
    
    /**random variable of StartMenu*/
    Random random = new Random();
    
    /**startMenuImage variable of StartMenu*/
    public static BufferedImage startMenuImage = new Texture("/menu/startMenu_1").getImage();
    
    /**startMenuImage0 variable of StartMenu*/
    public static BufferedImage startMenuImage0 = new Texture("/menu/startMenu_1").getImage();
    
    /**startMenuImage1 variable of StartMenu*/
    public static BufferedImage startMenuImage1 = new Texture("/menu/startMenu_3").getImage();
    
    /**menuImageX variable of StartMenu*/
    private final int menuImageX = 0;
    
    /**menuImageY variable of StartMenu*/
    private final int menuImageY = -15;
    
    /**menuImageW variable of StartMenu*/
    private final int menuImageW = SolarFox2023.getMainWidth()+12;
    
    /**menuImageH variable of StartMenu*/
    private final int menuImageH = SolarFox2023.getMainHeight();
    
    /**startTxt variable of StartMenu*/
    private final String startTxt = "STARTING . . .";
    
    /**startTxtFont variable of StartMenu*/
    private final Font startTxtFont = new Font("Times New Roman", Font.BOLD, 46);
    
    /**startTxtCol1 variable of StartMenu*/
    private final Color startTxtCol1 = Color.decode("#ff1000");
    
    /**startTxtX variable of StartMenu*/
    private final int startTxtX = 214;
    
    /**startTxtY variable of StartMenu*/
    private final int startTxtY = 340;
    
    /**startTxtCol variable of StartMenu*/
    private final Color startTxtCol = Color.decode("#ffa000");
    
    
    /**Links*/
    
    
    /**Constructor*/
    
    /**
    * StartMenu(Game game)
    * 
    * Initialises a new StartMenu object
    * 
    * @param game - the height of StartMenu
    */ 
    public StartMenu(Game game) {
        System.out.println("StartMenu: New Start Menu Created");
        this.game = game;
        Menu.setUp();
    }
    
    
    /**Public protocol*/

    
    /**
    * render(Render target, Graphics2D g)
    * 
    * Renders/Repaints StartMenu Objects
    * 
    * @param game
    * @param g2d
    */     
    @Override
    public void render(Game game, Graphics2D g2d) {
        Graphics2D g2d_StartMenu = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        //Draw Background
        g2d_StartMenu.drawImage(startMenuImage, menuImageX, menuImageY, menuImageW, menuImageH, null);
        ////////////////////////////////////////////////////////////////////
        
        if (SMTimer > 15) {
            //Render Starting Background and text
            if (System.currentTimeMillis() / 450 % 2 == 0) {
                startMenuImage = startMenuImage0;
                
                g2d_StartMenu.setFont(startTxtFont);
                g2d_StartMenu.setColor(startTxtCol);
                g2d_StartMenu.drawString(startTxt, startTxtX+2, startTxtY+2);
                g2d_StartMenu.setColor(startTxtCol1);
                g2d_StartMenu.drawString(startTxt, startTxtX, startTxtY);
                
                //Set StatusBar: "Starting . . ."
                SolarFox2023.setStatusBar("Starting . . .");
                ////////////////////////////////////////////////////////////////////
            } else {
                startMenuImage = startMenuImage1;
                
                //Set StatusBar: " "
                SolarFox2023.setStatusBar(" ");
                ////////////////////////////////////////////////////////////////////
            }
        }
        
        g2d.setTransform(oldXForm);
        g2d_StartMenu.setTransform(oldXForm);
    }

    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates StartMenu Object
    * 
    * @param game - the Game of StartMenu
    * @param up - the up variable of StartMenu
    * @param down - the down variable of StartMenu
    * @param left - the left variable of StartMenu
    * @param right - the right variable of StartMenu
    * @param fire - the fire variable of StartMenu
    */     
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        //Manage Start Menu: Timer
        if (SMTimer > 0) {
            SMTimer--;
        }
        ////////////////////////////////////////////////////////////////////
        
        //Manage Start Menu: First Tick
        if (SMfirstTick) {
            SMfirstTick = false;
            System.out.println("StartMenu: Cue Start Screen . . .");
            System.out.println("StartMenu: Cue Dodgy soundtrack . . .");
            
            //Set StatusBar: "Cue Start Screen . . ."
            SolarFox2023.setStatusBar("Cue Start Screen . . .");
            
            //Star.clearAll();
            Sound.stopAll();
            if(Game.getGameSound()){
                Sound.Menu3.play();
            }
        }
        ////////////////////////////////////////////////////////////////////
        
        //Manage Start Menu: Last Tick
        if (SMTimer == 0) {
            Sound.stopAll();
            System.out.println("StartMenu: End Dodgy soundtrack . . .");
            
            //Set Game Menu: null
            game.setMenu(null);
            System.out.println("StartMenu: Game On!!!");
            
            //Set StatusBar: "Game On!!!"
            SolarFox2023.setStatusBar("Game On!!!");
            
            //Reset Game Time
            Game.resetGameTime();
        }
        ////////////////////////////////////////////////////////////////////
    }

    
}
