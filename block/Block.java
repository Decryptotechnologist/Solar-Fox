/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.block;

import com.LOGamez.SolarFox2023.SolarFox2023;
import com.LOGamez.SolarFox2023.Game;
import com.LOGamez.audio.Sound;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.vecmath.Vector2d;

/**
 *
 * @author Ghomez
 */
public class Block {


    /**Attributes*/

    /**x variable of Block*/
    public int x;
    
    /**y variable of Block*/
    public int y;
    
    /**currentVec variable of Block*/
    private Vector2d currentVec;
    
    /**Blwidth variable of Block*/
    private int Blwidth;
    
    /**Blheight variable of Block*/
    private int Blheight;
    
    /**type variable of Block*/
    private int type;
    
    /**B1Rect variable of Block*/
    private Rectangle B1Rect;
    
    /**blockList variable of Block*/
    public static List<Block> blockList = new ArrayList<>();
    
    /**blockListA variable of Block*/
    private static List<Block> blockListA;
    
    /**random variable of Block*/
    public static Random random = new Random();
    
    /**id variable of Block*/
    private int id;
    
    /**col variable of Block*/
    private Color col = Color.MAGENTA;
    
    /**isDestroyed variable of Block*/
    private boolean isDestroyed;
    
    /**isDamaged variable of Block*/
    private boolean isDamaged;
    
    /**aBlockImg1 variable of Block*/
    private static BufferedImage aBlockImg1;
    
    /**aBlockImg2 variable of Block*/
    private static BufferedImage aBlockImg2;
    
    /**aBlockImg3 variable of Block*/
    private static BufferedImage aBlockImg3;
    
    /**aBlockImg4 variable of Block*/
    private static BufferedImage aBlockImg4;
    
    /**aBlockImg5 variable of Block*/
    private static BufferedImage aBlockImg5;
    
    /**aBlockImg6 variable of Block*/
    private static BufferedImage aBlockImg6;
    
    /**aBlockImg7 variable of Block*/
    private static BufferedImage aBlockImg7;
    
    /**aBlockImg8 variable of Block*/
    private static BufferedImage aBlockImg8;

    /**blockStrength variable of Block*/
    private static int blockStrength;
    
    /**invaderStrength variable of Block*/
    private static int invaderStrength;
    
    /**oldblockStrength variable of Block*/
    private static int oldblockStrength;
    
    /**oldInvaderStrength variable of Block*/
    private static int oldInvaderStrength;
    
    /**blockStrengthD variable of Block*/
    private static double blockStrengthD;
    
    /**ballBounds variable of Block*/
    private static Rectangle ballBounds;
    
    /**xOffs variable of Block*/
    private static int xOffs;
    
    /**yOffs variable of Block*/
    private static int yOffs;
    
    /**col1 variable of Block*/
    private static Color col1 = Color.YELLOW;
    
    /**col2 variable of Block*/
    private static Color col2 = Color.GRAY;
    
    
    
    /**Links*/
    
    
    
    
    /**Constructor*/
    
    
    /**
     * Block Constructor
     * 
     * 
     * @param xO
     * @param yO
     */
    public Block(int xO, int yO) {       
        //this.type = type;
        xOffs = xO;
        yOffs = yO;
    }
    
    
    /**
     * Block Constructor
     * 
     * 
     * @param _x
     * @param _y
     * @param w
     * @param h
     * @param type
     * @param id
     * @param img
     */
    public Block(int _x, int _y, int w, int h, int type, int id){//, BufferedImage img) {
        System.out.println("Block: New Block Created x:"+_x+" y:"+_y+" w:"+w+" h:"+h);
        this.x = _x;
        this.y = _y;
        this.currentVec = new Vector2d(this.x, this.y);
        this.Blwidth = w;
        this.Blheight = h;
        this.type = type;
        this.B1Rect = new Rectangle(_x, _y, 28, 22);
        this.id = id;
        this.isDestroyed = false;
        this.isDamaged = false;
    }
    
    
    
    
    /**Public Protocol*/
    
    
    
