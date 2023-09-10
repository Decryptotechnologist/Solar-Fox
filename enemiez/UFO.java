package com.LOGamez.enemiez;

import com.LOGamez.bullets.EnBullet;
import com.LOGamez.graphics.Texture;
import java.awt.*;
import java.util.List;
import com.LOGamez.SolarFox2023.*;
import java.awt.image.BufferedImage;

/**
 * UFO objects represent one UFO object 
 (above the first top-most row of enemies), 
 there are 1 of them at any one time randomly 
 through-out the game each with their own 
 collision Rectangle
 * 
 * @author(s) Ghomez
 */
public class UFO extends Enemy {
    
	
    /**Attributes*/
    
    /**enemyImg0 variable of UFO*/
    private static BufferedImage enemyImg0;
    
    /**enemyImg1 variable of UFO*/
    private static BufferedImage enemyImg1;
    
    /**img variable of UFO*/
    private final BufferedImage img;
    

    
    /**Constructor*/
        
    /**
    * UFO(int x, int y, boolean isDead, int DIR, int ID)
    * 
    * Initialises a new UFO object with a this.x set to x,
    * this.y set to y, this.isDead set to isDead, 
    * this.height set to h, this.width set to w
    * 
    * @param x - the x coordinate of UFO
    * @param y - the y coordinate of UFO
    * @param isDead - the isDead boolean of UFO
    * @param DIR - the direction of travel(Integer) of UFO
    * @param ID - the id reference of an UFO object
    * @param img
    */
    public UFO(int x, int y, boolean isDead, int DIR, int ID, BufferedImage img) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h/2;
        this.isDead = isDead;
        this.ufoDirection = DIR;
        this.id = ID;
        this.img = img;
    }

    
    /**Public Protocol*/
        
    
    /**
    * initUFO()
    * 
    * Initialises a single UFO object
    * and its linked Rectangle object
    */
    public static void initUFO() {
        enemyImg0 = new Texture("/sprites/E1_Top").getImage();
        enemyImg1 = new Texture("/sprites/E1_Bottom").getImage();
        
        if(random.nextInt(Enemy.UFOfreq) == 0){
            UFO eufo_a = new UFO(40, 60, false, 0, 0, enemyImg0);
            EnemiUFO.add(eufo_a);
        } else {
            UFO eufo_b = new UFO(SolarFox2023.getMainWidth()/2-40, SolarFox2023.getMainHeight()-100, false, 1, 1, enemyImg1);
            EnemiUFO.add(eufo_b);
        }
    }
    
    
    /**
    * move(int id)
    * 
    * Moves a row of UFO objects
    * 
    * @param id - the id reference of an UFO object (within EnemiUFO List)
    */
    public void move(int id) {
       
        for (int i = id; i < EnemiUFO.size(); i++) {
            if (EnemiUFO.get(i).isDead == false) {
                if (EnemiUFO.get(i).x > leftSide - 5 && EnemiUFO.get(i).x < rightSide) {
                    if (EnemiUFO.get(i).x < rightSide && ufoDirection == 0) {

                        moveRight(EnemiUFO.get(i));

                        if (EnemiUFO.get(i).x == leftSide + 10 || EnemiUFO.get(i).x + 20 == rightSide) {
                            for (int j = 0; j < EnemiUFO.size(); j++) {
                                if (EnemiUFO.get(j).ufoDirection == 0) {
                                    EnemiUFO.get(j).ufoDirection = 1;
                                } else {
                                    EnemiUFO.get(j).ufoDirection = 0;
                                }
                            }
                        }

                    } else {

                        moveLeft(EnemiUFO.get(i));

                        if (EnemiUFO.get(i).x == leftSide + 10 || EnemiUFO.get(i).x + 12 == rightSide) {
                            for (int j = 0; j < EnemiUFO.size(); j++) {
                                if (EnemiUFO.get(j).ufoDirection == 0) {
                                    EnemiUFO.get(j).ufoDirection = 1;
                                } else {
                                    EnemiUFO.get(j).ufoDirection = 0;
                                }
                            }

                        }
                    }
                }
            }
        }
        
    }
    
    
    /**
    * moveRight(UFO eufo)
    * 
    * Moves the UFO object referenced by id 
    * to the right by increasing its x value by 
    * EnSpeed (and does the same for the x value 
    * of its linked Rectangle) after checking 
    * its Direction value is 0(right).
    * 
    * @param eufo - the eufo reference of an UFO object (within EnemiUFO List)
    */
    public void moveRight(UFO eufo) {
        eufo.x += EnSpeed * 5;
    }

    
    /**
    * moveLeft(UFO eufo)
    * 
    * Moves the UFO object referenced by id 
    * to the left by decreasing its x value by 
    * EnSpeed (and does the same for the x value 
    * of its linked Rectangle) after checking 
    * its Direction value is 1(left).
    * 
    * @param eufo - the eufo reference of an UFO object (within EnemiUFO List)
    */
    public static void moveLeft(UFO eufo) {
        eufo.x -= EnSpeed * 5;
    }

    
    /**
    * UFOFire(UFO eufo)
    * 
    * Fires a bullet, creating a new Enbullet 
    * object with UFO objects (referenced 
    * by id) x and y coordinates as a starting 
    * point via EnBullet.FireUFO() message
    * 
    * @param eufo - the eufo reference of an UFO object (within EnemiUFO List)
    */
    public static void UFOFire(UFO eufo) {
        EnBullet.FireEn(eufo);
    }

    
    /**
    * UFOHit(UFO eufo)
    * 
    * Fires an Enemy Explosion, creating a new EnExplode object with UFO
    * objects (referenced by id) x and y coordinates as a reference point via
    * EnExplode.EnXDetonate() message
    * 
    * Following this UFO objects (referenced by id) isDead
    * value is changed to true.
    *
    * @param eufo - the eufo reference of an UFO object (within EnemiUFO List)
    */
    public static void UFOHit(UFO eufo) {
        if(random.nextInt(25) == 0){
            
        }
        eufo.isDead = true;
    }

    
    /**
    * tick()
    * 
    * Updates UFO Objects
    */
    public static void tick(){
        EnemiUFO = UFO.getAll();
    }
    
    
    /**
     * render(Graphics2D g2d)
     * 
     * 
     * @param g2d
     */
    public static void render(Graphics2D g2d){
        if(null == Game.aGame.menu){
            
            for(UFO eufo : EnemiUFO) {
                if(eufo.isDead == false){
                    g2d.drawImage(eufo.img, eufo.x, eufo.y, eufo.width, eufo.height, null);
                    if(Game .showBounds){
                        g2d.setColor(Color.red);
                        g2d.drawRect(eufo.x, eufo.y, eufo.width, eufo.height-8);
                        g2d.drawString("Eufo:"+eufo.id, eufo.x, eufo.y-4);
                        
                        if(eufo.ufoDirection == 0){
                            g2d.drawString("DIR: Right", eufo.x-6, eufo.y+44);
                        } else if(eufo.ufoDirection == 1){
                            g2d.drawString("DIR: Left", eufo.x-6, eufo.y+44);
                        } else {
                            g2d.drawString("DIR: Down", eufo.x-6, eufo.y+44);
                        }
                    }
                }
            }
            
        }
    }
    

    
    /**
    * getAll1()
    * 
    * Returns the List of the UFO objects referenced by EnemiUFO
    *
    * @return EnemiUFO
    */
    public static List<UFO> getAll() {
        return EnemiUFO;
    }


    
    /**
    * clearAll()
    * 
    */
    public static void clearAll() {
        EnemiUFO.clear();
    }
    
    
    /**
     * getBounds()
     * 
     * @return new Rectangle(this.x, this.y, this.width, this.height)
     */
    @Override
    public Rectangle getBounds() {
      return new Rectangle(this.x, this.y, this.width, this.height);
    }
    
}
