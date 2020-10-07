/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.menu;

import com.LOGamez.audio.Sound;
import com.LOGamez.graphics.*;
import com.LOGamez.input.MouseInput;
import com.LOGamez.solarfox.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ghomez
 */
public class CreditsMenu extends Menu {

    
    /**Attributes*/
        
    /**CMfirstTick variable of CreditsMenu*/ 
    private boolean CMfirstTick = true;
    
    /**CMTimer variable of CreditsMenu*/ 
    private int CMTimer = 1600;
    
    /**creditsColor variable of CreditsMenu*/
    private static int creditsColor;
    
    /**animPublisher variable of CreditsMenu*/
    public static Animation animPublisher;
    
    /**animCredits variable of CreditsMenu*/
    public static Animation animCredits;
    
    /**animCredits variable of CreditsMenu*/
    public static Animation animCreditsLightening;
    
    /**animCreditsA variable of CreditsMenu*/
    public static Animation animCreditsA;
    
    /**animCreditsB variable of CreditsMenu*/
    public static Animation animCreditsB;
    
    /**Creditz1A List of CreditsMenu*/
    private static List<Rectangle> Creditz1A;
    
    /**noBRC variable of CreditsMenu*/ 
    public static int noBRC;// = 3;
    
    /**id variable of CreditsMenu*/
    public int id;
	
    /**isDead (true/false) value of CreditsMenu*/
    public boolean isDead;
        
    /**visible (true/false) value of CreditsMenu*/
    public boolean visible;
        
    /**Barz1 List of CreditsMenu*/
    public static List<Rectangle> Creditz1 = new ArrayList<>();
    
    /**BarricadeRect List of CreditsMenu Rectangle*/
    public static List<Rectangle> CreditsRect = new ArrayList<>();
    
    /**BRCscale variable of CreditsMenu*/
    public static double BRCscale;
    
    /**random Random of CreditsMenu*/
    public Random random = new Random();
    
    /**count variable for CreditsMenu*/
    private static int count = 0;
    
    /**CMSkipTimer variable for CreditsMenu*/
    private int CMSkipTimer = 2000;
    
    private final int skipBtnX = 500;
    
    private final int skipBtnY = 630;
    
    private final int skipBtnW = 80;
    
    private final int skipBtnH = 30;
    
    
    
    /**Constructor*/
    
    
    /**
    * CreditsMenu(Game game)
    * 
    * Creates a new CreditsMenu object
    * 
    * @param game
    */
    public CreditsMenu(Game game) {
        System.out.println("CreditsMenu: New Credits Menu Created");
        this.game = game;
        Menu.setUp();
        init();
        
//        animCreditsLightening = new Animation(8, 
//            Texture.creditsLightening,    
//            Texture.creditsLightening0,    
//            Texture.creditsLightening1,
//            Texture.creditsLightening2,    
//            Texture.creditsLightening3,    
//            Texture.creditsLightening4
//        );
        
//        animPublisher = new Animation(280, 
//            Texture.creditsPublisher,    
//            Texture.creditsPublisher,    
//            Texture.creditsPublisher
//        );
        
//        animCredits = new Animation(280,
//            Texture.credits0, 
//            Texture.creditsBlank,
//            Texture.credits1, 
//            Texture.creditsBlank,
//            Texture.credits2, 
//            Texture.creditsBlank,
//            Texture.credits3,
//            Texture.creditsBlank,
//            Texture.credits4, 
//            Texture.creditsBlank,
//            Texture.credits5, 
//            Texture.creditsBlank,
//            Texture.credits6, 
//            Texture.creditsBlank,
//            Texture.credits7,
//            Texture.creditsBlank,
//            Texture.credits8, 
//            Texture.creditsBlank,
//            Texture.credits9,
//            Texture.creditsBlank,
//            Texture.credits10    
//        );
        
//        animCreditsA = new Animation(280, 
//            Texture.creditsA0, 
//            Texture.creditsBlank,
//            Texture.creditsA1, 
//            Texture.creditsBlank,
//            Texture.creditsA2, 
//            Texture.creditsBlank,
//            Texture.creditsA3,
//            Texture.creditsBlank,
//            Texture.creditsA4, 
//            Texture.creditsBlank,
//            Texture.creditsA5, 
//            Texture.creditsBlank,
//            Texture.creditsA6, 
//            Texture.creditsBlank,
//            Texture.creditsA7,
//            Texture.creditsBlank,
//            Texture.creditsA8, 
//            Texture.creditsBlank,
//            Texture.creditsA9,
//            Texture.creditsBlank,
//            Texture.creditsA10    
//        );
        
//        animCreditsB = new Animation(280,
//            Texture.creditsB0, 
//            Texture.creditsBlank,
//            Texture.creditsB1, 
//            Texture.creditsBlank,
//            Texture.creditsB2, 
//            Texture.creditsBlank,
//            Texture.creditsB3,
//            Texture.creditsBlank,
//            Texture.creditsB4, 
//            Texture.creditsBlank,
//            Texture.creditsB5, 
//            Texture.creditsBlank,
//            Texture.creditsB6, 
//            Texture.creditsBlank,
//            Texture.creditsB7,
//            Texture.creditsBlank,
//            Texture.creditsB8, 
//            Texture.creditsBlank,
//            Texture.creditsB9,
//            Texture.creditsBlank,
//            Texture.creditsB10    
//        );
    }

    
    
