/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.menu;

import com.LOGamez.audio.Sound;
import com.LOGamez.input.MouseInput;
import com.LOGamez.level.Level;
import com.LOGamez.solarfox.*;
import java.awt.*;
import java.awt.geom.AffineTransform;


/**
 * PauseMenu objects represent one Enemy4 object 
 * (above the first top-most row of enemies), 
 * there are 1 of them at any one time randomly 
 * through-out the game each with their own 
 * collision Rectangle
 * 
 * @author(s) Ghomez
 */
public class PauseMenu extends Menu {

    /**Attributes*/
    
    /**PMfirstTick variable of PauseMenu object */ 
    private boolean PMfirstTick = true;
    
    /**PMTimer variable of PauseMenu object */ 
    private int PMTimer = 550;
    
    
    /**menuImageX variable of StartMenu*/
    private final int menuImageX = 0;
    
    /**menuImageY variable of StartMenu*/
    private final int menuImageY = -15;
    
    /**menuImageW variable of StartMenu*/
    private final int menuImageW = SolarFox.getMainWidth()+12;
    
    /**menuImageH variable of StartMenu*/
    private final int menuImageH = SolarFox.getMainHeight();
    
    
    /**pauseTxt variable of StartMenu*/
    private final String pauseTxt = "PAUSED . . .";
    
    /**pauseTxtFont variable of StartMenu*/
    private final Font pauseTxtFont = new Font("Times New Roman", Font.BOLD, 46);
    
    /**pauseTxtCol1 variable of StartMenu*/
    private final Color pauseTxtCol1 = Color.decode("#013f0c");
    
    /**pauseTxtX variable of StartMenu*/
    private final int pauseTxtX = 254;
    
    /**pauseTxtY variable of StartMenu*/
    private final int pauseTxtY = 340;
    
    /**pauseTxtCol variable of StartMenu*/
    private final Color pauseTxtCol = Color.decode("#0afa00");
    
    
    /**resumeBtnX variable of StartMenu*/
    private final int resumeBtnX = 40;
    
    /**resumeBtnY variable of StartMenu*/
    private final int resumeBtnY = 488;
    
    /**resumeBtnW variable of StartMenu*/
    private final int resumeBtnW = 166;
    
    /**resumeBtnH variable of StartMenu*/
    private final int resumeBtnH = 66;
    
    
    /**restartBtnX variable of StartMenu*/
    private final int restartBtnX = 50;
    
    /**restartBtnY variable of StartMenu*/
    private final int restartBtnY = 552;
    
    /**restartBtnW variable of StartMenu*/
    private final int restartBtnW = 166;
    
    /**restartBtnH variable of StartMenu*/
    private final int restartBtnH = 66;
    
    
    /**quitBtnX variable of StartMenu*/
    private final int quitBtnX = 16;
    
    /**quitBtnY variable of StartMenu*/
    private final int quitBtnY = 612;
    
    /**quitBtnW variable of StartMenu*/
    private final int quitBtnW = 166;
    
    /**quitBtnH variable of StartMenu*/
    private final int quitBtnH = 66;
    
    
    

