/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.enemiez;

//import com.LOGamez.barricade.Barricade;
//import com.LOGamez.explodes.BRCExplode;
//import com.LOGamez.graphics.Animation;
import com.LOGamez.graphics.Render;
//import com.LOGamez.graphics.Texture;
import com.LOGamez.level.Level;
import com.LOGamez.solarfox.*;
//import com.LOGamez.player.Player;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Ghomez
 */
public class Enemy {

    /**Attributes*/
        
    /**x coordinate of Enemy object */
    public int x;
        
    /**y coordinate of Enemy object */
    public int y;
        
    /**width of Enemy object*/
    public int width;
        
    /**height of Enemy object*/
    public int height;
        
    /**height of Enemy and its linked Rectangle object*/
    public static int h;// = 40;
        
    /**width of Enemy and its linked Rectangle object*/
    public static int w;// = 40;
        
    /**isDead (true/false) value of Enemy object*/
    public boolean isDead;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy object*/
    public static int Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy object*/
    public static int allDirection = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy0 object*/
    public int en0Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy1 object*/
    public int en1Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy2 object*/
    public int en2Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy3 object*/
    public int en3Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy4 object*/
    public int en4Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy5 object*/
    public int en5Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy6 object*/
    public int en6Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy7 object*/
    public int en7Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy8 object*/
    public int en8Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of Enemy9 object*/
    public int en9Direction = 0;
    
    /**Direction of travel 0=Right, 1=Left, 2=Down of UFO object*/
    public int ufoDirection = 0;

    /**xSpace0 variable of Enemy object */
    public static int xSpace0;// = 36;//0:24, 1:48, 2:52
    
    /**xSpace1 variable of Enemy object */
    public static int xSpace1;// = 25;//0:15, 1:25, 2:30
    
    /**yFall variable of Enemy object */
    public static int yFall;// = 25;//0:25, 1:35, 2:30
    
    /**e0_y variable of Enemy object */
    public static int e0_y;
    
    /**e1_y variable of Enemy object */
    public static int e1_y;
    
    /**e2_y variable of Enemy object */
    public static int e2_y;
    
    /**e3_y variable of Enemy object */
    public static int e3_y;
    
    /**e4_y variable of Enemy object */
    public static int e4_y;
    
    /**e5_y variable of Enemy object */
    public static int e5_y;
    
    /**e6_y variable of Enemy object */
    public static int e6_y;
    
    /**e7_y variable of Enemy object */
    public static int e7_y;
    
    /**e8_y variable of Enemy object */
    public static int e8_y;
    
    /**e9_y variable of Enemy object */
    public static int e9_y;
    
    /**e0_col variable of Enemy object */
    public static int e0_col;
    
    /**e1_col variable of Enemy object */
    public static int e1_col;
    
    /**e2_col variable of Enemy object */
    public static int e2_col;
    
    /**e3_col variable of Enemy object */
    public static int e3_col;
    
    /**e4_col variable of Enemy object */
    public static int e4_col;
    
    /**e5_col variable of Enemy object */
    public static int e5_col;
    
    /**e6_col variable of Enemy object */
    public static int e6_col;
    
    /**e7_col variable of Enemy object */
    public static int e7_col;
    
    /**e8_col variable of Enemy object */
    public static int e8_col;
    
    /**e9_col variable of Enemy object */
    public static int e9_col;
    
    /**e0Col variable of Enemy object */
    public int e0Col;
    
    /**e1Col variable of Enemy object */
    public int e1Col;
    
    /**e2Col variable of Enemy object */
    public int e2Col;
    
    /**e3Col variable of Enemy object */
    public int e3Col;
    
    /**e4Col variable of Enemy object */
    public int e4Col;
    
    /**e5Col variable of Enemy object */
    public int e5Col;
    
    /**e6Col variable of Enemy object */
    public int e6Col;
    
    /**e7Col variable of Enemy object */
    public int e7Col;
    
    /**e8Col variable of Enemy object */
    public int e8Col;
    
    /**e9Col variable of Enemy object */
    public int e9Col;
    
    
    /**eufo_y variable of Enemy object */
    public static int eufo_y;
    
    /**E0rows variable of Enemy object*/ 
    public static int E0rows;
    
    /**E1rows variable of Enemy object*/ 
    public static int E1rows;
    
    /**E2rows variable of Enemy object*/ 
    public static int E2rows;
    
    /**E3rows variable of Enemy object*/ 
    public static int E3rows;
    
    /**E4rows variable of Enemy object*/ 
    public static int E4rows;
    
    /**E5rows variable of Enemy object*/ 
    public static int E5rows;
    
    /**E6rows variable of Enemy object*/ 
    public static int E6rows;
    
    /**E7rows variable of Enemy object*/ 
    public static int E7rows;
    
    /**E8rows variable of Enemy object*/ 
    public static int E8rows;
    
    /**E9rows variable of Enemy object*/ 
    public static int E9rows;
    
    /**UFOfreq variable of Enemy object*/ 
    public static int UFOfreq;
    
    /**Left side of screen value*/
    public static int leftSide;// = 25;//0:15 , 1:20, 2:25

    /**Right side of screen value (Derived)*/
    public static int rightSide;// = Display.getGameWidth() - 25;//0:15 , 1:20, 2:25
    
    /**Speed of travel variable of Enemy object*/
    public static double EnSpeed;// = 1.0;
    
    /**id variable of Enemy object */
    public int id;
    
    /**enTouchRight variable of Enemy object */
    private static boolean enTouchRight;
    
    /**enTouchLeft variable of Enemy object */
    private static boolean enTouchLeft;
    
    /**en0TouchLeft variable of Enemy0 object */
    public static boolean en0TouchLeft;
    
    /**en0TouchRight variable of Enemy0 object */
    public static boolean en0TouchRight;
    
    /**en1TouchRight variable of Enemy1 object */
    public static boolean en1TouchRight;
    
    /**en1TouchLeft variable of Enemy1 object */
    public static boolean en1TouchLeft;
    
    /**en2TouchRight variable of Enemy2 object */
    public static boolean en2TouchRight;
    
    /**en2TouchLeft variable of Enemy2 object */
    public static boolean en2TouchLeft;
    
    /**en3TouchRight variable of Enemy3 object */
    public static boolean en3TouchRight;
    
    /**en3TouchLeft variable of Enemy3 object */
    public static boolean en3TouchLeft;

    /**en4TouchRight variable of Enemy4 object */
    public static boolean en4TouchRight;
    
    /**en4TouchLeft variable of Enemy4 object */
    public static boolean en4TouchLeft;
    
    /**en5TouchRight variable of Enemy5 object */
    public static boolean en5TouchRight;
    
    /**en5TouchLeft variable of Enemy5 object */
    public static boolean en5TouchLeft;
    
    /**en6TouchRight variable of Enemy6 object */
    public static boolean en6TouchRight;
    
    /**en6TouchLeft variable of Enemy6 object */
    public static boolean en6TouchLeft;
    
    /**en7TouchRight variable of Enemy7 object */
    public static boolean en7TouchRight;
    
    /**en7TouchLeft variable of Enemy7 object */
    public static boolean en7TouchLeft;
    
