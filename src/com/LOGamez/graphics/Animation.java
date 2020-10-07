/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.graphics;

import java.awt.*;

/**
 * @author Ghomez
 * 
 */
public class Animation {
    
    /**Attributes*/
    
    /**count variable of Animation object*/
    private int count;
    
    /**countR variable of Animation object*/
    private int countR;
    
    /**index variable of Animation object*/
    private int index;
    
    /**indexR variable of Animation object*/
    private int indexR;
    
    /**speed variable of Animation object*/
    private int speed;
    
    /**speedR variable of Animation object*/
    private int speedR;
    
    /**numFrames variable of Animation object*/
    private int numFrames;
    
    /**numRenders variable of Animation object*/
    private int numRenders;
    
    /**currentFrame Texture of Animation object*/
    private Texture currentFrame; 
    
    /**currentRender Render of Animation object*/
    private Render currentRender; 
    
    /**frames Texture[] of Animation object*/
    private Texture[] frames;
    
    /**renders Render[] of Animation object*/
    private Render[] renders;

    
    /**Constructors*/
    
    /**
     * Animation(int speed, Texture... frames)
     * 
     * @param speed
     * @param frames
     */
    public Animation(int speed, Texture... frames) {
        this.speed = speed;
        this.frames = frames;
        this.numFrames = frames.length;
    }
    
    
    /**
     * Animation(int speedR, Render... renders)
     * 
     * @param speedR
     * @param renders
     */
    public Animation(int speedR, Render... renders) {
        this.speedR = speedR;
        this.renders = renders;
        this.numRenders = renders.length;
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * nextFrame()
     * 
     */
    public void nextFrame(){
        currentFrame = frames[index++];
        if(index >= numFrames){
            index = 0;
        }
        
    }
    
    
    /**
     * nextRender()
     * 
     */
    public void nextRender(){
        currentRender = renders[indexR++];
        if(indexR >= numRenders){
            indexR = 0;
        }
        
    }
    
    
    /**
     * run()
     * 
     */
    public void run(){
        count++;
        if(count > speed){
            count = 0;
            nextFrame();
        }
    }
    
    
    /**
     * runRen()
     * 
     */
    public void runRen(){
        countR++;
        if(countR > speedR){
            countR = 0;
            nextRender();
        }
    }
    
    
    /**
    * render(Graphics2D g, int x, int y, int w, int h)
    * 
    * Renders/Repaints Animation Objects
    * 
    * @param g
    * @param x - the x variable Animation object
    * @param y - the y variable Animation object
    * @param w - the w variable Animation object
    * @param h - the h variable Animation object
    */
    public void render(Graphics2D g, int x, int y, int w, int h){
        if(currentFrame != null){
            currentFrame.render(g, x, y, w, h);
        }
    }
    
    
    /**
    * render(Graphics2D g, int x, int y, int w, int h, Color col)
    * 
    * Renders/Repaints Animation Objects
    * 
    * @param g
    * @param x - the x variable Animation object
    * @param y - the y variable Animation object
    * @param w - the w variable Animation object
    * @param h - the h variable Animation object
    * @param col - the col variable Animation object
    */
    public void render(Graphics2D g, int x, int y, int w, int h, Color col){
        if(currentFrame != null){
            currentFrame.render(g, x, y, w, h, col);
        }
    }
    
    
    /**
    * render(Render r, int x, int y, double scale, int w, int h, int col)
    * 
    * Renders/Repaints Animation Objects
    * 
    * @param r
    * @param x - the x variable Animation object
    * @param y - the y variable Animation object
    * @param scale - the scale variable Animation object
    * @param w - the w variable Animation object
    * @param h - the h variable Animation object
    * @param col - the col variable Animation object
    */
    public void render(Render r, int x, int y, double scale, int w, int h, int col){
        if(currentRender != null){
            r.scaleDraw(currentRender, scale, x, y, 0, 0, w, h, col);
        }
    }
    
    
    /**
    * render(Render r, int x, int y, double scale, int w, int h)
    * 
    * Renders/Repaints Animation Objects
    * 
    * @param r
    * @param x - the x variable Animation object
    * @param y - the y variable Animation object
    * @param scale - the scale variable Animation object
    * @param w - the w variable Animation object
    * @param h - the h variable Animation object
    */
    public void render(Render r, int x, int y, double scale, int w, int h){
        if(currentRender != null){
            r.draw(currentRender, scale, scale, x, y, w, h);
        }
    }
    
    /**
    * render(Render r, int x, int y, double scale, int w, int h)
    * 
    * Renders/Repaints Animation Objects
    * 
    * @param r
    * @param x - the x variable Animation object
    * @param y - the y variable Animation object
    * @param scaleX - the X scale variable Animation object
    * @param scaleY - the Y scale variable Animation object
    * @param w - the w variable Animation object
    * @param h - the h variable Animation object
    * @param col
    */
    public void render(Render r, int x, int y, double scaleX, double scaleY, int w, int h, int col){
        if(currentRender != null){
            r.draw(currentRender, scaleX, scaleY, x, y, w, h, col);
        }
    }
    
    
    /**
    * render(Render r, int x, int y, double scale, int w, int h)
    * 
    * Renders/Repaints Animation Objects
    * 
    * @param r
    * @param x - the x variable Animation object
    * @param y - the y variable Animation object
    * @param scale - the scale variable Animation object
    * @param w - the w variable Animation object
    * @param h - the h variable Animation object
    */
    public void render(Render r, int x, int y, int scale, int w, int h){
        if(currentRender != null){
            r.scaleDraw(currentRender, scale, 0, 0, x, y, w, h);
        }
    }

    
    /**
    * render(Render r, int x, int y, int w, int h)
    * 
    * Renders/Repaints Animation Objects
    * 
    * @param r
    * @param x - the x variable Animation object
    * @param y - the y variable Animation object
    * @param w - the w variable Animation object
    * @param h - the h variable Animation object
    */
    public void render(Render r, int x, int y, int w, int h){
        if(currentRender != null){
            r.draw(currentRender, x, y, w, h);
        }
    }
    
}