    /**Public protocol*/ 
    
    
    /**
    * render(Graphics2D g)
    * 
    * Renders/Repaints PauseMenu Objects
    * 
    * @param game
    * @param g2d - the g of PauseMenu
    */
    @Override
    public void render(Game game, Graphics2D g2d) {
        Graphics2D g2d_PauseMenu = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        MouseInput.MouseButton = 0;
        
        //Draw Background
        g2d_PauseMenu.drawImage(menuImage, menuImageX, menuImageY, menuImageW, menuImageH, null);
        //////////////////////////////////////////////////////////////////////////////////////////////
        
        //Render Paused text
        if (System.currentTimeMillis() / 450 % 2 == 0) {
            menuImage = menuImage2;
            
            //Draw 3D Paused text: Green, Blue Shadow
            g2d_PauseMenu.setFont(pauseTxtFont);
            g2d_PauseMenu.setColor(pauseTxtCol);
            g2d_PauseMenu.drawString(pauseTxt, pauseTxtX+2, pauseTxtY+2);
            g2d_PauseMenu.setColor(pauseTxtCol1);
            g2d_PauseMenu.drawString(pauseTxt, pauseTxtX, pauseTxtY);
            ////////////////////////////////////////////////////////////////////////////
            
            //Set StatusBar: "Paused . . ."
            SolarFox.setStatusBar("Paused . . .");
            //////////////////////////////////////
        } else {
            menuImage = menuImage0;
            
            //Draw 3D Paused text: Blue, Green Shadow
            g2d_PauseMenu.setFont(pauseTxtFont);
            g2d_PauseMenu.setColor(pauseTxtCol1);
            g2d_PauseMenu.drawString(pauseTxt, pauseTxtX+2, pauseTxtY+2);
            g2d_PauseMenu.setColor(pauseTxtCol);
            g2d_PauseMenu.drawString(pauseTxt, pauseTxtX, pauseTxtY);
            ////////////////////////////////////////////////////////////////////////////
            
            //Set StatusBar: " "
            SolarFox.setStatusBar(" ");
            //////////////////////////////////////
        }
        
        
        //Draw Resume Button
        if (MouseInput.MouseX > resumeBtnX && MouseInput.MouseX < resumeBtnX + resumeBtnW && MouseInput.MouseY > resumeBtnY && MouseInput.MouseY < resumeBtnY + resumeBtnH) {
            g2d_PauseMenu.drawImage(resumeOffBtn, resumeBtnX, resumeBtnY, resumeBtnW, resumeBtnH, null);

            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g2d_PauseMenu.drawImage(leftArrowIcon, resumeBtnX + 166, 514, 22, 20, null);
                g2d_PauseMenu.drawImage(rightArrowIcon, resumeBtnX - 25, 514, 22, 20, null);
            }

            if (MouseInput.MouseButton == 1) {
                Sound.stopAll();
                Sound.btnPushed.play();
                System.out.println("PauseMenu: Resume Selected");
                game.setMenu(null);
                Game.paused = false;

                //Sound.reloopLevel(Game.levelNo);
                //config.loadConfiguration("res/sys/config.xml");
            }
        } else {
            g2d_PauseMenu.drawImage(resumeOnBtn, resumeBtnX, resumeBtnY, resumeBtnW, resumeBtnH, null);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////

        //Draw Restart Button
        if (MouseInput.MouseX > restartBtnX && MouseInput.MouseX < restartBtnX + restartBtnW && MouseInput.MouseY > restartBtnY && MouseInput.MouseY < restartBtnY + restartBtnH) {
            g2d_PauseMenu.drawImage(restartOffBtn, restartBtnX, restartBtnY, restartBtnW, restartBtnH, null);

            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g2d_PauseMenu.drawImage(leftArrowIcon, restartBtnX + 178, 574, 22, 20, null);
                g2d_PauseMenu.drawImage(rightArrowIcon, restartBtnX - 24, 576, 22, 20, null);
            }

            if (MouseInput.MouseButton == 1) {
                Sound.stopAll();
                Sound.btnPushed.play();
                Game.paused = false;

                System.out.println("PauseMenu: Restart Selected");
                game.setMenu(null);
                game.stateManager.setState("menu");

                Game.level = new Level(Game.startLevel, SolarFox.getMainWidth(), SolarFox.getMainHeight());
            }
        } else {
            g2d_PauseMenu.drawImage(restartOnBtn, restartBtnX, restartBtnY, restartBtnW, restartBtnH, null);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////

        //Draw Quit Button
        if (MouseInput.MouseX > quitBtnX && MouseInput.MouseX < quitBtnX + quitBtnW && MouseInput.MouseY > quitBtnY && MouseInput.MouseY < quitBtnY + quitBtnH) {
            g2d_PauseMenu.drawImage(quitOffBtn, quitBtnX, quitBtnY, quitBtnW, quitBtnH, null);

            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                g2d_PauseMenu.drawImage(leftArrowIcon, quitBtnX + 112, 638, 22, 20, null);
                g2d_PauseMenu.drawImage(rightArrowIcon, quitBtnX - 28, 638, 22, 20, null);
            }

            if (MouseInput.MouseButton == 1) {
                Sound.stopAll();
                Sound.btnPushed.play();
                System.out.println("PauseMenu: Quit Selected");
                Game.getGame().setMenu(null);

                Game.getGame().quitGame();
            }
        } else {
            g2d_PauseMenu.drawImage(quitOnBtn, quitBtnX, quitBtnY, quitBtnW, quitBtnH, null);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////
            
        g2d.setTransform(oldXForm);
        g2d_PauseMenu.setTransform(oldXForm);    
    }

    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates PauseMenu Object
    * 
    * @param game - the Game of PauseMenu
    * @param up - the up variable of PauseMenu
    * @param down - the down variable of PauseMenu
    * @param left - the left variable of PauseMenu
    * @param right - the right variable of PauseMenu
    * @param fire - the fire variable of PauseMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        //Manage Pause Menu: Timer
        if (PMTimer > 0) {
            PMTimer--;
        }
        //////////////////////////////////////////////////////////////////////////////////////////////
        
        //Manage Pause Menu: First Tick
        if (PMfirstTick) {
            PMfirstTick = false;
            System.out.println("PauseMenu: Cue Pause Screen . . .");
            System.out.println("PauseMenu: Cue Pause Wav . . .");
            //Sound.stopAll();
            if(Game.getGameSound()){
                //Sound.Paused.loop();
            }
            SolarFox.setStatusBar("Paused . . .");
        }
        //////////////////////////////////////////////////////////////////////////////////////////////
        
        //Manage Pause Menu: Last Tick
        if (PMTimer == 0) {
            SolarFox.setStatusBar(" ");
        }
        //////////////////////////////////////////////////////////////////////////////////////////////
    }
    
}

