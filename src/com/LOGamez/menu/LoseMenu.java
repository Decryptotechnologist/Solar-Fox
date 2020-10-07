package com.LOGamez.menu;

import com.LOGamez.audio.Sound;
import com.LOGamez.graphics.Texture;
import com.LOGamez.level.Level;
import com.LOGamez.solarfox.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * LoseMenu objects represent one Enemy4 object 
 * (above the first top-most row of enemies), 
 * there are 1 of them at any one time randomly 
 * through-out the game each with their own 
 * collision Rectangle
 * 
 * @author(s) Ghomez
 */
public class LoseMenu extends Menu {
    
    /**Attributes*/   
        
    /**LMfirstTick variable of LoseMenu*/ 
    private boolean LMfirstTick = true;
    
    /**LMTimer variable of LoseMenu*/ 
    private int LMTimer = 550;
    
    /**random variable of LoseMenu*/ 
    Random random = new Random();
    
    /**loseMenuImage BufferedImage of LoseMenu*/
    public static BufferedImage loseMenuImage = new Texture("/menu/startMenu_1").getImage();
    
    /**loseMenuImage0 BufferedImage of LoseMenu*/
    public static BufferedImage loseMenuImage0 = new Texture("/menu/startMenu_1").getImage();
    
    /**loseMenuImage1 BufferedImage of LoseMenu*/
    public static BufferedImage loseMenuImage1 = new Texture("/menu/startMenu_3").getImage();
    
    /**menuImageX variable of LoseMenu*/
    private final int menuImageX = 0;
    
    /**menuImageY variable of LoseMenu*/
    private final int menuImageY = -15;
    
    /**menuImageW variable of LoseMenu*/
    private final int menuImageW = SolarFox.getMainWidth()+12;
    
    /**menuImageH variable of LoseMenu*/
    private final int menuImageH = SolarFox.getMainHeight();
    
    /**loseTxt variable of LoseMenu*/
    private final String loseTxt = "GAME  OVER!!!";
    
    /**loseTxtFont variable of LoseMenu*/
    private final Font loseTxtFont = new Font("Times New Roman", Font.BOLD, 46);
    
    /**loseTxtCol1 variable of LoseMenu*/
    private final Color loseTxtCol1 = Color.decode("#013f0c");
    
    /**loseTxtX variable of LoseMenu*/
    private final int loseTxtX = 194;
    
    /**loseTxtY variable of LoseMenu*/
    private final int loseTxtY = 340;
    
    /**loseTxtCol variable of LoseMenu*/
    private final Color loseTxtCol = Color.decode("#00ac33");
    
    
    
    /**Constructor*/
    
    
    /**
    * LoseMenu(Game game)
    * 
    * 
    * Initialises a new LoseMenu object 
    * 
    * @param game - the game variable of LoseMenu
    */    
    public LoseMenu(Game game) {
        System.out.println("LoseMenu: New Lose Menu Created");
        this.game = game;
    }

    
    
    /**Public protocol*/ 
    
    
    /**
    * render(Graphics2D g)
    * 
    * Renders/Repaints LoseMenu Objects
    * 
    * @param game
    * @param g2d - the g of LoseMenu
    */
    @Override
    public void render(Game game, Graphics2D g2d) {
        Graphics2D g2d_LoseMenu = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        //Draw Background
        g2d_LoseMenu.drawImage(loseMenuImage, menuImageX, menuImageY, menuImageW, menuImageH, null);
        ////////////////////////////////////////////////////////////////////
        
        //Render GameOver text
        if (System.currentTimeMillis() / 450 % 2 == 0) {
            loseMenuImage = loseMenuImage0;
            
            g2d_LoseMenu.setFont(loseTxtFont);
            g2d_LoseMenu.setColor(loseTxtCol);
            g2d_LoseMenu.drawString(loseTxt, loseTxtX+2, loseTxtY+2);
            g2d_LoseMenu.setColor(loseTxtCol1);
            g2d_LoseMenu.drawString(loseTxt, loseTxtX, loseTxtY);
            
            //Set StatusBar: "Game Over!!!"
            SolarFox.setStatusBar("Game Over!!!");
            ////////////////////////////////////////////////////////////////////
        } else {
            loseMenuImage = loseMenuImage1;
            
            g2d_LoseMenu.setFont(loseTxtFont);
            g2d_LoseMenu.setColor(loseTxtCol1);
            g2d_LoseMenu.drawString(loseTxt, loseTxtX+2, loseTxtY+2);
            g2d_LoseMenu.setColor(loseTxtCol);
            g2d_LoseMenu.drawString(loseTxt, loseTxtX, loseTxtY);
            
            //Set StatusBar: " "
            SolarFox.setStatusBar(" ");
            ////////////////////////////////////////////////////////////////////
        }
        g2d.setTransform(oldXForm);
        g2d_LoseMenu.setTransform(oldXForm);
    }

    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates LoseMenu Object
    * 
    * @param game - the Game of LoseMenu
    * @param up - the up variable of LoseMenu
    * @param down - the down variable of LoseMenu
    * @param left - the left variable of LoseMenu
    * @param right - the right variable of LoseMenu
    * @param fire - the fire variable of LoseMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        //Manage Lose Menu: Timer
        if (LMTimer > 0) {
            LMTimer--;
        }
        ////////////////////////////////////////////////////////////////////
        
        //Manage Lose Menu: First Tick
        if (LMfirstTick) {
            LMfirstTick = false;
            System.out.println("LoseMenu: Cue Game Over Screen . . .");
            System.out.println("LoseMenu: Cue Dodgy soundtrack . . .");
            Sound.stopAll();
            if(Game.getGameSound()){
                Sound.Menu3.loop();
            }
        }
        ////////////////////////////////////////////////////////////////////
        
        //Manage Lose Menu: Last Tick
        if (LMTimer == 0) {
            Sound.stopAll();
            game.setMenu(null);
            game.stateManager.setState("menu");
            
            Game.level = new Level(1, SolarFox.getMainWidth(), SolarFox.getMainHeight());
            SolarFox.setStatusBar("Ready");
        }
        ////////////////////////////////////////////////////////////////////
    }

}