    /**en8TouchRight variable of Enemy8 object */
    public static boolean en8TouchRight;
    
    /**en8TouchLeft variable of Enemy8 object */
    public static boolean en8TouchLeft;
    
    /**en9TouchRight variable of Enemy9 object */
    public static boolean en9TouchRight;
    
    /**en9TouchLeft variable of Enemy9 object */
    public static boolean en9TouchLeft;
    
    /**barStrength variable of Enemy object */
    //public static int barStrength;
    
    /**barricadeStrength variable of Enemy object */
    //private static double barricadeStrength;

    /**oldBarStrength variable of Enemy object */
    //public static int oldBarStrength;
    
    /**invaderStrength variable of Enemy object */
    //private static int invaderStrength;
    
    /**oldInvaderStrength variable of Enemy object */
    //private static int oldInvaderStrength;
    
    /**random variable of Enemy object */
    public static Random random = new Random();
    
    /**enScale variable of Enemy object */
    public static double enScale;
    
    /**EnemiAll variable of Enemy object */
    public static List<Enemy> EnemiAll = new ArrayList<>();
    
    /**Enemi0 variable of Enemy object */
    //public static List<Enemy0> Enemi0 = new ArrayList<>();
    
    /**Enemi0A variable of Enemy object */
    //public static List<Enemy0> Enemi0A;
    
    /**Enemi1 variable of Enemy object */
    //public static List<Enemy1> Enemi1 = new ArrayList<>();
    
    /**Enemi1A variable of Enemy object */
    //public static List<Enemy1> Enemi1A;
    
    /**Enemi2 variable of Enemy object */
    //public static List<Enemy2> Enemi2 = new ArrayList<>();
    
    /**Enemi2A variable of Enemy object */
    //public static List<Enemy2> Enemi2A;
    
    /**Enemi3 variable of Enemy object */
    //public static List<Enemy3> Enemi3 = new ArrayList<>();
    
    /**Enemi3A variable of Enemy object */
    //public static List<Enemy3> Enemi3A;
    
    /**Enemi4 variable of Enemy object */
    //public static List<Enemy4> Enemi4 = new ArrayList<>();
    
    /**Enemi4A variable of Enemy object */
    //public static List<Enemy4> Enemi4A;
    
    /**Enemi5 variable of Enemy object */
    //public static List<Enemy5> Enemi5 = new ArrayList<>();
    
    /**Enemi5A variable of Enemy object */
    //public static List<Enemy5> Enemi5A;
    
    /**Enemi6 variable of Enemy object */
    //public static List<Enemy6> Enemi6 = new ArrayList<>();
    
    /**Enemi6A variable of Enemy object */
    //public static List<Enemy6> Enemi6A;
    
    /**Enemi7 variable of Enemy object */
    //public static List<Enemy7> Enemi7 = new ArrayList<>();
    
    /**Enemi7A variable of Enemy object */
    //public static List<Enemy7> Enemi7A;
    
    /**Enemi8 variable of Enemy object */
    //public static List<Enemy8> Enemi8 = new ArrayList<>();
    
    /**Enemi8A variable of Enemy object */
    //public static List<Enemy8> Enemi8A;
    
    /**Enemi9 variable of Enemy object */
    //public static List<Enemy9> Enemi9 = new ArrayList<>();
    
    /**Enemi9A variable of Enemy object */
    //public static List<Enemy9> Enemi9A;
    
    /**EnemiUFO variable of Enemy object */
    public static List<UFO> EnemiUFO = new ArrayList<>();
    
    /**enimizHit variable of Enemy object */
    private static int enimizHit = 0;
    
    /**animE0 variable of Enemy object */
//    public static final Animation animE0 = new Animation(18, 
//        Texture.en1_0, 
//        Texture.en1_1, 
//        Texture.en1_0, 
//        Texture.en1_1
//    );
    
    /**animE1 variable of Enemy1 object */
//    public static final Animation animE1 = new Animation(18, 
//        Texture.en9_0, 
//        Texture.en9_1, 
//        Texture.en9_0, 
//        Texture.en9_1
//    );
    
    /**animE2 variable of Enemy2 object */
//    public static final Animation animE2 = new Animation(18, 
//        Texture.en2_0, 
//        Texture.en2_1, 
//        Texture.en2_0, 
//        Texture.en2_1
//    );
    
//    public static final Animation animE3 = new Animation(18, 
//        Texture.en3_0, 
//        Texture.en3_1, 
//        Texture.en3_0, 
//        Texture.en3_1
//    );
    
    /**animE4 variable of Enemy4 object */
//    public static final Animation animE4 = new Animation(18, 
//        Texture.en4_0, 
//        Texture.en4_1, 
//        Texture.en4_0, 
//        Texture.en4_1
//    );
    
    /**animE5 variable of Enemy5 object */
//    public static final Animation animE5 = new Animation(18, 
//        Texture.en5_0, 
//        Texture.en5_1, 
//        Texture.en5_0, 
//        Texture.en5_1
//    );
    
    /**animE6 variable of Enemy6 object */
//    public static final Animation animE6 = new Animation(18, 
//        Texture.en6_0, 
//        Texture.en6_1, 
//        Texture.en6_0, 
//        Texture.en6_1
//    );
    
    /**animE7 variable of Enemy7 object */
//    public static final Animation animE7 = new Animation(18, 
//        Texture.en7_0, 
//        Texture.en7_1, 
//        Texture.en7_0, 
//        Texture.en7_1
//    );
    
    /**animE8 variable of Enemy8 object */
//    public static final Animation animE8 = new Animation(18, 
//        Texture.en8_0, 
//        Texture.en8_1, 
//        Texture.en8_0, 
//        Texture.en8_1
//    );
    
    /**animE9 variable of Enemy9 object */
//    public static final Animation animE9 = new Animation(18, 
//        Texture.en9_0, 
//        Texture.en9_1, 
//        Texture.en9_0, 
//        Texture.en9_1
//    );
    
   
    
    
    /**Constructor*/
    
