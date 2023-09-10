/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.enemiez;

import com.LOGamez.level.Level;
import com.LOGamez.SolarFox2023.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Ghomez
 */
public class Enemy {

    /**Attributes*/
        
    /**x coordinate of Enemy*/
    public int x;
        
    /**y coordinate of Enemy*/
    public int y;
        
    /**width variable of Enemy*/
    public int width;
        
    /**height variable of Enemy*/
    public int height;
        
    /**height variable of Enemy*/
    public static int h;// = 40;
        
    /**width variable of Enemy*/
    public static int w;// = 40;
        
    /**isDead variable of Enemy*/
    public boolean isDead;
    
    /**Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public static int Direction = 0;
    
    /**allDirection variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public static int allDirection = 0;
    
    /**en0Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en0Direction = 0;
    
    /**en1Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en1Direction = 0;
    
    /**en2Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en2Direction = 0;
    
    /**en3Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en3Direction = 0;
    
    /**en4Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en4Direction = 0;
    
    /**en5Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en5Direction = 0;
    
    /**en6Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en6Direction = 0;
    
    /**en7Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en7Direction = 0;
    
    /**en8Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en8Direction = 0;
    
    /**en9Direction variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int en9Direction = 0;
    
    /**ufoDirection variable of Enemy*/ //0=Right, 1=Left, 2=Down
    public int ufoDirection = 0;

    /**xSpace0 variable of Enemy*/
    public static int xSpace0;// = 36;//0:24, 1:48, 2:52
    
    /**xSpace1 variable of Enemy*/
    public static int xSpace1;// = 25;//0:15, 1:25, 2:30
    
    /**yFall variable of Enemy*/
    public static int yFall;// = 25;//0:25, 1:35, 2:30
    
    /**e0_y variable of Enemy*/
    public static int e0_y;
    
    /**e1_y variable of Enemy*/
    public static int e1_y;
    
    /**e2_y variable of Enemy*/
    public static int e2_y;
    
    /**e3_y variable of Enemy*/
    public static int e3_y;
    
    /**e4_y variable of Enemy*/
    public static int e4_y;
    
    /**e5_y variable of Enemy*/
    public static int e5_y;
    
    /**e6_y variable of Enemy*/
    public static int e6_y;
    
    /**e7_y variable of Enemy*/
    public static int e7_y;
    
    /**e8_y variable of Enemy*/
    public static int e8_y;
    
    /**e9_y variable of Enemy*/
    public static int e9_y;
    
    /**e0_col variable of Enemy*/
    public static int e0_col;
    
    /**e1_col variable of Enemy*/
    public static int e1_col;
    
    /**e2_col variable of Enemy*/
    public static int e2_col;
    
    /**e3_col variable of Enemy*/
    public static int e3_col;
    
    /**e4_col variable of Enemy*/
    public static int e4_col;
    
    /**e5_col variable of Enemy*/
    public static int e5_col;
    
    /**e6_col variable of Enemy*/
    public static int e6_col;
    
    /**e7_col variable of Enemy*/
    public static int e7_col;
    
    /**e8_col variable of Enemy*/
    public static int e8_col;
    
    /**e9_col variable of Enemy*/
    public static int e9_col;
    
    /**e0Col variable of Enemy*/
    public int e0Col;
    
    /**e1Col variable of Enemy*/
    public int e1Col;
    
    /**e2Col variable of Enemy*/
    public int e2Col;
    
    /**e3Col variable of Enemy*/
    public int e3Col;
    
    /**e4Col variable of Enemy*/
    public int e4Col;
    
    /**e5Col variable of Enemy*/
    public int e5Col;
    
    /**e6Col variable of Enemy*/
    public int e6Col;
    
    /**e7Col variable of Enemy*/
    public int e7Col;
    
    /**e8Col variable of Enemy*/
    public int e8Col;
    
    /**e9Col variable of Enemy*/
    public int e9Col;
    
    
    /**eufo_y variable of Enemy*/
    public static int eufo_y;
    
    /**E0rows variable of Enemy*/ 
    public static int E0rows;
    
    /**E1rows variable of Enemy*/ 
    public static int E1rows;
    
    /**E2rows variable of Enemy*/ 
    public static int E2rows;
    
    /**E3rows variable of Enemy*/ 
    public static int E3rows;
    
    /**E4rows variable of Enemy*/ 
    public static int E4rows;
    
    /**E5rows variable of Enemy*/ 
    public static int E5rows;
    
    /**E6rows variable of Enemy*/ 
    public static int E6rows;
    
    /**E7rows variable of Enemy*/ 
    public static int E7rows;
    
    /**E8rows variable of Enemy*/ 
    public static int E8rows;
    
    /**E9rows variable of Enemy*/ 
    public static int E9rows;
    
    /**UFOfreq variable of Enemy*/ 
    public static int UFOfreq;
    
    /**leftSide variable of Enemy*/
    public static int leftSide;// = 25;//0:15 , 1:20, 2:25

    /**rightSide variable of Enemy*/
    public static int rightSide;// = Display.getGameWidth() - 25;//0:15 , 1:20, 2:25
    
