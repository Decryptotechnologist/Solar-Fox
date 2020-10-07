/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.gui;

import com.sun.glass.events.KeyEvent;
//import com.LOGamez.audio.Sound;
//import com.LOGamez.level.Level;
import com.LOGamez.solarfox.Game;
import com.LOGamez.solarfox.SolarFox;
import com.LOGamez.player.Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author Ghomez
 */
public class MainMenu extends JMenuBar {
    
    /**Attributes*/
    
    private final JRadioButtonMenuItem gameDiff0Mi;
    private final JRadioButtonMenuItem gameDiff1Mi;
    private final JRadioButtonMenuItem gameDiff2Mi;
    private final JRadioButtonMenuItem keysMi;
    private final JRadioButtonMenuItem mouseMi;
    
    /**Links*/
    
    /**Constructor*/
    
    /**
     * MainMenu Constructor
     * @param game
     */
    public MainMenu(Game game){
        System.out.println("MainMenu: New MainMenu created");
        
        ImageIcon optionsIcon = new ImageIcon("res/icon/settings.png");
        ImageIcon boundsIcon = new ImageIcon("res/icon/bounds.png");
        ImageIcon statusIcon = new ImageIcon("res/icon/statusbar.png");
        ImageIcon fpsIcon = new ImageIcon("res/icon/FPSa.png");
        ImageIcon upsIcon = new ImageIcon("res/icon/UPS.png");
        ImageIcon soundIcon = new ImageIcon("res/icon/sound.png");
        ImageIcon sfxIcon = new ImageIcon("res/icon/sfx.png");
        ImageIcon musicIcon = new ImageIcon("res/icon/music.png");
        ImageIcon rapidIcon = new ImageIcon("res/icon/rapid.png");
        ImageIcon KsIcon = new ImageIcon("res/icon/Killshot.png");
        ImageIcon playerIcon = new ImageIcon("res/icon/SI_Player0.png");
        ImageIcon playerHitIcon = new ImageIcon("res/icon/SI_Player1_1.png");
        ImageIcon powCannonIcon = new ImageIcon("res/icon/SI_cPOWT1_0.png");
        ImageIcon powShieldIcon = new ImageIcon("res/icon/SI_shPOWT1_0.png");
        ImageIcon powSpeedIcon = new ImageIcon("res/icon/SI_spPOWT1_0.png");
        
        //GAME
        JMenu fileMenu = new JMenu("Game");
        
            //GAME : NEW GAME
            JMenuItem newMi = new JMenuItem("New Game");
            KeyStroke f5 = KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0);
            newMi.setAccelerator(f5);
            newMi.setMnemonic(KeyEvent.VK_F5);
            
            newMi.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("New Game Clicked!");
//                    Game.getGame().setMenu(null);
//                    game.stateManager.setState("menu");

//                    game.level = new Level(game.startLevel, SolarFox.getMainWidth(), SolarFox.getMainHeight(), 4200);
                }
            });
            
        
            //GAME : EXIT GAME
            JMenuItem exitMi = new JMenuItem("Exit Game");
            KeyStroke f4 = KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0);
            exitMi.setAccelerator(f4);
            exitMi.setMnemonic(KeyEvent.VK_F4);
            
            exitMi.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Exit Game Clicked!");
                    game.quitGame();
                }
            });
            
            
        //EDIT
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(java.awt.event.KeyEvent.VK_E);
        
            //EDIT : OPTIONS
            JMenuItem optionsMi = new JMenuItem("Options", optionsIcon);
            optionsMi.setMnemonic(java.awt.event.KeyEvent.VK_O);
            KeyStroke o = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, 0);
            optionsMi.setAccelerator(o);

            optionsMi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
