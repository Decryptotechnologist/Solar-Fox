/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.menu;

import com.LOGamez.graphics.*;
import com.LOGamez.solarfox.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Ghomez
 */
public class Menu {

    /**Attributes*/
    
    /**copyRight variable of Menu object*/ 
    public static final String copyRight = "(C) Solarfox 2020";
    
    /**startTxtScale variable of Menu object*/ 
    //public static double startTxtScale;// = 2;
    
    /**pauseTxtScale variable of Menu object*/ 
    //public static double pauseTxtScale;// = 2;
    
    /**logoScale variable of Menu object*/ 
    public static double logoScale;// = 1.15;
    
    /**scoreSheetScale variable of Menu object*/ 
    public static double scoreSheetScale;// = 1.0;
    
    /**startTxtX coordinate of Menu object*/ 
    //public static int startTxtX;
    
    /**startTxtY coordinate of Menu object*/ 
    //public static int startTxtY;
    
    /**pauseTxtX coordinate of Menu object*/ 
    //public static int pauseTxtX;
    
    /**pauseTxtY coordinate of Menu object*/ 
    //public static int pauseTxtY;
    
    /**logoX coordinate of Menu object*/ 
    public static int logoX;
    
    /**logoY coordinate of Menu object*/ 
    public static int logoY;
    
    /**scoreSheetX coordinate of Menu object*/ 
    public static int scoreSheetX;
    
    /**scoreSheetY coordinate of Menu object*/ 
    public static int scoreSheetY;
    
    /**copyRightX coordinate of Menu object*/ 
    public static int copyRightX;
    
    /**copyRightY coordinate of Menu object*/ 
    public static int copyRightY;
    
    /**gameOverTxtScale variable of Menu object*/ 
    public static double gameOverTxtScale;
    
    /**gameOverTxtX coordinate of Menu object*/ 
    public static int gameOverTxtX;
    
    /**gameOverTxtY coordinate of Menu object*/ 
    public static int gameOverTxtY;
    
    /**options variable of Menu object*/ 
    public static String[] options = { "Resume", "Restart", "Quit" };
    
    /**msg variable of Menu object*/ 
    public static String msg;
    
    /**optionsTxtX0 coordinate of Menu object*/ 
    public static int optionsTxtX0;
    
    /**optionsTxtY0 coordinate of Menu object*/ 
    public static int optionsTxtY0;
    
    /**optionsTxtX1 coordinate of Menu object*/ 
    public static int optionsTxtX1;
    
    /**optionsTxtY1 coordinate of Menu object*/ 
    public static int optionsTxtY1;

    /**menuImage BufferedImage of Menu object*/
    public static BufferedImage menuImage;
    
    /**menuImage0 BufferedImage of Menu object*/
    public static BufferedImage menuImage0;
    
    /**menuImage1 BufferedImage of Menu object*/
    public static BufferedImage menuImage1;
    
    /**menuImage2 BufferedImage of Menu object*/
    public static BufferedImage menuImage2;
    
    /**menuImage3 BufferedImage of Menu object*/
    public static BufferedImage menuImage3;
    
//    /**startMenuImage BufferedImage of Menu object*/
//    public static BufferedImage startMenuImage;
//    
//    /**startMenuImage0 BufferedImage of Menu object*/
//    public static BufferedImage startMenuImage0;
//    
//    /**startMenuImage1 BufferedImage of Menu object*/
//    public static BufferedImage startMenuImage1;
    
    /**playOffBtn BufferedImage of Menu object*/
    public static BufferedImage resumeOffBtn;
    
    /**playOnBtn BufferedImage of Menu object*/
    public static BufferedImage resumeOnBtn;
    
    /**optionsOffBtn BufferedImage of Menu object*/
    public static BufferedImage restartOffBtn;
    
    /**optionsOnBtn BufferedImage of Menu object*/
    public static BufferedImage restartOnBtn;
    
    /**quitOffBtn BufferedImage of Menu object*/
    public static BufferedImage quitOffBtn;
    
    /**quitOnBtn BufferedImage of Menu object*/
    public static BufferedImage quitOnBtn;
    
    /**backOffBtn BufferedImage of Menu object*/
    public static BufferedImage backOffBtn;
    
    /**backOnBtn BufferedImage of Menu object*/
    public static BufferedImage backOnBtn;
    
    /**backOffBtn BufferedImage of Menu object*/
    public static BufferedImage OKOffBtn;
    
    /**backOnBtn BufferedImage of Menu object*/
    public static BufferedImage OKOnBtn;
    
