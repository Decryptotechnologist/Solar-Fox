/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.menu;

import com.LOGamez.graphics.*;
import com.LOGamez.SolarFox2023.*;
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
    
    /**copyRight variable of Menu*/ 
    public static final String copyRight = "(C) Solarfox 2023";
    
    /**startTxtScale variable of Menu*/ 
    //public static double startTxtScale;// = 2;
    
    /**pauseTxtScale variable of Menu*/ 
    //public static double pauseTxtScale;// = 2;
    
    /**logoScale variable of Menu*/ 
    public static double logoScale;// = 1.15;
    
    /**scoreSheetScale variable of Menu*/ 
    public static double scoreSheetScale;// = 1.0;
    
    /**startTxtX variable of Menu*/ 
    //public static int startTxtX;
    
    /**startTxtY variable of Menu*/ 
    //public static int startTxtY;
    
    /**pauseTxtX variable of Menu*/ 
    //public static int pauseTxtX;
    
    /**pauseTxtY variable of Menu*/ 
    //public static int pauseTxtY;
    
    /**logoX variable of Menu*/ 
    public static int logoX;
    
    /**logoY variable of Menu*/ 
    public static int logoY;
    
    /**scoreSheetX variable of Menu*/ 
    public static int scoreSheetX;
    
    /**scoreSheetY variable of Menu*/ 
    public static int scoreSheetY;
    
    /**copyRightX variable of Menu*/ 
    public static int copyRightX;
    
    /**copyRightY variable of Menu*/ 
    public static int copyRightY;
    
    /**gameOverTxtScale variable of Menu*/ 
    public static double gameOverTxtScale;
    
    /**gameOverTxtX variable of Menu*/ 
    public static int gameOverTxtX;
    
    /**gameOverTxtY variable of Menu*/ 
    public static int gameOverTxtY;
    
    /**options variable of Menu*/ 
    public static String[] options = { "Resume", "Restart", "Quit" };
    
    /**msg variable of Menu*/ 
    public static String msg;
    
    /**optionsTxtX0 variable of Menu*/ 
    public static int optionsTxtX0;
    
    /**optionsTxtY0 variable of Menu*/ 
    public static int optionsTxtY0;
    
    /**optionsTxtX1 variable of Menu*/ 
    public static int optionsTxtX1;
    
    /**optionsTxtY1 variable of Menu*/ 
    public static int optionsTxtY1;

    /**menuImage variable of Menu*/
    public static BufferedImage menuImage;
    
    /**menuImage0 variable of Menu*/
    public static BufferedImage menuImage0;
    
    /**menuImage1 variable of Menu*/
    public static BufferedImage menuImage1;
    
    /**menuImage2 variable of Menu*/
    public static BufferedImage menuImage2;
    
    /**menuImage3 variable of Menu*/
    public static BufferedImage menuImage3;
    
//    /**startMenuImage variable of Menu*/
//    public static BufferedImage startMenuImage;
    
//    /**startMenuImage0 variable of Menu*/
//    public static BufferedImage startMenuImage0;
   
