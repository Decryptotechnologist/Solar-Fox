/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.gui;

import com.LOGamez.graphics.*;
//import com.LOGamez.level.Level;
import com.LOGamez.solarfox.*;
import com.LOGamez.player.Player;
import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 *
 * @author Ghomez
 */
public class HUD {

    /**Attributes*/
    
    /**ceilBounds Rectangle of HUD object*/ 
    public static Rectangle ceilBounds;
    
    /**currentFont Font of HUD object*/ 
    private Font currentFont;
    
    /**gameScoreX variable of HUD object*/ 
    private int gameScoreX;
    
    
    /**Constructor*/
    
    /**
     * HUD()
     * 
     */
    public HUD() {
        System.out.println("HUD: New HUD Created");
        //ceilBounds = new Rectangle(0, Labels.livesLabelY+22, SolarFox.getMainWidth(), 28);
        
        setUp();
    }
    
    
    /**Public protocol*/
    
    
    /**
     * setUp()
     * 
     */
    private void setUp(){
        //ceilBounds = new Rectangle(0, Labels.livesLabelY+22, SolarFox.getMainWidth(), 28);
        
        Player.levelNo = "Lv";
        Player.livesNo = "L";
    }
    
    
    /**
     * init()
     * 
     */
    private void init(){
        
    }
    