    /**Public Protocol*/
    
    
    /**
     * init()
     * 
     */
    private void init(){
        creditsColor = 0xff0000;
        
        //INIT : WIDTH : 604
        for(int t = 0; t < 10; t++) {
            Rectangle c1 = new Rectangle(creditsX, creditsY, creditsWidth, creditsHeight);
            Creditz1.add(c1);

            //Split each BRC into 18 * 12 rectangles
            for(int t1 = 15; t1 < creditsr_w+25; t1++) {
                for(int t2 = 0; t2 < creditsr_h+1; t2++) {
                    //Rectangle r1 = new Rectangle(t1 * 6 + xSpace0 + (t * xSpace1) * 3, creditsY + (t2 * 8), CreditsRectWidth, CreditsRectHeight);
                    Rectangle r1 = new Rectangle(t1 * 6 + xSpace0 + (t * 6) * 3, creditsY + (t2 * 8), CreditsRectWidth, CreditsRectHeight);
                    
                    if(r1.x > 132 && r1.x < 207 && r1.y < 324 && r1.y > 264 || 
                    r1.x > 132 && r1.x < 472 && r1.y < 284 && r1.y > 264 || 
                    r1.x > 397 && r1.x < 472 && r1.y < 324 && r1.y > 264 ||
                    r1.x > 132 && r1.x < 472 && r1.y < 324 && r1.y > 304){

                    } else {
                        CreditsRect.add(r1);
                    }
                }
            }
        }
    }
    
    
    /**
    * CreditsHit(int id)
    * 
    * CreditsMenu Rectangle objects (referenced by id) 
    * is removed and a CreditsXDetonate(CreditsRect)
    * message. 
    * 
    * @param id - the id reference of an CreditsMenu Rectangle object
    */
    public void CreditsHit(int id){
	//CreditsExplode.CreditsXDetonate(CreditsRect.get(id));
	CreditsRect.remove(id);
    }
    
    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints CreditsMenu Objects
     * 
     * @param game
     * @param g
     */
    @Override
    public void render(Game game, Graphics2D g) {
                
        if(CMTimer > 0){
            if(System.currentTimeMillis() % 15 == 0){
                int x = 75+count;
                double dx =  x * Math.sin(CMTimer/6);
                int y = 22-count;
                double dy  = y * Math.cos(CMTimer/6);
//                animPublisher.render(target, (int) dx, (int) dy, 1, 480, 240, 0x00d5fc + random.nextInt(0x00d5fc + 1));
                
            }
//            animPublisher.render(target, 77, 24, 1, 480, 240, 0xc0c0c0);
//            animPublisher.render(target, 75, 22, 1, 480, 240, 0x00d5fc);
            
        }
        if(CMTimer > 450 && CMTimer < 1300){
            if(System.currentTimeMillis() % 27 == 0){
                //render Space Invaders Icon
//                target.scaleDraw(Texture.buttonsA, 6, 174, 292, 48, 126, 50, 38, 0x00d5fc);
//                target.scaleDraw(Texture.buttonsA, 6, 170, 288, 48, 126, 50, 38, 0xc0c0c0);
            } else if(System.currentTimeMillis() % 24 == 0){
                //render Space Invaders Icon
//                target.scaleDraw(Texture.buttonsA, 6, 174, 292, 48, 126, 50, 38, 0xc0c0c0);
//                target.scaleDraw(Texture.buttonsA, 6, 170, 288, 48, 126, 50, 38, 0x00d5fc);
            }
        }
        if(CMTimer < 450 && CMTimer > 0){
            if(System.currentTimeMillis() % 47 == 0){
//                target.scaleDraw(Texture.SI2015Logo, 1, 170-(CMTimer/2), 288, 0, 0, 281, 271, 0x000000);
//                target.scaleDraw(Texture.SI2015Logo, 1, 168-(CMTimer/2), 286, 0, 0, 281, 271, 0xffffff);

//                target.scaleDraw(Texture.SI2015Logo, 1, -170+(CMTimer/2), 288, 0, 0, 281, 271, 0x00b222);
//                target.scaleDraw(Texture.SI2015Logo, 1, -168+(CMTimer/2), 286, 0, 0, 281, 271, 0x00ffff);
            } else if(System.currentTimeMillis() % 34 == 0){
//                target.scaleDraw(Texture.SI2015Logo, 1, SolarFox.getMainWidth()-40-(CMTimer/2), 288, 0, 0, 281, 271, 0x000000);
//                target.scaleDraw(Texture.SI2015Logo, 1, SolarFox.getMainWidth()-38-(CMTimer/2), 286, 0, 0, 281, 271, 0xffffff);

//                target.scaleDraw(Texture.SI2015Logo, 1, 170+(CMTimer/2), 288, 0, 0, 281, 271, 0x00b222);
//                target.scaleDraw(Texture.SI2015Logo, 1, 168+(CMTimer/2), 286, 0, 0, 281, 271, 0x00ffff);
            }
//            target.scaleDraw(Texture.SI2015Logo, 1, 170, 288, 0, 0, 281, 271, 0xb22222);
//            target.scaleDraw(Texture.SI2015Logo, 1, 168, 286, 0, 0, 281, 271, 0xff0400);
        }
        
        //Renders Credits Animation: animCredits, animCreditsA, animCreditsB
        if(CMTimer == 0){
            
            if(count % 18 == 0){
                int x = SolarFox.getMainWidth()/2 - 168+count;
                double dx =  x * Math.sin(count/6);
                int y = SolarFox.getMainHeight()/2 - 108-count;
                double dy  = y * Math.cos(count/6);
//                animCredits.render(target, (int) dx, (int) dy, 1, 340, 180, (int) Math.cos(creditsColor) * count);
//                animCredits.render(target, (int) dx-2, (int) dy-2, 1, 340, 180, 0xffffff);
            } else if(count % 24 == 0){
//                animCredits.render(target, SolarFox.getMainWidth()/2 - 168-count, SolarFox.getMainHeight()/2 - 108-count, 1, 340, 180, creditsColor);
//                animCredits.render(target, SolarFox.getMainWidth()/2 - 170-count, SolarFox.getMainHeight()/2 - 110-count, 1, 340, 180, 0xffffff);

//                animCreditsA.render(target, SolarFox.getMainWidth()/2 - 168-count, SolarFox.getMainHeight()/2 - 108+count, 1, 340, 180, creditsColor);
//                animCreditsA.render(target, SolarFox.getMainWidth()/2 - 170-count, SolarFox.getMainHeight()/2 - 110+count, 1, 340, 180, 0xffffff);

//                animCreditsA.render(target, SolarFox.getMainWidth()/2 - 168+count, SolarFox.getMainHeight()/2 - 108+count, 1, 340, 180, creditsColor);
//                animCreditsA.render(target, SolarFox.getMainWidth()/2 - 170+count, SolarFox.getMainHeight()/2 - 110+count, 1, 340, 180, 0xffffff);
            }
            
//            animCreditsB.render(target, SolarFox.getGameWidth()/2 - 168, SolarFox.getGameHeight()/2 - 108, 1, 340, 180, creditsColor);
//            animCreditsB.render(target, SolarFox.getGameWidth()/2 - 170, SolarFox.getGameHeight()/2 - 110, 1, 340, 180, 0xffffff);

            if(count % 30 == 0){
                int x;
                int y;
                int r = random.nextInt(3);
                int offSet = random.nextInt(3)+2;
                if(r == 0){
                    x = 95+random.nextInt(150);
                    y = -30+random.nextInt(25);
//                    animCreditsLightening.render(target, x+offSet, y+2, 0.55, 0.65, 260, 540, 0xfff400);
//                    animCreditsLightening.render(target, x-1, y-1, 0.55, 0.65, 260, 540, 0xfff400);
//                    animCreditsLightening.render(target, x, y, 0.55, 0.65, 260, 540, 0x00fc00);// + random.nextInt(0xffffff + 1));
                } 
                if(r == 1){
                    x = 105+random.nextInt(250);
                    y = -60+random.nextInt(35);
//                    animCreditsLightening.render(target, x+offSet, y+1, 0.65, 0.75, 260, 540, 0x4ff000);
//                    animCreditsLightening.render(target, x-1, y-1, 0.65, 0.75, 260, 540, 0x4ff000);
//                    animCreditsLightening.render(target, x, y, 0.65, 0.75, 260, 540, 0xfcd500);
                } 
                if(r == 2){
                    x = 100+random.nextInt(150);
                    y = -10+random.nextInt(15);
//                    animCreditsLightening.render(target, x+offSet, y+1, 0.45, 0.65, 260, 540, 0x00f5ff);
//                    animCreditsLightening.render(target, x-1, y-1, 0.45, 0.65, 260, 540, 0x00f5ff);
//                    animCreditsLightening.render(target, x, y, 0.45, 0.65, 260, 540, 0x00d5fc);
                }
                if(r == 3){
                    x = 105+random.nextInt(250);
                    y = -40+random.nextInt(35);
//                    animCreditsLightening.render(target, x+offSet, y+1, 0.35, 0.70, 260, 540, 0x00f5ff + random.nextInt(0xffffff + 1));
//                    animCreditsLightening.render(target, x-1, y-1, 0.35, 0.70, 260, 540, 0x00f5ff + random.nextInt(0xffffff + 1));
//                    animCreditsLightening.render(target, x, y, 0.35, 0.70, 260, 540, 0x00d5fc + random.nextInt(0xffffff + 1));
                }
            }
            
            for(int i = 0; i < Creditz1.size(); i++){
                if(Game.showBounds){
                    g.setColor(Color.green);
                    g.drawRect(Creditz1.get(i).x, Creditz1.get(i).y, Creditz1.get(i).width, Creditz1.get(i).height);
                    g.drawString("Credits: X:" + Creditz1.get(i).x + " Credits: Y:"+Creditz1.get(i).y, Creditz1.get(i).x, Creditz1.get(i).y-4);
                }
            }

            for(int i = 0; i < CreditsRect.size(); i++){
                if(Game.showBounds){
                    g.setColor(Color.white);
                    g.drawRect(CreditsRect.get(i).x, CreditsRect.get(i).y, CreditsRect.get(i).width, CreditsRect.get(i).height);
                }
            }
        }
        
        if(CMSkipTimer < 20){
            //Set Button Logic: Skip Button
            if(MouseInput.MouseX > skipBtnX && MouseInput.MouseX < skipBtnX + skipBtnW && MouseInput.MouseY > skipBtnY && MouseInput.MouseY < skipBtnY + skipBtnH) {

                //Draws Back Button Image: skipOffBtn
                g.drawImage(skipOffBtn, skipBtnX, skipBtnY, skipBtnW, skipBtnH, null);

                //Draws Back (Flashing) Button Arrow Images: leftArrowIcon, rightArrowIcon
                if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0){
                    g.drawImage(leftArrowIcon, skipBtnX + 80, 634, 22, 20, null);
                    g.drawImage(rightArrowIcon, skipBtnX - 25, 635, 22, 20, null);
                }

                //Set Status Bar: Skip
                SolarFox.setStatusBar("Skip");

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

                //Draws Skip Button Image: skipOnBtn
                g.drawImage(skipOnBtn, skipBtnX, skipBtnY, skipBtnW, skipBtnH, null);

                //Set Status Bar: Credits Menu
                SolarFox.setStatusBar("Credits Menu");
            }
        }
        