    /**
    * Enemy()
    * 
    * Initialises a new Enemy object
    */
    public Enemy() { 
        //System.out.println("Enemy: New Enemy Created");
        setUp();
    }
    
    
    /**Public Protocol*/
    
    
    /**
    * setUp()
    * 
    */
    public static void setUp(){
        int width = SolarFox.getMainWidth();
        switch(width){
            case 300:
                h = 20;
                w = 20;
                xSpace0 = 24;//0:36, 1:48, 2:52
                xSpace1 = 10;//0:15, 1:25, 2:30
                yFall = 25;//0:25, 1:35, 2:30

                e0_y = 45;//0:25, 1:35, 2:30
                e1_y = 88;//0:25, 1:35, 2:30
                e2_y = 130;//0:25, 1:35, 2:30
                e3_y = 190;//0:25, 1:35, 2:30
                e4_y = 250;//0:25, 1:35, 2:30
                e5_y = 310;//0:25, 1:35, 2:30
                e6_y = 370;//0:25, 1:35, 2:30
                e7_y = 430;//0:25, 1:35, 2:30
                e8_y = 490;//0:25, 1:35, 2:30
                e9_y = 550;//0:25, 1:35, 2:30
                eufo_y = 30;//0:25, 1:35, 2:30

                EnSpeed = 0.5;// * Level.EnSpeedGlobal;

                leftSide = 2;//0:10, 1:15, 2:20
                rightSide = SolarFox.getMainWidth() - 18;//0:15 , 1:20, 2:25

                enScale = 0.2;
                
                break;
                
            case 480:
                h = 30;
                w = 30;
                xSpace0 = 24;//0:36, 1:48, 2:52
                xSpace1 = 20;//0:15, 1:25, 2:30
                yFall = 25;//0:25, 1:35, 2:30

                e0_y = 45;//0:25, 1:35, 2:30
                e1_y = 88;//0:25, 1:35, 2:30
                e2_y = 130;//0:25, 1:35, 2:30
                e3_y = 190;//0:25, 1:35, 2:30
                e4_y = 250;//0:25, 1:35, 2:30
                e5_y = 310;//0:25, 1:35, 2:30
                e6_y = 370;//0:25, 1:35, 2:30
                e7_y = 430;//0:25, 1:35, 2:30
                e8_y = 490;//0:25, 1:35, 2:30
                e9_y = 550;//0:25, 1:35, 2:30
                eufo_y = 30;//0:25, 1:35, 2:30

                EnSpeed = 0.6;// * Level.EnSpeedGlobal;

                leftSide = 15;//0:10, 1:15, 2:20
                rightSide = SolarFox.getMainWidth() - 15;//0:15 , 1:20, 2:25

                enScale = 0.4;
                
                break;
                
            case 604:
                h = 64;
                w = 64;
                xSpace0 = 48;//0:36, 1:48, 2:52
                xSpace1 = 25;//0:15, 1:25, 2:30
                yFall = 35;//0:25, 1:35, 2:30

                e0_y = 70;//0:25, 1:35, 2:30//FIRST ROW //TOP
                e1_y = 170;//0:25, 1:35, 2:30//THIRD ROW
                e2_y = 120;//0:25, 1:35, 2:30//SECOND ROW
                e3_y = 220;//0:25, 1:35, 2:30//FOURTH ROW //BOTTOM
                e4_y = 270;//0:25, 1:35, 2:30//FIFTH ROW
                e5_y = 320;//0:25, 1:35, 2:30//SIXTH ROW
                e6_y = 370;//0:25, 1:35, 2:30//SEVENTH ROW
                e7_y = 420;//0:25, 1:35, 2:30//EIGHTH ROW
                e8_y = 470;//0:25, 1:35, 2:30//NINETH ROW
                e9_y = 520;//0:25, 1:35, 2:30//TENTH ROW //BOTTOM[NEW]
                eufo_y = 30;//0:25, 1:35, 2:30//PRE_FIRST ROW //ABOVETOP

                EnSpeed = 1.0;// * Level.EnSpeedGlobal;

                leftSide = 5;//0:10, 1:15, 2:20
                rightSide = SolarFox.getMainWidth() - 25;//0:15 , 1:20, 2:25

                enScale = 0.6;
                
                break;
                
            default:
                h = 64;
                w = 64;
                xSpace0 = 48;//0:36, 1:48, 2:52
                xSpace1 = 25;//0:15, 1:25, 2:30
                yFall = 35;//0:25, 1:35, 2:30

                e0_y = 70;//0:25, 1:35, 2:30//FIRST ROW //TOP
                e1_y = 170;//0:25, 1:35, 2:30//THIRD ROW
                e2_y = 120;//0:25, 1:35, 2:30//SECOND ROW
                e3_y = 220;//0:25, 1:35, 2:30//FOURTH ROW //BOTTOM
                e4_y = 270;//0:25, 1:35, 2:30//FIFTH ROW
                e5_y = 320;//0:25, 1:35, 2:30//SIXTH ROW
                e6_y = 370;//0:25, 1:35, 2:30//SEVENTH ROW
                e7_y = 420;//0:25, 1:35, 2:30//EIGHTH ROW
                e8_y = 470;//0:25, 1:35, 2:30//NINETH ROW
                e9_y = 520;//0:25, 1:35, 2:30//TENTH ROW //BOTTOM[NEW]
                eufo_y = 30;//0:25, 1:35, 2:30//PRE_FIRST ROW //ABOVETOP

                EnSpeed = 1.0;// * Level.EnSpeedGlobal;

                leftSide = 5;//0:10, 1:15, 2:20
                rightSide = SolarFox.getMainWidth() - 25;//0:15 , 1:20, 2:25

                enScale = 0.6;
                
                break;
                
        }
        
    }
    
    
    
    /**
    * init()
    * 
    * Initialises all rows of Enemy objects
    */
    public static void init() {
        System.out.println("Enemy: Initializing Enemy Objects . . .");
//        if(!Enemi0.isEmpty()){
//            Enemy0.clearAll();
//        }
//        if(!Enemi1.isEmpty()){
//            Enemy1.clearAll();
//        }
//        if(!Enemi2.isEmpty()){
//            Enemy2.clearAll();
//        }
//        if(!Enemi3.isEmpty()){
//            Enemy3.clearAll();
//        }
//        if(!Enemi4.isEmpty()){
//            Enemy4.clearAll();
//        }
//        if(!Enemi5.isEmpty()){
//            Enemy5.clearAll();
//        }
//        if(!Enemi6.isEmpty()){
//            Enemy6.clearAll();
//        }
//        if(!Enemi7.isEmpty()){
//            Enemy7.clearAll();
//        }
//        if(!Enemi8.isEmpty()){
//            Enemy8.clearAll();
//        }
//        if(!Enemi9.isEmpty()){
//            Enemy9.clearAll();
//        }
        if(!EnemiUFO.isEmpty()){
            UFO.clearAll();
        }
        allDirection = 0;
        EnemiAll = new ArrayList<>();
                
        EnemiAll.addAll(EnemiUFO);
//        EnemiAll.addAll(Enemi1);
//        EnemiAll.addAll(Enemi2);
//        EnemiAll.addAll(Enemi3);
//        EnemiAll.addAll(Enemi4);
//        EnemiAll.addAll(Enemi5);
//        EnemiAll.addAll(Enemi6);
//        EnemiAll.addAll(Enemi7);
//        EnemiAll.addAll(Enemi8);
//        EnemiAll.addAll(Enemi9);
        
//        Enemy0.initE0();
//        Enemy1.initE1();
//        Enemy2.initE2();
//        Enemy3.initE3();
//        Enemy4.initE4();
//        Enemy5.initE5();
//        Enemy6.initE6();
//        Enemy7.initE7();
//        Enemy8.initE8();
//        Enemy9.initE9();
        UFO.initUFO();
        
        
    }
    
    
    /**
     * render(Render target, Graphics2D g)
     * 
     * @param g2d
     */
    public static void render(Graphics2D g2d) {
        //System.out.println("Rendering Enemy . . .");
        if(Game.pauseTime == 0){
//            Enemy0.render(target, g);
//            Enemy1.render(target, g);
//            Enemy2.render(target, g);
//            Enemy3.render(target, g);
//            Enemy4.render(target, g);
//            Enemy5.render(target, g);
//            Enemy6.render(target, g);
//            Enemy7.render(target, g);
//            Enemy8.render(target, g);
//            Enemy9.render(target, g);
            UFO.render(g2d);
        }
    }
    
    
    /**
    * tick()
    * 
    * Updates Enemy Objects
    */
    public static synchronized void tick(){
        if(Game.getGame().menu == null && !Game.getGame().stateManager.currentState.getName().equals("menu")){
        if(!Level.levelComplete){
            checkCollisions();
            
//            Enemy0.tick();
//            Enemy1.tick();
//            Enemy2.tick();
//            Enemy3.tick();
//            Enemy4.tick();
//            Enemy5.tick();
//            Enemy6.tick();
//            Enemy7.tick();
//            Enemy8.tick();
//            Enemy9.tick();
            UFO.tick();
            
            EnemiAll = new ArrayList<>();

            EnemiAll.addAll(EnemiUFO);
//            EnemiAll.addAll(Enemi1);
//            EnemiAll.addAll(Enemi2);
//            EnemiAll.addAll(Enemi3);
//            EnemiAll.addAll(Enemi4);
//            EnemiAll.addAll(Enemi5);
//            EnemiAll.addAll(Enemi6);
//            EnemiAll.addAll(Enemi7);
//            EnemiAll.addAll(Enemi8);
//            EnemiAll.addAll(Enemi9);
            
            
            if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0) { 
                moveAll();
                EnemiAll = Enemy.getAllEnemies();
            }
            

            
            EnemiUFO.get(0).move(0);
            if ((System.currentTimeMillis() / 2000) * 1.0 % 5 == 0 && EnemiUFO.size() > 0) { 
                //Sound.UFOsnd.stop();
                UFO.clearAll();
                UFO.initUFO();
            }
            
//            barStrength = Barricade.BarricadeRect.size();
//            invaderStrength = EnemiAll.size();
            
//            if(barStrength < oldBarStrength || invaderStrength < oldInvaderStrength){
//                displayBarStrength();
//            }
            
//            oldBarStrength = barStrength;
//            oldInvaderStrength = invaderStrength;
            
        }
        }
    }

    
    /**
    * displayBarStrength()
    * 
    */
