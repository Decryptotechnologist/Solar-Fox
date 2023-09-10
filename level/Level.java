/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.SolarFox2023.Game;
import com.LOGamez.audio.Sound;
import com.LOGamez.block.Block;
import com.LOGamez.bullets.Bullet;
import com.LOGamez.bullets.EnBullet;
import com.LOGamez.enemiez.Enemy;
import com.LOGamez.graphics.Texture;
import com.LOGamez.player.Player;
import com.LOGamez.SolarFox2023.SolarFox2023;
import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 *
 * @author Ghomez
 */
public class Level {
    
    /**Attributes*/
    
    /**levelNo variable of Level*/
    public static int levelNo;
    
    /**fpsX variable of Level*/
    public int fpsX;
    
    /**fpsY variable of Level*/
    public int fpsY;
    
    /**upsX variable of Level*/
    public int upsX;
    
    /**upsY variable of Level*/
    public int upsY;
    
    /**gTimeX variable of Level*/
    public int gTimeX;
    
    /**gTimeY variable of Level*/
    public int gTimeY;
    
    /**theLevelTime variable of Level*/
    public static String theLevelTime;
    
    /**levelComplete variable of Level*/
    public static boolean levelComplete;
    
    /**levelName variable of Level*/
    public static String levelName;
    
    /**levelCompleteCount variable of Level*/ 
    private int levelCompleteCount = 0;
    
    /**levelStartCount variable of Level*/ 
    private int levelStartCount;
    
    /**bonusTxtCol variable of Level*/
    private Color bonusTxtCol = Color.decode("#Feca00");//0xFeca00;
    
    /**livesBonusTxt variable of Level*/
    private String livesBonusTxt;
    
    /**livesBonusTxtX variable of Level*/
    private final int livesBonusTxtX = SolarFox2023.getMainWidth() / 6 - 30;
    
    /**livesBonusTxtY variable of Level*/
    private final int livesBonusTxtY = SolarFox2023.getMainHeight() - 465;
    
    /**timeBonusTxt variable of Level*/
    private String timeBonusTxt;
    
    /**timeBonusTxtX variable of Level*/
    private final int timeBonusTxtX = SolarFox2023.getMainWidth() / 6 - 30;
    
    /**timeBonusTxtY variable of Level*/
    private final int timeBonusTxtY = SolarFox2023.getMainHeight() - 465;
    
    /**levelBonusTxt variable of Level*/
    private String levelBonusTxt;
    
    /**levelBonusTxtX variable of Level*/
    private final int levelBonusTxtX = SolarFox2023.getMainWidth() / 6 - 30;
    
    /**levelBonusTxtY variable of Level*/
    private final int levelBonusTxtY = SolarFox2023.getMainHeight() - 465;
    
    /**bonusTxtFont variable of Level*/
    private final Font bonusTxtFont = new Font("Times New Roman", Font.BOLD, 16);
    
    /**levelTxtBGCol variable of Level*/
    private Color levelTxtBGCol = Color.decode("#333333");//0x00ff00;//Green
    
    /**levelTxtFGCol variable of Level*/
    private Color levelTxtFGCol = Color.decode("#FF1000");//0x00ff00;//Green
    
    /**levelTxt variable of Level*/
    private String levelTxt;
    
    /**levelTxtFont variable of Level*/
    private final Font levelTxtFont = new Font("Times New Roman", Font.BOLD, 46);
    
    /**levelTxtX variable of Level*/
    private final int levelTxtX = SolarFox2023.getMainWidth() / 4 - 30;
    
    /**levelTxtY variable of Level*/
    private final int levelTxtY = SolarFox2023.getMainHeight() - 425;
    
    /**firstTick variable of Level*/
    private static boolean firstTick;
    
    /**lastTick variable of Level*/
    private static boolean lastTick;
    
    /**alpha variable of Level*/
    private float alpha;
    
    /**acomp variable of Level*/
    private AlphaComposite acomp;
    
    /**currentFont variable of Level*/
    private Font currentFont;
    
    /**fps variable of Level*/
    private String fps;
    
    /**ups variable of Level*/
    private String ups;
    
    /**gTime variable of Level*/
    private String gTime;
    
