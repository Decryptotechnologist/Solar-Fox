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
public class InstructionsMenu extends Menu {

    /**Attributes*/
        
    /**IMfirstTick variable of InstructionsMenu*/ 
    private boolean IMfirstTick = true;
    
    /**IMTimer variable of InstructionsMenu*/ 
    private int IMTimer = 550;
    
    
    
    /**Constructor*/
    
    
    /**
    * InstructionsMenu(Game game)
    * 
    * 
    * Creates a new InstructionsMenu object
    * 
    * @param game
    */
    public InstructionsMenu(Game game) {
        System.out.println("InstructionsMenu: New Instructions Menu Created");
        this.game = game;
        Menu.setUp();
        
        game.requestFocus();
    }

    
    /**Public Protocol*/
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints InstructionsMenu Objects
     * 
     * @param game
     * @param g
     */
    @Override
    public void render(Game game, Graphics2D g) {
        
        //Draws Background Image: instructionsMenuImage
        g.drawImage(instructionsMenuImage, 0, -15, SolarFox.getMainWidth(), SolarFox.getMainHeight()-20, null);

        //Set Button Logic: Back Button
        if(MouseInput.MouseX > 500 && MouseInput.MouseX < 500 + 80 && MouseInput.MouseY > 630 && MouseInput.MouseY < 630 + 30) {
            
            //Draws Back Button Image: backOffBtn
            g.drawImage(backOffBtn, 500, 630, 80, 30, null);
            
            //Sets Background Image: instructionsMenuImage1
            instructionsMenuImage = instructionsMenuImage1;

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
            //Sets Background Image: instructionsMenuImage0
            instructionsMenuImage = instructionsMenuImage0;
            
            //Draws Back Button Image: backOnBtn
            g.drawImage(backOnBtn, 500, 630, 80, 30, null);
            
            //Set Status Bar: Help Menu
            SolarFox.setStatusBar("Help Menu");
        }
        
    }
    
    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates InstructionsMenu Object
    * 
    * @param game - the Game of InstructionsMenu
    * @param up - the up variable of InstructionsMenu
    * @param down - the down variable of InstructionsMenu
    * @param left - the left variable of InstructionsMenu
    * @param right - the right variable of InstructionsMenu
    * @param fire - the fire variable of InstructionsMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        if(IMTimer > 0) {
            IMTimer--;
        }
        
        if(IMfirstTick) {
            IMfirstTick = false;
            System.out.println("Instructions Menu: Cue Instructions Screen . . .");
            System.out.println("Instructions Menu: Cue Dodgy soundtrack . . .");
            if(Game.getGameSound()){
                Sound.Menu4.loop();
            }
            //Set Status Bar: Help Menu
            SolarFox.setStatusBar("Help Menu");
        }
        
        if(IMTimer == 0){
            
        }

    }

}