    /**
    * render(Render target, Graphics2D g)
    * 
    * Renders/Repaints Level Objects
    * 
    * @param target - the Render of Level
    * @param g2d
    */
    public void render(Render target, Graphics2D g2d){
        Graphics2D g2d_HUD = g2d;
        AffineTransform oldXForm = g2d.getTransform();
//        System.out.println("HUD: Rendering . . .");
//        System.out.println("HUD: Rendering HUD Show HUD:"+Game.showHUD);
        
        if(Game.showHUD){
//            if(!Level.levelComplete && Game.pauseTime == 0){
//                target.scaleDraw(Texture.livesLabel, Labels.LabelScale, Labels.livesLabelX, Labels.livesLabelY, 0, 0, 64, 64, Labels.livesLabelBGCol);
//                target.scaleDraw(Texture.livesLabel, Labels.LabelScale, Labels.livesLabelX-2, Labels.livesLabelY-2, 0, 0, 64, 64, Labels.livesLabelFGCol);
//
//                if(Game.gameScore >= 100000){
//                    target.scaleDraw(Texture.scoreLabel, Labels.LabelScale, Labels.scoreLabelX-20, Labels.scoreLabelY, 0, 0, 64, 64, Labels.scoreLabelBGCol);
//                    target.scaleDraw(Texture.scoreLabel, Labels.LabelScale, Labels.scoreLabelX-18, Labels.scoreLabelY-2, 0, 0, 64, 64, Labels.scoreLabelFGCol);
//                } else {
//                    target.scaleDraw(Texture.scoreLabel, Labels.LabelScale, Labels.scoreLabelX, Labels.scoreLabelY, 0, 0, 64, 64, Labels.scoreLabelBGCol);
//                    target.scaleDraw(Texture.scoreLabel, Labels.LabelScale, Labels.scoreLabelX-2, Labels.scoreLabelY-2, 0, 0, 64, 64, Labels.scoreLabelFGCol);
//                }
            }

//            int gameScoreX = Labels.scoreX;
            Player.levelNo = "Lv-"+Game.levelNo;
            Player.livesNo = "L-"+Player.lives;

            if(Game.gameScore == 0){
//                gameScoreX = Labels.scoreX-5;
//                Game.fox.setPlayScore("0000");
            } else if(Game.gameScore > 0  && Game.gameScore < 100){
//                gameScoreX = Labels.scoreX-5;
//                Game.player.setPlayScore("00"+Game.gameScore);
            } else if(Game.gameScore >= 100 && Game.gameScore < 1000){
//                gameScoreX = Labels.scoreX-5;
//                Game.player.setPlayScore("0"+Game.gameScore);
            } else if(Game.gameScore >= 1000 && Game.gameScore < 100000){
//                gameScoreX = Labels.scoreX-5;
//                Game.player.setPlayScore(""+Game.gameScore);
            } else if(Game.gameScore >= 100000){
//                gameScoreX = Labels.scoreX-(5 + Game.player.getPlayScore().length());
//                Game.player.setPlayScore(""+Game.gameScore);
            }   
            
            currentFont = new Font("default", Font.BOLD, 18);
            g2d_HUD.setFont(currentFont);
            g2d_HUD.setColor(Color.black);
            //g2d_HUD.drawString("SCORE:"+Game.fox.getPlayScore(), gameScoreX-38, Labels.scoreY+14);
            //target.draw(Game.player.getPlayScore(), gameScoreX, Labels.scoreY, 0x00ff0c);
            g2d_HUD.setColor(Color.green);
            //g2d_HUD.drawString("SCORE:"+Game.fox.getPlayScore(), gameScoreX-40, Labels.scoreY+12);

            if(Game.showBounds){
                g2d_HUD.setColor(Color.LIGHT_GRAY);
                g2d_HUD.drawRect(ceilBounds.x, ceilBounds.y, ceilBounds.width - 1, ceilBounds.height);
                
                //Draw Bottom EOS Bounds
                g2d_HUD.setColor(Color.green);
//                g2d_HUD.drawRect(0, Level.getLevelHeight() - 12, Level.getLevelWidth(), 5);

                //Draw Left EOS Bounds
                g2d_HUD.setColor(Color.green);
//                g2d_HUD.drawRect(0, 12, 5, Level.getLevelHeight());

                //Draw Right EOS Bounds
                g2d_HUD.setColor(Color.green);
//                g2d_HUD.drawRect(Level.getLevelWidth()+4, 12, 5, Level.getLevelHeight());
            }   

//            if(Player.rapidFire){
//                currentFont = new Font("default", Font.PLAIN, 12);
//                g2d_HUD.setFont(currentFont);
//                g2d_HUD.setColor(Color.black);
//                g2d_HUD.drawString("RAPID", Labels.playerNameX-25, Labels.playerNameY+13);
//                g2d_HUD.setColor(Color.red);
//                g2d_HUD.drawRect(Labels.playerNameX-30, Labels.playerNameY, 76, 14);
//                //target.draw("RAPID", Labels.playerNameX-26, Labels.playerNameY-12, 0xff000c);
//                g2d_HUD.drawString("RAPID", Labels.playerNameX-26, Labels.playerNameY+12);
//            }
//            if(Game.showKillShot){
//                currentFont = new Font("default", Font.PLAIN, 12);
//                g2d_HUD.setFont(currentFont);
//                g2d_HUD.setColor(Color.black);
//                g2d_HUD.drawString("KShot:"+Player.killShot, Labels.playerNameX+51, Labels.playerNameY-11);
//                g2d_HUD.setColor(Color.red);
//                g2d_HUD.drawRect(Labels.playerNameX+142, Labels.playerNameY-14, 28, 11);
//                //target.draw("KShot:"+Player.killShot, Labels.playerNameX+50, Labels.playerNameY-12, 0xff000c);
//                g2d_HUD.drawString("KShot:"+Player.killShot, Labels.playerNameX+50, Labels.playerNameY-12);
//            } else {
//                if(Player.rapidFire){
//                    currentFont = new Font("default", Font.PLAIN, 12);
//                    g2d_HUD.setFont(currentFont);
//                    g2d_HUD.setColor(Color.black);
//                    g2d_HUD.drawString("Hi-Score:  "+Game.hiScoreName+"  "+Game.hiScore, Labels.playerNameX-49, Labels.playerNameY+13);
//                    g2d_HUD.setColor(Color.white);
//                    g2d_HUD.drawRect(Labels.playerNameX+48, Labels.playerNameY, 188, 14);
//                    //target.draw("Hi-Score:"+Game.hiScore, Labels.playerNameX+50, Labels.playerNameY-12, 0xffffff);
//                    g2d_HUD.drawString("Hi-Score:  "+Game.hiScoreName+"  "+Game.hiScore, Labels.playerNameX+50, Labels.playerNameY+12);
//                } else {
//                    currentFont = new Font("default", Font.PLAIN, 12);
//                    g2d_HUD.setFont(currentFont);
//                    g2d_HUD.setColor(Color.black);
//                    g2d_HUD.drawString("Hi-Score:  "+Game.hiScoreName+"  "+Game.hiScore, Labels.playerNameX-29, Labels.playerNameY+13);
//                    g2d_HUD.setColor(Color.white);
//                    g2d_HUD.drawRect(Labels.playerNameX-32, Labels.playerNameY, 188, 14);
//                    //target.draw("Hi-Score:"+Game.hiScore, Labels.playerNameX-30, Labels.playerNameY-12, 0xffffff);
//                    g2d_HUD.drawString("Hi-Score:  "+Game.hiScoreName+"  "+Game.hiScore, Labels.playerNameX-30, Labels.playerNameY+12);
//                }
//            }

            //target.draw(Player.livesNo, Labels.playerNameX-30, Labels.playerNameY, 0xdd0f0c);
            currentFont = new Font("default", Font.PLAIN, 12);
            g2d_HUD.setFont(currentFont);
            g2d_HUD.setColor(Color.black);
//            g2d_HUD.drawString(Player.livesNo, Labels.playerNameX-29, Labels.playerNameY-3);
            g2d_HUD.setColor(Color.red);
//            g2d_HUD.drawString(Player.livesNo, Labels.playerNameX-30, Labels.playerNameY-4);
            //target.draw(Player.playName, Labels.playerNameX, Labels.playerNameY, 0x00ff0c);
            
            currentFont = new Font("default", Font.BOLD, 14);
            g2d_HUD.setFont(currentFont);
            g2d_HUD.setColor(Color.black);
//            g2d_HUD.drawString(Player.playName, Labels.playerNameX+2, Labels.playerNameY-2);
            g2d_HUD.setColor(Color.green);
//            g2d_HUD.drawString(Player.playName, Labels.playerNameX, Labels.playerNameY-4);
            //target.draw(Player.levelNo, Labels.playerNameX+126, Labels.playerNameY, 0xdd0f0c);
            
            currentFont = new Font("default", Font.PLAIN, 12);
            g2d_HUD.setFont(currentFont);
            g2d_HUD.setColor(Color.black);
//            g2d_HUD.drawString(Player.levelNo, Labels.playerNameX+127, Labels.playerNameY-3);
            g2d_HUD.setColor(Color.red);
//            g2d_HUD.drawString(Player.levelNo, Labels.playerNameX+126, Labels.playerNameY-4);
            
            //Draw Player Lives
            if(Player.lives == 3){
                g2d_HUD.drawImage(Player.imgPLives, Player.pLives2X, Player.pLivesY, Player.pLivesScale, Player.pLivesScale, null);
                g2d_HUD.drawImage(Player.imgPLives, Player.pLives1X, Player.pLivesY, Player.pLivesScale, Player.pLivesScale, null);
                g2d_HUD.drawImage(Player.imgPLives, Player.pLives0X, Player.pLivesY, Player.pLivesScale, Player.pLivesScale, null);
            }

            if(Player.lives == 2){
                g2d_HUD.drawImage(Player.imgPLives, Player.pLives1X, Player.pLivesY, Player.pLivesScale, Player.pLivesScale, null);
                g2d_HUD.drawImage(Player.imgPLives, Player.pLives0X, Player.pLivesY, Player.pLivesScale, Player.pLivesScale, null);
            }

            if(Player.lives == 1 || Player.lives > 3){
                g2d_HUD.drawImage(Player.imgPLives, Player.pLives0X, Player.pLivesY, Player.pLivesScale, Player.pLivesScale, null);
                if(Player.lives > 3){
                    String l = "X "+Player.lives;
                    currentFont = new Font("default", Font.BOLD, 24);
                    g2d_HUD.setFont(currentFont);
                    g2d_HUD.setColor(Color.black);
                    g2d_HUD.drawString(l, Player.pLives1X, Player.pLivesY+24);
                    g2d_HUD.setColor(Color.green);
                    g2d_HUD.drawString(l, Player.pLives1X-2, Player.pLivesY+22);
                    currentFont = new Font("default", Font.PLAIN, 10);
                    g2d_HUD.setFont(currentFont);
                }
            }
            
            if(Game.showFPS){
                currentFont = new Font("default", Font.PLAIN, 12);
                g2d_HUD.setFont(currentFont);
                //target.drawString(fps, fpsX, fpsY+5, 0x00ff00);
                g2d_HUD.setColor(Color.black);
                if(Game.showUPS){                    
//                    g2d_HUD.drawString(Game.theFPS, Level.fpsX+1, Level.fpsY+1);
                    g2d_HUD.setColor(Color.yellow);
//                   g2d_HUD.drawString(Game.theFPS, Level.fpsX, Level.fpsY);
                } else {
//                    g2d_HUD.drawString(Game.theFPS, Level.fpsX+1, Level.upsY+1);
                    g2d_HUD.setColor(Color.yellow);
//                    g2d_HUD.drawString(Game.theFPS, Level.fpsX, Level.upsY);
                }
            }
            
            if(Game.showUPS){
                currentFont = new Font("default", Font.PLAIN, 12);
                g2d_HUD.setFont(currentFont);
                //ups = Game.theUPS;
                //target.drawString(ups, upsX, upsY, 0x00ffe0);
                g2d_HUD.setColor(Color.black);
//                g2d_HUD.drawString(Game.theUPS, Level.upsX+1, Level.upsY+1);
                g2d_HUD.setColor(Color.green);
//                g2d_HUD.drawString(Game.theUPS, Level.upsX, Level.upsY);
            }
            
            if(Game.showGameTime){
                //gTime = Game.theGameTime;
                currentFont = new Font("default", Font.BOLD, 16);
                g2d_HUD.setFont(currentFont);
                g2d_HUD.setColor(Color.black);
//                g2d_HUD.drawString(Game.theGameTime, Level.gTimeX+2, Level.gTimeY+2);
                g2d_HUD.setColor(Color.red);
//                g2d_HUD.drawString(Game.theGameTime, Level.gTimeX, Level.gTimeY);
                currentFont = new Font("default", Font.PLAIN, 12);
                g2d_HUD.setFont(currentFont);
            }
            
            if(Game.showLevelTime){
                //gTime = Game.theGameTime;
                currentFont = new Font("default", Font.BOLD, 16);
                g2d_HUD.setFont(currentFont);
                g2d_HUD.setColor(Color.black);
//                g2d_HUD.drawString(Level.theLevelTime, Level.gTimeX+2, Level.gTimeY-18);
                g2d_HUD.setColor(Color.green);
//                g2d_HUD.drawString(Level.theLevelTime, Level.gTimeX, Level.gTimeY-20);
                currentFont = new Font("default", Font.PLAIN, 12);
                g2d_HUD.setFont(currentFont);
            }
            
            
            
            if (Game.pauseTime > 0 && !Game.paused && Game.getGame().menu == null) {
                //if(Level.levelComplete){
                    long time = System.currentTimeMillis();
                    //P1Explode.clearAll();
                    //P1Bullet.clearAll();

  //                  for (Level.levelCompleteCount = 0; Level.levelCompleteCount < 500; Level.levelCompleteCount++) {
                        System.out.println("Level: Drawing Level Complete Text");
                        
                        //Draw scaled 3D SI Icon: GOLD
                        if(time / 25 % 5 == 0){
                            //render Space Invaders Icon
                            //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, 0xFFBF00);
                            //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, 0xBF9B30);
                        } else if(time / 200 % 40 == 0){
                            //render Space Invaders Icon
                            //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, 0xBF9B30);
                            //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, 0xFFBF00);
                        }
                        if (time / 450 % 2 == 0) {

                            //COMPLETE
                            currentFont = new Font("default", Font.BOLD, 36);
                            g2d_HUD.setFont(currentFont);
                            g2d_HUD.setColor(new Color(0xBF9B30));
//                            g2d_HUD.drawString("COMPLETE", Labels.click2FocusX+120, Labels.click2FocusY+40);
                            g2d_HUD.setColor(new Color(0xffffff));
//                            g2d_HUD.drawString("COMPLETE", Labels.click2FocusX+124, Labels.click2FocusY+36);
                            currentFont = new Font("default", Font.PLAIN, 12);
                            g2d_HUD.setFont(currentFont);
                            
                            //target.scaleDraw(Texture.buttonsA, Labels.click2FocusScale, Labels.click2FocusX-20, Labels.click2FocusY+40, 235, 200, 220, 30, 0xBF9B30);
                            //target.scaleDraw(Texture.buttonsA, Labels.click2FocusScale, Labels.click2FocusX-24, Labels.click2FocusY+36, 235, 200, 220, 30, 0xffffff);


                            //Level
                            currentFont = new Font("default", Font.BOLD, 36);
                            g2d_HUD.setFont(currentFont);
//                            g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                            g2d_HUD.drawString("LEVEL", Labels.LevelX-100, Labels.LevelY);
                            g2d_HUD.setColor(new Color(0xffffff));
//                            g2d_HUD.drawString("LEVEL", Labels.LevelX-96, Labels.LevelY-4);
                            currentFont = new Font("default", Font.PLAIN, 12);
                            g2d_HUD.setFont(currentFont);
                            
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-120, Labels.LevelY, 130, 300, 73, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-116, Labels.LevelY-4, 130, 300, 73, 35, 0xffffff);
                            
                            System.out.println("Level: Drawing Level 1 No.");
                            String lvlNo = ""+Game.levelNo;
                            currentFont = new Font("default", Font.BOLD, 36);
                            g2d_HUD.setFont(currentFont);
//                            g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                            g2d_HUD.drawString(lvlNo, Labels.LevelX+50, Labels.LevelY);
                            g2d_HUD.setColor(new Color(0xffffff));
//                            g2d_HUD.drawString(lvlNo, Labels.LevelX+46, Labels.LevelY-4);
                            currentFont = new Font("default", Font.PLAIN, 12);
                            g2d_HUD.setFont(currentFont);

//                            if (Game.levelNo == 1){
//                                System.out.println("Level: Drawing Level 1 No.");
//                                //level 1 No.
//                                currentFont = new Font("default", Font.BOLD, 16);
//                                g2d_HUD.setFont(currentFont);
//                                g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                                g2d_HUD.drawString("1", Labels.LevelX-120, Labels.LevelY);
//                                g2d_HUD.setColor(new Color(0xffffff));
//                                g2d_HUD.drawString("1", Labels.LevelX-116, Labels.LevelY-4);
//                                currentFont = new Font("default", Font.PLAIN, 12);
//                                g2d_HUD.setFont(currentFont);
//                                
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 200, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 200, 300, 15, 35, 0xffffff);
//                            }
//
//                            if (Game.levelNo == 2) {
//                                System.out.println("Level: Drawing Level 2 No.");
//                                //level 2 No.
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 220, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 220, 300, 15, 35, 0xffffff);
//                            }
//
//                            if (Game.levelNo == 3) {
//                                System.out.println("Level: Drawing Level 3 No.");
//                                //level 3 No.
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 240, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 240, 300, 15, 35, 0xffffff);
//                            }
//
//                            if (Game.levelNo == 4) {
//                                System.out.println("Level: Drawing Level 4 No.");
//                                //level 4 No.
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 260, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 260, 300, 15, 35, 0xffffff);
//                            }
//
//                            if (Game.levelNo == 5) {
//                                System.out.println("Level: Drawing Level 5 No.");
//                                //level 5 No.
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 276, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 276, 300, 15, 35, 0xffffff);
//                            }
//
//                            if (Game.levelNo == 6) {
//                                System.out.println("Level: Drawing Level 6 No.");
//                                //level 6 No.
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 292, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 292, 300, 15, 35, 0xffffff);
//                            }
//
//                            if (Game.levelNo == 7) {
//                                System.out.println("Level: Drawing Level 7 No.");
//                                //level 7 No.
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 310, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 310, 300, 15, 35, 0xffffff);
//                            }
//
//                            if (Game.levelNo == 8) {
//                                System.out.println("Level: Drawing Level 8 No.");
//                                //level 8 No.
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 332, 300, 15, 35, levelTxtBGCol);
//                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 332, 300, 15, 35, 0xffffff);
//                            }                        

                            //target.drawText("Lives Bonus: "+Game.getLivesBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+170, 0xFeca00);
                            //target.drawText("Time Bonus: "+Game.getTimeBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+200, 0xFF0000);
                            //target.drawText("Accuracy Bonus: "+Game.getAccuracyBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+230, 0xFFaa00);
                            //target.drawText("Level Bonus: "+Game.getLevelBonus(), 3, Labels.enterLevelX+120, Labels.enterLevelY+275, 0xFFce00);

                            //SolarFox.setStatusBar("Level "+Game.levelNo+" : "+Level.getLevelName()+" Completed!!");    
                        } else {
                            //target.drawText("Level Bonus: "+Game.getLevelBonus(), 3, Labels.enterLevelX+120, Labels.enterLevelY+275, 0xffffff);
                        }

                        System.out.println("Level: Drawing Level 1 Name");
                        currentFont = new Font("default", Font.BOLD, 16);
                        g2d_HUD.setFont(currentFont);