    /**levelWidth variable of Level*/
    public int levelWidth;
    
    /**levelHeight variable of Level*/
    public int levelHeight;
    
    /**blocks variable of Level*/
    private static Block blocks;
    
    /**blockXOffs variable of Level*/
    private int blockXOffs;
    
    /**blockYOffs variable of Level*/
    private int blockYOffs;
    
    
    /**Links*/
    
    
    /**Constructor*/

    
    /**
     * Level Constructor
     * 
     * 
     * @param lvlNo
     * @param w
     * @param h
     */
    public Level(int lvlNo, int w, int h) {
        System.out.println("Level: new Level "+lvlNo+" created");
        
        levelNo = lvlNo;
        this.levelWidth = w;
        this.levelHeight = h;
        levelComplete = false;
        
        System.out.println("Level: Loading Level "+levelNo+" : "+getLevelName());
        
        //Create Player
        if(Player.getLives() > 0 && levelNo != 1){
            //set player lives to current player lives
            Game.fox = new Player((Game.gameWidth/2)+32, (Game.gameHeight/2)-84, 64, 14, Game.getPName(), Player.getLives());
        } else {
            //set player lives to 3
            Game.fox = new Player((Game.gameWidth/2)+32, (Game.gameHeight/2)-84, 64, 14, Game.getPName(), 3);
        }
        
        setUp();
        
        init();
    }
    
    
    
