/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.solarfox;

import com.LOGamez.gui.*;
import com.LOGamez.utils.Util;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;
import java.applet.AudioClip;
import java.text.DecimalFormat;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.border.Border;


/**
 *
 * @author Nicholas Wright
 */
public class SolarFox {

    /**Attributes*/
    
    /**frame variable of SolarFox*/
    JFrame frame;
    
    /**panel variable of SolarFox*/
    JPanel panel;
    
    /**raisedBevel variable of SolarFox*/
    Border raisedBevel;
    
    /**mainWidth variable of SolarFox*/
    static int mainWidth;
    
    /**mainHeight variable of SolarFox*/
    static int mainHeight;

    /**icon variable of SolarFox*/
    private BufferedImage icon;
    
    /**currentStatus String of SolarFox*/
    private static String currentStatus = "Ready.";
    
    /**audioMap Map<String, AudioClip> of SolarFox*/
    public static Map<String, AudioClip> audioMap = new HashMap<>();
    
    /**sndMap Map<String, Clip> of SolarFox*/
    public static Map<String, Clip> sndMap = new HashMap<>();
    
    /**audioCount variable of SolarFox*/
    public static int audioCount = 0;
    
    /**soundCount variable of SolarFox*/
    public static int soundCount = 0;
    
    /**colours variable of SolarFox*/
    public static Color[] colours ={
        Color.black, 
        Color.blue, 
        Color.cyan, 
        Color.darkGray, 
        Color.gray, 
        Color.green, 
        Color.lightGray, 
        Color.magenta, 
        Color.orange, 
        Color.pink, 
        Color.red, 
        Color.white, 
        Color.yellow
    };
    
    /**optionsWindow JPanel of SolarFox*/
    public static JPanel optionsWindow;
    
    
    
    /**Links*/
    
    /**menuBR MainMenu of SolarFox*/
    static MainMenu menuBR;
    
    /**statusBar StatusBar of SolarFox*/
    public static StatusBar statusBar;
    
    /**game Game of SolarFox*/
    public Game game;
    
    
    
    
    
    /**Constructor*/
    
    
    /**
     * SolarFox Constructor
     *
     */
    public SolarFox(){
        System.out.println("SolarFox: New SolarFox created");
        
        setIcon();
        setLAF();
        
        //Create new JFrame: frame(Game.TITLE+" "+Game.version)
        frame = new JFrame(Game.TITLE+" "+Game.version);
        
        //Create new Game: Game()
        game = new Game(getMainWidth(), getMainHeight());
        
        //Create new MainMenu: MainMenu(game)
        menuBR = new MainMenu(game);
        
        //Create size: new Dimension(getMainWidth(), getMainHeight())
        Dimension size = new Dimension(getMainWidth(), getMainHeight());
        
        //Create panel: new JPanel(new BorderLayout())
        panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(size);
        
        //Create new JPanel: optionsWindow(new FlowLayout())
        optionsWindow = new JPanel(new FlowLayout());
        optionsWindow.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.96f));
        optionsWindow.setSize(getMainWidth(), getMainHeight());
        optionsWindow.setOpaque(true);
        optionsWindow.setVisible(false);
        
        //Create new StatusBar: statusBar("", SwingConstants.CENTER, raisedBevel)
        statusBar = new StatusBar("Ready.", SwingConstants.CENTER, raisedBevel);
        statusBar.setVisible(true);
        
        panel.add(optionsWindow, BorderLayout.CENTER);
        panel.add(game, BorderLayout.CENTER);
        panel.add(statusBar, BorderLayout.SOUTH);
        
        
        //Setup frame
        frame.setSize(size);
        frame.setContentPane(panel);
        frame.setIconImage(icon);
        frame.pack();
        
        frame.setVisible(true);
        frame.setJMenuBar(menuBR);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.err.println("Exiting Game . . .");
                game.quitGame();
            }
        }); 
        
        
    }
    
    
    /**Public Protocol*/
    
    
    /**
    * revalidate()
    * 
    */
    public static void revalidate(){
        // NOTE: Here we need a workaround for the HW/LW Mixing feature to work
        // correctly due to yet unfixed bug 6852592.
        // The JTextField is a validate root, so the revalidate() method called
        // during the setText() operation does not validate the parent of the
        // component. Therefore, we need to force validating its parent here.
        Container parent = menuBR.getParent();
        if (parent instanceof JComponent) {
            ((JComponent)parent).revalidate();
        }
    }
    
    
    /**
    * addOptions()
    * 
    */
    public static void addOptions() {
        optionsWindow.setVisible(true);
    }
    
    
    /**
    * removeOptions()
    * 
    */
    public static void removeOptions() {
        optionsWindow.setVisible(false);
        optionsWindow.removeAll();
    }
    
    /**
     * getMainWidth()
     * 
     * @return 
     */
    public static int getMainWidth(){
        if(mainWidth < 720){
            setMainWidth(720);
        }
        return mainWidth;
    }
    
    
    /**
     * setMainWidth(int width)
     * 
     * @param width
     */
    private static void setMainWidth(int width) {
        mainWidth = width;
    }

    
    /**
     * getMainHeight()
     * 
     * @return 
     */
    public static int getMainHeight(){
        if(mainHeight < 760){
            setMainHeight(760);
        }
        return mainHeight;
    }
    
    
    /**
     * setMainHeight(int height)
     * 
     * @param height 
     */
    private static void setMainHeight(int height) {
        mainHeight = height;
    }
    
    /**
    * setStatusBar(String msg)
    * 
    * @param msg
    */
    public static void setStatusBar(String msg) {
        currentStatus = msg;
        statusBar.setText(msg);
    }
    
    
    /**
    * getStatusBar()
    * 
    * @return currentStatus
    */
    public static String getStatusBar() {
        return currentStatus;
    }
    
    /**
     * setIcon()
     */
    private void setIcon() {
//        this.icon = new Texture("/icon/CCS-icon-16").getImage();
    }

    
    /**
     * setLAF()
     */
    private void setLAF() {
        raisedBevel = BorderFactory.createRaisedBevelBorder();
    }
    
    public static String memoryToMB(long mem){
        DecimalFormat dec = new DecimalFormat("#0.00");
        double result = (double) mem / (double) (1024 * 1024);
        return dec.format(result);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Starting " + Game.TITLE + " . . . Started by " + Util.getUserNAME());
        System.out.println("Running on OS:     " + Util.getOSName() + " "
                + Util.getOSARC() + " "+Util.getOSVER() +" Processor Cores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Working Directory: " + Util.getDIR());
        System.out.println("Home Directory:    " + Util.getHomeDIR());
        System.out.println("Memory: Max Memory: " + memoryToMB(Runtime.getRuntime().maxMemory()) + " MB");
        System.out.println("Memory: Total Memory: " + memoryToMB(Runtime.getRuntime().totalMemory()) + " MB");
        System.out.println("Memory: Free Memory: " + memoryToMB(Runtime.getRuntime().freeMemory()) + " MB");
        System.out.println("Memory: Used Memory: " + memoryToMB(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + " MB");
        System.out.println("");
        
        //Splashscreen code here
        SplashScreenDriver splashScreenDriver = new SplashScreenDriver();
        
        // TODO code application logic here
        SolarFox sf1 = new SolarFox();
        
    }
    
}