//                    game.setOptions();
                }
            });
            
        
            
        //VIEW
        JMenu viewMenu = new JMenu("View");
        viewMenu.setMnemonic(java.awt.event.KeyEvent.VK_V);
        
            //VIEW : SHOW STATUSBAR
            JCheckBoxMenuItem sbarMi = new JCheckBoxMenuItem("Show statubar", statusIcon);
            sbarMi.setMnemonic(java.awt.event.KeyEvent.VK_Z);
            KeyStroke z = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, 0);
            sbarMi.setAccelerator(z);
            sbarMi.setSelected(true);

            sbarMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        SolarFox.statusBar.setVisible(true);
                    } else {
                        //Sound.btnPushed.play();
                        SolarFox.statusBar.setVisible(false);
                    }

                }

            });

            //VIEW : SHOW FPS
            JCheckBoxMenuItem sfpsMi = new JCheckBoxMenuItem("Show FPS", fpsIcon);
            sfpsMi.setMnemonic(java.awt.event.KeyEvent.VK_F);
            KeyStroke f = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, 0);
            sfpsMi.setAccelerator(f);
            sfpsMi.setSelected(true);

            sfpsMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.showFPS = true;
                    } else {
                        //Sound.btnPushed.play();
                        game.showFPS = false;
                    }

                }

            });

            //VIEW : SHOW UPS
            JCheckBoxMenuItem sUpsMi = new JCheckBoxMenuItem("Show UPS", upsIcon);
            sUpsMi.setMnemonic(java.awt.event.KeyEvent.VK_P);
            KeyStroke p = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0);
            sUpsMi.setAccelerator(p);
            sUpsMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.showUPS = true;
                    } else {
                        //Sound.btnPushed.play();
                        game.showUPS = false;
                    }

                }

            });

            //VIEW : SHOW BOUNDS
            JCheckBoxMenuItem sboundsMi = new JCheckBoxMenuItem("Show Bounds", boundsIcon, false);
            sboundsMi.setMnemonic(java.awt.event.KeyEvent.VK_B);
            KeyStroke b = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0);
            sboundsMi.setAccelerator(b);
            sboundsMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if(e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.showBounds = true;
                    } else {
                        //Sound.btnPushed.play();
                        game.showBounds = false;
                    }

                }

            });
            
            //VIEW : SHOW KILLSHOT
            JCheckBoxMenuItem sKillshotMi = new JCheckBoxMenuItem("Show Kill Shot", KsIcon);
            sKillshotMi.setMnemonic(java.awt.event.KeyEvent.VK_K);
            KeyStroke k = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, 0);
            sKillshotMi.setAccelerator(k);
            sKillshotMi.setSelected(true);

            sKillshotMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
//                        game.showKillShot = true;
                    } else {
                        //Sound.btnPushed.play();
//                        game.showKillShot = false;
                    }

                }

            });
            
            //VIEW : SHOW LEVELTIME
            JCheckBoxMenuItem sLevelTimeMi = new JCheckBoxMenuItem("Show Level Time", KsIcon);
            sLevelTimeMi.setMnemonic(java.awt.event.KeyEvent.VK_L);
            KeyStroke l = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, 0);
            sLevelTimeMi.setAccelerator(l);
            sLevelTimeMi.setSelected(true);

            sLevelTimeMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.showLevelTime = true;
                    } else {
                        //Sound.btnPushed.play();
                        game.showLevelTime = false;
                    }

                }

            });
            
            //VIEW : SHOW GAMETIME
            JCheckBoxMenuItem sGameTimeMi = new JCheckBoxMenuItem("Show Game Time", KsIcon);
            sGameTimeMi.setMnemonic(java.awt.event.KeyEvent.VK_G);
            KeyStroke g = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, 0);
            sGameTimeMi.setAccelerator(g);
            sGameTimeMi.setSelected(true);

            sGameTimeMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.showGameTime = true;
                    } else {
                        //Sound.btnPushed.play();
                        game.showGameTime = false;
                    }

                }

            });
            
            //VIEW : SHOW HUD
            JCheckBoxMenuItem sHUDMi = new JCheckBoxMenuItem("Show Heads-up Display", KsIcon);
            sHUDMi.setMnemonic(java.awt.event.KeyEvent.VK_U);
            KeyStroke u = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, 0);
            sHUDMi.setAccelerator(u);
            sHUDMi.setSelected(true);

            sHUDMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.showHUD = true;
                    } else {
                        //Sound.btnPushed.play();
                        game.showHUD = false;
                    }

                }

            });
            
            
            
        //DEVELOPER
        JMenu devMenu = new JMenu("Developer");
        devMenu.setMnemonic(java.awt.event.KeyEvent.VK_D);
        
        //DEVELOPER : GAME : PLAYER
        JMenu playerMenu = new JMenu("Player");
        playerMenu.setMnemonic(java.awt.event.KeyEvent.VK_P);
        
            //DEVELOPER : GAME : PLAYER : RAPID FIRE
            JCheckBoxMenuItem rapidFireMi = new JCheckBoxMenuItem("Rapid Fire", rapidIcon);
            rapidFireMi.setMnemonic(java.awt.event.KeyEvent.VK_R);
            KeyStroke r = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0);
            rapidFireMi.setAccelerator(r);
            rapidFireMi.setSelected(true);

            rapidFireMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