        if(count < 468){
            count++;
            creditsColor++;
        } else {
            count = 0;
            creditsColor = 0xff0400;
        }
        
    }
    
    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates CreditsMenu Object
    * 
    * @param game - the Game of CreditsMenu
    * @param up - the up variable of CreditsMenu
    * @param down - the down variable of CreditsMenu
    * @param left - the left variable of CreditsMenu
    * @param right - the right variable of CreditsMenu
    * @param fire - the fire variable of CreditsMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        CreditsRect = CreditsMenu.getAllRect();
//        animPublisher.runRen();
//        animCreditsLightening.runRen();
        
        if(CMTimer > 0) {
            CMTimer--;
        }
        if(CMSkipTimer > 0) {
            CMSkipTimer--;
        }
        if(CMfirstTick) {
            CMfirstTick = false;
            System.out.println("Cue Credits Screen . . .");
            System.out.println("Cue Dodgy soundtrack . . .");
            if(Game.getGameSound()){
                Sound.creditsSoundtrack.loop();
            }
            //Set Status Bar: Credits Menu
            SolarFox.setStatusBar("Credits Menu");
        }
        if(CMTimer == 0) {
//            animCredits.runRen();
//            animCreditsA.runRen();
//            animCreditsB.runRen();
        }

    }
    
    
    /**
    * getAll()
    * 
    * Returns the List of the CreditsMenu 
    * objects referenced by Creditz1A
    * 
    * @return Creditz1A
    */
    public static List<Rectangle> getAll() {
        Creditz1A = new ArrayList<>();
        int j = 0;
        
        for (int i = 0; i < Creditz1.size(); i++) {
            //if (Creditz1.get(i).isDead == false) {
                Creditz1A.add(j, Creditz1.get(i));
                
                j++;
            //}
        }
        
        return Creditz1A;
    }

    
    /**
    * getAllRect()
    * 
    * Returns the List of the Rectangles 
    * referenced by CreditsRect 
    * 
    * @return CreditsRect
    */	
    public static List<Rectangle> getAllRect() {        
	return CreditsRect;
    }

    
    /**
    * dead(int k)
    * 
    * 
    * @param k
    */
    public void dead(int k) {
        CreditsRect.remove(k);
    }
    
    
    /**
    * clearAll()
    * 
    * 
    */
    public static void clearAll() {
        Creditz1.clear();
        CreditsRect.clear();
    }
    
    
    /**
    * setBarricadeCol(int col)
    * 
    * 
    * @param col
    */
    public static void setCreditsCol(int col) {
        creditsColor = col;
    }
    
    
}