//    public static void displayBarStrength(){
//        if(Barricade.BarricadeRect.isEmpty()){
//            //System.out.println("Barricade Destroyed!");
//            Display.setStatusBar("Barricade Destroyed!"+"    Invaders Remaining: "+EnemiAll.size());
//        } else {
//            barricadeStrength = ((double) (barStrength % 648.0 / 10.0));
//            String num = String.format("%.1f", barricadeStrength);
//            //System.out.println("Barricade Strength: "+num +"%");
//            Display.setStatusBar("Barricade Strength: "+num +"%"+"    Invaders Remaining: "+EnemiAll.size());
//        }
//    }
    
    
    /**
    * checkCollisions()
    * 
    */
    public static synchronized void checkCollisions() {
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//        int count4 = 0;
//        int count5 = 0;
//        int count6 = 0;
//        int count7 = 0;
//        int count8 = 0;
//        int count9 = 0;
        int count10 = 0;
        
        //Check collisions between En1-10&Barricade
        //Check collisions between BRCExplode&En1-10
        if(Game.getGame().menu == null){
            //Move En1-10 fire to here
            
            //Check collisions between En9&Barricade    *********************************
//            for (int c9 = 0; c9 < Enemi9.size(); c9++) {
//                if(Enemi9.get(c9).isDead == false) {
//                    
//                    count9 = c9;
//
//                    if (random.nextInt(155) == 2) {
//                        //En9 Fire Bullet
//                        EnFire(Enemi9.get(c9));
//                    }
//
//                    if(Enemi9.get(c9).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi9.get(c9).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En9   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi9.get(c9).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            
            //Check collisions between En8&Barricade    *********************************
//            for (int c8 = 0; c8 < Enemi8.size(); c8++) {
//                if(Enemi8.get(c8).isDead == false) {
//                    
//                    count8 = c8;
//
//                    if (random.nextInt(155) == 2) {
//                        //En8 Fire Bullet
//                        EnFire(Enemi8.get(c8));
//                    }
//
//                    if(Enemi8.get(c8).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi8.get(c8).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En8   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi8.get(c8).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            //Check collisions between En7&Barricade    *********************************
//            for (int c7 = 0; c7 < Enemi7.size(); c7++) {
//                if(Enemi7.get(c7).isDead == false) {
//                    
//                    count7 = c7;
//
//                    if (random.nextInt(155) == 2) {
//                        //En7 Fire Bullet
//                        EnFire(Enemi7.get(c7));
//                    }
//                    
//                    if(Enemi7.get(c7).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi7.get(c7).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                    
//                        //Check collisions between BRCExplode&En7   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi7.get(c7).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            
            //Check collisions between En6&Barricade    *********************************
//            for (int c6 = 0; c6 < Enemi6.size(); c6++) {
//                if(Enemi6.get(c6).isDead == false) {
//                    
//                    count6 = c6;
//
//                    if (random.nextInt(155) == 2) {
//                        //En6 Fire Bullet
//                        EnFire(Enemi6.get(c6));
//                    }
//
//                    if(Enemi6.get(c6).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi6.get(c6).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En6   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi6.get(c6).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            
            //Check collisions between En5&Barricade    *********************************
//            for (int c5 = 0; c5 < Enemi5.size(); c5++) {
//                if(Enemi5.get(c5).isDead == false) {
//                    
//                    count5 = c5;
//
//                    if (random.nextInt(155) == 2) {
//                        //En5 Fire Bullet
//                        EnFire(Enemi5.get(c5));
//                    }
//
//                    if(Enemi5.get(c5).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi5.get(c5).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En5   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi5.get(c5).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            
            //Check collisions between En4&Barricade    *********************************
//            for (int c4 = 0; c4 < Enemi4.size(); c4++) {
//                if(Enemi4.get(c4).isDead == false) {
//                    
//                    count4 = c4;
//
//                    if (random.nextInt(155) == 2) {
//                        //En4 Fire Bullet
//                        EnFire(Enemi4.get(c4));
//                    }
//
//                    if(Enemi4.get(c4).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi4.get(c4).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En4   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi4.get(c4).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            
            
            //Check collisions between En3&Barricade    *********************************
//            for (int c3 = 0; c3 < Enemi3.size(); c3++) {
//                if(Enemi3.get(c3).isDead == false) {
//                    
//                    count3 = c3;
//
//                    if (random.nextInt(155) == 2) {
//                        //En3 Fire Bullet
//                        EnFire(Enemi3.get(c3));
//                    }
//
//                    if(Enemi3.get(c3).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi3.get(c3).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En3   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi3.get(c3).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            
            //Check collisions between En1&Barricade    *********************************
//            for (int c1 = 0; c1 < Enemi1.size(); c1++) {
//                if(Enemi1.get(c1).isDead == false) {
//                    
//                    count1 = c1;
//
//                    if(random.nextInt(280) == 2) {
//                        //En1 Fire Bullet
//                        EnFire(Enemi1.get(c1));
//                    }
//                
//                    if(Enemi1.get(c1).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi1.get(c1).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En1   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi1.get(c1).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            //Check collisions between En2&Barricade    *********************************
//            for (int c2 = 0; c2 < Enemi2.size(); c2++) {
//                if (Enemi2.get(c2).isDead == false) {       
//                    
//                    count2 = c2;
//
//                    if (random.nextInt(320) == 2) {
//                        //En2 Fire Bullet
//                        EnFire(Enemi2.get(c2));
//                    }
//
//                    if(Enemi2.get(c2).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k = 0; k < Barricade.BarricadeRect.size(); k++) {
//                                if (Enemi2.get(c2).getBounds().intersects(Barricade.BarricadeRect.get(k))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En2   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k = 0; k < BRCExplode.BRCXPR.size(); k++) {
//                                if (Enemi2.get(c2).getBounds().intersects(BRCExplode.BRCXPR.get(k))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            
            //Check collisions between En0&Barricade    *********************************    
//            for (int c0 = 0; c0 < Enemi0.size(); c0++) {
//                if (Enemi0.get(c0).isDead == false) {
//                    
//                    count0 = c0;
//
//                    if (random.nextInt(280) == 2) {
//                        //En0 Fire Bullet
//                        EnFire(Enemi0.get(c0));
//                    }
//
//                    if(Enemi0.get(c0).y > Game.getGameHeight()-240){
//                        for (Barricade BRC1 : Barricade.BRC) {
//                            for (int k0 = 0; k0 < Barricade.BarricadeRect.size(); k0++) {
//                                if (Enemi0.get(c0).getBounds().intersects(Barricade.BarricadeRect.get(k0))) {
//
//                                    //message Barricade(id) dead
//                                    BRC1.dead(k0);
//                                }
//                            }
//                        }
//
//                        //Check collisions between BRCExplode&En0   **********************************
//                        for (BRCExplode BRCX1 : BRCExplode.BRCXP) {
//                            for (int k0 = 0; k0 < BRCExplode.BRCXPR.size(); k0++) {
//                                if (Enemi0.get(c0).getBounds().intersects(BRCExplode.BRCXPR.get(k0))) {
//
//                                    //message BRCExplode(id) dead
//                                    BRCX1.BRCEHit(k0);
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            
            

            //Check collisions between En10&?    *********************************
            for (int c10 = 0; c10 < EnemiUFO.size(); c10++) {
                if (EnemiUFO.get(c10).isDead == false) {
                    count10 = c10;

                    if (random.nextInt(48) == 2) {
                        //En10 Fire Bullet
                        EnFire(EnemiUFO.get(c10));
                    }
                }
            }
            
            
            if(count10 == 0 && getAllEnemies().isEmpty() && getAllEnemies().size() == 0){//if(count0 + count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 == 0 && getAllEnemies().isEmpty() && getAllEnemies().size() == 0){
                System.out.println("Level Complete!");
                Game.pauseTime = 150;
                Level.levelComplete = true;

            }
            
        }
        
    }
    
    
    /**
     * setNoEnemy(int E0row, int E1row, int E2row, int E3row, int E4row, int E5row, int E6row, int E7row, int E8row, int E9row)
     * 
     * @param E0row
     * @param E1row
     * @param E2row
     * @param E3row
     * @param E4row
     * @param E5row
     * @param E6row
     * @param E7row
     * @param E8row
     * @param E9row
     * 
     */
    public static void setNoEnemy(int E0row, int E1row, int E2row, int E3row, int E4row, int E5row, int E6row, int E7row, int E8row, int E9row) {
        E0rows = E0row;
        E1rows = E1row;
        E2rows = E2row;
        E3rows = E3row;
        E4rows = E4row;
        E5rows = E5row;
        E6rows = E6row;
        E7rows = E7row;
        E8rows = E8row;
        E9rows = E9row;
    }
    
    
    /**
     * setUFOFreq(int freq)
     * 
     * @param freq
     */
    public static void setUFOFreq(int freq) {
        UFOfreq = freq;
    }
    
    
    /**
     * setEnemyCol(int col)
     * 
     * @param col
     */
    public static void setEnemyCol(int col) {
        e0_col = col;
        e1_col = col;
        e2_col = col;
        e3_col = col;
        e4_col = col;
        e5_col = col;
        e6_col = col;
        e7_col = col;
        e8_col = col;
        e9_col = col;
    }
    
    
    /**
     * getBounds()
     * 
     * @return new Rectangle(this.x, this.y, this.width, this.height)
     */
    public Rectangle getBounds() {
      return new Rectangle(this.x, this.y, 40, 40);
    }

    
    /**
     * getEnemiesHit()
     * 
     * @return enimizHit
     */
    public static int getEnemiesHit() {
        return enimizHit;
    }
    
    
    /**
     * resetEnemiesHit()
     * 
     */
    public static void resetEnemiesHit() {
        enimizHit = 0;
    }
    
    
    /**
     * moveAll()
     * 
     */
    private static synchronized void moveAll(){
        
//        for (int i = 0; i < Enemi3.size(); i++) {
//            if (Enemi3.get(i).isDead == false) {
//
//                if(Enemi3.get(i).x > leftSide && Enemi3.get(i).x < rightSide) {
//                    if(Enemi3.get(i).x < rightSide && Enemi3.get(i).en3Direction == 0) {
//
//                        moveRight(Enemi3.get(i));
//
//                        if(Enemi3.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi3.size(); j++) {
//                                if (Enemi3.get(j).en3Direction == 0) {
//                                    Enemi3.get(j).en3Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy3.moveDown(Enemi3.get(j));
//                                } else {
//                                    Enemi3.get(j).en3Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy3.moveDown(Enemi3.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi3.get(i).x > leftSide && Enemi3.get(i).en3Direction == 1) {
//
//                        Enemy3.moveLeft(Enemi3.get(i));
//
//                        if(Enemi3.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi3.size(); j++) {
//                                if (Enemi3.get(j).en3Direction == 0) {
//                                    Enemi3.get(j).en3Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy3.moveDown(Enemi3.get(j));
//                                } else {
//                                    Enemi3.get(j).en3Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy3.moveDown(Enemi3.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
//        for (int i = 0; i < Enemi4.size(); i++) {
//            if (Enemi4.get(i).isDead == false) {
//
//                if(Enemi4.get(i).x > leftSide && Enemi4.get(i).x < rightSide) {
//                    if(Enemi4.get(i).x < rightSide && Enemi4.get(i).en4Direction == 0) {
//
//                        moveRight(Enemi4.get(i));
//
//                        if(Enemi4.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi4.size(); j++) {
//                                if (Enemi4.get(j).en4Direction == 0) {
//                                    Enemi4.get(j).en4Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy4.moveDown(Enemi4.get(j));
//                                } else {
//                                    Enemi4.get(j).en4Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy4.moveDown(Enemi4.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi4.get(i).x > leftSide && Enemi4.get(i).en4Direction == 1) {
//
//                        Enemy4.moveLeft(Enemi4.get(i));
//
//                        if(Enemi4.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi4.size(); j++) {
//                                if (Enemi4.get(j).en4Direction == 0) {
//                                    Enemi4.get(j).en4Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy4.moveDown(Enemi4.get(j));
//                                } else {
//                                    Enemi4.get(j).en4Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy4.moveDown(Enemi4.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
//        for (int i = 0; i < Enemi5.size(); i++) {
//            if (Enemi5.get(i).isDead == false) {
//
//                if(Enemi5.get(i).x > leftSide && Enemi5.get(i).x < rightSide) {
//                    if(Enemi5.get(i).x < rightSide && Enemi5.get(i).en5Direction == 0) {
//
//                        moveRight(Enemi5.get(i));
//
//                        if(Enemi5.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi5.size(); j++) {
//                                if (Enemi5.get(j).en5Direction == 0) {
//                                    Enemi5.get(j).en5Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy5.moveDown(Enemi5.get(j));
//                                } else {
//                                    Enemi5.get(j).en5Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy5.moveDown(Enemi5.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi5.get(i).x > leftSide && Enemi5.get(i).en5Direction == 1) {
//
//                        Enemy5.moveLeft(Enemi5.get(i));
//
//                        if(Enemi5.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi5.size(); j++) {
//                                if (Enemi5.get(j).en5Direction == 0) {
//                                    Enemi5.get(j).en5Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy5.moveDown(Enemi5.get(j));
//                                } else {
//                                    Enemi5.get(j).en5Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy5.moveDown(Enemi5.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
//        for (int i = 0; i < Enemi6.size(); i++) {
//            if (Enemi6.get(i).isDead == false) {
//
//                if(Enemi6.get(i).x > leftSide && Enemi6.get(i).x < rightSide) {
//                    if(Enemi6.get(i).x < rightSide && Enemi6.get(i).en6Direction == 0) {
//
//                        moveRight(Enemi6.get(i));
//
//                        if(Enemi6.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi6.size(); j++) {
//                                if (Enemi6.get(j).en6Direction == 0) {
//                                    Enemi6.get(j).en6Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy6.moveDown(Enemi6.get(j));
//                                } else {
//                                    Enemi6.get(j).en6Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy6.moveDown(Enemi6.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi6.get(i).x > leftSide && Enemi6.get(i).en6Direction == 1) {
//
//                        Enemy6.moveLeft(Enemi6.get(i));
//
//                        if(Enemi6.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi6.size(); j++) {
//                                if (Enemi6.get(j).en6Direction == 0) {
//                                    Enemi6.get(j).en6Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy6.moveDown(Enemi6.get(j));
//                                } else {
//                                    Enemi6.get(j).en6Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy6.moveDown(Enemi6.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
        
//        for (int i = 0; i < Enemi7.size(); i++) {
//            if (Enemi7.get(i).isDead == false) {
//
//                if(Enemi7.get(i).x > leftSide && Enemi7.get(i).x < rightSide) {
//                    if(Enemi7.get(i).x < rightSide && Enemi7.get(i).en7Direction == 0) {
//
//                        moveRight(Enemi7.get(i));
//
//                        if(Enemi7.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi7.size(); j++) {
//                                if (Enemi7.get(j).en7Direction == 0) {
//                                    Enemi7.get(j).en7Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy7.moveDown(Enemi7.get(j));
//                                } else {
//                                    Enemi7.get(j).en7Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy7.moveDown(Enemi7.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi7.get(i).x > leftSide && Enemi7.get(i).en7Direction == 1) {
//
//                        Enemy7.moveLeft(Enemi7.get(i));
//
//                        if(Enemi7.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi7.size(); j++) {
//                                if (Enemi7.get(j).en7Direction == 0) {
//                                    Enemi7.get(j).en7Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy7.moveDown(Enemi7.get(j));
//                                } else {
//                                    Enemi7.get(j).en7Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy7.moveDown(Enemi7.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
        
//        for (int i = 0; i < Enemi8.size(); i++) {
//            if (Enemi8.get(i).isDead == false) {
//
//                if(Enemi8.get(i).x > leftSide && Enemi8.get(i).x < rightSide) {
//                    if(Enemi8.get(i).x < rightSide && Enemi8.get(i).en8Direction == 0) {
//
//                        moveRight(Enemi8.get(i));
//
//                        if(Enemi8.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi8.size(); j++) {
//                                if (Enemi8.get(j).en8Direction == 0) {
//                                    Enemi8.get(j).en8Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy8.moveDown(Enemi8.get(j));
//                                } else {
//                                    Enemi8.get(j).en8Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy8.moveDown(Enemi8.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi8.get(i).x > leftSide && Enemi8.get(i).en8Direction == 1) {
//
//                        Enemy8.moveLeft(Enemi8.get(i));
//
//                        if(Enemi8.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi8.size(); j++) {
//                                if (Enemi8.get(j).en8Direction == 0) {
//                                    Enemi8.get(j).en8Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy8.moveDown(Enemi8.get(j));
//                                } else {
//                                    Enemi8.get(j).en8Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy8.moveDown(Enemi8.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
//        for (int i = 0; i < Enemi9.size(); i++) {
//            if (Enemi9.get(i).isDead == false) {
//
//                if(Enemi9.get(i).x > leftSide && Enemi9.get(i).x < rightSide) {
//                    if(Enemi9.get(i).x < rightSide && Enemi9.get(i).en9Direction == 0) {
//
//                        moveRight(Enemi9.get(i));
//
//                        if(Enemi9.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi9.size(); j++) {
//                                if (Enemi9.get(j).en9Direction == 0) {
//                                    Enemi9.get(j).en9Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy9.moveDown(Enemi9.get(j));
//                                } else {
//                                    Enemi9.get(j).en9Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy9.moveDown(Enemi9.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi9.get(i).x > leftSide && Enemi9.get(i).en9Direction == 1) {
//
//                        Enemy9.moveLeft(Enemi9.get(i));
//
//                        if(Enemi9.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi9.size(); j++) {
//                                if (Enemi9.get(j).en9Direction == 0) {
//                                    Enemi9.get(j).en9Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy9.moveDown(Enemi9.get(j));
//                                } else {
//                                    Enemi9.get(j).en9Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy9.moveDown(Enemi9.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
        
        
//        for (int i = 0; i < Enemi1.size(); i++) {
//            if (Enemi1.get(i).isDead == false) {
//
//                if(Enemi1.get(i).x > leftSide && Enemi1.get(i).x < rightSide) {
//                    if(Enemi1.get(i).x < rightSide && Enemi1.get(i).en1Direction == 0) {
//
//                        Enemy1.moveRight(Enemi1.get(i));
//
//                        if(Enemi1.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi1.size(); j++) {
//                                if (Enemi1.get(j).en1Direction == 0) {
//                                    Enemi1.get(j).en1Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy1.moveDown(Enemi1.get(j));
//                                } else {
//                                    Enemi1.get(j).en1Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy1.moveDown(Enemi1.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi1.get(i).x > leftSide && Enemi1.get(i).en1Direction == 1) {
//
//                        Enemy1.moveLeft(Enemi1.get(i));
//
//                        if(Enemi1.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi1.size(); j++) {
//                                if (Enemi1.get(j).en1Direction == 0) {
//                                    Enemi1.get(j).en1Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy1.moveDown(Enemi1.get(j));
//                                } else {
//                                    Enemi1.get(j).en1Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy1.moveDown(Enemi1.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
        
        
//        for (int i = 0; i < Enemi2.size(); i++) {
//            if (Enemi2.get(i).isDead == false) {
//
//                if(Enemi2.get(i).x > leftSide && Enemi2.get(i).x < rightSide) {
//                    if(Enemi2.get(i).x < rightSide && Enemi2.get(i).en2Direction == 0) {
//
//                        Enemy2.moveRight(Enemi2.get(i));
//
//                        if(Enemi2.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi2.size(); j++) {
//                                if (Enemi2.get(j).en2Direction == 0) {
//                                    Enemi2.get(j).en2Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy2.moveDown(Enemi2.get(j));
//                                } else {
//                                    Enemi2.get(j).en2Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy2.moveDown(Enemi2.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi2.get(i).x > leftSide && Enemi2.get(i).en2Direction == 1) {
//
//                        Enemy2.moveLeft(Enemi2.get(i));
//
//                        if(Enemi2.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }
//
//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi2.size(); j++) {
//                                if (Enemi2.get(j).en2Direction == 0) {
//                                    Enemi2.get(j).en2Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    Enemy2.moveDown(Enemi2.get(j));
//                                } else {
//                                    Enemi2.get(j).en2Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    Enemy2.moveDown(Enemi2.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
        
//        for (int i = 0; i < Enemi0.size(); i++) {
//            if (Enemi0.get(i).isDead == false) {
//
//                if(Enemi0.get(i).x > leftSide && Enemi0.get(i).x < rightSide) {
//                    if(Enemi0.get(i).x < rightSide && Enemi0.get(i).en0Direction == 0) {
//
//                        moveRight(Enemi0.get(i));
//
//                        if(Enemi0.get(i).x + 20 == rightSide){
//                            Enemy0.en0TouchRight = true;
//                            Enemy1.en1TouchRight = true;
//                            Enemy2.en2TouchRight = true;
//                            Enemy3.en3TouchRight = true;
//                            Enemy4.en4TouchRight = true;
//                            Enemy5.en5TouchRight = true;
//                            Enemy6.en6TouchRight = true;
//                            Enemy7.en7TouchRight = true;
//                            Enemy8.en8TouchRight = true;
//                            Enemy9.en9TouchRight = true;
//                            Enemy.enTouchRight = true;
//                        }
//
//                        if(Enemy0.en0TouchRight || 
//                                Enemy1.en1TouchRight || 
//                                Enemy2.en2TouchRight || 
//                                Enemy3.en3TouchRight || 
//                                Enemy4.en4TouchRight || 
//                                Enemy5.en5TouchRight || 
//                                Enemy6.en6TouchRight || 
//                                Enemy7.en7TouchRight || 
//                                Enemy8.en8TouchRight || 
//                                Enemy9.en9TouchRight ||
//                                Enemy.enTouchRight) {
//
//                            for (int j = 0; j < Enemi0.size(); j++) {
//                                if (Enemi0.get(j).en0Direction == 0) {
//                                    Enemi0.get(j).en0Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    moveDown(Enemi0.get(j));
//                                } else {
//                                    Enemi0.get(j).en0Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    moveDown(Enemi0.get(j));
//                                }
//                            }
//                            moveAll();
//                            break;
//                        }
//
//                    } else if(Enemi0.get(i).x > leftSide && Enemi0.get(i).en0Direction == 1) {
//
//                        moveLeft(Enemi0.get(i));
//
//                        if(Enemi0.get(i).x == leftSide + 5){
//                            Enemy0.en0TouchLeft = true;
//                            Enemy1.en1TouchLeft = true;
//                            Enemy2.en2TouchLeft = true;
//                            Enemy3.en3TouchLeft = true;
//                            Enemy4.en4TouchLeft = true;
//                            Enemy5.en5TouchLeft = true;
//                            Enemy6.en6TouchLeft = true;
//                            Enemy7.en7TouchLeft = true;
//                            Enemy8.en8TouchLeft = true;
//                            Enemy9.en9TouchLeft = true;
//                            Enemy.enTouchLeft = true;
//                        }

//                        if(Enemy0.en0TouchLeft || 
//                                Enemy1.en1TouchLeft || 
//                                Enemy2.en2TouchLeft || 
//                                Enemy3.en3TouchLeft ||
//                                Enemy4.en4TouchLeft || 
//                                Enemy5.en5TouchLeft || 
//                                Enemy6.en6TouchLeft || 
//                                Enemy7.en7TouchLeft || 
//                                Enemy8.en8TouchLeft || 
//                                Enemy9.en9TouchLeft ||
//                                Enemy.enTouchLeft) {
//                            for (int j = 0; j < Enemi0.size(); j++) {
//                                if (Enemi0.get(j).en0Direction == 0) {
//                                    Enemi0.get(j).en0Direction = 1;
//                                    allDirection = 1;
//                                    
//                                    moveDown(Enemi0.get(j));
//                                } else {
//                                    Enemi0.get(j).en0Direction = 0;
//                                    allDirection = 0;
//                                    
//                                    moveDown(Enemi0.get(j));
//                                 }
//                            }
//                            moveAll();
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        
        
        
        Enemy.enTouchRight = false;
//        Enemy0.en0TouchRight = false;
//        Enemy1.en1TouchRight = false;
//        Enemy2.en2TouchRight = false;
//        Enemy3.en3TouchRight = false;
//        Enemy4.en4TouchRight = false;
//        Enemy5.en5TouchRight = false;
//        Enemy6.en6TouchRight = false;
//        Enemy7.en7TouchRight = false;
//        Enemy8.en8TouchRight = false;
//        Enemy9.en9TouchRight = false;
        
        Enemy.enTouchLeft = false;
//        Enemy0.en0TouchLeft = false;
//        Enemy1.en1TouchLeft = false;
//        Enemy2.en2TouchLeft = false;
//        Enemy3.en3TouchLeft = false;
//        Enemy4.en4TouchLeft = false;
//        Enemy5.en5TouchLeft = false;
//        Enemy6.en6TouchLeft = false;
//        Enemy7.en7TouchLeft = false;
//        Enemy8.en8TouchLeft = false;
//        Enemy9.en9TouchLeft = false;
        
        
        //play sound
        if(Game.getGameSound()){
            //Sound.EnMove.play();
        }

    }
    
    
    /**
    * clearAll()
    * 
    */
    public static void clearAll() {
        EnemiAll.clear();
    }

    
    /**
    * EnFire(Enemy en)
    * 
    * Fires a bullet, creating a new Enbullet object with Enemy n objects
    * x and y coordinates as a starting point via
    * EnBullet.FireE1() message. Enemy n is determined via instance type.
    *
    * @param en - the en reference of an Enemy object
    */
    public static void EnFire(Enemy en){
        if(!Game.paused) {
//            if(en instanceof Enemy0){
//                Enemy0.E0Fire((Enemy0) en);
//            } else if(en instanceof Enemy1){
//                Enemy1.E1Fire((Enemy1) en);
//            } else if(en instanceof Enemy2){
//                Enemy2.E2Fire((Enemy2) en);
//            } else if(en instanceof Enemy3){
//                Enemy3.E3Fire((Enemy3) en);
//            } else if(en instanceof Enemy4){
//                Enemy4.E4Fire((Enemy4) en);
//            } else if(en instanceof Enemy5){
//                Enemy5.E5Fire((Enemy5) en);
//            } else if(en instanceof Enemy6){
//                Enemy6.E6Fire((Enemy6) en);
//            } else if(en instanceof Enemy7){
//                Enemy7.E7Fire((Enemy7) en);
//            } else if(en instanceof Enemy8){
//                Enemy8.E8Fire((Enemy8) en);
//            } else if(en instanceof Enemy9){
//                Enemy9.E9Fire((Enemy9) en);
//            } else 
            if(en instanceof UFO){
                UFO.UFOFire((UFO) en);
            }
        }
    }
    
    
    /**
    * moveRight(Enemy en)
    * 
    * Moves the Enemy object referenced by Enemy n to the right by increasing its x
    * value by EnSpeed
    *
    * @param en - the reference of an Enemy object
    */
    public static void moveRight(Enemy en) {
        if(!Game.paused && !enTouchRight) {
//            if(en instanceof Enemy0){
//                Enemy0.moveRight((Enemy0) en);
//            } else if(en instanceof Enemy1){
//                Enemy1.moveRight((Enemy1) en);
//            } else if(en instanceof Enemy2){
//                Enemy2.moveRight((Enemy2) en);
//            } else if(en instanceof Enemy3){
//                Enemy3.moveRight((Enemy3) en);
//            } else if(en instanceof Enemy4){
//                Enemy4.moveRight((Enemy4) en);
//            } else if(en instanceof Enemy5){
//                Enemy5.moveRight((Enemy5) en);
//            } else if(en instanceof Enemy6){
//                Enemy6.moveRight((Enemy6) en);
//            } else if(en instanceof Enemy7){
//                Enemy7.moveRight((Enemy7) en);
//            } else if(en instanceof Enemy8){
//                Enemy8.moveRight((Enemy8) en);
//            } else if(en instanceof Enemy9){
//                Enemy9.moveRight((Enemy9) en);
//            }
        }
    }

    
    /**
    * moveDown(Enemy en)
    * 
    * Moves the Enemy object referenced by Enemy n to the down by increasing its x
    * value by EnSpeed
    *
    * @param en - the reference of an Enemy object
    */
    public static void moveDown(Enemy en) {
        if(!Game.paused) {
//            if(en instanceof Enemy0){
//                Enemy0.moveDown((Enemy0) en);
//            } else if(en instanceof Enemy1){
//                Enemy1.moveDown((Enemy1) en);
//            } else if(en instanceof Enemy2){
//                Enemy2.moveDown((Enemy2) en);
//            } else if(en instanceof Enemy3){
//                Enemy3.moveDown((Enemy3) en);
//            } else if(en instanceof Enemy4){
//                Enemy4.moveDown((Enemy4) en);
//            } else if(en instanceof Enemy5){
//                Enemy5.moveDown((Enemy5) en);
//            } else if(en instanceof Enemy6){
//                Enemy6.moveDown((Enemy6) en);
//            } else if(en instanceof Enemy7){
//                Enemy7.moveDown((Enemy7) en);
//            } else if(en instanceof Enemy8){
//                Enemy8.moveDown((Enemy8) en);
//            } else if(en instanceof Enemy9){
//                Enemy9.moveDown((Enemy9) en);
//            }
            
        }
    }

    
    /**
    * moveLeft(Enemy en)
    * 
    * Moves the Enemy object referenced by Enemy n to the left by decreasing its x
    * value by EnSpeed
    *
    * @param en - the reference of an Enemy object
    */
    public static void moveLeft(Enemy en) {
        if(!Game.paused && !enTouchLeft) {
//            if(en instanceof Enemy0){
//                Enemy0.moveLeft((Enemy0) en);
//            } else if(en instanceof Enemy1){
//                Enemy1.moveLeft((Enemy1) en);
//            } else if(en instanceof Enemy2){
//                Enemy2.moveLeft((Enemy2) en);
//            } else if(en instanceof Enemy3){
//                Enemy3.moveLeft((Enemy3) en);
//            } else if(en instanceof Enemy4){
//                Enemy4.moveLeft((Enemy4) en);
//            } else if(en instanceof Enemy5){
//                Enemy5.moveLeft((Enemy5) en);
//            } else if(en instanceof Enemy6){
//                Enemy6.moveLeft((Enemy6) en);
//            } else if(en instanceof Enemy7){
//                Enemy7.moveLeft((Enemy7) en);
//            } else if(en instanceof Enemy8){
//                Enemy8.moveLeft((Enemy8) en);
//            } else if(en instanceof Enemy9){
//                Enemy9.moveLeft((Enemy9) en);
//            }
            
        }
    }
    
    
    /**
    * getAllEnemies()
    * 
    * Returns the List of the Enemy objects referenced by EnemiAll
    *
    * @return EnemiAll
    */
    public static synchronized List<Enemy> getAllEnemies() {
        EnemiAll.clear();
                
        EnemiAll.addAll(EnemiUFO);
//        EnemiAll.addAll(Enemi1);
//        EnemiAll.addAll(Enemi2);
//        EnemiAll.addAll(Enemi3);
//        EnemiAll.addAll(Enemi4);
//        EnemiAll.addAll(Enemi5);
//        EnemiAll.addAll(Enemi6);
//        EnemiAll.addAll(Enemi7);
//        EnemiAll.addAll(Enemi8);
//        EnemiAll.addAll(Enemi9);
    
        return EnemiAll;
    }
    
    
    /**
    * EnemyHit(Enemy en)
    * 
    * Fires an Enemy Explosion, creating a new EnExplode object with Enemy n
    * objects x and y coordinates as a reference point via
    * EnExplode.EnXDetonate() message
    *
    * @param en - the en reference of an Enemy object
    */
    public static void EnemyHit(Enemy en) {
        if(!Game.paused) {
//            if(en instanceof Enemy0){
//                Enemy0.E0Hit((Enemy0) en);
//            } else if(en instanceof Enemy1){
//                Enemy1.E1Hit((Enemy1) en);
//            } else if(en instanceof Enemy2){
//                Enemy2.E2Hit((Enemy2) en);
//            } else if(en instanceof Enemy3){
//                Enemy3.E3Hit((Enemy3) en);
//            } else if(en instanceof Enemy4){
//                Enemy4.E4Hit((Enemy4) en);
//            } else if(en instanceof Enemy5){
//                Enemy5.E5Hit((Enemy5) en);
//            } else if(en instanceof Enemy6){
//                Enemy6.E6Hit((Enemy6) en);
//            } else if(en instanceof Enemy7){
//                Enemy7.E7Hit((Enemy7) en);
//            } else if(en instanceof Enemy8){
//                Enemy8.E8Hit((Enemy8) en);
//            } else if(en instanceof Enemy9){
//                Enemy9.E9Hit((Enemy9) en);
//            } else 
            if(en instanceof UFO){
                UFO.UFOHit((UFO) en);
            }
            enimizHit++;
//            Player.killShot += 1;
        }
    }
    
    
}