    /**Public Protocol*/
    
    
    /**
     * setUp()
     *
     */
    private void setUp(){
        switch(levelNo){
            case 1:
                setUpLevel1();
                break;
            case 2:
                setUpLevel2();
                break;
            case 3:
                setUpLevel3();
                break;
            case 4:
                setUpLevel4();
                break;
            case 5:
                setUpLevel5();
                break;
            case 6:
                setUpLevel6();
                break;    
            case 7:
                setUpLevel7();
                break;    
            case 8:
                setUpLevel8();
                break;    
            case 9:
                setUpLevel9();
                break;    
            case 10:
                setUpLevel10();
                break;    
            case 11:
                setUpLevel11();
                break;
            case 12:
                setUpLevel12();
                break;
            case 13:
                setUpLevel13();
                break;
            case 14:
                setUpLevel14();
                break;
            case 15:
                setUpLevel15();
                break;
            case 16:
                setUpLevel16();
                break;    
            case 17:
                setUpLevel17();
                break;    
            case 18:
                setUpLevel18();
                break;    
            case 19:
                setUpLevel19();
                break;    
            case 20:
                setUpLevel20();
                break;
            case 21:
                setUpLevel21();
                break;
            case 22:
                setUpLevel22();
                break;
            case 23:
                setUpLevel23();
                break;
            case 24:
                setUpLevel24();
                break;
            case 25:
                setUpLevel25();
                break;
            case 26:
                setUpLevel26();
                break;    
            case 27:
                setUpLevel27();
                break;    
            case 28:
                setUpLevel28();
                break;    
            case 29:
                setUpLevel29();
                break;    
            case 30:
                setUpLevel30();
                break;    
            case 31:
                setUpLevel31();
                break;
            case 32:
                setUpLevel32();
                break;
            case 33:
                setUpLevel33();
                break;
            case 34:
                setUpLevel34();
                break;
            case 35:
                setUpLevel35();
                break;
            case 36:
                setUpLevel36();
                break;    
            case 37:
                setUpLevel37();
                break;    
            case 38:
                setUpLevel38();
                break;    
            case 39:
                setUpLevel39();
                break;    
            case 40:
                setUpLevel40();
                break;
        }
        
        fpsX = 10;
        fpsY = levelHeight - 60;
        upsX = 10;
        upsY = levelHeight - 40;
        gTimeX = levelWidth-160;
        gTimeY = 20;
        
    }
    
    
    /**
     * setUpLevel1()
     *
     */
    public void setUpLevel1(){
        levelName = "RACK 1";
        
        //Top Row Offset
        blockYOffs = 20;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel2()
     *
     */
    public void setUpLevel2(){
        levelName = "RACK 2";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel3()
     *
     */
    public void setUpLevel3(){
        levelName = "RACK 3";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel4()
     *
     */
    public void setUpLevel4(){
        levelName = "RACK 4";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel5()
     *
     */
    public void setUpLevel5(){
        levelName = "RACK 5";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel6()
     *
     */
    public void setUpLevel6(){
        levelName = "CHALLENGE 1";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel7()
     *
     */
    public void setUpLevel7(){
        levelName = "RACK 7";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel8()
     *
     */
    public void setUpLevel8(){
        levelName = "RACK 8";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel9()
     *
     */
    public void setUpLevel9(){
        levelName = "RACK 9";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel10()
     *
     */
    public void setUpLevel10(){
        levelName = "RACK 10";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        //levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        //levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel11()
     *
     */
    public void setUpLevel11(){
        levelName = "RACK 11";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel12()
     *
     */
    public void setUpLevel12(){
        levelName = "RACK 12";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel13()
     *
     */
    public void setUpLevel13(){
        levelName = "RACK 13";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel14()
     *
     */
    public void setUpLevel14(){
        levelName = "RACK 14";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel15()
     *
     */
    public void setUpLevel15(){
        levelName = "RACK 15";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel16()
     *
     */
    public void setUpLevel16(){
        levelName = "RACK 16";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel17()
     *
     */
    public void setUpLevel17(){
        levelName = "RACK 17";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel18()
     *
     */
    public void setUpLevel18(){
        levelName = "RACK 18";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel19()
     *
     */
    public void setUpLevel19(){
        levelName = "RACK 19";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel20()
     *
     */
    public void setUpLevel20(){
        levelName = "RACK 20";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel21()
     *
     */
    public void setUpLevel21(){
        levelName = "RACK 21";
        
        //Top Row Offset
        blockYOffs = 20;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green 
        
    }
    
    
    /**
     * setUpLevel22()
     *
     */
    public void setUpLevel22(){
        levelName = "RACK 22";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel23()
     *
     */
    public void setUpLevel23(){
        levelName = "RACK 23";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel24()
     *
     */
    public void setUpLevel24(){
        levelName = "RACK 24";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel25()
     *
     */
    public void setUpLevel25(){
        levelName = "RACK 25";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel26()
     *
     */
    public void setUpLevel26(){
        levelName = "CHALLENGE 1";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel27()
     *
     */
    public void setUpLevel27(){
        levelName = "Level 27 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel28()
     *
     */
    public void setUpLevel28(){
        levelName = "Level 28 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel29()
     *
     */
    public void setUpLevel29(){
        levelName = "Level 29 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel30()
     *
     */
    public void setUpLevel30(){
        levelName = "Level 30 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel31()
     *
     */
    public void setUpLevel31(){
        levelName = "Level 31 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel32()
     *
     */
    public void setUpLevel32(){
        levelName = "Level 32 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel33()
     *
     */
    public void setUpLevel33(){
        levelName = "Level 33 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel34()
     *
     */
    public void setUpLevel34(){
        levelName = "Level 34 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel35()
     *
     */
    public void setUpLevel35(){
        levelName = "Level 35 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
    }
    
    
    /**
     * setUpLevel36()
     *
     */
    public void setUpLevel36(){
        levelName = "Level 36 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel37()
     *
     */
    public void setUpLevel37(){
        levelName = "Level 37 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel38()
     *
     */
    public void setUpLevel38(){
        levelName = "Level 38 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel39()
     *
     */
    public void setUpLevel39(){
        levelName = "Level 39 name";
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#00ff00");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FFFFFF");//0x00ff00;//Green
        
    }
    
    
    /**
     * setUpLevel40()
     *
     */
    public void setUpLevel40(){
        levelName = "Level 40 name"; 
        
        //Top Row Offset
        blockYOffs = 40;
        
        //Left Offset
        blockXOffs = -46;
        
        //Setup Level
        //Max Level Time
        
        //Set Enemy UFOfreq: 5
        Enemy.setUFOFreq(5);
        
        //Set Level Text
        levelTxt = getLevelName();
        
        //Set Level Text Background Color: Green
        levelTxtBGCol = Color.decode("#ff0000");//0x00ff00;//Green
        
        //Set Level Text Foreground Color: Green
        levelTxtFGCol = Color.decode("#FF33FF");//0x00ff00;//Green
        
    }
    
    /**
     * init()
     *
     */
    private void init(){
        Texture.clearMaps();
        Block.clearAll();

        if(EnBullet.getAll().size() > 0){
            EnBullet.clearAll();
        }
        
        Game.enemies = new Enemy();
        blocks = new Block(blockXOffs, blockYOffs);
        Game.bullets = new Bullet();
        
        Block.init();
        Enemy.init();
        
        loadLevelMap(levelNo);
        
        firstTick = true;
        lastTick = false;
        
        Sound.stopAll();
    }
    
    
    /**
     * render(Render target, Graphics2D g2d)
     *
     * @param g2d
     */
    public void render(Graphics2D g2d){
        Graphics2D g2d_Level = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        blocks.render(g2d);
        Enemy.render(g2d);
        EnBullet.render(g2d);
        
        if (Game.pauseTime > 0 && !Game.paused && Game.getGame().menu == null) {
            if(levelComplete){
                long time = System.currentTimeMillis();
                
                for (levelCompleteCount = 0; levelCompleteCount < 500; levelCompleteCount++) {
        
                    if (time / 450 % 2 == 0) {
                        g2d_Level.setFont(levelTxtFont);
                        g2d_Level.setColor(levelTxtBGCol);
                        g2d_Level.drawString(levelTxt+" COMPLETE", levelTxtX+2, levelTxtY+2); 
                        g2d_Level.setColor(levelTxtFGCol);
                        g2d_Level.drawString(levelTxt+" COMPLETE", levelTxtX, levelTxtY);

                        g2d_Level.setFont(bonusTxtFont);
                        g2d_Level.setColor(bonusTxtCol);
                        g2d_Level.drawString(livesBonusTxt, livesBonusTxtX, livesBonusTxtY);
                        g2d_Level.drawString(timeBonusTxt, timeBonusTxtX, timeBonusTxtY);
                        g2d_Level.drawString(levelBonusTxt, levelBonusTxtX, levelBonusTxtY);
                        
                        SolarFox2023.setStatusBar("Level "+Game.levelNo+" : "+getLevelName()+" Completed!!");    
                    } else {
                        
                        g2d_Level.setFont(bonusTxtFont);
                        g2d_Level.setColor(bonusTxtCol);
                        g2d_Level.drawString(levelBonusTxt, levelBonusTxtX, levelBonusTxtY);
                    }

                    if(levelCompleteCount == 500) {
                        lastTick = true;
                        break;
                    }
                }

            } else {
                long time = System.currentTimeMillis();
                g2d_Level.setFont(levelTxtFont);
                for (levelStartCount = 0; levelStartCount < 500; levelStartCount++) {    
                    if (time / 450 % 2 == 0) {                        
                        if(levelTxt.charAt(0) == 'C'){
                            g2d_Level.setColor(levelTxtBGCol);
                            g2d_Level.drawString("ENTERING "+levelTxt, levelTxtX-73, levelTxtY+2);
                            g2d_Level.setColor(levelTxtFGCol);
                            g2d_Level.drawString("ENTERING "+levelTxt, levelTxtX-75, levelTxtY);
                        } else {
                            g2d_Level.setColor(levelTxtBGCol);
                            g2d_Level.drawString("ENTERING "+levelTxt, levelTxtX+2, levelTxtY+2);
                            g2d_Level.setColor(levelTxtFGCol);
                            g2d_Level.drawString("ENTERING "+levelTxt, levelTxtX, levelTxtY);
                        }
                    }
                }
            }
        }
        
        if(Game.showFPS){
            fps = Game.theFPS;
            currentFont = new Font("default", Font.PLAIN, 10);
            g2d_Level.setFont(currentFont);
            g2d_Level.setColor(Color.yellow);
            g2d_Level.drawString(fps, fpsX, fpsY-36);
        }
        
        if(Game.showUPS){
            ups = Game.theUPS;
            currentFont = new Font("default", Font.PLAIN, 10);
            g2d_Level.setFont(currentFont);
            g2d_Level.setColor(Color.green);
            g2d_Level.drawString(ups, upsX, upsY-36);
        }
        
        if(Game.showGameTime){
            gTime = Game.theGameTime;
            currentFont = new Font("default", Font.BOLD, 16);
            g2d_Level.setFont(currentFont);
            g2d_Level.setColor(Color.red);
            g2d_Level.drawString(gTime, gTimeX, gTimeY);
            currentFont = new Font("default", Font.PLAIN, 10);
            g2d_Level.setFont(currentFont);
        }
        
        if(Game.showBounds || Game.showScreenBounds){
            //Draw Bottom EOS Bounds
            g2d_Level.setColor(Color.green);
            g2d_Level.drawRect(Game.BOTTOMSIDE.x, Game.BOTTOMSIDE.y, Game.BOTTOMSIDE.width, Game.BOTTOMSIDE.height);
            
            //Draw Left EOS Bounds
            g2d_Level.setColor(Color.green);
            g2d_Level.drawRect(Game.LEFTSIDE.x, Game.LEFTSIDE.y, Game.LEFTSIDE.width, Game.LEFTSIDE.height);
            
            //Draw Right EOS Bounds
            g2d_Level.setColor(Color.green);
            g2d_Level.drawRect(Game.RIGHTSIDE.x, Game.RIGHTSIDE.y, Game.RIGHTSIDE.width, Game.RIGHTSIDE.height);
            
            //Draw Top EOS Bounds
            g2d_Level.setColor(Color.green);
            g2d_Level.drawRect(Game.TOPSIDE.x, Game.TOPSIDE.y, Game.TOPSIDE.width, Game.TOPSIDE.height);
        }
        
        g2d_Level.setColor(Color.LIGHT_GRAY);
        g2d_Level.fillRect(fpsX+6, fpsY-12, 694, 6);
        
        currentFont = new Font("default", Font.BOLD, 34);
        g2d_Level.setFont(currentFont);
        g2d_Level.setColor(Color.yellow);
        g2d_Level.drawString(levelName, upsX-4, upsY+4);
        currentFont = new Font("default", Font.PLAIN, 10);
        g2d_Level.setFont(currentFont);
            
        
        g2d.setTransform(oldXForm);
        g2d_Level.setTransform(oldXForm);
    }
        
        
    /**
     * tick()
     *
     */
    public static void tick(){
    
        if(firstTick){
            firstTick = false;
            Game.resetGameTime();
            if(Game.getGameMusic()){
                if(Game.levelNo == 1){
                    Sound.Level1.play();
                }
                if(Game.levelNo == 2){
                    //Sound.Level2.loop();
                }
                if(Game.levelNo == 3){
                    //Sound.Level3.loop();
                }
                if(Game.levelNo == 4){
//                    Sound.Level4.loop();
                }
                if(Game.levelNo == 5){
//                    Sound.Level5.loop();
                }
                if(Game.levelNo == 6){
//                    Sound.Level6.loop();
                }
            }
        }
        if(lastTick){
            lastTick = false;
            Sound.stopAll();
            if(!Sound.endOfLevel.isPlaying()){
                Sound.endOfLevel.play();
            }
            
        }
        
        blocks.tick();
        Enemy.tick();
        Bullet.tick();
    }
    
    
    /**
     * getLevelName()
     * 
     *
     * @return levelName
     */
    public static String getLevelName(){
        return levelName;
    }
    
    
    /**
     * getLevelNo()
     * 
     *
     * @return Game.levelNo
     */
    public static int getLevelNo(){
        return Game.levelNo;
    }
    
    
    /**
     * setLevelNo()
     * 
     * 
     * @param levNo
     */
    public static void setLevelNo(int levNo){
        levelNo = levNo;
        Game.level = new Level(levelNo, SolarFox2023.getMainWidth(), SolarFox2023.getMainHeight());
    }
    

    /**
     * loadLevelMap(int lvlNo)
     * 
     * 
     * @param levNo
     */
    private void loadLevelMap(int lvlNo) {
        loadLevelBlockMap(lvlNo);
    }
    

    /**
     * loadLevelBlockMap(int lvlNo)
     * 
     * 
     * @param levNo
     */
    private void loadLevelBlockMap(int lvlNo) {
        Block.loadBlockMap(lvlNo);
    }
    
}
