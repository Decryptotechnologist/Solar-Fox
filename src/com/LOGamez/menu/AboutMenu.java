/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.menu;

import com.LOGamez.audio.Sound;
import com.LOGamez.input.MouseInput;
import com.LOGamez.solarfox.*;
import java.awt.*;

/**
 *
 * @author Ghomez
 */
public class AboutMenu extends Menu {
    
    /**Attributes*/
    
    /**AMfirstTick variable of AboutMenu object */ 
    private boolean AMfirstTick = true;
    
    /**AMTimer variable of AboutMenu object */ 
    private int AMTimer = 550;
    
    /**tickDelay variable of AboutMenu object */ 
    private int tickDelay = 60;

    
    
    /**Constructor*/
    
    
    /**
    * AboutMenu(Game game)
    * 
    * Creates a new AboutMenu object
    * 
    * @param game
    */
    public AboutMenu(Game game) {
        System.out.println("AboutMenu: New About Menu Created");
        this.game = game;
        Menu.setUp();
        
        game.requestFocus();
    }

    
    /**Public Protocol*/
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints AboutMenu Objects
     * 
     * @param game
     * @param g
     */
    @Override
    public void render(Game game, Graphics2D g) {
        
        //Draws Background Image: aboutMenuImage
        g.drawImage(aboutMenuImage, 0, -15, SolarFox.getMainWidth(), SolarFox.getMainHeight()-20, null);

        //Set Button Logic: Back Button
        if(MouseInput.MouseX > 500 && MouseInput.MouseX < 500 + 80 && MouseInput.MouseY > 630 && MouseInput.MouseY < 630 + 30) {
            //Draws Back Button Image: backOffBtn
            g.drawImage(backOffBtn, 500, 630, 80, 30, null);
            
            //Sets Background Image: aboutMenuImage1
            aboutMenuImage = aboutMenuImage1;

            //Draws Back (Flashing) Button Arrow Images: leftArrowIcon, rightArrowIcon
            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g.drawImage(leftArrowIcon, 500 + 80, 634, 22, 20, null);
                g.drawImage(rightArrowIcon, 500 - 25, 635, 22, 20, null);
            }
            //Set Status Bar: Back
            SolarFox.setStatusBar("Back");
            
            //Set Mouse Button Logic: MouseButton 1 || RMB
            if(MouseInput.MouseButton == 1) {
                Sound.stopAll();
                Sound.btnPushed.play();
                
                game.setMenu(null);
                game.stateManager.setState("menu");
                
                //Set Status Bar: Ready
                SolarFox.setStatusBar("Ready");
            }
            
        } else {
            //Sets Background Image: aboutMenuImage0
            aboutMenuImage = aboutMenuImage0;
            
            //Draws Back Button Image: backOnBtn
            g.drawImage(backOnBtn, 500, 630, 80, 30, null);
            
            //Set Status Bar: About Menu
            SolarFox.setStatusBar("About Menu");
        }
        
    }

    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates AboutMenu Object
    * 
    * @param game - the Game of AboutMenu
    * @param up - the up variable of AboutMenu
    * @param down - the down variable of AboutMenu
    * @param left - the left variable of AboutMenu
    * @param right - the right variable of AboutMenu
    * @param fire - the fire variable of AboutMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        if(AMTimer > 0) {
           AMTimer--;
        }
        if(AMfirstTick) {
            AMfirstTick = false;
            System.out.println("Cue About Screen . . .");
            System.out.println("Cue Dodgy soundtrack . . .");
            if(Game.getGameSound()){
                Sound.Menu4.loop();
            }
            SolarFox.setStatusBar("About Menu");
        }
        if(AMTimer == 0) {
        }
    }
    
}