//                        g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                        g2d_HUD.drawString(Level.getLevelName(), Labels.enterLevelX+180, Labels.enterLevelY+40);
                        g2d_HUD.setColor(new Color(0xffffff));
//                        g2d_HUD.drawString(Level.getLevelName(), Labels.enterLevelX+182, Labels.enterLevelY+38);
                        currentFont = new Font("default", Font.PLAIN, 12);
                        g2d_HUD.setFont(currentFont);
                            
//                        if (Game.levelNo == 1){
//                            System.out.println("Level: Drawing Level 1 Name");
//                            //level 1 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-30, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-32, Labels.enterLevelY+68, 0xffffff);
//                        }
//                        if (Game.levelNo == 2){
//                            System.out.println("Level: Drawing Level 2 Name");
//                            //level 2 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-2, Labels.enterLevelY+68, 0xffffff);
//                        }
//                        if (Game.levelNo == 3){
//                            System.out.println("Level: Drawing Level 3 Name");
//                            //level 3 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+8, Labels.enterLevelY+68, 0xffffff);
//                        }
//                        if (Game.levelNo == 4){
//                            System.out.println("Level: Drawing Level 4 Name");
//                            //level 4 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-5, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-7, Labels.enterLevelY+68, 0xffffff);
//                        }
//                        if (Game.levelNo == 5){
//                            System.out.println("Level: Drawing Level 5 Name");
//                            //level 5 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+8, Labels.enterLevelY+68, 0xffffff);
//                        }
//                        if (Game.levelNo == 6){
//                            System.out.println("Level: Drawing Level 6 Name");
//                            //level 6 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-22, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-24, Labels.enterLevelY+68, 0xffffff);
//                        }
//                        if (Game.levelNo == 7){
//                            System.out.println("Level: Drawing Level 7 Name");
//                            //level 7 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-60, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-62, Labels.enterLevelY+68, 0xffffff);
//                        }
//                        if (Game.levelNo == 8){
//                            System.out.println("Level: Drawing Level 8 Name");
//                            //level 8 3D Name
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-50, Labels.enterLevelY+70, levelTxtBGCol);
//                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-52, Labels.enterLevelY+68, 0xffffff);
//                        }