//                        Player.rapidFire = true;
                    } else {
                        //Sound.btnPushed.play();
//                        Player.rapidFire = false;
                    }

                }

            });
            
            //DEVELOPER : GAME : PLAYER : EXTRA LIFE
            JMenuItem extraLifeMi = new JMenuItem("Extra Life", playerIcon);
            KeyStroke plus = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PLUS, 0);
            extraLifeMi.setAccelerator(plus);
            extraLifeMi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.extraLife();
                }

            });
            
            //DEVELOPER : GAME : PLAYER : LOSE A LIFE
            JMenuItem loseALifeMi = new JMenuItem("Lose A Life", playerHitIcon);
            KeyStroke minus = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, 0);
            loseALifeMi.setAccelerator(minus);
            loseALifeMi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.loseALife();
                }

            });
            
            //DEVELOPER : GAME : PLAYER : SET LIVES 3
            JMenuItem setLives3Mi = new JMenuItem("Set Lives 3", playerIcon);
            KeyStroke f6 = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0);
            setLives3Mi.setAccelerator(f6);
            setLives3Mi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.setLives(3);
                }

            });
            
            //DEVELOPER : GAME : PLAYER : SET LIVES 5
            JMenuItem setLives5Mi = new JMenuItem("Set Lives 5", playerIcon);
            KeyStroke f7 = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0);
            setLives5Mi.setAccelerator(f7);
            setLives5Mi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.setLives(5);
                }

            });
            
            //DEVELOPER : GAME : PLAYER : SET LIVES 8
            JMenuItem setLives8Mi = new JMenuItem("Set Lives 8", playerIcon);
            KeyStroke f8 = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0);
            setLives8Mi.setAccelerator(f8);
            setLives8Mi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.setLives(8);
                }

            });
            
            //DEVELOPER : GAME : PLAYER : SET POW 1
            JMenuItem setPOW1Mi = new JMenuItem("Set POW 1", powCannonIcon);
            KeyStroke f1 = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0);
            setPOW1Mi.setAccelerator(f1);
            setPOW1Mi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.setPOW(1);
                }

            });
            
            //DEVELOPER : GAME : PLAYER : SET POW 2
            JMenuItem setPOW2Mi = new JMenuItem("Set POW 2", powShieldIcon);
            KeyStroke f2 = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0);
            setPOW2Mi.setAccelerator(f2);
            setPOW2Mi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.setPOW(2);
                }

            });
            
            //DEVELOPER : GAME : PLAYER : SET POW 3
            JMenuItem setPOW3Mi = new JMenuItem("Set POW 3", powSpeedIcon);
            KeyStroke f3 = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0);
            setPOW3Mi.setAccelerator(f3);
            setPOW3Mi.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent event) {
                    //Sound.btnPushed.play();
                    game.fox.setPOW(3);
                }

            });
            
            
            
            
        //DEVELOPER : SOUND
        JMenu soundMenu = new JMenu("Sound");
        soundMenu.setMnemonic(java.awt.event.KeyEvent.VK_F9);
            
            //DEVELOPER : SOUND : SOUND ON
            JCheckBoxMenuItem soundMi = new JCheckBoxMenuItem("Sound Enabled", soundIcon);
            soundMi.setMnemonic(java.awt.event.KeyEvent.VK_S);
            KeyStroke s = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0);
            soundMi.setAccelerator(s);
            soundMi.setSelected(true);

            soundMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.setGameSound(true);
                    } else {
                        game.setGameSound(false);

//                        Sound.stopAll();
                    }

                }

            });

            //DEVELOPER : SOUND : MUSIC ON
            JCheckBoxMenuItem musicMi = new JCheckBoxMenuItem("Game Music Enabled", musicIcon);
            musicMi.setMnemonic(java.awt.event.KeyEvent.VK_M);
            KeyStroke m = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0);
            musicMi.setAccelerator(m);
            musicMi.setSelected(true);

            musicMi.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        //Sound.btnPushed.play();
                        game.setGameMusic(true);
                    } else {
                        //Sound.btnPushed.play();
                        game.setGameMusic(false);

//                        Sound.Level1.stop();
//                        Sound.Level2.stop();
//                        Sound.Level3.stop();
//                        Sound.Level4.stop();
//                        Sound.Level5.stop();
//                        Sound.Level6.stop();
//                        Sound.Level7.stop();
//                        Sound.Level8.stop();
//                        Sound.Level9.stop();
                    }

                }

            });
            
        //DEVELOPER : GAME    
        JMenu gameMenu = new JMenu("Game");
        gameMenu.setMnemonic(java.awt.event.KeyEvent.VK_G);
        
            //DEVELOPER : GAME : DIFFICULTY
            JMenu difficultyMenu = new JMenu("Difficulty");
            difficultyMenu.setMnemonic(java.awt.event.KeyEvent.VK_F);
            
                //DEVELOPER : GAME : DIFFICULTY : EASY
                gameDiff0Mi = new JRadioButtonMenuItem("Game Difficulty: Easy");
                gameDiff0Mi.setSelected(false);

                    //Difficulty Menu Item ItemListener - Game Difficulty: Easy
                    gameDiff0Mi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Sound.btnPushed.play();
                            //Set Game Difficulty
