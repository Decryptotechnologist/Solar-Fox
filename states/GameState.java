/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.states;

import com.LOGamez.level.Level;
import com.LOGamez.SolarFox2023.*;
import java.awt.*;

/**
 * @author Ghomez
 * 
 */
public class GameState implements State {

    
    /**Constructor*/
    
    
    /**
    * GameState()
    * 
    * Creates a new GameState object
    */
    public GameState() {
        System.out.println("GameState: New GameState Created");
    }

    
    
    /**Public Protocol*/
    
    
    /**
    * init()
    * 
    */
    @Override
    public void init() {
        System.out.println("GameState: Initiating Game State . . .");
    }

    
    /**
    * enter()
    * 
    */
    @Override
    public void enter() {
        System.out.println("GameState: Entering Game State . . .");        
    }

    
    /**
    * exit()
    * 
    */
    @Override
    public void exit() {
        System.out.println("GameState: Exiting Game State . . .");
        //Sound.stopAll();
    }

    
    /**
    * tick(StateManager statemanager, Game game)
    * 
    * Updates GameState Object
    * 
    * @param statemanager
    * @param game
    */
    @Override
    public void tick(StateManager statemanager, Game game) {
        if(game.menu == null){
            Level.tick();
        }
    }

    
    /**
     * render(Graphics2D g)
     * 
     * Renders/Repaints GameState Objects
     * 
     * @param g
     */
    @Override
    public void render(Graphics2D g) {
    }

    
    /**
    * getName()
    * 
    * @return "Level 1" - [name of State]
    */
    @Override
    public String getName() {
        return "Level 1";
    }

    
}