    /**EnSpeed variable of Enemy*/
    public static double EnSpeed;// = 1.0;
    
    /**id variable of Enemy*/
    public int id;
    
    /**enTouchRight variable of Enemy*/
    private static boolean enTouchRight;
    
    /**enTouchLeft variable of Enemy*/
    private static boolean enTouchLeft;
    
    /**en0TouchLeft variable of Enemy*/
    public static boolean en0TouchLeft;
    
    /**en0TouchRight variable of Enemy*/
    public static boolean en0TouchRight;
    
    /**en1TouchRight variable of Enemy*/
    public static boolean en1TouchRight;
    
    /**en1TouchLeft variable of Enemy*/
    public static boolean en1TouchLeft;
    
    /**en2TouchRight variable of Enemy*/
    public static boolean en2TouchRight;
    
    /**en2TouchLeft variable of Enemy*/
    public static boolean en2TouchLeft;
    
    /**en3TouchRight variable of Enemy*/
    public static boolean en3TouchRight;
    
    /**en3TouchLeft variable of Enemy*/
    public static boolean en3TouchLeft;

    /**en4TouchRight variable of Enemy*/
    public static boolean en4TouchRight;
    
    /**en4TouchLeft variable of Enemy*/
    public static boolean en4TouchLeft;
    
    /**en5TouchRight variable of Enemy*/
    public static boolean en5TouchRight;
    
    /**en5TouchLeft variable of Enemy*/
    public static boolean en5TouchLeft;
    
    /**en6TouchRight variable of Enemy*/
    public static boolean en6TouchRight;
    
    /**en6TouchLeft variable of Enemy*/
    public static boolean en6TouchLeft;
    
    /**en7TouchRight variable of Enemy*/
    public static boolean en7TouchRight;
    
    /**en7TouchLeft variable of Enemy*/
    public static boolean en7TouchLeft;
    
    /**en8TouchRight variable of Enemy*/
    public static boolean en8TouchRight;
    
    /**en8TouchLeft variable of Enemy*/
    public static boolean en8TouchLeft;
    
    /**en9TouchRight variable of Enemy*/
    public static boolean en9TouchRight;
    
    /**en9TouchLeft variable of Enemy*/
    public static boolean en9TouchLeft;
    
    /**random variable of Enemy*/
    public static Random random = new Random();
    
    /**enScale variable of Enemy*/
    public static double enScale;
    
    /**EnemiAll variable of Enemy*/
    public static List<Enemy> EnemiAll = new ArrayList<>();
    
    /**EnemiUFO variable of Enemy*/
    public static List<UFO> EnemiUFO = new ArrayList<>();
    
    /**enimizHit variable of Enemy*/
    private static int enimizHit = 0;
    
   
    
    
    /**Constructor*/
    
    /**
    * Enemy Constructor
    * 
    * Initialises a new Enemy object
    */
    public Enemy() { 
        
        setUp();
    }
    
    
    /**Public Protocol*/
    
    
    /**
    * setUp()
    * 
    */
    public static void setUp(){
        int width = SolarFox2023.getMainWidth();
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
                rightSide = SolarFox2023.getMainWidth() - 18;//0:15 , 1:20, 2:25

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
                rightSide = SolarFox2023.getMainWidth() - 15;//0:15 , 1:20, 2:25

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
                rightSide = SolarFox2023.getMainWidth() - 25;//0:15 , 1:20, 2:25

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
                rightSide = SolarFox2023.getMainWidth() - 25;//0:15 , 1:20, 2:25

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
        if(!EnemiUFO.isEmpty()){
            UFO.clearAll();
        }
        allDirection = 0;
        EnemiAll = new ArrayList<>();
                
        EnemiAll.addAll(EnemiUFO);
        
        UFO.initUFO();
    }
    
    
    /**
     * render(Render target, Graphics2D g)
     * 
     * @param g2d
     */
    public static void render(Graphics2D g2d) {
        if(Game.pauseTime == 0){
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

                UFO.tick();

                EnemiAll = new ArrayList<>();

                EnemiAll.addAll(EnemiUFO);            

                if((System.currentTimeMillis() / 150) * 0.5 % 2 == 0) { 
                    moveAll();
                    EnemiAll = Enemy.getAllEnemies();
                }

                EnemiUFO.get(0).move(0);
                if ((System.currentTimeMillis() / 2000) * 1.0 % 5 == 0 && EnemiUFO.size() > 0) { 
                    UFO.clearAll();
                    UFO.initUFO();
                }
            }
        }
    }

    
    
    /**
    * checkCollisions()
    * 
    */
    public static synchronized void checkCollisions() {
        int count10 = 0;
        
        //Check collisions between En1-10&Barricade
        //Check collisions between BRCExplode&En1-10
        if(Game.getGame().menu == null){
            
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
        
        Enemy.enTouchRight = false;
        Enemy.enTouchLeft = false;
        
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
            if(en instanceof UFO){
                UFO.UFOHit((UFO) en);
            }
            enimizHit++;
        }
    }
    
    
}
