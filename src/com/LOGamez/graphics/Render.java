/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.graphics;

/**
 *
 * @author Ghomez
 */
public class Render {

    /**Attributes*/
    
    /**Attributes*/
    int width;
    
    /**Attributes*/
    int height;
    
    /**Attributes*/
    public int[] pixels;
    
    /**Attributes*/
    static String chars = "" + //
            "abcdefghijklmnopqrstuvw" + //
            "xyz0123456789#!";
    
    
    /**Links*/
    
    /**Constructor*/
    
    /**
     * Render Constructor
     * 
     * 
     * @param width
     * @param height
     */
    public Render(int width, int height) {
        System.out.println("Render: New Render created");
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
    }
    
    public void clearScreen(){
        //pixels = new int[width * height];
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = 0xffffff;
        }
    }
    
    
    /**
    * draw(String string, int x, int y, int col)
    * 
    * @param string - the string variable Render object
    * @param x - the x variable Render object
    * @param y - the y variable Render object
    * @param col - the col variable Render object
    */     
    public void draw(String string, int x, int y, int col) {
        for (int i = 0; i < string.length(); i++) {
            int ch = chars.indexOf(string.charAt(i));
            if (ch < 0) {
                continue;
            }

            int xx = ch % 42;
            int yy = ch / 42;
//            draw(Texture.fonts, x + i * 16, y, xx * 6, yy * 8, 5, 8, col);
        }
    }
    
    /**
     * drawText(String msg, int scale, int x, int y, int col)
     * 
     * 
     * @param msg
     * @param scale
     * @param x
     * @param y
     * @param col
     */
    public void drawText(String msg, int scale, int x, int y, int col){
        for(int i = 0; i < msg.length(); i++){
            int ch = chars.indexOf(msg.charAt(i));
            if(ch < 0){
                continue;
            }
            
            int xx = ch % 42;
            int yy = ch / 42;
//            scaleDraw(Texture.fonts, x + i * 16, y, xx * 6, yy * 8, 5, 8, col);
        }
    }
    
    /**
     * drawString(String msg, int x, int y, int col)
     * 
     * 
     * @param msg
     * @param x
     * @param y
     * @param col
     */
    public void drawString(String msg, int x, int y, int col){
        for(int i = 0; i < msg.length(); i++){
            int ch = chars.indexOf(msg.charAt(i));
            if(ch < 0){
                continue;
            }
            
            int xx = ch % 42;
            int yy = ch / 42;
//            draw(Texture.fonts, x + i * 16, y, xx * 6, yy * 8, 5, 8, col);
        }
    }

    /**
     * scaleDraw(Render bitmap, double scale, int xOffs, int yOffs, int x0, int y0, int w, int h)
     * 
     * 
     * @param xOffs
     * @param yOffs
     * @param x0
     * @param y0
     * @param w
     * @param h
     */
    public void scaleDraw(Render bitmap, double scale, int xOffs, int yOffs, int x0, int y0, int w, int h) {
        for(int y = 0; y < h * scale; y++){
            int yPix = y + yOffs;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < w * scale; x++){
                int xPix = x + xOffs;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int src = bitmap.pixels[(int) (x / scale + x0) + (int) (y / scale + y0) * bitmap.width];
                if(src > -1){
                    pixels[xPix + yPix * width] = src;
                }
            }
        }
    }
    
    /**
     * scaleDraw(Render bitmap, double scale, int xOffs, int yOffs, int x0, int y0, int w, int h, int col)
     * 
     * 
     * @param xOffs
     * @param yOffs
     * @param x0
     * @param y0
     * @param w
     * @param h
     * @param col
     */
    public void scaleDraw(Render bitmap, double scale, int xOffs, int yOffs, int x0, int y0, int w, int h, int col) {
        for(int y = 0; y < h * scale; y++){
            int yPix = y + yOffs;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < w * scale; x++){
                int xPix = x + xOffs;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int src = bitmap.pixels[(int) (x / scale + x0) + (int) (y / scale + y0) * bitmap.width];
                if(src > -1){
                    pixels[xPix + yPix * width] = src * col;
                }
            }
        }
    }
    
    /**
     * scaleDraw(Render bitmap, double scale, int xOffs, int yOffs, int x0, int y0, int w, int h, int col)
     * 
     * 
     * @param xOffs
     * @param yOffs
     * @param x0
     * @param y0
     * @param w
     * @param h
     * @param col
     */
    public void scaleDraw(Render bitmap, int scale, int xOffs, int yOffs, int x0, int y0, int w, int h, int col) {
        for(int y = 0; y < h * scale; y++){
            int yPix = y + yOffs;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < w * scale; x++){
                int xPix = x + xOffs;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int src = bitmap.pixels[(int) (x / scale + x0) + (int) (y / scale + y0) * bitmap.width];
                if(src > -1){
                    pixels[xPix + yPix * width] = src * col;
                }
            }
        }
    }
    
    /**
     * draw(Render bitmap, int xOffs, int yOffs)
     * 
     * 
     * @param xOffs
     * @param yOffs
     * @param bitmap
     */
    public void draw(Render bitmap, int xOffs, int yOffs) {
        for(int y = 0; y < bitmap.height; y++){
            int yPix = y + yOffs;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < bitmap.width; x++){
                int xPix = x + xOffs;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int src = bitmap.pixels[x + y * bitmap.width];
                pixels[xPix + yPix * width] = src;   
            }
        }
    }
    
    
    /**
     * draw(Render bitmap, double scaleW, double scaleH, int xOffs, int yOffs, int w, int h)
     * 
     * 
     * @param xOffs
     * @param yOffs
     * @param scaleW
     * @param scaleH
     * @param w
     * @param h
     * @param bitmap
     */
    public void draw(Render bitmap, double scaleW, double scaleH, int xOffs, int yOffs, int w, int h) {
        for(int y = 0; y < h * scaleH; y++){
            int yPix = y + yOffs;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < w * scaleW; x++){
                int xPix = x + xOffs;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int scW = (int) (x / scaleW);
                int scH = (int) (y / scaleH);
                
                int src = bitmap.pixels[scW + scH * bitmap.width];
                pixels[xPix + yPix * width] = src;
                
            }
        }
    }
    
    /**
    * draw(Render bitmap, Double scaleW, Double scaleH, double xOffs, double yOffs, int w, int h)
    * 
    * @param bitmap - the bitmap variable Render object
    * @param scaleW - the scaleW variable Render object
    * @param scaleH - the scaleH variable Render object
    * @param xOffs - the xOffs variable Render object
    * @param yOffs - the yOffs variable Render object
    * @param w - the w variable Render object
    * @param h - the h variable Render object
    * @param col
    */  
    public void draw(Render bitmap, double scaleW, double scaleH, double xOffs, double yOffs, int w, int h) {
        for (int y = 0; y < bitmap.height * scaleH; y++) {
            int yPix =  y + (int) yOffs;
            if (yPix < 0 || yPix >= height) {
                continue;
            }

            for (int x = 0; x < bitmap.width * scaleW; x++) {
                int xPix =  x + (int) xOffs;
                if (xPix < 0 || xPix >= width) {
                    continue;
                }
                
                int scW = (int) (x / scaleW);
                int scH = (int) (y / scaleH);

                int src = bitmap.pixels[scW + scH * bitmap.width];
                if (src >= 0) {
                    pixels[xPix + yPix * width] = src;// * col;
                }

            }
        }
    }
    
    /**
     * draw(Render bitmap, double scaleW, double scaleH, int xOffs, int yOffs, int w, int h, int col)
     * 
     * 
     * @param xOffs
     * @param yOffs
     * @param scaleW
     * @param scaleH
     * @param w
     * @param h
     * @param bitmap
     * @param col
     */
    public void draw(Render bitmap, double scaleW, double scaleH, int xOffs, int yOffs, int w, int h, int col) {
        for(int y = 0; y < h * scaleH; y++){
            int yPix = y + yOffs;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < w * scaleW; x++){
                int xPix = x + xOffs;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int scW = (int) (x / scaleW);
                int scH = (int) (y / scaleH);
                
                int src = bitmap.pixels[scW + scH * bitmap.width];
                pixels[xPix + yPix * width] = src * col;
                
            }
        }
    }
    
    /**
     * draw(Render bitmap, int xOffs, int yOffs, int x0, int y0, int w, int h, int col)
     * 
     * 
     * @param xOffs
     * @param yOffs
     * @param x0
     * @param y0
     * @param w
     * @param h
     * @param bitmap
     * @param col
     */
    public void draw(Render bitmap, int xOffs, int yOffs, int x0, int y0, int w, int h, int col) {
        int bWidth = bitmap.width;
        for(int y = 0; y < h; y++){
            int yPix = y + yOffs;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < w; x++){
                int xPix = x + xOffs;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int scW = (int) (x + x0);
                int scH = (int) (y + y0);
                
                int src = bitmap.pixels[scW + scH * bWidth];
                if(src >= 0){
                    pixels[xPix + yPix * width] = src * col;
                }
            }
        }
    }
    
    /**
     * draw(Render bitmap, int x0, int y0, int w, int h)
     * 
     * 
     * @param x0
     * @param y0
     * @param w
     * @param h
     * @param bitmap
     */
    public void draw(Render bitmap, int x0, int y0, int w, int h) {
        int bWidth = bitmap.width;
        for(int y = 0; y < h; y++){
            int yPix = y;
            if(yPix < 0 || yPix >= height){
                continue;
            }
            for(int x = 0; x < w; x++){
                int xPix = x;
                if(xPix < 0 || xPix >= width){
                    continue;
                }
                
                int scW = (int) (x + x0);
                int scH = (int) (y + y0);
                
                int src = bitmap.pixels[scW + scH * bWidth];
                if(src >= 0){
                    pixels[xPix + yPix * width] = src;
                }
            }
        }
    }
    
}
