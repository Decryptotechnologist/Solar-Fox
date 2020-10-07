/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.player;

import com.LOGamez.graphics.Texture;
import com.LOGamez.solarfox.Game;
import com.LOGamez.solarfox.SolarFox;
import com.LOGamez.audio.Sound;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.vecmath.Vector2d;

/**
 *
 * @author Ghomez
 */
public class Player {

    /**Attributes*/
    
    /**x variable of Player*/ 
    int x;
    
    /**y variable of Player*/ 
    int y;
    
    /**dx variable of Player*/ 
    double dx;
    
    /**dy variable of Player*/ 
    double dy;
    
    /**Pwidth variable of Player*/ 
    int Pwidth;
    
    /**Pheight variable of Player*/ 
    int Pheight;
    
    /**lives variable of Player*/ 
    public static int lives;
    
    /**startLives variable of Player*/
    int startLives;
    
    /**LALCount variable of Player*/
    int LALCount;
    
    /**P1Rect variable of Player*/
    public static Rectangle P1Rect;
    
    /**LEFTSIDE variable of Player*/
    public static Rectangle LEFTSIDE;
    
    /**CENTRESIDE variable of Player*/
    public static Rectangle CENTRESIDE;
    
    /**RIGHTSIDE variable of Player*/
    public static Rectangle RIGHTSIDE;
    
    /**moveSpeed variable of Player*/
    public static int moveSpeed;
    
    /**pLives0X variable of Player*/
    public static int pLives0X = 560;
    
    /**pLives1X variable of Player*/
    public static int pLives1X = 600;
    
    /**pLives2X variable of Player*/
    public static int pLives2X = 640;
    
    /**pLivesScale variable of Player*/
    public static int pLivesScale = 30;
    
    /**pLivesY variable of Player*/
    public static int pLivesY = SolarFox.getMainHeight() - 62;
    
    /**isFiring variable of Player*/
    boolean isFiring;
    
    /**isDead variable of Player*/
    boolean isDead;
    
    /**mouseLeft variable of Player*/
    public static boolean mouseLeft, mouseRight, mouseFire;
    
    /**playerImg variable of Player*/
    BufferedImage playerImg;
    
    /**pLivesImg variable of Player*/
    public static BufferedImage pLivesImg;
    
    /**imgP1 variable of Player*/
    BufferedImage imgP1;
    
    /**imgPLives variable of Player*/
    public static BufferedImage imgPLives;
    
    /**playerName variable of Player*/
    String playerName;
    
    /**playerImg0 variable of Player*/
    BufferedImage playerImg0;
    
    /**playerImg1 variable of Player*/
    BufferedImage playerImg1;
    
    /**playerImg2 variable of Player*/
    BufferedImage playerImg2;
    
    /**currentVec variable of Player*/
    public static Vector2d currentVec;
    
    /**suit variable of Player*/
    public static int suit;
    
    /**power variable of Player*/
    public static int power;

    /**levelNo variable of Player*/
    public static String levelNo;
    
    /**livesNo variable of Player*/
    public static String livesNo;
    
    /**playScore variable of Player*/
    private String playScore;

    
    /**Links*/
    
    
    
    
    
    /**Constructor*/
    
    
    /**
     * Player Constructor
     * 
     * 
     * @param x
     * @param y
     * @param w
     * @param h
     * @param name
     * @param Lives
     */
    public Player(int x, int y, int w, int h, String name, int Lives) {
        System.out.println("Player: New Player Created");
        this.x = x;
        this.y = y;
        this.currentVec = new Vector2d(this.x, this.y);
        this.Pwidth = w;
        this.Pheight = h;
        playerName = name;
        lives = Lives;
        this.startLives = lives;
        this.LALCount = 0;
        this.P1Rect = new Rectangle(x, y, w, h);
        this.suit = 0;
        
        LEFTSIDE = new Rectangle(x, y, w/2, h);
        CENTRESIDE = new Rectangle(x + w/4, y, w/2, h);
        RIGHTSIDE = new Rectangle(x + w/2, y, w/2, h);
        
        moveSpeed = 5;
        isFiring = false;
        
        pLivesImg = new Texture("/sprites/P1_Upa").getImage();
        playerImg = new Texture("/sprites/P1_Upa").getImage();
        playerImg0 = new Texture("/sprites/P1_Downa").getImage();
        playerImg1 = new Texture("/sprites/P1_Lefta").getImage();
        playerImg2 = new Texture("/sprites/P1_Righta").getImage();
        
        imgP1 = playerImg;
    }
    
    
    