//                            game.setGameDifficulty(0);
                            
                            gameDiff0Mi.setSelected(true);
                            gameDiff1Mi.setSelected(false);
                            gameDiff2Mi.setSelected(false);
                        }
                    });
                    
                //DEVELOPER : GAME : DIFFICULTY : NORMAL
                gameDiff1Mi = new JRadioButtonMenuItem("Game Difficulty: Normal");
                gameDiff1Mi.setSelected(true);

                    //Difficulty Menu Item ItemListener - Game Difficulty: Normal
                    gameDiff1Mi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Sound.btnPushed.play();
                            //Set Game Difficulty
//                            game.setGameDifficulty(1);
                            
                            gameDiff0Mi.setSelected(false);
                            gameDiff1Mi.setSelected(true);
                            gameDiff2Mi.setSelected(false);
                        }
                    });
                    
                //DEVELOPER : GAME : DIFFICULTY : HARD
                gameDiff2Mi = new JRadioButtonMenuItem("Game Difficulty: Hard");
                gameDiff2Mi.setSelected(false);

                    //Difficulty Menu Item ItemListener - Game Difficulty: Hard
                    gameDiff2Mi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Sound.btnPushed.play();
                            //Set Game Difficulty
//                            game.setGameDifficulty(2);
                            
                            gameDiff0Mi.setSelected(false);
                            gameDiff1Mi.setSelected(false);
                            gameDiff2Mi.setSelected(true);
                        }
                    });
                    
            //DEVELOPER : GAME : CONTROLS        
            JMenu controlsMenu = new JMenu("Controls");
            controlsMenu.setMnemonic(java.awt.event.KeyEvent.VK_C);
            
                //DEVELOPER : GAME : CONTROLS : KEYS
                keysMi = new JRadioButtonMenuItem("Game Controls: Keys");
                keysMi.setSelected(true);

                    //Difficulty Menu Item ItemListener - Game Controls: Keys
                    keysMi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Sound.btnPushed.play();
                            //Set Game Control : true(keys)