//                        if (Level.levelCompleteCount == 0) {
//                            System.out.println("Level: Last Tick Complete.");
//                            Level.lastTick = true;
//                            Game.resetGameTime();
//                            break;
//                        }
                    //}

            } else {
                    long time = System.currentTimeMillis();
//                    for (Level.levelStartCount = 0; Level.levelStartCount < 100; Level.levelStartCount++) {    
//                        System.out.println("Level: Drawing Level Starting Text");
//                        
//                        //Draw scaled 3D SI Icon: BLUE
//                        if(time / 25 % 5 == 0){
//                            //render Space Invaders Icon
//                            //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, enterLvlIconBG);
//                            //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, enterLvlIconFG);
//                        } else if(time / 20 % 40 == 0){
//                            //render Space Invaders Icon
//                            //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, enterLvlIconFG);
//                            //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, enterLvlIconBG);
//                        }
//                        if (time / 450 % 2 == 0) {
//
//                            //Entering 3D
//                            currentFont = new Font("default", Font.BOLD, 56);
//                            g2d_HUD.setFont(currentFont);
//                            g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                            g2d_HUD.drawString("ENTERING", Labels.enterLevelX, Labels.enterLevelY+30);
//                            g2d_HUD.setColor(new Color(0xffffff));
//                            g2d_HUD.drawString("ENTERING", Labels.enterLevelX-4, Labels.enterLevelY+26);
//                            currentFont = new Font("default", Font.PLAIN, 12);
//                            g2d_HUD.setFont(currentFont);
//                            
//                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.enterLevelX, Labels.enterLevelY+30, 0, 300, 130, 35, levelTxtBGCol);
//                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.enterLevelX-4, Labels.enterLevelY+26, 0, 300, 130, 35, 0xffffff);
//
//                            //Level
//                            currentFont = new Font("default", Font.BOLD, 56);
//                            g2d_HUD.setFont(currentFont);
//                            g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                            g2d_HUD.drawString("LEVEL", Labels.LevelX+30, Labels.enterLevelY+30);
//                            g2d_HUD.setColor(new Color(0xffffff));
//                            g2d_HUD.drawString("LEVEL", Labels.LevelX+26, Labels.enterLevelY+26);
//                            currentFont = new Font("default", Font.PLAIN, 12);
//                            g2d_HUD.setFont(currentFont);
//                            
//                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX, Labels.LevelY+30, 130, 300, 73, 35, levelTxtBGCol);
//                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-4, Labels.LevelY+26, 130, 300, 73, 35, 0xffffff);
//
//                            
//                            System.out.println("Level: Drawing Level 1 No.");
//                            String lvlNo = ""+Game.levelNo;
//                            currentFont = new Font("default", Font.BOLD, 56);
//                            g2d_HUD.setFont(currentFont);
//                            g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                            g2d_HUD.drawString(lvlNo, Labels.LevelX+220, Labels.enterLevelY+30);
//                            g2d_HUD.setColor(new Color(0xffffff));
//                            g2d_HUD.drawString(lvlNo, Labels.LevelX+216, Labels.enterLevelY+26);
//                            currentFont = new Font("default", Font.PLAIN, 12);
//                            g2d_HUD.setFont(currentFont);
//                                
//                                
//                                
////                            if (Game.levelNo == 1 || Game.levelNo == -1) {
////                                System.out.println("Level: Drawing Level 1 No.");
////                                //level 1 No.
////                                currentFont = new Font("default", Font.BOLD, 16);
////                                g2d_HUD.setFont(currentFont);
////                                g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
////                                g2d_HUD.drawString("1", Labels.LevelX, Labels.LevelY+30);
////                                g2d_HUD.setColor(new Color(0xffffff));
////                                g2d_HUD.drawString("1", Labels.LevelX-4, Labels.LevelY+26);
////                                currentFont = new Font("default", Font.PLAIN, 12);
////                                g2d_HUD.setFont(currentFont);
////                                
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelY+30, 200, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelY+26, 200, 300, 15, 35, 0xffffff);
////                            }
////
////                            if (Game.levelNo == 2) {
////                                System.out.println("Level: Drawing Level 2 No.");
////                                //level 2 No.
////                                currentFont = new Font("default", Font.BOLD, 16);
////                                g2d_HUD.setFont(currentFont);
////                                g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
////                                g2d_HUD.drawString("2", Labels.LevelX, Labels.LevelY+30);
////                                g2d_HUD.setColor(new Color(0xffffff));
////                                g2d_HUD.drawString("2", Labels.LevelX-4, Labels.LevelY+26);
////                                currentFont = new Font("default", Font.PLAIN, 12);
////                                g2d_HUD.setFont(currentFont);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 220, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 220, 300, 15, 35, 0xffffff);
////                            }
////
////                            if (Game.levelNo == 3) {
////                                System.out.println("Level: Drawing Level 3 No.");
////                                //level 3 No.
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 240, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 240, 300, 15, 35, 0xffffff);
////                            }
////
////                            if (Game.levelNo == 4) {
////                                System.out.println("Level: Drawing Level 4 No.");
////                                //level 4 No.
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 260, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 260, 300, 15, 35, 0xffffff);
////                            }
////
////                            if (Game.levelNo == 5) {
////                                System.out.println("Level: Drawing Level 5 No.");
////                                //level 5 No.
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 276, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 276, 300, 15, 35, 0xffffff);
////                            }
////
////                            if (Game.levelNo == 6) {
////                                System.out.println("Level: Drawing Level 6 No.");
////                                //level 6 No.
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 292, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 292, 300, 15, 35, 0xffffff);
////                            }
////
////                            if (Game.levelNo == 7) {
////                                System.out.println("Level: Drawing Level 7 No.");
////                                //level 7 No.
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 310, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 310, 300, 15, 35, 0xffffff);
////                            }
////
////                            if (Game.levelNo == 8) {
////                                System.out.println("Level: Drawing Level 8 No.");
////                                //level 8 No.
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 332, 300, 15, 35, levelTxtBGCol);
////                                //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 332, 300, 15, 35, 0xffffff);
////                            }
//                            GameDesign.setStatusBar("Entering Level "+Game.levelNo+" : "+Level.getLevelName()+Level.levelStartCount);
//
//                        }
//                        
//                        System.out.println("Level: Drawing Level 1 Name");
//                        currentFont = new Font("default", Font.BOLD, 16);
//                        g2d_HUD.setFont(currentFont);
//                        g2d_HUD.setColor(new Color(0xffffff));
//                        g2d_HUD.drawString(Level.getLevelName(), Labels.enterLevelX+180, Labels.enterLevelY+60);
//                        g2d_HUD.setColor(new Color(Level.levelTxtBGCol));
//                        g2d_HUD.drawString(Level.getLevelName(), Labels.enterLevelX+181, Labels.enterLevelY+59);
//                        currentFont = new Font("default", Font.PLAIN, 12);
//                        g2d_HUD.setFont(currentFont);
//
////                        if (Game.levelNo == 1 || Game.levelNo == -1) {
////                            System.out.println("Level: Drawing Level 1 Name");
////                            //level 3D Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-30, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-31, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
////                        if (Game.levelNo == 2) {
////                            System.out.println("Level: Drawing Level 2 Name");
////                            //level 2 Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-1, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
////                        if (Game.levelNo == 3) {
////                            System.out.println("Level: Drawing Level 3 Name");
////                            //level 3 Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+9, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
////                        if (Game.levelNo == 4) {
////                            System.out.println("Level: Drawing Level 4 Name");
////                            //level 4 Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-5, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-6, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
////                        if (Game.levelNo == 5) {
////                            System.out.println("Level: Drawing Level 5 Name");
////                            //level 5 Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX+9, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
////                        if (Game.levelNo == 6) {
////                            System.out.println("Level: Drawing Level 6 Name");
////                            //level 6 Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-22, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-21, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
////                        if (Game.levelNo == 7) {
////                            System.out.println("Level: Drawing Level 7 Name");
////                            //level 7 Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-60, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-61, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
////                        if (Game.levelNo == 8) {
////                            System.out.println("Level: Drawing Level 8 Name");
////                            //level 8 Name
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-50, Labels.enterLevelY+100, 0xffffff);
////                            //target.drawText(getLevelName(), 2, Labels.enterLevelX-51, Labels.enterLevelY+99, levelTxtBGCol);
////                        }
//
//                        if(Level.levelStartCount == 100){
//                            System.out.println("Level: First Tick Complete.");
//                            Level.firstTick = true;
//                            
//                            //Reset Level Time
//                            Level.resetLevelTime();
//                            break;
//                        }
//
//                    }
//                }
        //}
            
            
            
            g2d.setTransform(oldXForm);
        }
    }
    
}
