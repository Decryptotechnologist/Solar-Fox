package com.LOGamez.bullets;

import com.LOGamez.enemiez.*;
import com.LOGamez.graphics.Texture;
import com.LOGamez.solarfox.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 * EnBullet objects represent the Enemy bullets in the game
 * represented by a small white strange shape bullets
 * that rain from the sky fired by all 4 sets of Alien invaders. 
 * 
 * @author(s) Ghomez
 */
public class EnBullet extends Bullet {

    /**Attributes*/                                      
    
    /**enBullIMG BufferedImage of EnBullet*/
    private static final BufferedImage enBullIMG = new Texture("/Sprites/B1_Red").getImage();
    
    /**img BufferedImage of EnBullet*/
    private final BufferedImage img;
    
    /**en BufferedImage of EnBullet*/
    private final Enemy en;

    
    /**Constructor*/
    
        
    /**
    * EnBullet(int x, int y, int h, int w, boolean isDead)
    * 
    * Initialises a new EnBullet object with a this.x set to x,
    * this.y set to y, this.isDead set to isDead, 
    * this.height set to h, this.width set to w, this.visible 
    * set to vis
    * 
    * @param x the x coordinate of EnBullet
    * @param y the y coordinate of EnBullet
    * @param h the height of EnBullet
    * @param w the width of EnBullet
    * @param isDead the isDead boolean of EnBullet
    * @param e
    */
    public EnBullet(int x, int y, int h, int w, boolean isDead, Enemy e){
	this.x = x;
	this.y = y;
	this.width = w;
	this.height = h;
	this.isDead = isDead;
        this.img = enBullIMG;
        this.en = e;
    }

    
    /**
     * setUp()
     * 
     * Setup Enemy Bullet Objects
     */
    public static void setUp(){
        int width = SolarFox.getMainWidth();
        switch(width){
            case 300:
                enBulletScale = 0.1;
                enBulletXoffs = -2;
                enBulletYoffs = 0;
            
                break;
                
            case 480:
                enBulletScale = 0.4;
                enBulletXoffs = 0;
                enBulletYoffs = 0;
            
                break;
                
            case 604:
                enBulletScale = 0.3;
                enBulletXoffs = 3;
                enBulletYoffs = 15;
                
                break;
                
            default:
                enBulletScale = 0.3;
                enBulletXoffs = 3;
                enBulletYoffs = 15;
                
                break;
                
        }
            
    }
    
    
    /**
    * FireEn(Enemy en)
    * 
    * Fires a bullet, creating a new Enbullet 
    * object with Enemy objects (referenced 
    * by id) x and y coordinates as a starting 
    * point
    * 
    * @param en a reference to an Enemy object
    */
    public static void FireEn(Enemy en){
        if(en.y == 60){
            //Create New EnBullet
            EnBullet eb = new EnBullet((int) en.x + 3, (int) en.y + 15, w, h, false, en);
            
            //Add EnBullet to EnBull List
            EnBull.add(eb);
        } else {
            //Create New EnBullet
            EnBullet eb = new EnBullet((int) en.x + 3, (int) en.y - 15, w, h, false, en);
            
            //Add EnBullet to EnBull List
            EnBull.add(eb);
        }
    }
    
    
    /**
    * move(EnBullet eB)
    * 
    * Moves each of the EnBullet objects (depending how
    * many EnBullet objects remain in EnBulletz List) 
    * after checking that the EnBullet object isDead 
    * value is false and visible value is true.
    * 
    * @param eB - the eB reference of an EnBullet object (within EnBulletz List)
    */
    public static void move(EnBullet eB){
        if(eB.isDead == false){
            if(eB.en.y == 60){
                eB.y += bulletSpeed/3;
            } else {
                eB.y -= bulletSpeed/3;
            }
        }
    }

    
    /**
    * EnBHit(EnBullet eB)
    * 
    * EnBullet objects (referenced by id) 
    * isDead value is changed to false 
    * and true respectively. 
    * 
    * @param eB the eB reference of an EnBullet object (within EnBulletz List)
    */
    public static void EnBHit(EnBullet eB){
	eB.isDead = true;
    }

    
    /**
    * tick()
    * 
    * Updates EnBullet Objects
    */
    public static void tick(){
        //Update All Enemy Bullets 
        EnBull = EnBullet.getAll();
    }
    
    
    /**
     * render(Graphics2D g2d)
     * 
     * Renders/Repaints Enemy Bullet Objects
     * 
     * @param g2d
     */
    public static void render(Graphics2D g2d){
        if (null == Game.aGame.menu){
            //Draw EnBullets
            for(EnBullet enB : EnBull) {
                if(enB.isDead == false){
                    if(Game.showBounds){
                        //Draw Bounds
                        g2d.setColor(Color.red);
                        g2d.drawRect(enB.x+4, enB.y, enB.width/3, enB.height);
                    }
                    //Render EnBullets
                    g2d.drawImage(enB.img, enB.x, enB.y, enB.width, enB.height, null);
                }
            }
        }
    }
    
    
    /**
    * getAll()
    * 
    * Returns the List of the EnBullet 
    * objects referenced by EnBulletz
    * 
    * @return EnBulletz
    */
    public static List<EnBullet> getAll() {
        //Return All Enemy Bullets
	return EnBull;
    }

    
    /**
    * clearAll()
    * 
    */
    public static void clearAll() {
        //Clear All Enemy Bullets
        EnBull.clear();
    }
    
    
    /**
     * getBounds()
     * 
     * 
     * @return new Rectangle(this.x, this.y, this.width, this.height)
     */
    public Rectangle getBounds(){
      return new Rectangle(this.x+4, this.y, this.width/3, this.height);
    }
    
}