//                            game.setGameControl(true);
                            
                            keysMi.setSelected(true);
                            mouseMi.setSelected(false);
                        }
                    });
                    
                //DEVELOPER : GAME : CONTROLS : MOUSE
                mouseMi = new JRadioButtonMenuItem("Game Controls: Mouse");
                mouseMi.setSelected(false);

                    //Difficulty Menu Item ItemListener - Game Controls: Mouse
                    mouseMi.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent event) {
                            //Sound.btnPushed.play();
                            //Set Game Control : false(mouse)
//                            game.setGameControl(false);
                            
                            keysMi.setSelected(false);
                            mouseMi.setSelected(true);
                        }
                    });
                    
                //DEVELOPER : GAME : RESET SCORE
                JMenuItem resetScoreMi = new JMenuItem("Reset Score");
                KeyStroke home = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HOME, 0);
                resetScoreMi.setAccelerator(home);
                
                resetScoreMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        game.resetScore();
                    }

                });
                
                //DEVELOPER : GAME : LOSE GAME || GAME OVER
                JMenuItem loseGameMi = new JMenuItem("Lose Game");
                
                loseGameMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        game.lose();
                    }

                });
                
                //DEVELOPER : GAME : QUIT GAME
                JMenuItem quitGameMi = new JMenuItem("Quit Game");
                KeyStroke q = KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, 0);
                quitGameMi.setAccelerator(q);
                
                quitGameMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        game.quitGame();
                    }

                });
                
                
            //DEVELOPER : LEVEL
            JMenu levelMenu = new JMenu("Level");
            levelMenu.setMnemonic(java.awt.event.KeyEvent.VK_L);
            
            
                //DEVELOPER : LEVEL : NEXT LEVEL
                JMenuItem nextLevelMi = new JMenuItem("Next Level");
                
                nextLevelMi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
//                        Level.changeLevel();
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 1
                JMenuItem setLevel1Mi = new JMenuItem("Set Level 1");
                
                setLevel1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(1);
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 2
                JMenuItem setLevel2Mi = new JMenuItem("Set Level 2");
                
                setLevel2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(2);
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 3
                JMenuItem setLevel3Mi = new JMenuItem("Set Level 3");
                
                setLevel3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(3);
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 4
                JMenuItem setLevel4Mi = new JMenuItem("Set Level 4");
                
                setLevel4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(4);
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 5
                JMenuItem setLevel5Mi = new JMenuItem("Set Level 5");
                
                setLevel5Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(5);
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 6
                JMenuItem setLevel6Mi = new JMenuItem("Set Level 6");
                
                setLevel6Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(6);
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 7
                JMenuItem setLevel7Mi = new JMenuItem("Set Level 7");
                
                setLevel7Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(7);
                    }

                });
                
                //DEVELOPER : LEVEL : SET LEVEL 8
                JMenuItem setLevel8Mi = new JMenuItem("Set Level 8");
                
                setLevel8Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
                        Game.setStartLevel(8);
                    }

                });
                
                //DEVELOPER : LEVEL : SET BACKGROUND 1
                JMenuItem setPlanet1Mi = new JMenuItem("Set Planet 1");
                
                setPlanet1Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
//                        Level.setBackground(1);
                    }

                });
                
                //DEVELOPER : LEVEL : SET BACKGROUND 2
                JMenuItem setPlanet2Mi = new JMenuItem("Set Planet 2");
                
                setPlanet2Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
//                        Level.setBackground(2);
                    }

                });
                
                //DEVELOPER : LEVEL : SET BACKGROUND 3
                JMenuItem setPlanet3Mi = new JMenuItem("Set Planet 3");
                
                setPlanet3Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