    /**backOffBtn BufferedImage of Menu object*/
    public static BufferedImage cancelOffBtn;
    
    /**backOnBtn BufferedImage of Menu object*/
    public static BufferedImage cancelOnBtn;
    
    /**skipOffBtn BufferedImage of Menu object*/
    public static BufferedImage skipOffBtn;
    
    /**skipOnBtn BufferedImage of Menu object*/
    public static BufferedImage skipOnBtn;    
    
    /**leftArrowIcon BufferedImage of Launcher object*/
    public static BufferedImage leftArrowIcon;
    
    /**rightArrowIcon BufferedImage of Launcher object*/
    public static BufferedImage rightArrowIcon;
    
    
    public static BufferedImage instructionsMenuImage;
    public static BufferedImage instructionsMenuImage0;
    public static BufferedImage instructionsMenuImage1;
    
    public static BufferedImage aboutMenuImage;
    public static BufferedImage aboutMenuImage0;
    public static BufferedImage aboutMenuImage1;
    
    public static BufferedImage optionsMenuImage;
    public static BufferedImage optionsMenuImage0;
    public static BufferedImage optionsMenuImage1;
    public static BufferedImage optionsMenuImage2;
    
    public static BufferedImage graphicsPanelImage;
    public static BufferedImage graphicsPanelImage0;
    public static BufferedImage graphicsPanelImage1;
    
    public static BufferedImage controlsPanelImage;
    public static BufferedImage controlsPanelImage0;
    public static BufferedImage controlsPanelImage1;
    
    public static BufferedImage gameplayPanelImage;
    public static BufferedImage gameplayPanelImage0;
    public static BufferedImage gameplayPanelImage1;
    
    public static BufferedImage soundPanelImage;
    public static BufferedImage soundPanelImage0;
    public static BufferedImage soundPanelImage1;
    
    public static BufferedImage devPanelImage;
    public static BufferedImage devPanelImage0;
    public static BufferedImage devPanelImage1;
    
    public static BufferedImage sliderIconImage;
    public static BufferedImage mainPanelImage;
    public static BufferedImage panelImage0;
    public static BufferedImage panelImage1;
    
    public static BufferedImage icon1;
    public static BufferedImage logo1;
    
    
    /**creditsX coordinate of CreditsMenu object */
    public static int creditsX;
    
    /**creditsY coordinate of CreditsMenu object */
    public static int creditsY;
    
    /**CreditsRectHeight variable of CreditsMenu Rectangle Object */
    public static int CreditsRectHeight;// = 135 / 12;
    
    /**CreditsRectWidth variable of CreditsMenu Rectangle Object */
    public static int CreditsRectWidth;// = 100 / 18;
    
    /**xSpace0 variable of CreditsMenu object */
    public static int xSpace0;// = 45;
    
    /**xSpace1 variable of CreditsMenu object */
    public static int xSpace1;// = 65;
    
    /**creditsr_w variable of CreditsMenu object */
    public static int creditsr_w;// = 18;
    
    /**creditsr_h variable of CreditsMenu object */
    public static int creditsr_h;// = 12;
    
    /**creditsWidth variable of CreditsMenu object */
    public static int creditsWidth = 340;
    
    /**creditsHeight variable of CreditsMenu object */
    public static int creditsHeight = 180;
    
    
    
    
    /**Links*/
    