    /**
     * render(Graphics2D g2d)
     * 
     *
     * @param g2d
     */
    public void render(Graphics2D g2d){
        Graphics2D g2d_Block = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        for(Block bl1 : blockList){
            
            if(bl1.type == 3){
                //Draw Box
                g2d_Block.setColor(col1);
                g2d_Block.drawRect(bl1.x, bl1.y, 28, 22);
                g2d_Block.setColor(col2);
                g2d_Block.drawRect(bl1.x, bl1.y+9, 28, 4);
            } else {
                //Draw Box
                g2d_Block.setColor(col1);
                g2d_Block.fillRect(bl1.x, bl1.y, 28, 22);
                g2d_Block.setColor(col2);
                g2d_Block.fillRect(bl1.x, bl1.y+9, 28, 4);
            }
            
            if(Game.showBounds){
                g2d_Block.setColor(Color.yellow);
                g2d_Block.drawRect(bl1.getBounds().x, bl1.getBounds().y, 27, 21);
            }
            
        }
        
        g2d.setTransform(oldXForm);
        g2d_Block.setTransform(oldXForm);
    
    }
    
    
    /**
     * tick()
     * 
     *
     */
    public static void tick(){
            blockList = getAll();

            for(Block bl1 : blockList){
                if(bl1.getBounds().intersects(Game.fox.getBounds())){

                    if(bl1.type == 3){
                        break;
                    } else {
                        hit(bl1);
                    }

                    //Play sideHit Sound
                    if(Game.getGameSound()){
                        if(Sound.P1Collect.isPlaying()) Sound.P1Collect.stop();
                        Sound.P1Collect.play();
                    }
                }
        
                blockStrength = Block.getAll().size();
                invaderStrength = Block.getAll().size();

                if(blockStrength < oldblockStrength || invaderStrength < oldInvaderStrength){
                    displayBarStrength();
                }

                oldblockStrength = blockStrength;
                oldInvaderStrength = invaderStrength;


            }
            if(System.currentTimeMillis()/1000 % 2 == 0){
                col1 = Color.YELLOW;
                col2 = Color.GRAY;
            } else {
                col1 = Color.GRAY;
                col2 = Color.YELLOW;
            }
        
    }
    
    
    /**
    * displayBarStrength()
    * 
    */
    public static void displayBarStrength(){
        if(blockStrength == 0){
            SolarFox2023.setStatusBar("Blocks Destroyed!"+"    Blocks Remaining: "+Block.getAll().size());
        } else {
            blockStrengthD = ((double) (blockStrength % 648.0 / 10.0));
            String num = String.format("%.1f", blockStrengthD);
            SolarFox2023.setStatusBar("Block Strength: "+num +"%"+"    Blocks Remaining: "+Block.getAll().size());
        }
        if(Block.getAll().isEmpty()) Game.level.levelComplete = true;
    }
    
    
    /**
     * hit(Block bl1)
     * 
     *
     * @param bl1
     */
    public static void hit(Block bl1){
        if(bl1.type == 1 && bl1.isDamaged == false){
            damaged(bl1);
        } else {        
            destroyed(bl1);        
        }
    }
    
    
    /**
     * loadBlockMap(int lvlNo)
     * 
     *
     * @param lvlNo
     */
    public static void loadBlockMap(int lvlNo){
        List<String> lvl_Map = new ArrayList<>();
        clearAll();
        
        BufferedReader reader;
        String line;
        String fileName = "Level ";
        System.out.println("Loading BlockMap: "+fileName+lvlNo+".txt");
        
        try {
            reader = new BufferedReader(new FileReader("res/sys/"+fileName+lvlNo+".txt"));
            while((line = reader.readLine()) != null){
                lvl_Map.add(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Block.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int xN = 0;
        int yN = 0;
        
        int idc = 0;
        Block aBlock = null;
        int newWidth = 72;
        int newHeight = 58;
        
        for(int i = 0; i < lvl_Map.size(); i++){
            for(int j = 0; j < lvl_Map.get(i).length(); j++){
                char chr = lvl_Map.get(i).charAt(j);
                xN = xOffs + (j * newWidth);
                yN = yOffs + (i * newHeight);
                
                switch(chr){
                    case 'X':
                        aBlock = new Block(xN, yN, newWidth, newHeight, 0, idc);
                        
                        break;
                    case 'S':
                        aBlock = new Block(xN, yN, newWidth, newHeight, 1, idc);
                        
                        break;
                }
                if(aBlock != null){
                    blockList.add(aBlock);
                    idc++;
                }
            }
        }
        System.out.println("Blocks created:"+blockList.size());
        System.out.println("Solid Blocks created:"+blockList.size());
        System.out.println("Blocks to collect:"+blockList.size());
    }
    
    
    /**
     * init()
     * 
     *
     */
    public static void init(){
        System.out.println("Block: Initializing Block Objects");
    }    
    
    
    /**
     * damaged(Block bl1)
     * 
     * @param bl1
     */
    private static void damaged(Block bl1) {
        if(bl1.type == 3 || bl1.isDamaged){
            bl1.type = 0;
            bl1.isDamaged = true; 
            destroyed(bl1);
        } else {
            bl1.type = 3;
            bl1.isDamaged = true; 
        }
    }
    
    
    /**
     * destroyed(Block bl1)
     * 
     * @param bl1
     */
    private static void destroyed(Block bl1) {
        Game.increaseScore(100);
        bl1.isDestroyed = true;
    }
    
    
    /**
     * getAll()
     * 
     *
     * @return blockListA
     */
    public static List<Block> getAll() {
        blockListA = new ArrayList<>();
        int j = 0;
        
        for (int i = 0; i < blockList.size(); i++) {
            if (blockList.get(i).isDestroyed == false){
                blockListA.add(j, blockList.get(i));
                j++;
            }
        }
        
        return blockListA;
    }
    
    
    /**
     * clearAll()
     * 
     *
     */
    public static void clearAll() {
        blockList.clear();
    }
    
    
    /**
     * getBounds()
     * 
     * 
     * @return B1Rect
     */
    private Rectangle getBounds() {
        return B1Rect;
    }

    
    /**
     * resetBlocksHit()
     * 
     *
     */
    public static void resetBlocksHit() {
        
    }
    
}