//                        Level.setBackground(3);
                    }

                });
                
                //DEVELOPER : LEVEL : SET BACKGROUND 4
                JMenuItem setPlanet4Mi = new JMenuItem("Set Planet 4");
                
                setPlanet4Mi.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //Sound.btnPushed.play();
//                        Level.setBackground(4);
                    }

                });
            
        //HELP
        JMenu helpMenu = new JMenu("Help");
        
            //HELP : HELP
            JMenuItem helpMi = new JMenuItem("Help");
            KeyStroke h = KeyStroke.getKeyStroke(KeyEvent.VK_H, 0);
            helpMi.setAccelerator(h);
            helpMi.setMnemonic(KeyEvent.VK_H);
            
            helpMi.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.out.println("Help Clicked!");
                }
            });
        
            
//        fileMenu.add(newMi);
//        fileMenu.add(exitMi);
//        
//        helpMenu.add(helpMi);
//        
//        
//        this.add(fileMenu);
//        this.add(Box.createHorizontalGlue());
//        this.add(helpMenu);
//        
//        this.setVisible(true);
//        this.setOpaque(true);
            
            
        playerMenu.add(rapidFireMi);
        playerMenu.addSeparator();
        playerMenu.add(extraLifeMi);
        playerMenu.add(loseALifeMi);
        playerMenu.addSeparator();
        playerMenu.add(setLives3Mi);
        playerMenu.add(setLives5Mi);
        playerMenu.add(setLives8Mi);
        playerMenu.addSeparator();
        playerMenu.add(setPOW1Mi);
        playerMenu.add(setPOW2Mi);
        playerMenu.add(setPOW3Mi);
        
        difficultyMenu.add(gameDiff0Mi);
        difficultyMenu.add(gameDiff1Mi);
        difficultyMenu.add(gameDiff2Mi);
        
        controlsMenu.add(keysMi);
        controlsMenu.add(mouseMi);
        
        gameMenu.add(playerMenu);
        gameMenu.add(difficultyMenu);
        gameMenu.add(controlsMenu);
        gameMenu.addSeparator();
        gameMenu.add(resetScoreMi);
        gameMenu.add(loseGameMi);
        gameMenu.add(quitGameMi);
        
        soundMenu.add(soundMi);
        soundMenu.add(musicMi);
        
        levelMenu.add(nextLevelMi);
        levelMenu.addSeparator();
        levelMenu.add(setLevel1Mi);
        levelMenu.add(setLevel2Mi);
        levelMenu.add(setLevel3Mi);
        levelMenu.add(setLevel4Mi);
        levelMenu.add(setLevel5Mi);
        levelMenu.add(setLevel6Mi);
        levelMenu.add(setLevel7Mi);
        levelMenu.add(setLevel8Mi);
        levelMenu.addSeparator();
        levelMenu.add(setPlanet1Mi);
        levelMenu.add(setPlanet2Mi);
        levelMenu.add(setPlanet3Mi);
        levelMenu.add(setPlanet4Mi);
        
        devMenu.add(gameMenu);
        devMenu.add(soundMenu);
        devMenu.add(levelMenu);
        
        viewMenu.add(sfpsMi);
        viewMenu.add(sUpsMi);
        viewMenu.add(sbarMi);
        viewMenu.addSeparator();
        viewMenu.add(sKillshotMi);
        viewMenu.add(sHUDMi);
        viewMenu.add(sboundsMi);
        viewMenu.add(sLevelTimeMi);
        viewMenu.add(sGameTimeMi);
        
        editMenu.add(optionsMi);
        //editMenu.add(defaultKeysMi);
        
        fileMenu.add(newMi);
        fileMenu.addSeparator();
        fileMenu.add(exitMi);

        this.add(fileMenu);
        this.add(editMenu);
        this.add(viewMenu);
        this.add(devMenu);
        this.add(Box.createHorizontalGlue());
        this.add(helpMenu);

        this.setVisible(true);        
        this.setOpaque(true);
    }
    
    /**Public Protocol*/
    
}