    /**Public Protocol*/
    
    
    /**
     * increasePlayerLives(int liv)
     * 
     * 
     * @param liv
     */
    public void increasePlayerLives(int liv) {
        lives += liv;
    }
    
    
    /**
     * render(Game game, Graphics2D g2d)
     * 
     *
     * @param g2d
     */
    public void render(Graphics2D g2d){
        Graphics2D g2d_Player = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        //Draw Game Title
        g2d_Player.setColor(Color.GREEN);
        g2d_Player.drawString(Game.TITLE, Game.gameWidth/2 - Game.TITLE.length() * 3, 12);
        ///////////////////////////////////////////////////////////////////////////////////

        //Draw Player Name
        g2d_Player.setColor(Color.GRAY);
        g2d_Player.drawString("Player Name: ", Game.gameWidth/2 - Game.getPName().length() * 8, 22);
        g2d_Player.setColor(Color.GRAY);
        g2d_Player.drawString(Game.getPName(), Game.gameWidth/2 + Game.getPName().length() * 2, 22);
        ///////////////////////////////////////////////////////////////////////////////////
        
        //Draw Player Lives
        if(lives == 3){            
            g2d_Player.drawImage(imgPLives, pLives2X, pLivesY, pLivesScale, pLivesScale, null);
            g2d_Player.drawImage(imgPLives, pLives1X, pLivesY, pLivesScale, pLivesScale, null);
            g2d_Player.drawImage(imgPLives, pLives0X, pLivesY, pLivesScale, pLivesScale, null);
        }
        
        if(lives == 2){
            g2d_Player.drawImage(imgPLives, pLives1X, pLivesY, pLivesScale, pLivesScale, null);
            g2d_Player.drawImage(imgPLives, pLives0X, pLivesY, pLivesScale, pLivesScale, null);
        }
        
        if(lives == 1){
            g2d_Player.drawImage(imgPLives, pLives0X, pLivesY, pLivesScale, pLivesScale, null);
        }
        ///////////////////////////////////////////////////////////////////////////////////
        
        //Draw Hi-Score
        Font currentFont = new Font("default", Font.BOLD, 38);
        g2d_Player.setFont(currentFont);
        g2d_Player.setColor(Color.YELLOW);
        ///////////////////////////////////////////////////////////////////////////////////
        
        //Draw Current Score
        String currentScore;
        if(Game.gameScore == 0){ 
            currentScore = "000000";
        } else if(Game.gameScore > 0 && Game.gameScore < 1000){
            currentScore = "000"+Game.gameScore;
        } else if(Game.gameScore > 1000 && Game.gameScore < 10000){ 
            currentScore = "00"+Game.gameScore;
        } else if(Game.gameScore > 10000 && Game.gameScore < 100000){
            currentScore = "0"+Game.gameScore;
        } else if(Game.gameScore > 100000 && Game.gameScore < 1000000){ 
            currentScore = "0"+Game.gameScore;
        } else {
            currentScore = ""+Game.gameScore;
        }
        
        g2d_Player.drawString(currentScore, 306, 70);
        currentFont = new Font("default", Font.PLAIN, 10);
        g2d_Player.setFont(currentFont);
        ///////////////////////////////////////////////////////////////////////////////////
        
        
        if(this.isDead == false){
            //Draw Player
            g2d_Player.drawImage(imgP1, x, y, imgP1.getWidth(), imgP1.getHeight(), null);//Pwidth, Pheight, null);
            ///////////////////////////////////////////////////////////////////////////////////
            
            //Draw Bounding Box
//            g2d_Player.setColor(Color.red);
//            g2d_Player.drawRect(this.getBounds().x, this.getBounds().y, this.getBounds().width, this.getBounds().height);
            ///////////////////////////////////////////////////////////////////////////////////
            
            //Draw Bounds
            if(Game.showBounds){
                g2d_Player.setColor(Color.red);
                g2d_Player.drawRect(P1Rect.x, P1Rect.y, P1Rect.width, P1Rect.height);
                
                g2d_Player.setColor(Color.DARK_GRAY);
                g2d_Player.drawRect(RIGHTSIDE.x, RIGHTSIDE.y, RIGHTSIDE.width, RIGHTSIDE.height);
                
                g2d_Player.setColor(Color.BLUE);
                g2d_Player.drawRect(LEFTSIDE.x, LEFTSIDE.y, LEFTSIDE.width, LEFTSIDE.height);
                
                g2d_Player.setColor(Color.black);
                g2d_Player.drawRect(CENTRESIDE.x, CENTRESIDE.y, CENTRESIDE.width, CENTRESIDE.height);
                
                g2d_Player.setColor(Color.green);
                g2d_Player.drawOval(P1Rect.x+1, P1Rect.y+1, P1Rect.width-2, P1Rect.height-2);
                
                g2d_Player.setColor(Color.orange);
                g2d_Player.drawLine(x + Pwidth/2, y, x + Pwidth/2, y+14);
                g2d_Player.drawLine(x, y + Pheight/2, x + 64, y + Pheight/2);
            }
            ///////////////////////////////////////////////////////////////////////////////////
            
        }
        
        g2d.setTransform(oldXForm);
        g2d_Player.setTransform(oldXForm);
    
    }
    
    
    /**
     * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
     * 
     * 
     * @param game
     * @param up
     * @param down
     * @param left
     * @param right
     * @param fire
     */
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire){//, boolean rotLeft, boolean rotRight){
        
        //Load Player Lives Image
        imgPLives = pLivesImg;        
        
        if(left){
            imgP1 = playerImg1;
            if(x > 4){
                dx -= moveSpeed;
                P1Rect.x -= moveSpeed;
                LEFTSIDE.x -= moveSpeed;
                RIGHTSIDE.x -= moveSpeed;
                CENTRESIDE.x -= moveSpeed;
                //pAngle = 180.0;
            }
        } else 
        
        if(right){
            imgP1 = playerImg2;
            if(x < game.getWidth() - 68){//width - 68
                dx += moveSpeed;
                P1Rect.x += moveSpeed;
                RIGHTSIDE.x += moveSpeed;
                CENTRESIDE.x += moveSpeed;
                LEFTSIDE.x += moveSpeed;
                //pAngle = 0.0;
            }
        } else
            
        if(down){
            imgP1 = playerImg0;
            if(y < game.getHeight() - 110){//height - 110
                dy += moveSpeed;
                P1Rect.y += moveSpeed;
                //pAngle = 0.0;
            }
        } else 
        
        if(up){
            imgP1 = playerImg;
            if(y > 40){
                dy -= moveSpeed;
                P1Rect.y -= moveSpeed;
                //pAngle = 0.0;
            }
        }
        
        if(fire){
            if(game.menu == null){
                if(isFiring == false){
                    //ball.fire();
                    isFiring = true;
                    //shotsFired++;
                }
            }
        }
        
        if(mouseFire){
            if(game.menu == null){
                if(isFiring == false){
                    //ball.fire();
                    isFiring = true;
                    fire = false;
                }
            }
        }
        
        if(Player.lives == 0){
            isDead = true;
            dead();
	}
        Player.lives = Player.getLives();
        x += dx;
        y += dy;
        this.currentVec.x += dx;
        this.currentVec.y += dy;
        
        dx = 0;
        dy = 0;
        
    }
    
    
    /**
    * P1Hit()
    * 
    * 
    */
    public void P1Hit(){
        loseALife();
        if(LALCount < startLives){
            LALCount += 1;
        } else {
            LALCount = 0;
        }
    }
    
    
    /**
    * loseALife()
    * 
    * 
    */
    public void loseALife(){
        if(LALCount < 1){
            if(lives >= 1){
                lives--;
                //P1Explode.P1Detonate(this);
                
                if(Game.getGameSound()){
                    Sound.P1Exp.play();
                }
            }
        }
    }
    
    
    /**
    * dead()
    * 
    * 
    */
    public void dead(){
        System.out.println("Player: GAME OVER!!!");
        isDead = true;
        Game.loseGame();
    }
    
    
    /**
    * getLives()
    * 
    * 
    * @return lives
    */
    public static int getLives() {
        return lives;
    }
    
    
    /**
    * setPlayerName(String name)
    * 
    * 
    * @param name
    */
    public void setPlayerName(String name) {
        this.playerName = name;
    }
    
    
    
    /**
    * setPOW(int pow)
    * 
    * 
    * @param pow
    */
    public static void setPOW(int pow) {
        if(power < 4){
            power = pow;
        } else {
            power = 0;
            if(getLives() < 3){
                Game.increaseGameLives(1);
            }
        }
        suit = power;
        if(suit == 3){
            moveSpeed = 26;
        } else {
            moveSpeed = 17;
        }
    }
    
    
    /**
    * getPOW()
    * 
    * 
    * @return power
    */
    public static int getPOW() {
        return power;
    }

    
    /**
    * extraLife()
    * 
    * Checks if LALCount is less than 1 then 
    * checks if live is greater than or equal 
    * to 1. As the checks pass lives is 
    * decremented by 1 and a P1Explode is 
    * fired via the P1Explode.P1Detonate(this) 
    * message.
    * 
    */
    public void extraLife(){
	lives++;
	
        setPOW(getPOW());
    }

    
    /**
    * getPlayScore()
    * 
    * 
    * @return playScore
    */
    public String getPlayScore() {
        return playScore;
    }

    
    /**
    * setLives(int liv)
    * 
    * 
    * @param liv
    */
    public void setLives(int liv) {
        lives = liv;
    }

    
    /**
     * getBounds()
     * 
     * 
     * @return n1
     */
    public Rectangle getBounds() {
        Rectangle n1 = new Rectangle(P1Rect.x + P1Rect.width/8, P1Rect.y + P1Rect.height/2, P1Rect.width/4, P1Rect.height/2);
        return n1;
    }

}