    /**game a linked Game object*/ 
    public Game game;
    
    
    /**Public protocol*/

    
    /**
     * setUp()
     * 
     */
    public static void setUp(){
        
        resumeOffBtn = new Texture("/menu/resume_off1").getImage();
        resumeOnBtn = new Texture("/menu/resume_on1").getImage();
        restartOffBtn = new Texture("/menu/restart_off1").getImage();
        restartOnBtn = new Texture("/menu/restart_on1").getImage();
        quitOffBtn = new Texture("/menu/quit_off2").getImage();
        quitOnBtn = new Texture("/menu/quit_on2").getImage();
        
        backOffBtn = new Texture("/menu/back_off1").getImage();
        backOnBtn = new Texture("/menu/back_on1").getImage();
        OKOffBtn = new Texture("/menu/ok_off1").getImage();
        OKOnBtn = new Texture("/menu/ok_on1").getImage();
        cancelOffBtn = new Texture("/menu/cancel_off1").getImage();
        cancelOnBtn = new Texture("/menu/cancel_on1").getImage();
        
        skipOffBtn = new Texture("/menu/skip_off1").getImage();
        skipOnBtn = new Texture("/menu/skip_on1").getImage();

        leftArrowIcon = new Texture("/menu/arrow1").getImage();
        rightArrowIcon = new Texture("/menu/arrow1R").getImage();
        
        try {
            menuImage = ImageIO.read(Menu.class.getResource("/menu/menuState_2.png"));
            menuImage0 = ImageIO.read(Menu.class.getResource("/menu/menuState_1.png"));
            menuImage2 = ImageIO.read(Menu.class.getResource("/menu/menuState_2.png"));
            menuImage1 = ImageIO.read(Menu.class.getResource("/menu/menuState_3.png"));
            menuImage3 = ImageIO.read(Menu.class.getResource("/menu/menuState_4.png"));
            
//            icon1 = ImageIO.read(Menu.class.getResource("/Sprites/Planes-and-Saucers-Icon1.png"));
//            logo1 = ImageIO.read(Menu.class.getResource("/Sprites/Planes-and-Saucers-LOGO1.png"));
            
//            startMenuImage = ImageIO.read(Menu.class.getResource("/menu/startMenu_1.png"));
//            startMenuImage0 = ImageIO.read(Menu.class.getResource("/menu/startMenu_1.png"));
//            startMenuImage1 = ImageIO.read(Menu.class.getResource("/menu/startMenu_2.png"));
            
            instructionsMenuImage = ImageIO.read(Menu.class.getResource("/menu/instructionMenu_1.png"));
            instructionsMenuImage0 = ImageIO.read(Menu.class.getResource("/menu/instructionMenu_1.png"));
            instructionsMenuImage1 = ImageIO.read(Menu.class.getResource("/menu/instructionMenu_2.png"));
            
//            aboutMenuImage = ImageIO.read(Menu.class.getResource("/menu/aboutMenu_1.png"));
//            aboutMenuImage0 = ImageIO.read(Menu.class.getResource("/menu/aboutMenu_1.png"));
//            aboutMenuImage1 = ImageIO.read(Menu.class.getResource("/menu/aboutMenu_2.png"));
            
            optionsMenuImage = ImageIO.read(Menu.class.getResource("/menu/optionsMenu_2b.png"));
            optionsMenuImage0 = ImageIO.read(Menu.class.getResource("/menu/optionsMenu_2b.png"));
            optionsMenuImage1 = ImageIO.read(Menu.class.getResource("/menu/optionsMenu_1b.png"));
            optionsMenuImage2 = ImageIO.read(Menu.class.getResource("/menu/optionsMenu_3a.png"));
            
            mainPanelImage = ImageIO.read(Menu.class.getResource("/menu/optionsMenu_1a.png"));
            
            graphicsPanelImage = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            graphicsPanelImage0 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG2.png"));
            graphicsPanelImage1 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            
            controlsPanelImage = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            controlsPanelImage0 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            controlsPanelImage1 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG2.png"));
            
            gameplayPanelImage = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            gameplayPanelImage0 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            gameplayPanelImage1 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG2.png"));
            
            soundPanelImage = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            soundPanelImage0 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            soundPanelImage1 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG2.png"));
            
            devPanelImage = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            devPanelImage0 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG.png"));
            devPanelImage1 = ImageIO.read(Menu.class.getResource("/menu/SI2018-PanelLgeBG2.png"));
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int width = SolarFox.getMainWidth();
        switch(width){
            case 300:
                creditsr_w = 9;
                creditsr_h = 6;

                xSpace0 = 25;
                xSpace1 = 35;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox.getMainHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 100 / creditsr_w;
                CreditsRectHeight = 135 / creditsr_h;
            
                break;
                
            case 480:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox.getMainHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 100 / creditsr_w;
                CreditsRectHeight = 135 / creditsr_h;
            
                break;
                
            case 604:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox.getMainHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 180 / creditsr_w;
                CreditsRectHeight = 115 / creditsr_h;
                
                break;
                
            default:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox.getMainHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 180 / creditsr_w;
                CreditsRectHeight = 115 / creditsr_h;
                
                break;
                
        }
    }
    
    
    /**
    * render(Graphics2D g)
    * 
    * Renders/Repaints Menu Objects(Overridden)
    * 
    * @param game
    * @param g
    */     
    public void render(Game game, Graphics2D g) {
    }

    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates Menu Object(Overridden)
    * 
    * @param game - the Game of StartMenu
    * @param up - the up variable of StartMenu
    * @param down - the down variable of StartMenu
    * @param left - the left variable of StartMenu
    * @param right - the right variable of StartMenu
    * @param fire - the fire variable of StartMenu
    */
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
    }
    
}