//    /**startMenuImage1 variable of Menu*/
//    public static BufferedImage startMenuImage1;
    
    /**playOffBtn variable of Menu*/
    public static BufferedImage resumeOffBtn;
    
    /**playOnBtn variable of Menu*/
    public static BufferedImage resumeOnBtn;
    
    /**optionsOffBtn variable of Menu*/
    public static BufferedImage restartOffBtn;
    
    /**optionsOnBtn variable of Menu*/
    public static BufferedImage restartOnBtn;
    
    /**quitOffBtn variable of Menu*/
    public static BufferedImage quitOffBtn;
    
    /**quitOnBtn variable of Menu*/
    public static BufferedImage quitOnBtn;
    
    /**backOffBtn variable of Menu*/
    public static BufferedImage backOffBtn;
    
    /**backOnBtn variable of Menu*/
    public static BufferedImage backOnBtn;
    
    /**backOffBtn variable of Menu*/
    public static BufferedImage OKOffBtn;
    
    /**backOnBtn variable of Menu*/
    public static BufferedImage OKOnBtn;
    
    /**backOffBtn variable of Menu*/
    public static BufferedImage cancelOffBtn;
    
    /**backOnBtn variable of Menu*/
    public static BufferedImage cancelOnBtn;
    
    /**skipOffBtn variable of Menu*/
    public static BufferedImage skipOffBtn;
    
    /**skipOnBtn variable of Menu*/
    public static BufferedImage skipOnBtn;    
    
    /**leftArrowIcon variable of Menu*/
    public static BufferedImage leftArrowIcon;
    
    /**rightArrowIcon variable of Menu*/
    public static BufferedImage rightArrowIcon;
    
    /**instructionsMenuImage variable of Menu*/
    public static BufferedImage instructionsMenuImage;
    
    /**instructionsMenuImage0 variable of Menu*/
    public static BufferedImage instructionsMenuImage0;
    
    /**instructionsMenuImage1 variable of Menu*/
    public static BufferedImage instructionsMenuImage1;
    
    /**aboutMenuImage variable of Menu*/
    public static BufferedImage aboutMenuImage;
    
    /**aboutMenuImage0 variable of Menu*/
    public static BufferedImage aboutMenuImage0;
    
    /**aboutMenuImage1 variable of Menu*/
    public static BufferedImage aboutMenuImage1;
    
    /**optionsMenuImage variable of Menu*/
    public static BufferedImage optionsMenuImage;
    
    /**optionsMenuImage0 variable of Menu*/
    public static BufferedImage optionsMenuImage0;
    
    /**optionsMenuImage1 variable of Menu*/
    public static BufferedImage optionsMenuImage1;
    
    /**optionsMenuImage2 variable of Menu*/
    public static BufferedImage optionsMenuImage2;
    
    /**graphicsPanelImage variable of Menu*/
    public static BufferedImage graphicsPanelImage;
    
    /**graphicsPanelImage0 variable of Menu*/
    public static BufferedImage graphicsPanelImage0;
    
    /**graphicsPanelImage1 variable of Menu*/
    public static BufferedImage graphicsPanelImage1;
    
    /**controlsPanelImage variable of Menu*/
    public static BufferedImage controlsPanelImage;
    
    /**controlsPanelImage0 variable of Menu*/
    public static BufferedImage controlsPanelImage0;
    
    /**controlsPanelImage1 variable of Menu*/
    public static BufferedImage controlsPanelImage1;
    
    /**gameplayPanelImage variable of Menu*/
    public static BufferedImage gameplayPanelImage;
    
    /**gameplayPanelImage0 variable of Menu*/
    public static BufferedImage gameplayPanelImage0;
    
    /**gameplayPanelImage1 variable of Menu*/
    public static BufferedImage gameplayPanelImage1;
    
    /**soundPanelImage variable of Menu*/
    public static BufferedImage soundPanelImage;
    
    /**soundPanelImage0 variable of Menu*/
    public static BufferedImage soundPanelImage0;
    
    /**soundPanelImage1 variable of Menu*/
    public static BufferedImage soundPanelImage1;
    
    /**devPanelImage variable of Menu*/
    public static BufferedImage devPanelImage;
    
    /**devPanelImage0 variable of Menu*/
    public static BufferedImage devPanelImage0;
    
    /**devPanelImage1 variable of Menu*/
    public static BufferedImage devPanelImage1;
    
    /**sliderIconImage variable of Menu*/
    public static BufferedImage sliderIconImage;
    
    /**mainPanelImage variable of Menu*/
    public static BufferedImage mainPanelImage;
    
    /**panelImage0 variable of Menu*/
    public static BufferedImage panelImage0;
    
    /**panelImage1 variable of Menu*/
    public static BufferedImage panelImage1;
    
    /**icon1 variable of Menu*/
    public static BufferedImage icon1;
    
    /**logo1 variable of Menu*/
    public static BufferedImage logo1;
    
    
    /**creditsX variable of Menu*/
    public static int creditsX;
    
    /**creditsY variable of Menu*/
    public static int creditsY;
    
    /**CreditsRectHeight variable of Menu*/
    public static int CreditsRectHeight;// = 135 / 12;
    
    /**CreditsRectWidth variable of Menu*/
    public static int CreditsRectWidth;// = 100 / 18;
    
    /**xSpace0 variable of Menu*/
    public static int xSpace0;// = 45;
    
    /**xSpace1 variable of Menu*/
    public static int xSpace1;// = 65;
    
    /**creditsr_w variable of Menu*/
    public static int creditsr_w;// = 18;
    
    /**creditsr_h variable of Menu*/
    public static int creditsr_h;// = 12;
    
    /**creditsWidth variable of Menu*/
    public static int creditsWidth = 340;
    
    /**creditsHeight variable of Menu*/
    public static int creditsHeight = 180;
    
    
    
    
    /**Links*/
    
    /**game variable of Menu*/ 
    public Game game;
    
    
    /**Constructor*/
    
    
    
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
        
        int width = SolarFox2023.getMainWidth();
        switch(width){
            case 300:
                creditsr_w = 9;
                creditsr_h = 6;

                xSpace0 = 25;
                xSpace1 = 35;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox2023.getMainHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 100 / creditsr_w;
                CreditsRectHeight = 135 / creditsr_h;
            
                break;
                
            case 480:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox2023.getMainHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 100 / creditsr_w;
                CreditsRectHeight = 135 / creditsr_h;
            
                break;
                
            case 604:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox2023.getMainHeight()/2 - creditsHeight/2;

                CreditsRectWidth = 180 / creditsr_w;
                CreditsRectHeight = 115 / creditsr_h;
                
                break;
                
            default:
                creditsr_w = 18;
                creditsr_h = 12;

                xSpace0 = 45;
                xSpace1 = 65;
                creditsX = width/2 - creditsWidth/2;
                creditsY = SolarFox2023.getMainHeight()/2 - creditsHeight/2;

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
