/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.bullets;

import com.LOGamez.SolarFox2023.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Ghomez
 */
public class Bullet {
    
    /**Attributes*/
    
    /**x variable of Bullet*/
    public int x;
        
    /**y variable of Bullet*/
    public int y;
        
    /**height variable of Bullet*/
    public int height;
        
    /**width variable of Bullet*/
    public int width;
        
    /**w variable of Bullet*/
    public static int w;

    /**h variable of Bullet*/
    public static int h;
    
    /**isDead variable of Bullet*/
    public boolean isDead;
    
    /**bulletSpeed variable of Bullet*/
    public static int bulletSpeed;

    /**enBulletScale variable of Bullet*/
    public static double enBulletScale;
    
    /**enBulletXoffs variable of Bullet*/
    public static int enBulletXoffs;
    
    /**enBulletYoffs variable of Bullet*/
    public static int enBulletYoffs;
    
    /**playerBulletScale variable of Bullet*/
    public static double playerBulletScale;
    
    /**playerBulletXoffs variable of Bullet*/
    public static int playerBulletXoffs;
    
    /**playerBulletYoffs variable of Bullet*/
    public static int playerBulletYoffs;
    
    /**EnBullCol variable of Bullet*/
    public static int EnBullCol;
    
    /**EnBull variable of Bullet*/
    public static List<EnBullet> EnBull = new ArrayList<>();
    
    
    
    /**Constructor*/
    
    
    /**
    * Bullet Constructor
    * 
    * 
    * Initialises a new Bullet object
    */
    public Bullet(){
        
        setUp();
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * setUp()
     * 
     * Setup Bullet Objects
     */
    public static void setUp(){
        EnBullet.setUp();
        
        int width = SolarFox2023.getMainWidth();
        switch(width){
            case 300:
                w = 10;
                h = 20;
            
                bulletSpeed = 9;
            
                break;
                
            case 480:
                w = 12;
                h = 25;
            
                bulletSpeed = 12;
            
                break;
                
            case 604:
                w = 15;
                h = 40;
            
                bulletSpeed = 17;
                break;
                
            default:
                w = 15;
                h = 42;
            
                bulletSpeed = 17;
                break;
        }
        
    }

    
    /**
    * tick()
    * 
    * 
    * Updates Bullet Objects
    */
    public static synchronized void tick(){
        //Check All Bullet Collisions
        checkCollisions();
        
        //Tick(Update) Enemy Bullets
        EnBullet.tick();
    }
    
    
    /**
    * move(Bullet b)
    * 
    * 
    * @param b - a Bullet instance
    */
    public static void move(Bullet b) {
        if(!Game.paused) {
            if(b instanceof EnBullet){
                //Move Enemy Bullet: b
                EnBullet.move((EnBullet) b);
            }
        }
    }
    
    
    /**
    * checkCollisions()
    * 
    */
    public static synchronized void checkCollisions() {
        
	//Check collisions between AllEnBulletRect&P1Rect
        for(int i = 0; i < EnBull.size(); i++){
            if(EnBull.get(i).isDead == false){
                move(EnBull.get(i));

                //Check collisions between EnBullet & Player1						
                if(EnBull.get(i).getBounds().intersects(Game.fox.P1Rect)){
                    if(!Game.paused){
                        //message Player1 hit
                        Game.fox.P1Hit();
                    }

                    //message EnBullet(id) hit
                    BulletHit(EnBull.get(i));								
                }
            }
        }
        
    }
    
    
    /**
    * BulletHit(Bullet b)
    * 
    * 
    * @param b - a Bullet instance
    */
    public static void BulletHit(Bullet b){
        if(b instanceof EnBullet){
            //Enemy Bullet Hit: b
            EnBullet.EnBHit((EnBullet) b);
        }
    }
    
    
    /**
    * setEnemyBulletCol(int col)
    * 
    * 
    * @param col - Color of Enemy Bullet
    */
    public static void setEnemyBulletCol(int col) {
        //Set Enemy Bullet Color: col
        EnBullCol = col;
    }
    
}
