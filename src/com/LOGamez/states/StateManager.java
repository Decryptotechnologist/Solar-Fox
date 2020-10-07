/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.states;

import com.LOGamez.solarfox.*;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ghomez
 */
public class StateManager {
    
    /**Attributes*/
    
    /**map variable of StateManager object*/
    public Map<String, State> map;
    
    /**currentState variable of StateManager object*/
    public State currentState;

    
    /**Constructor*/
    
    
    /**
    * StateManager()
    * 
    */
    public StateManager() {
        System.out.println("StateManager: New StateManager Created");
        map = new HashMap<>();
    }
    
    
    /**Public Protocol*/
    
    
    /**
    * addState(State state)
    * 
    * @param state
    */
    public void addState(State state){
        System.out.println("StateManager: Adding State:"+state.getName().toUpperCase());
        map.put(state.getName().toUpperCase(), state);
        state.init();
        if(currentState == null){
            state.enter();
            currentState = state;
        }
    }
    
    
    /**
    * setState(String name)
    * 
    * @param name
    */
    public void setState(String name){
        System.out.println("StateManager: Setting State:"+name.toUpperCase());
        State state = map.get(name.toUpperCase());
        if(state == null){
            System.err.println("State <" + name + "> does not exist");
            return;
        }
        currentState.exit();
        state.enter();
        currentState = state;
    }
    
    
    /**
    * tick()
    * 
    * Updates StateManager Object
    * 
    */
    public void tick(){
        currentState.tick(this, Game.getGame());
    }
    
    
    /**
    * render(Graphics2D g)
    * 
    * Renders/Repaints StateManager Objects
    * 
    * @param g
    */
    public void render(Graphics2D g){
        currentState.render(g);
    }
    
    
}
