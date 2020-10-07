/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.menu;

//import com.LOGamez.config.Configuration;
import com.LOGamez.audio.Sound;
import com.LOGamez.solarfox.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Ghomez
 */
public class OptionsMenu extends Menu {
    
    /**Attributes*/ 
    
    private static Properties selectedProperties;
    private static Properties properties;

    private static Color altCol;
    private static Color altBGCol;
    private static Border altLine;
    private static CompoundBorder compound4;
    private static int selection;

    
    private Dimension smlPanelSize;
    private Dimension medPanelSize;
    private Dimension lgePanelSize;
    
    public JPanel mainPanel;
    
    private JPanel graphicsPanel_L_Top;
    private JPanel controlsPanel_R_Top;
    private JPanel gameplayPanel_L_Center;
    private JPanel soundPanel_R_Center;
    private JPanel developerPanel_Center_Bottom;
    
    private static Border redLine;
    private static Border raisedbevel;
    private static Border loweredbevel;
    private static CompoundBorder compound;
    private static CompoundBorder compound1;
    private static CompoundBorder compound0;
    private static CompoundBorder compound2;
    private static CompoundBorder compound3;
    private static Border redLine1;
    
    private static Color txtCol;
    private static Color btnCol;
    private static Color darkCol;
    private static Color lightCol;
    private static Font smallGameFont;
    private static Font lgeGameFont;
    private static Font medGameFont;
    private static Color gameGreenCol;
    
    private JButton restoreDefBtn;
    private JButton backBtn;
    private JButton creditsBtn;
    private JButton saveBtn;
    private JButton cancelBtn;
    private JButton defineBtn;
    private JButton defKeysBtn;
    
    private JCheckBox boundsCheckBox;
    private JCheckBox jCheckBox10;
    private JCheckBox jCheckBox11;
    //private JCheckBox jCheckBox12;
    //private JCheckBox jCheckBox13;
    //private JCheckBox jCheckBox14;
    //private JCheckBox jCheckBox15;
    //private JCheckBox jCheckBox16;
    private JCheckBox sfxEnabledCheckBox;
    private JCheckBox musicEnabledCheckBox;
    private JCheckBox windowedCheckBox;
    private JCheckBox gameTimeCheckBox;
    private JCheckBox rapidFireCheckBox;
    private JCheckBox killshotCheckBox;
    private JCheckBox invincibilityCheckBox;
    private JCheckBox showStarsCheckBox;
    private JCheckBox showSpaceCheckBox;
    private JCheckBox jCheckBox3;
    //private JCheckBox jCheckBox4;
    private JCheckBox upsCheckBox;
    private JCheckBox jCheckBox6;
    private JCheckBox jCheckBox7;
    //private JCheckBox jCheckBox8;
    private JCheckBox fpsCheckBox;
    
    private JComboBox<String> resolutionComboBox;
    private JComboBox<String> detailComboBox;
    private JComboBox<String> difficultyComboBox;
    
    private JLabel graphicsTitleLabel;
    private JLabel customWidthLabel;
    private JLabel customHeightLabel;
    private JLabel detailLabel;
    private JLabel difficultyLabel;
    private JLabel playerNameLabel;
    private JLabel controlsTitleLabel;
    private JLabel gameplayTitleLabel;
    private JLabel soundTitleLabel;
    private JLabel developerTitleLabel;
    private JLabel sfxVolumeLabel;
    private JLabel musicVolumeLabel;
    private JLabel mouseSensitivityLabel;
    private JLabel resolutionLabel;
    
    private JRadioButton keysRadioButton;
    private JRadioButton mouseRadioButton;
    
    private JSlider sfxVolumeSlider;
    private JSlider musicVolumeSlider;
    private JSlider mouseSensitivitySlider;
    
    private JTextField customWidthTextField;
    private JTextField customHeightTextField;
    private JTextField playerNameTextField;
    
//    private BufferedImage graphicsPanelImage;
//    private BufferedImage graphicsPanelImage0;
//    private BufferedImage graphicsPanelImage1;
//    
//    private BufferedImage controlsPanelImage;
//    private BufferedImage controlsPanelImage0;
//    private BufferedImage controlsPanelImage1;
//    
//    private BufferedImage gameplayPanelImage;
//    private BufferedImage gameplayPanelImage0;
//    private BufferedImage gameplayPanelImage1;
//    
//    private BufferedImage soundPanelImage;
//    private BufferedImage soundPanelImage0;
//    private BufferedImage soundPanelImage1;
//    
//    private BufferedImage devPanelImage;
//    private BufferedImage devPanelImage0;
//    private BufferedImage devPanelImage1;
    
    
//    private static BufferedImage sliderIconImage;
//    private BufferedImage mainPanelImage;
//    private BufferedImage panelImage0;
//    private BufferedImage panelImage1;
    private String[] resList;

    private int currentSFXVol;
    private int currentMusicVol;
    private int currentMouseSense;
//    private Configuration config;
    private int w;
    private int h;
    private int OMTimer = 550;
    private boolean OMfirstTick = true;
    
    
    /**Constructor*/
    
    
    /**
    * OptionsMenu(Game game)
    * 
    * Creates a new OptionsMenu object
    * 
    * @param game
    */
    public OptionsMenu(Game game) {
        System.out.println("OptionsMenu: New Options Menu Created");
        this.game = game;
        Menu.setUp();
        //config = new Configuration();
    }
    
    
    /**Public Protocol*/
    
    
    /**
     * initComponents()
     * 
     */
    private void initComponents() {
        
        darkCol = new Color(0.25f, 0.05f, 0.05f, 0.90f);//new Color(0.15f, 0.15f, 0.15f, 0.96f);
        lightCol = Color.red;
        txtCol = Color.red;
        altCol = new Color(0, 129, 129);//Color.cyan;
        altBGCol = new Color(0, 49, 49);//Color.cyan;
        btnCol = new Color(0.25f, 0.05f, 0.05f, 1.0f);//new Color(0.15f, 0.15f, 0.15f, 0.96f);
        gameGreenCol = new Color(20, 36, 26);//new Color(0.06f, 0.10f, 0.02f, 0.80f);//new Color(0, 51, 51);
                
        smallGameFont = new Font("Cosmic Alien", Font.PLAIN, 9);
        medGameFont = new Font("Cosmic Alien", Font.PLAIN, 10);
        lgeGameFont = new Font("Cosmic Alien", Font.PLAIN, 12);
                
        
        redLine = BorderFactory.createLineBorder(lightCol, 2);
        redLine1 = BorderFactory.createLineBorder(Color.red, 2);
        altLine = BorderFactory.createLineBorder(altCol, 2);
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        loweredbevel = BorderFactory.createLoweredBevelBorder();
        compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
        compound0 = BorderFactory.createCompoundBorder(redLine, loweredbevel);
        compound1 = BorderFactory.createCompoundBorder(redLine, compound);
        compound2 = BorderFactory.createCompoundBorder(compound3, redLine1);
        compound3 = BorderFactory.createCompoundBorder(loweredbevel, raisedbevel);
        compound4 = BorderFactory.createCompoundBorder(altLine, loweredbevel);

        UIManager.put("Button.border", compound);
        UIManager.put("Button.selectBorder", BorderFactory.createLineBorder(lightCol, 2));
        UIManager.put("Button.background", btnCol);
        UIManager.put("Button.foreground", txtCol);
        UIManager.put("Button.shadow", new ColorUIResource(Color.RED));
        UIManager.put("Button.rollover", true);
        UIManager.put("Button.select", Color.black);
        UIManager.put("Button.gradient", new ColorUIResource(Color.blue));
        //UIManager.put("Button.opaque", true);
        UIManager.put("Button.font", smallGameFont);
        
        UIManager.put("Panel.border", compound0);
        UIManager.put("Panel.background", darkCol);
        UIManager.put("Panel.foreground", lightCol);
        UIManager.put("Panel.font", medGameFont);
        
        UIManager.put("Label.font", smallGameFont);
        UIManager.put("Label.foreground", txtCol);
        
        UIManager.put("CheckBox.background", darkCol);
        UIManager.put("CheckBox.foreground", lightCol);
        UIManager.put("CheckBox.selectionBackground", new ColorUIResource(darkCol));
        UIManager.put("CheckBox.selectionForeground", new ColorUIResource(lightCol));
        UIManager.put("CheckBox.border", redLine);
        UIManager.put("CheckBox.font", new Font("Cosmic Alien", Font.PLAIN, 10));
        
        UIManager.put("TextField.background", darkCol);
        UIManager.put("TextField.foreground", lightCol);
        UIManager.put("TextField.border", loweredbevel);
        UIManager.put("TextField.font", lgeGameFont);
        
        UIManager.put("ComboBox.buttonBackground", btnCol);
        UIManager.put("ComboBox.background", Color.black);
        UIManager.put("ComboBox.foreground", lightCol);
        UIManager.put("ComboBox.selectionBackground", lightCol);
        UIManager.put("ComboBox.selectionForeground", Color.black);
        UIManager.put("ComboBox.border", raisedbevel);
        UIManager.put("ComboBox.font", smallGameFont);

        UIManager.put("RadioButton.border", raisedbevel);
        UIManager.put("RadioButton.background", darkCol);
        UIManager.put("RadioButton.foreground", lightCol);
        UIManager.put("RadioButton.focus", Color.black);
        UIManager.put("RadioButton.font", new Font("Cosmic Alien", Font.PLAIN, 10));
        
        UIManager.put("Slider.border", raisedbevel);
        UIManager.put("Slider.background", darkCol);
        UIManager.put("Slider.foreground", lightCol);
        UIManager.put("Slider.highlight", darkCol);
        UIManager.put("Slider.tickColor", lightCol);
        UIManager.put("Slider.altTrackColor", Color.black);
        UIManager.put("Slider.trackColor", Color.orange);
        //UIManager.put("Slider.horizontalThumbIcon", sliderIconImage);
        UIManager.put("Slider.margin", new Insets(5, 2, 5, 2));
        UIManager.put("Slider.font", smallGameFont);
        
        properties = new Properties();
        selectedProperties = new Properties();
        
        //Graphics properties
        properties.put("Resolution", "720p");
        properties.put("Windowed", true);
        properties.put("Detail", "Normal");
        properties.put("CustomWidth", 820);
        properties.put("CustomHeight", 740);
        
        //Controls properties
        properties.put("KeyControl", true);
        properties.put("MouseControl", false);
        properties.put("MouseSensitivity", 50);
        
        //Gameplay properties
        properties.put("RapidFireOn", true);
        properties.put("KillShotOn", true);
        properties.put("ShowStarsOn", true);
        properties.put("ShowSpaceOn", false);
        properties.put("Difficulty", "Normal");
        properties.put("Invincibility", false);
        
        //Sound properties
        properties.put("SFXControlOn", true);
        properties.put("MusicControlOn", true);
        properties.put("SFXVolume", 50);
        properties.put("MusicVolume", 40);
        
        //Developer properties
        properties.put("BoundsOn", true);
        properties.put("fpsOn", true);
        properties.put("upsOn", false);
        
        
        
        smlPanelSize = new Dimension(312, 204);
        medPanelSize = new Dimension(590, 190);
        lgePanelSize = new Dimension(SolarFox.getMainWidth() - 40, SolarFox.getMainHeight() - 20);

        //MainPanel Panel*******************************************************
        mainPanel = new JPanel(){
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(mainPanelImage, 0, -10, SolarFox.getMainWidth() - 40, SolarFox.getMainHeight() - 20, null);
            }
        };
        
        mainPanel.setPreferredSize(lgePanelSize);
        
        mainPanel.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                mainPanelMouseEntered(evt);
            }
            
            @Override
            public void mouseExited(MouseEvent evt) {
                mainPanelMouseExited(evt);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

        });
        
        
        
        //Graphics Panel*******************************************************
        graphicsPanel_L_Top = new JPanel(){
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(graphicsPanelImage, -30, -30, null);
            }
        };        
        //graphicsPanel_L_Top.setToolTipText("Graphics");
        
        graphicsPanel_L_Top.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                graphicsPanel_L_TopMouseEntered(evt);
            }
            
            @Override
            public void mouseExited(MouseEvent evt) {
                graphicsPanel_L_TopMouseExited(evt);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }
            
        });
        //graphicsPanel_L_Top.setBounds(4, 140, 312, 204);
        graphicsPanel_L_Top.setPreferredSize(smlPanelSize);
        
        graphicsPanel_L_Top.setVisible(true);
        //graphicsPanel_L_Top.setBackground(gameGreenCol);
        
        //mainPanel.add(graphicsPanel_L_Top);
        
        graphicsTitleLabel = new JLabel();
        resolutionComboBox = new JComboBox<>();
        customWidthTextField = new JTextField();
        customHeightTextField = new JTextField();
        resolutionLabel = new JLabel();
        customWidthLabel = new JLabel();
        customHeightLabel = new JLabel();
        detailComboBox = new JComboBox<>();
        detailLabel = new JLabel();
        difficultyLabel = new JLabel();
        windowedCheckBox = new JCheckBox();
        
        windowedCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                graphicsPanel_L_TopMouseEntered(evt);
            }
            
        });

        graphicsTitleLabel.setText("<html><H2><u>Graphics</u></H2></html>");

        resList = new String[] { "480p", "720p", "1028HD" };
        resolutionComboBox.setModel(new DefaultComboBoxModel<>(resList));
        resolutionComboBox.setPreferredSize(new Dimension(80, 20));
        resolutionComboBox.setSelectedIndex(1);
        
        //Graphics properties
        selectedProperties.put("Resolution", "720p");
        
        resolutionComboBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                graphicsPanel_L_TopMouseEntered(evt);
            }
            
        });

        customWidthTextField.setColumns(5);
        customWidthTextField.setPreferredSize(new Dimension(35, 20));
        customWidthTextField.setText("600");
        
        selectedProperties.put("CustomWidth", 820);
        
        customWidthTextField.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                graphicsPanel_L_TopMouseEntered(evt);
            }
            
        });

        customHeightTextField.setColumns(5);
        customHeightTextField.setPreferredSize(new Dimension(35, 20));
        customHeightTextField.setText("800");
        
        selectedProperties.put("CustomHeight", 740);
        
        customHeightTextField.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                graphicsPanel_L_TopMouseEntered(evt);
            }
            
        });

        resolutionLabel.setText("<html><b>Resolution:</b></html>");
        resolutionLabel.setFont(smallGameFont);

        customWidthLabel.setText("<html><b>Width:</b></html>");

        customHeightLabel.setText("<html><b>Height:</b></html>");

        detailComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "High", "Normal", "Low" }));
        detailComboBox.setPreferredSize(new Dimension(80, 20));
        detailComboBox.setSelectedIndex(1);
        
        selectedProperties.put("Detail", "Normal");
        
        detailComboBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                graphicsPanel_L_TopMouseEntered(evt);
            }
            
        });

        detailLabel.setText("<html><b>Detail:</b></html>");

        windowedCheckBox.setText("<html><b>Windowed</b></html>");
        windowedCheckBox.setFont(smallGameFont);
        windowedCheckBox.setSelected(true);
        windowedCheckBox.setOpaque(true);
        
        selectedProperties.put("Windowed", true);

        //mainPanel.add(graphicsPanel_L_Top);
        //Display.optionsWindow.add(mainPanel);
        GroupLayout jPanel1_L_TopLayout = new GroupLayout(graphicsPanel_L_Top);
        graphicsPanel_L_Top.setLayout(jPanel1_L_TopLayout);
        jPanel1_L_TopLayout.setHorizontalGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_L_TopLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(graphicsTitleLabel)
                    .addGroup(jPanel1_L_TopLayout.createSequentialGroup()
                        .addGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(resolutionLabel)
                            .addComponent(customWidthLabel)
                            .addComponent(customHeightLabel)
                            .addComponent(detailLabel))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(customWidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(customHeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1_L_TopLayout.createSequentialGroup()
                                .addComponent(resolutionComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(windowedCheckBox)))))
                .addGap(36, 36, 36))
        );
        jPanel1_L_TopLayout.setVerticalGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_L_TopLayout.createSequentialGroup()
                .addComponent(graphicsTitleLabel)
                //.addGap(4, 4, 4)
                .addGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(resolutionComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolutionLabel)
                    .addComponent(windowedCheckBox))
                //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(detailComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailLabel))
                .addGap(8, 8, 8)
                .addGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(customWidthTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(customWidthLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_L_TopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(customHeightTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(customHeightLabel))
                .addGap(4, 4, 4))
        );
        
        
        
        //Controls Panel*******************************************************
        controlsPanel_R_Top = new JPanel(){
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(controlsPanelImage, -270, -55, null);
            }
        };
        
        controlsPanel_R_Top.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                controlsPanel_R_TopMouseEntered(evt);
            }
            
            @Override
            public void mouseExited(MouseEvent evt) {
                controlsPanel_R_TopMouseExited(evt);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            
        });
        
        //controlsPanel_R_Top.setBackground(gameGreenCol);
        controlsPanel_R_Top.setPreferredSize(smlPanelSize);
        
        

        controlsTitleLabel = new JLabel();
        keysRadioButton = new JRadioButton();
        
        keysRadioButton.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                controlsPanel_R_TopMouseEntered(evt);
            }
            
        });
        
        mouseRadioButton = new JRadioButton();
        
        mouseRadioButton.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                controlsPanel_R_TopMouseEntered(evt);
            }
            
        });
        
        mouseSensitivitySlider = new JSlider();
        
        //Controls properties
        //selectedProperties.put("MouseSensitivity", 0);
        
        mouseSensitivitySlider.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                controlsPanel_R_TopMouseEntered(evt);
            }
            
        });
        
        mouseSensitivityLabel = new JLabel();
        defineBtn = new JButton();
        defKeysBtn = new JButton();
        
        controlsTitleLabel.setText("<html><H2><u>Controls</u></H2></html>");

        keysRadioButton.setText("<html><b>Keys</b></html>");
        keysRadioButton.setSelected(true);
        keysRadioButton.setOpaque(true);
        
        //keysRadioButton Item ItemListener
        keysRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                //game.setMouseControl(false);
                //game.setKeyControl(true);
                
                selectedProperties.put("KeyControl", true);
                selectedProperties.put("MouseControl", false);

                mouseRadioButton.setSelected(false);
                mouseSensitivitySlider.setValue(0);
                mouseSensitivitySlider.setEnabled(false);
            }
        });

        mouseRadioButton.setText("<html><b>Mouse</b></html>");
        mouseRadioButton.setOpaque(true);
        
        //mouseRadioButton Item ItemListener
        mouseRadioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                //game.setMouseControl(true);
                //game.setKeyControl(false);
                
                selectedProperties.put("KeyControl", false);
                selectedProperties.put("MouseControl", true);

                keysRadioButton.setSelected(false);
                mouseSensitivitySlider.setEnabled(true);
                mouseSensitivitySlider.setValue(50);
            }
        });

        mouseSensitivitySlider.setFont(new Font("Digital-7", 1, 8)); // NOI18N
        mouseSensitivitySlider.setMajorTickSpacing(10);
        mouseSensitivitySlider.setMinorTickSpacing(5);
        mouseSensitivitySlider.setPaintTicks(true);
        mouseSensitivitySlider.setSnapToTicks(true);
        mouseSensitivitySlider.setName("sfxSlider"); // NOI18N
        mouseSensitivitySlider.setPreferredSize(new Dimension(80, 27));
        mouseSensitivitySlider.setEnabled(false);
        mouseSensitivitySlider.setValue(0);
        
        mouseSensitivitySlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                mouseSensitivityStateChanged(evt);
            }
        });
        

        mouseSensitivityLabel.setText("<html><b>Mouse Sensitivity:</b></html>");

        
        
        try {
            //defineBtn.setText("<html><b>Define</b></html>");
            defineBtn.setIcon(resizeButtonImage("/menu/define_on1.png", 100, 20, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defineBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                defineBtnMouseEntered(evt);
                controlsPanel_R_TopMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                defineBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                defineBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                defineBtnMouseReleased(evt);
            }
        });

        
        try {
            //defKeysBtn.setText("<html><b>Default Keys</b></html>");
            defKeysBtn.setIcon(resizeButtonImage("/menu/defKeys_on1.png", 122, 20, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        defKeysBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                defKeysBtnMouseEntered(evt);
                controlsPanel_R_TopMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                defKeysBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                defKeysBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                defKeysBtnMouseReleased(evt);
            }
        });

        GroupLayout jPanel2_R_TopLayout = new GroupLayout(controlsPanel_R_Top);
        controlsPanel_R_Top.setLayout(jPanel2_R_TopLayout);
        jPanel2_R_TopLayout.setHorizontalGroup(jPanel2_R_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2_R_TopLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2_R_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)    
                    .addGroup(jPanel2_R_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        //.addGap(58, 58, 58)
                            .addComponent(mouseSensitivitySlider, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel2_R_TopLayout.createSequentialGroup()
                            .addComponent(mouseSensitivityLabel)))
                    .addGroup(jPanel2_R_TopLayout.createSequentialGroup()
                        .addComponent(mouseRadioButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(defKeysBtn, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel2_R_TopLayout.createSequentialGroup()
                        .addComponent(controlsTitleLabel))
                    .addGroup(jPanel2_R_TopLayout.createSequentialGroup()
                        .addComponent(keysRadioButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(defineBtn, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2_R_TopLayout.setVerticalGroup(jPanel2_R_TopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_R_TopLayout.createSequentialGroup()
                .addComponent(controlsTitleLabel)
                //.addGap(8, 8, 8)
                .addGroup(jPanel2_R_TopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(keysRadioButton)
                    .addComponent(defineBtn, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2_R_TopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(mouseRadioButton)
                    .addComponent(defKeysBtn, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(mouseSensitivityLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mouseSensitivitySlider, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        
        
        
        //Gameplay Panel*******************************************************
        gameplayPanel_L_Center = new JPanel(){
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(gameplayPanelImage, -130, -135, null);
            }
        };
        
        gameplayPanel_L_Center.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                gameplayPanel_L_CenterMouseEntered(evt);
            }
            
            @Override
            public void mouseExited(MouseEvent evt) {
                gameplayPanel_L_CenterMouseExited(evt);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

        });
        
        gameplayPanel_L_Center.setBackground(gameGreenCol);
        gameplayPanel_L_Center.setPreferredSize(smlPanelSize);

        gameplayTitleLabel = new JLabel();
        playerNameLabel = new JLabel();
        playerNameTextField = new JTextField();
        rapidFireCheckBox = new JCheckBox();
        
        rapidFireCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //Player.rapidFire = true;
                    selectedProperties.put("RapidFireOn", true);
                } else {
                    //Player.rapidFire = false;
                    selectedProperties.put("RapidFireOn", false);
                }
                
            }

        });
        
        
        
        rapidFireCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                gameplayPanel_L_CenterMouseEntered(evt);
            }
            
        });
        
        killshotCheckBox = new JCheckBox();
        
        killshotCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //showKillShot = true;
                    selectedProperties.put("KillShotOn", true);
                } else {
                    //showKillShot = false;
                    selectedProperties.put("KillShotOn", false);
                }
                
            }

        });
        
        
        killshotCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                gameplayPanel_L_CenterMouseEntered(evt);
            }
            
        });
        
        difficultyComboBox = new JComboBox<>();
        
        selectedProperties.put("Difficulty", "Normal");
        
        difficultyComboBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                gameplayPanel_L_CenterMouseEntered(evt);
            }
            
        });
        
        invincibilityCheckBox = new JCheckBox();
        
        invincibilityCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //Player.invincible = true;
                    selectedProperties.put("Invincibility", true);
                } else {
                    //Player.invincible = false;
                    selectedProperties.put("Invincibility", false);
                }
                
            }

        });
        
        invincibilityCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                gameplayPanel_L_CenterMouseEntered(evt);
            }
            
        });
        
        
        playerNameTextField.setColumns(5);
        //playerNameTextField.setPreferredSize(new Dimension(35, 20));
        playerNameTextField.setText("Player 1");
        
        selectedProperties.put("Player Name", "Player 1");
        
        playerNameTextField.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                graphicsPanel_L_TopMouseEntered(evt);
            }
            
        });
        
        
        showStarsCheckBox = new JCheckBox();
        
        showStarsCheckBox.setText("<html><b>Show Stars</b></html>");
        showStarsCheckBox.setSelected(true);
        showStarsCheckBox.setOpaque(true);
        
        showStarsCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //game.showStars = true;
                    selectedProperties.put("StarsOn", true);
                } else {
                    //game.showStars = false;
                    selectedProperties.put("StarsOn", false);
                }
                
            }

        });
        
        showStarsCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                gameplayPanel_L_CenterMouseEntered(evt);
            }
            
        });
        
        
        showSpaceCheckBox = new JCheckBox();
        
        showSpaceCheckBox.setText("<html><b>Show Space</b></html>");
        showSpaceCheckBox.setOpaque(true);
        
        showSpaceCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //game.showSpace = true;
                    selectedProperties.put("SpaceOn", true);
                } else {
                    //game.showSpace = false;
                    selectedProperties.put("SpaceOn", false);
                }
                
            }

        });
        
        showSpaceCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                gameplayPanel_L_CenterMouseEntered(evt);
            }
            
        });
        
        
        
        gameplayTitleLabel.setText("<html><H2><u>Gameplay</u></H2></html>");

        rapidFireCheckBox.setText("<html><b>Rapid Fire</b></html>");
        rapidFireCheckBox.setSelected(true);
        rapidFireCheckBox.setOpaque(true);

        rapidFireCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //Player.rapidFire = true;
                    //Gameplay properties
                    selectedProperties.put("RapidFire", true);
                } else {
                    //Player.rapidFire = false;
                    //Gameplay properties
                    selectedProperties.put("RapidFire", false);
                }
                
            }

        });
        
        
        killshotCheckBox.setText("<html><b>Killshot</b></html>");
        killshotCheckBox.setSelected(true);
        killshotCheckBox.setOpaque(true);
        
        killshotCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //Display.showKillShot = true;
                    selectedProperties.put("KillShotOn", true);
                } else {
                    //Display.showKillShot = false;
                    selectedProperties.put("KillShotOn", false);
                }
                
            }

        });

        difficultyComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Easy", "Normal", "Expert", "Jedi" }));
        difficultyComboBox.setPreferredSize(new Dimension(80, 20));
        difficultyComboBox.setSelectedIndex(1);
        
        selectedProperties.put("Difficulty", "Normal");

        difficultyLabel.setText("<html><b>Difficulty:</b></html>");
        playerNameLabel.setText("<html><b>Player Name:</b></html>");
        
        invincibilityCheckBox.setText("<html><b>Invincibility</b></html>");
        invincibilityCheckBox.setOpaque(true);
        
        invincibilityCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //game.invincibility = true;
                    selectedProperties.put("Invincibility", true);
                } else {
                    //game.invincibility = false;
                    selectedProperties.put("Invincibility", false);
                }
                
            }

        });
        

        
        GroupLayout jPanel3_L_CenterLayout = new GroupLayout(gameplayPanel_L_Center);
        gameplayPanel_L_Center.setLayout(jPanel3_L_CenterLayout);
        jPanel3_L_CenterLayout.setHorizontalGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_L_CenterLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3_L_CenterLayout.createSequentialGroup()
                        .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(rapidFireCheckBox, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameplayTitleLabel)
                            .addComponent(killshotCheckBox, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(showStarsCheckBox, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                            .addComponent(showSpaceCheckBox, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))//)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3_L_CenterLayout.createSequentialGroup()
                        .addComponent(difficultyLabel, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                        .addComponent(difficultyComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3_L_CenterLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(invincibilityCheckBox, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3_L_CenterLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(playerNameLabel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                        .addComponent(playerNameTextField, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3_L_CenterLayout.setVerticalGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_L_CenterLayout.createSequentialGroup()
                .addComponent(gameplayTitleLabel)
                .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rapidFireCheckBox)
                    .addComponent(showStarsCheckBox))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(killshotCheckBox)
                    .addComponent(showSpaceCheckBox))
                .addGap(4, 4, 4)
                .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(invincibilityCheckBox))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(difficultyLabel)
                    .addComponent(difficultyComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(4, 4, 4)
                    .addGroup(jPanel3_L_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(playerNameLabel)
                    .addComponent(playerNameTextField, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
        );
        
        
        
        //Sound Panel*******************************************************
        soundPanel_R_Center = new JPanel(){
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(soundPanelImage, -315, -140, null);
            }
        };
        
        soundPanel_R_Center.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                soundPanel_R_CenterMouseEntered(evt);
            }
            
            @Override
            public void mouseExited(MouseEvent evt) {
                soundPanel_R_CenterMouseExited(evt);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

        });
        
        soundPanel_R_Center.setBackground(gameGreenCol);
        soundPanel_R_Center.setPreferredSize(smlPanelSize);

        soundTitleLabel = new JLabel();
        sfxEnabledCheckBox = new JCheckBox();
        
        //Add ItemListener to SFX checkBox
        sfxEnabledCheckBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    sfxVolumeSlider.setEnabled(true);
                    sfxVolumeSlider.setValue(50);
                    selectedProperties.put("SFXControlOn", true);
                } else {
                    sfxVolumeSlider.setValue(0);
                    sfxVolumeSlider.setEnabled(false);
                    selectedProperties.put("SFXControlOn", false);
                }
            }
        });
        
        sfxEnabledCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                soundPanel_R_CenterMouseEntered(evt);
            }
            
        });
        
        musicEnabledCheckBox = new JCheckBox();
        
        //Add ItemListener to Game Music checkBox
        musicEnabledCheckBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    musicVolumeSlider.setEnabled(true);
                    musicVolumeSlider.setValue(40);
                    selectedProperties.put("MusicControlOn", true);
                } else {
                    musicVolumeSlider.setValue(0);
                    musicVolumeSlider.setEnabled(false);
                    selectedProperties.put("MusicControlOn", false);
                }
            }
        });
        
        musicEnabledCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                soundPanel_R_CenterMouseEntered(evt);
            }
            
        });
        
        sfxVolumeSlider = new JSlider();
        
        sfxVolumeSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                sfxVolumeStateChanged(evt);
            }
        });
        
        sfxVolumeSlider.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                soundPanel_R_CenterMouseEntered(evt);
            }
            
        });
        
        musicVolumeSlider = new JSlider();
        
        musicVolumeSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                musicVolumeStateChanged(evt);
            }
        });
        
        musicVolumeSlider.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                soundPanel_R_CenterMouseEntered(evt);
            }
            
        });
        
        sfxVolumeLabel = new JLabel();
        musicVolumeLabel = new JLabel();
        
        soundTitleLabel.setText("<html><H2><u>Sound</u></H2></html>");

        
        sfxEnabledCheckBox.setText("<html>SoundFX ON</html>");
        sfxEnabledCheckBox.setSelected(true);
        sfxEnabledCheckBox.setOpaque(true);
        
        //Add ItemListener to SFX checkBox
        sfxEnabledCheckBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    selectedProperties.put("GameSoundOn", true);
                    sfxVolumeSlider.setEnabled(true);
                } else {
                    selectedProperties.put("GameSoundOn", false);
                    sfxVolumeSlider.setEnabled(false);
                }
            }
        });
        
        
        

        musicEnabledCheckBox.setText("<html>Music ON</html>");
        musicEnabledCheckBox.setSelected(true);
        musicEnabledCheckBox.setOpaque(true);
        
        //Add ItemListener to Game Music checkBox
        musicEnabledCheckBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    selectedProperties.put("GameMusicOn", true);
                    musicVolumeSlider.setEnabled(true);
                } else {
                    selectedProperties.put("GameMusicOn", false);
                    musicVolumeSlider.setEnabled(false);
                }
            }
        });
        
        

        sfxVolumeSlider.setFont(new Font("Digital-7", 1, 8)); // NOI18N
        sfxVolumeSlider.setMajorTickSpacing(10);
        sfxVolumeSlider.setMinorTickSpacing(5);
        sfxVolumeSlider.setPaintTicks(true);
        sfxVolumeSlider.setSnapToTicks(true);
        sfxVolumeSlider.setName("sfxVolumeSlider"); // NOI18N
        sfxVolumeSlider.setPreferredSize(new Dimension(80, 27));
        
        sfxVolumeSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                sfxVolumeStateChanged(evt);
            }
        });
        

        musicVolumeSlider.setFont(new Font("Dialog", 1, 8)); // NOI18N
        musicVolumeSlider.setMajorTickSpacing(10);
        musicVolumeSlider.setMinorTickSpacing(5);
        musicVolumeSlider.setPaintTicks(true);
        musicVolumeSlider.setSnapToTicks(true);
        musicVolumeSlider.setName("musicVolumeSlider"); // NOI18N
        musicVolumeSlider.setPreferredSize(new Dimension(80, 27));
        
        musicVolumeSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                musicVolumeStateChanged(evt);
            }
        });
        

        sfxVolumeLabel.setText("<html><b>SoundFX Volume:</b></html>");

        musicVolumeLabel.setText("<html><b>Music Volume:</b></html>");

        GroupLayout jPanel4_R_CenterLayout = new GroupLayout(soundPanel_R_Center);
        soundPanel_R_Center.setLayout(jPanel4_R_CenterLayout);
        jPanel4_R_CenterLayout.setHorizontalGroup(jPanel4_R_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_R_CenterLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4_R_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4_R_CenterLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4_R_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(musicVolumeSlider, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
                            .addComponent(sfxVolumeSlider, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel4_R_CenterLayout.createSequentialGroup()
                        //.addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sfxVolumeLabel))
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel4_R_CenterLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(sfxEnabledCheckBox, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(musicEnabledCheckBox, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel4_R_CenterLayout.createSequentialGroup()
                        .addComponent(soundTitleLabel)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4_R_CenterLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(musicVolumeLabel))
        );
        jPanel4_R_CenterLayout.setVerticalGroup(jPanel4_R_CenterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_R_CenterLayout.createSequentialGroup()
                .addComponent(soundTitleLabel)
                //.addGap(8, 8, 8)
                //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4_R_CenterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(sfxEnabledCheckBox)
                    .addComponent(musicEnabledCheckBox))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                //.addGap(18, 18, 18)
                .addComponent(sfxVolumeLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sfxVolumeSlider, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                //.addGap(18, 18, 18)
                .addComponent(musicVolumeLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musicVolumeSlider, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
            )//.addGap(12, 12, 12))
        );
        
        
        
        
        //Developer Panel*******************************************************
        developerPanel_Center_Bottom = new JPanel(){
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(devPanelImage, -80, -170, null);
            }
        };
        
        developerPanel_Center_Bottom.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
            @Override
            public void mouseExited(MouseEvent evt) {
                developerPanel_Center_BottomMouseExited(evt);
            }

            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            
        });
        
        developerPanel_Center_Bottom.setBackground(gameGreenCol);
        developerPanel_Center_Bottom.setPreferredSize(medPanelSize);
        
        developerTitleLabel = new JLabel();
        boundsCheckBox = new JCheckBox();
        
        boundsCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    //Display.showBounds = true;
                    selectedProperties.put("BoundsOn", true);
                } else {
                    //Display.showBounds = false;
                    selectedProperties.put("BoundsOn", false);
                }
                
            }

        });
        
        boundsCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
        gameTimeCheckBox = new JCheckBox();
        
        gameTimeCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    //Display.showGameTime = true;
                    selectedProperties.put("GameTimeOn", true);
                } else {
                    //Display.showGameTime = false;
                    selectedProperties.put("GameTimeOn", false);
                }
                
            }

        });
        
        gameTimeCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
        jCheckBox3 = new JCheckBox();
        
        jCheckBox3.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
//        jCheckBox4 = new JCheckBox();
//        
//        jCheckBox4.addMouseListener(new MouseAdapter() {
//            
//            @Override
//            public void mouseEntered(MouseEvent evt) {
//                developerPanel_Center_BottomMouseEntered(evt);
//            }
//            
//        });
        
        
        
        upsCheckBox = new JCheckBox();
        
        upsCheckBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //Game.showUPS = true;
                    selectedProperties.put("upsOn", true);
                } else {
                    //Game.showUPS = false;
                    selectedProperties.put("upsOn", false);
                }
                
            }

        });
        
        upsCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
        jCheckBox6 = new JCheckBox();
        
        jCheckBox6.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
        jCheckBox7 = new JCheckBox();
        
        jCheckBox7.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
//        jCheckBox8 = new JCheckBox();
//        
//        jCheckBox8.addMouseListener(new MouseAdapter() {
//            
//            @Override
//            public void mouseEntered(MouseEvent evt) {
//                developerPanel_Center_BottomMouseEntered(evt);
//            }
//            
//        });
        
        fpsCheckBox = new JCheckBox();
        
        fpsCheckBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //Game.showFPS = true;
                    selectedProperties.put("fpsOn", true);
                } else {
                    //Game.showFPS = false;
                    selectedProperties.put("fpsOn", false);
                }
                
            }

        });
        
        fpsCheckBox.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
        jCheckBox10 = new JCheckBox();
        
        jCheckBox10.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
        jCheckBox11 = new JCheckBox();
        
        jCheckBox11.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent evt) {
                developerPanel_Center_BottomMouseEntered(evt);
            }
            
        });
        
//        jCheckBox12 = new JCheckBox();
//        
//        jCheckBox12.addMouseListener(new MouseAdapter() {
//            
//            @Override
//            public void mouseEntered(MouseEvent evt) {
//                developerPanel_Center_BottomMouseEntered(evt);
//            }
//            
//        });
        
        //jCheckBox13 = new JCheckBox();
        //jCheckBox14 = new JCheckBox();
        //jCheckBox15 = new JCheckBox();
        //jCheckBox16 = new JCheckBox();
        restoreDefBtn = new JButton();
        creditsBtn = new JButton();
        backBtn = new JButton();
        cancelBtn = new JButton();
        saveBtn = new JButton();
        
        developerTitleLabel.setText("<html><H2><u>Developer</u></H2></html>");

        boundsCheckBox.setText("Show Bounds");
        boundsCheckBox.setOpaque(true);
        
        boundsCheckBox.addItemListener(new ItemListener() {
            
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    //Display.showBounds = true;
                    selectedProperties.put("BoundsOn", true);
                } else {
                    //Display.showBounds = false;
                    selectedProperties.put("BoundsOn", false);
                }
                
            }

        });
        
        

        gameTimeCheckBox.setText("jCheckBox2");
        gameTimeCheckBox.setOpaque(true);

        jCheckBox3.setText("jCheckBox3");
        jCheckBox3.setOpaque(true);

        //jCheckBox4.setText("jCheckBox4");
        //jCheckBox4.setOpaque(true);

        
        
        upsCheckBox.setText("Show UPS");
        upsCheckBox.setOpaque(true);
        
        upsCheckBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    //Game.showUPS = true;
                    selectedProperties.put("upsOn", true);
                } else {
                    //Game.showUPS = false;
                    selectedProperties.put("upsOn", false);
                }
                
            }

        });

        jCheckBox6.setText("jCheckBox6");
        jCheckBox6.setOpaque(true);

        jCheckBox7.setText("jCheckBox7");
        jCheckBox7.setOpaque(true);

        //jCheckBox8.setText("jCheckBox8");
        //jCheckBox8.setOpaque(true);

        
        
        fpsCheckBox.setText("Show FPS");
        fpsCheckBox.setOpaque(true);

        jCheckBox10.setText("jCheckBox10");
        jCheckBox10.setOpaque(true);

        jCheckBox11.setText("jCheckBox11");
        jCheckBox11.setOpaque(true);

        //jCheckBox12.setText("jCheckBox12");
        //jCheckBox12.setOpaque(true);

        
//        jCheckBox13.setText("jCheckBox16");
//        jCheckBox13.setOpaque(false);
//
//        jCheckBox14.setText("jCheckBox15");
//        jCheckBox14.setOpaque(false);
//
//        jCheckBox15.setText("jCheckBox14");
//        jCheckBox15.setOpaque(false);
//
//        jCheckBox16.setText("jCheckBox13");
//        jCheckBox16.setOpaque(false);

        
        
        
        //restoreDefBtn.setText("<html><b>Restore Defaults</b></html>");
        try {
            restoreDefBtn.setIcon(resizeButtonImage("/menu/restoreDef_on1.png", 138, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        restoreDefBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                restoreDefBtnMouseEntered(evt);
                developerPanel_Center_BottomMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                restoreDefBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                restoreDefBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                restoreDefBtnMouseReleased(evt);
            }
        });
        
        
        

        //creditsBtn.setText("<html><b>Credits</b></html>");
        try {
            creditsBtn.setIcon(resizeButtonImage("/menu/credits_on1.png", 100, 34, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        creditsBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                creditsBtnMouseEntered(evt);
                developerPanel_Center_BottomMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                creditsBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                creditsBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                creditsBtnMouseReleased(evt);
            }
        });
        

        try {
            backBtn.setIcon(resizeButtonImage("/menu/back_on1.png", 100, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        backBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                backBtnMouseEntered(evt);
                developerPanel_Center_BottomMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                backBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                backBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                backBtnMouseReleased(evt);
            }
        });
        

        //jButton5.setText("<html><b>Cancel</b></html>");
        try {
            cancelBtn.setIcon(resizeButtonImage("/menu/cancel_on1.png", 100, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cancelBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                cancelBtnMouseEntered(evt);
                developerPanel_Center_BottomMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                cancelBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                cancelBtnMouseReleased(evt);
            }
        });
        

        //saveBtn.setText("<html><b>Save</b></html>");
        try {
            saveBtn.setIcon(resizeButtonImage("/menu/save_on1.png", 100, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        saveBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                saveBtnMouseEntered(evt);
                developerPanel_Center_BottomMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                saveBtnMouseExited(evt);
            }
            @Override
            public void mousePressed(MouseEvent evt) {
                saveBtnMousePressed(evt);
            }
            @Override
            public void mouseReleased(MouseEvent evt) {
                saveBtnMouseReleased(evt);
            }
        });
        

        GroupLayout jPanel5_Center_BottomLayout = new GroupLayout(developerPanel_Center_Bottom);
        developerPanel_Center_Bottom.setLayout(jPanel5_Center_BottomLayout);
        jPanel5_Center_BottomLayout.setHorizontalGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                        .addComponent(restoreDefBtn, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                        .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                                .addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(creditsBtn, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(saveBtn, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                                .addComponent(developerTitleLabel)
                                //.addGap(0, 0, Short.MAX_VALUE)
                            )))
                        //.addContainerGap())
                    .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(boundsCheckBox)
                            .addComponent(gameTimeCheckBox)
                            .addComponent(jCheckBox3))
                            //.addComponent(jCheckBox4))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(upsCheckBox)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7))
                            //.addComponent(jCheckBox8))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(fpsCheckBox)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox11))
                            //.addComponent(jCheckBox12))
                        //.addGap(59, 59, 59)
                        //.addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            //.addComponent(jCheckBox16)
                            //.addComponent(jCheckBox15)
                            //.addComponent(jCheckBox14)
                            //.addComponent(jCheckBox13))
                        //.addGap(20, 20, 20)
                        )))//)
        );
        jPanel5_Center_BottomLayout.setVerticalGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                .addComponent(developerTitleLabel)
                //.addGap(8, 8, 8)
                .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                        .addComponent(boundsCheckBox)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gameTimeCheckBox)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3))
                        //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        //.addComponent(jCheckBox4))
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel5_Center_BottomLayout.createSequentialGroup()
                        .addComponent(upsCheckBox)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox7))
                        //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        //.addComponent(jCheckBox8))
                    .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5_Center_BottomLayout.createSequentialGroup()
                            .addComponent(fpsCheckBox)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox10)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox11))
                            //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            //.addComponent(jCheckBox12))
                        //.addGroup(GroupLayout.Alignment.TRAILING, jPanel5_Center_BottomLayout.createSequentialGroup()
                            //.addComponent(jCheckBox16)
                            //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            //.addComponent(jCheckBox15)
                            //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            //.addComponent(jCheckBox14)
                            //.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            //.addComponent(jCheckBox13)
                        //)
                    ))
                .addGap(8, 8, 8)
                .addComponent(restoreDefBtn, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel5_Center_BottomLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(creditsBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)//)
        );

        
        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(developerPanel_Center_Bottom, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(gameplayPanel_L_Center, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(graphicsPanel_L_Top, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(controlsPanel_R_Top, GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(soundPanel_R_Center, GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE))))
                .addGap(4, 4, 4))
        );
        mainPanelLayout.setVerticalGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(controlsPanel_R_Top, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(soundPanel_R_Center, GroupLayout.DEFAULT_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(graphicsPanel_L_Top, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(gameplayPanel_L_Center, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(developerPanel_Center_Bottom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        
        SolarFox.optionsWindow.add(mainPanel);
        mainPanel.revalidate();
        mainPanel.repaint();        
        
    }

    
    /**
     * render(Render target, Graphics2D g)
     * 
     * Renders/Repaints AboutMenu Objects
     * 
     * @param game
     * @param g
     */
    @Override
    public void render(Game game, Graphics2D g) {
    }

    
    /**
    * tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire)
    * 
    * Updates OptionsMenu Object
    * 
    * @param game - the Game of OptionsMenu
    * @param up - the up variable of OptionsMenu
    * @param down - the down variable of OptionsMenu
    * @param left - the left variable of OptionsMenu
    * @param right - the right variable of OptionsMenu
    * @param fire - the fire variable of OptionsMenu
    */
    @Override
    public void tick(Game game, boolean up, boolean down, boolean left, boolean right, boolean fire) {
        if(OMTimer > 0) {
           OMTimer--;
        }
        if(OMfirstTick) {
            OMfirstTick = false;
            System.out.println("Cue About Screen . . .");
            System.out.println("Cue Dodgy soundtrack . . .");
            if(Game.getGameSound()){
                Sound.Menu3.loop();
            }
            
            initComponents();
            
            currentMouseSense = (int)mouseSensitivitySlider.getValue();
            currentSFXVol = (int)sfxVolumeSlider.getValue();
            currentMusicVol = (int)musicVolumeSlider.getValue();
            
            SwingUtilities.updateComponentTreeUI(mainPanel);
            
            SolarFox.addOptions();
            SolarFox.setStatusBar("Options Menu");
            SolarFox.optionsWindow.validate();
            
        }
        
        SolarFox.revalidate();
    }
    
    
    
    /**
    * setConfig()
    */
    private void setConfig(){
        properties = new Properties();
        
//        config.saveConfiguration("Resolution", properties.get("Resolution").toString());
//        config.saveConfiguration("Windowed", properties.get("Windowed").toString());
//        config.saveConfiguration("Detail", properties.get("Detail").toString());
//        config.saveConfiguration("CustomWidth", properties.get("CustomWidth").toString());
//        config.saveConfiguration("CustomHeight", properties.get("CustomHeight").toString());
        
//        config.saveConfiguration("KeyControl", properties.get("KeyControl").toString());
//        config.saveConfiguration("MouseControl", properties.get("MouseControl").toString());
//        config.saveConfiguration("MouseSensitivity", properties.get("MouseSensitivity").toString());
        
//        config.saveConfiguration("RapidFire", properties.get("RapidFire").toString());
//        config.saveConfiguration("KillShot", properties.get("KillShot").toString());
//        config.saveConfiguration("ShowStars", properties.get("ShowStars").toString());
//        config.saveConfiguration("ShowSpace", properties.get("ShowSpace").toString());
//        config.saveConfiguration("Difficulty", properties.get("Difficulty").toString());
//        config.saveConfiguration("Invincibility", properties.get("Invincibility").toString());
        
//        config.saveConfiguration("SFXControlOn", properties.get("SFXControlOn").toString());
//        config.saveConfiguration("MusicControlOn", properties.get("MusicControlOn").toString());
//        config.saveConfiguration("SFXVolume", properties.get("SFXVolume").toString());
//        config.saveConfiguration("MusicVolume", properties.get("MusicVolume").toString());
        
//        config.saveConfiguration("Bounds", properties.get("Bounds").toString());
//        config.saveConfiguration("FPS", properties.get("FPS").toString());
//        config.saveConfiguration("UPS", properties.get("UPS").toString());

        JOptionPane.showMessageDialog(null, "Your Settings Have Been Saved :)\n" +
                        "Width Set to: "+parseWidth()+" pixels\n" +
                        "Height Set to: "+parseHeight()+" pixels\n" +
                        "Sky Set to: "+playerNameLabel+" Sky\n"+
                        "Player Name: "+playerNameTextField.getText());

        //dispose();
        //new Launcher(0);
    }
    
    
//    protected int parseSky() {
//        drop();
//        return selection1;
//    }

    
    /**
    * drop()
    */
    private void drop() {
        selection = resolutionComboBox.getSelectedIndex();
        if(selection == 0) {
                w = 640;
                h = 480;
        }
        if(selection == 1 || selection == -1) {
                w = 800;
                h = 600;
        }
        if(selection == 2) {
                w = 1024;
                h = 768;
        }
        if(selection == 3) {
                w = 1240;
                h = 768;
        }
//        //selection1 = skyMode.getSelectedIndex();
//        if(selection1 == 0) {//game sky
//                skySel = "Game";
//        }
//        if(selection1 == 1 || selection == -1) {//natural sky
//                skySel = "Natural";
//        }
    }
	
    
    /**
    * getSelection()
    * 
    * @return selection
    */
    public static int getSelection() {
        return selection;
    }
	
    
//    public static int getSelection1() {
//            return selection1;
//    }
	
    
    /**
    * parseWidth()
    */
    private int parseWidth() {
        try{
            w = Integer.parseInt(customWidthTextField.getText());
            return w;
        }catch(NumberFormatException e) {
            drop();
            return w;
        }
    }
	
    
    /**
    * parseHeight()
    */
    private int parseHeight() {
        try{
            h = Integer.parseInt(customHeightTextField.getText());
            return h;
        }catch(NumberFormatException e) {
            drop();
            return h;
        }
    }
    
    
    
    //Graphics Panel Functions
    private void graphicsPanel_L_TopMouseEntered(MouseEvent evt) {
        //System.out.println("Mouse Entered");
        graphicsPanelImage = graphicsPanelImage0;
        graphicsPanel_L_Top.setBorder(compound4);
        graphicsTitleLabel.setForeground(altCol);
        resolutionLabel.setForeground(altCol);
        detailLabel.setForeground(altCol);
        customHeightLabel.setForeground(altCol);
        customWidthLabel.setForeground(altCol);
        customHeightTextField.setBackground(altBGCol);
        customWidthTextField.setBackground(altBGCol);
        windowedCheckBox.setForeground(altCol);
        windowedCheckBox.setBackground(altBGCol);
        resolutionComboBox.setForeground(altCol);
        resolutionComboBox.setBackground(altBGCol);
        detailComboBox.setForeground(altCol);
        detailComboBox.setBackground(altBGCol);
        customHeightTextField.setForeground(altCol);
        customWidthTextField.setForeground(altCol);
        graphicsPanel_L_Top.repaint();
        
        SolarFox.setStatusBar("Graphics");
        
        controlsPanel_R_TopMouseExited(evt);
        gameplayPanel_L_CenterMouseExited(evt);
        soundPanel_R_CenterMouseExited(evt);
        developerPanel_Center_BottomMouseExited(evt);
    }
    
    private void graphicsPanel_L_TopMouseExited(MouseEvent evt) {
        //System.out.println("Mouse Exited");
        graphicsPanelImage = graphicsPanelImage1;
        graphicsPanel_L_Top.setBorder(compound0);
        graphicsTitleLabel.setForeground(txtCol);
        resolutionLabel.setForeground(txtCol);
        detailLabel.setForeground(txtCol);
        customHeightLabel.setForeground(txtCol);
        customWidthLabel.setForeground(txtCol);
        windowedCheckBox.setForeground(txtCol);
        windowedCheckBox.setBackground(darkCol);
        resolutionComboBox.setForeground(lightCol);
        resolutionComboBox.setBackground(Color.BLACK);
        detailComboBox.setForeground(lightCol);
        detailComboBox.setBackground(Color.BLACK);
        customHeightTextField.setForeground(txtCol);
        customWidthTextField.setForeground(txtCol);
        customHeightTextField.setBackground(darkCol);
        customWidthTextField.setBackground(darkCol);
        graphicsPanel_L_Top.repaint();
        
        //Display.setStatusBar("Options Menu");
    }

    
    //Controls Panel Functions
    private void controlsPanel_R_TopMouseEntered(MouseEvent evt) {
        controlsPanelImage = controlsPanelImage1;
        controlsPanel_R_Top.setBorder(compound4);
        controlsTitleLabel.setForeground(altCol);
        mouseSensitivityLabel.setForeground(altCol);
        mouseSensitivitySlider.setForeground(altCol);
        mouseSensitivitySlider.setBackground(altBGCol);
        keysRadioButton.setForeground(altCol);
        keysRadioButton.setBackground(altBGCol);
        mouseRadioButton.setForeground(altCol);
        mouseRadioButton.setBackground(altBGCol);
        
        //Display.setStatusBar("Controls");
        
        graphicsPanel_L_TopMouseExited(evt);
        gameplayPanel_L_CenterMouseExited(evt);
        soundPanel_R_CenterMouseExited(evt);
        developerPanel_Center_BottomMouseExited(evt);
    }
    
    private void controlsPanel_R_TopMouseExited(MouseEvent evt) {
        controlsPanelImage = controlsPanelImage0;
        controlsPanel_R_Top.setBorder(compound0);
        controlsTitleLabel.setForeground(txtCol);
        mouseSensitivityLabel.setForeground(txtCol);
        mouseSensitivitySlider.setForeground(txtCol);
        mouseSensitivitySlider.setBackground(darkCol);
        keysRadioButton.setForeground(txtCol);
        keysRadioButton.setBackground(darkCol);
        mouseRadioButton.setForeground(txtCol);
        mouseRadioButton.setBackground(darkCol);
    }
    
    
    //Gameplay Panel Functions
    private void gameplayPanel_L_CenterMouseEntered(MouseEvent evt) {
        gameplayPanelImage = gameplayPanelImage1;
        gameplayPanel_L_Center.setBorder(compound4);
        gameplayTitleLabel.setForeground(altCol);
        rapidFireCheckBox.setForeground(altCol);
        rapidFireCheckBox.setBackground(altBGCol);
        killshotCheckBox.setForeground(altCol);
        killshotCheckBox.setBackground(altBGCol);
        showStarsCheckBox.setForeground(altCol);
        showStarsCheckBox.setBackground(altBGCol);
        showSpaceCheckBox.setForeground(altCol);
        showSpaceCheckBox.setBackground(altBGCol);
        invincibilityCheckBox.setForeground(altCol);
        invincibilityCheckBox.setBackground(altBGCol);
        difficultyLabel.setForeground(altCol);
        difficultyComboBox.setForeground(altCol);
        difficultyComboBox.setBackground(altBGCol);
        
        SolarFox.setStatusBar("Gameplay");
        
        graphicsPanel_L_TopMouseExited(evt);
        controlsPanel_R_TopMouseExited(evt);
        soundPanel_R_CenterMouseExited(evt);
        developerPanel_Center_BottomMouseExited(evt);
    }
    
    private void gameplayPanel_L_CenterMouseExited(MouseEvent evt) {
        gameplayPanelImage = gameplayPanelImage0;
        gameplayPanel_L_Center.setBorder(compound0);
        gameplayTitleLabel.setForeground(txtCol);
        rapidFireCheckBox.setForeground(txtCol);
        rapidFireCheckBox.setBackground(darkCol);
        killshotCheckBox.setForeground(txtCol);
        killshotCheckBox.setBackground(darkCol);
        showStarsCheckBox.setForeground(txtCol);
        showStarsCheckBox.setBackground(darkCol);
        showSpaceCheckBox.setForeground(txtCol);
        showSpaceCheckBox.setBackground(darkCol);
        invincibilityCheckBox.setForeground(txtCol);
        invincibilityCheckBox.setBackground(darkCol);
        difficultyLabel.setForeground(txtCol);
        difficultyComboBox.setForeground(txtCol);
        difficultyComboBox.setBackground(Color.BLACK);
    }
    
    
    //Sound Panel Functions
    private void soundPanel_R_CenterMouseEntered(MouseEvent evt) {
        soundPanelImage = soundPanelImage1;
        soundPanel_R_Center.setBorder(compound4);
        soundTitleLabel.setForeground(altCol);
        sfxEnabledCheckBox.setForeground(altCol);
        sfxEnabledCheckBox.setBackground(altBGCol);
        musicEnabledCheckBox.setForeground(altCol);
        musicEnabledCheckBox.setBackground(altBGCol);
        sfxVolumeLabel.setForeground(altCol);
        sfxVolumeSlider.setForeground(altCol);
        sfxVolumeSlider.setBackground(altBGCol);
        musicVolumeLabel.setForeground(altCol);
        musicVolumeSlider.setForeground(altCol);
        musicVolumeSlider.setBackground(altBGCol);
        
        SolarFox.setStatusBar("Sound");
        
        graphicsPanel_L_TopMouseExited(evt);
        controlsPanel_R_TopMouseExited(evt);
        gameplayPanel_L_CenterMouseExited(evt);
        developerPanel_Center_BottomMouseExited(evt);
    }
    
    private void soundPanel_R_CenterMouseExited(MouseEvent evt) {
        soundPanelImage = soundPanelImage0;
        soundPanel_R_Center.setBorder(compound0);
        soundTitleLabel.setForeground(txtCol);
        sfxEnabledCheckBox.setForeground(txtCol);
        sfxEnabledCheckBox.setBackground(darkCol);
        musicEnabledCheckBox.setForeground(txtCol);
        musicEnabledCheckBox.setBackground(darkCol);
        sfxVolumeLabel.setForeground(txtCol);
        sfxVolumeSlider.setForeground(txtCol);
        sfxVolumeSlider.setBackground(darkCol);
        musicVolumeLabel.setForeground(txtCol);
        musicVolumeSlider.setForeground(txtCol);
        musicVolumeSlider.setBackground(darkCol);
    }
    
    
    //Developer Panel Functions
    private void developerPanel_Center_BottomMouseEntered(MouseEvent evt) {
        devPanelImage = devPanelImage1;
        developerPanel_Center_Bottom.setBorder(compound4);
        developerTitleLabel.setForeground(altCol);
        boundsCheckBox.setForeground(altCol);
        boundsCheckBox.setBackground(altBGCol);
        upsCheckBox.setForeground(altCol);
        upsCheckBox.setBackground(altBGCol);
        fpsCheckBox.setForeground(altCol);
        fpsCheckBox.setBackground(altBGCol);
        gameTimeCheckBox.setForeground(altCol);
        gameTimeCheckBox.setBackground(altBGCol);
        jCheckBox3.setForeground(altCol);
        jCheckBox3.setBackground(altBGCol);        
        //jCheckBox4.setForeground(altCol);
        //jCheckBox4.setBackground(altBGCol);
        jCheckBox6.setForeground(altCol);
        jCheckBox6.setBackground(altBGCol);
        jCheckBox7.setForeground(altCol);
        jCheckBox7.setBackground(altBGCol);        
        //jCheckBox8.setForeground(altCol);
        //jCheckBox8.setBackground(altBGCol);
        jCheckBox10.setForeground(altCol);
        jCheckBox10.setBackground(altBGCol);
        jCheckBox11.setForeground(altCol);
        jCheckBox11.setBackground(altBGCol);        
        //jCheckBox12.setForeground(altCol);
        //jCheckBox12.setBackground(altBGCol);
        
        //Display.setStatusBar("Developer");
        
        graphicsPanel_L_TopMouseExited(evt);
        controlsPanel_R_TopMouseExited(evt);
        gameplayPanel_L_CenterMouseExited(evt);
        soundPanel_R_CenterMouseExited(evt);
    }
    
    private void developerPanel_Center_BottomMouseExited(MouseEvent evt) {
        devPanelImage = devPanelImage0;
        developerPanel_Center_Bottom.setBorder(compound0);
        developerTitleLabel.setForeground(txtCol);
        boundsCheckBox.setForeground(txtCol);
        boundsCheckBox.setBackground(darkCol);
        upsCheckBox.setForeground(txtCol);
        upsCheckBox.setBackground(darkCol);
        fpsCheckBox.setForeground(txtCol);
        fpsCheckBox.setBackground(darkCol);
        gameTimeCheckBox.setForeground(txtCol);
        gameTimeCheckBox.setBackground(darkCol);
        jCheckBox3.setForeground(txtCol);
        jCheckBox3.setBackground(darkCol);
        //jCheckBox4.setForeground(txtCol);
        //jCheckBox4.setBackground(darkCol);
        jCheckBox6.setForeground(txtCol);
        jCheckBox6.setBackground(darkCol);
        jCheckBox7.setForeground(txtCol);
        jCheckBox7.setBackground(darkCol);
        //jCheckBox8.setForeground(txtCol);
        //jCheckBox8.setBackground(darkCol);
        jCheckBox10.setForeground(txtCol);
        jCheckBox10.setBackground(darkCol);
        jCheckBox11.setForeground(txtCol);
        jCheckBox11.setBackground(darkCol);
        //jCheckBox12.setForeground(txtCol);
        //jCheckBox12.setBackground(darkCol);
    }
    
    private void mainPanelMouseEntered(MouseEvent evt) {
        graphicsPanel_L_TopMouseExited(evt);
        controlsPanel_R_TopMouseExited(evt);
        gameplayPanel_L_CenterMouseExited(evt);
        soundPanel_R_CenterMouseExited(evt);
        developerPanel_Center_BottomMouseExited(evt);
        
        SolarFox.setStatusBar("Options Menu");
    }

    private void mainPanelMouseExited(MouseEvent evt) {
        //Display.setStatusBar("Developer");
    }
    
    
    
    
    
    //Restore Defaults Button Functions
    private void restoreDefBtnMouseEntered(MouseEvent evt) {  
        try {
            restoreDefBtn.setIcon(resizeButtonImage("/menu/restoreDef_off1.png", 138, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Restore Defaults");
    }                                     

    private void restoreDefBtnMouseExited(MouseEvent evt) {
        try {
            restoreDefBtn.setIcon(resizeButtonImage("/menu/restoreDef_on1.png", 138, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Developer");
    }                                    

    private void restoreDefBtnMousePressed(MouseEvent evt) {                                      
        try {
            restoreDefBtn.setIcon(resizeButtonImage("/menu/restoreDef_click1.png", 140, 32, BufferedImage.TYPE_INT_ARGB));
            restoreDefBtn.setBorder(compound2);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void restoreDefBtnMouseReleased(MouseEvent evt) {                                     
        try {
            restoreDefBtn.setIcon(resizeButtonImage("/menu/restoreDef_on1.png", 138, 32, BufferedImage.TYPE_INT_ARGB));
            restoreDefBtn.setBorder(compound);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        restoreDefaultSettings();
    }
    
    
    
    
    //Back Button Functions    
    private void backBtnMouseEntered(MouseEvent evt) {                                      
        try {
            backBtn.setIcon(resizeButtonImage("/menu/back_off1.png", backBtn.getWidth(), backBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Back to Main Menu");
    }                                     

    private void backBtnMouseExited(MouseEvent evt) {                                     
        try {
            backBtn.setIcon(resizeButtonImage("/menu/back_on1.png", backBtn.getWidth(), backBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Developer");
    }                                    

    private void backBtnMousePressed(MouseEvent evt) {                                    
        try {
            backBtn.setIcon(resizeButtonImage("/menu/back_click1.png", backBtn.getWidth(), backBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
            backBtn.setBorder(compound2);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void backBtnMouseReleased(MouseEvent evt) {      
        try {
            backBtn.setIcon(resizeButtonImage("/menu/back_on1.png", backBtn.getWidth(), backBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
            backBtn.setBorder(compound);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        back2MainMenu();
    }
    
    private void back2MainMenu() {
        System.out.println("Back [to Main Menu] Button Clicked!");
        SolarFox.removeOptions();
        Sound.Menu3.stop();
        
        game.requestFocus();
        game.setMenu(null);
        game.stateManager.setState("menu");
        SolarFox.setStatusBar("Ready");
        SolarFox.revalidate();
    }
    
    
    //Credits Button Functions
    private void creditsBtnMouseEntered(MouseEvent evt) {  
        try {
            creditsBtn.setIcon(resizeButtonImage("/menu/credits_off1.png", 100, 34, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Credits");
    }                                     

    private void creditsBtnMouseExited(MouseEvent evt) {                                     
        try {
            creditsBtn.setIcon(resizeButtonImage("/menu/credits_on1.png", 100, 34, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Developer");
    }                                    

    private void creditsBtnMousePressed(MouseEvent evt) {                                      
        try {
            creditsBtn.setIcon(resizeButtonImage("/menu/credits_click1.png", 102, 34, BufferedImage.TYPE_INT_ARGB));
            creditsBtn.setBorder(compound2);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void creditsBtnMouseReleased(MouseEvent evt) {                                       
        try {
            creditsBtn.setIcon(resizeButtonImage("/menu/credits_on1.png", 100, 34, BufferedImage.TYPE_INT_ARGB));
            creditsBtn.setBorder(compound);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        creditsMenu();
    }
    
    private void creditsMenu() {
        System.out.println("Credits Button Clicked!");
        SolarFox.removeOptions();
        Sound.Menu3.stop();
        
        game.setCredits();
        game.requestFocus();
        SolarFox.setStatusBar("Credits Menu");
    }
    
    
    //Save Button Functions
    private void saveBtnMouseEntered(MouseEvent evt) {                                      
        try {
            saveBtn.setIcon(resizeButtonImage("/menu/save_off1.png", saveBtn.getWidth(), saveBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Save");
    }                                     

    private void saveBtnMouseExited(MouseEvent evt) {                                     
        try {
            saveBtn.setIcon(resizeButtonImage("/menu/save_on1.png", saveBtn.getWidth(), saveBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Developer");
    }                                    

    private void saveBtnMousePressed(MouseEvent evt) {                                      
        try {
            saveBtn.setIcon(resizeButtonImage("/menu/save_click1.png", saveBtn.getWidth(), saveBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
            saveBtn.setBorder(compound2);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void saveBtnMouseReleased(MouseEvent evt) {                                       
        try {
            saveBtn.setIcon(resizeButtonImage("/menu/save_on1.png", saveBtn.getWidth(), saveBtn.getHeight(), BufferedImage.TYPE_INT_ARGB));
            saveBtn.setBorder(compound);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        saveCurrentSettings();
    }
    
    private void saveCurrentSettings() {
        System.out.println("Save [Current Settings] Button Clicked!");
    }
    
    
    
    //Cancel Button Functions
    private void cancelBtnMouseEntered(MouseEvent evt) {
        try {
            cancelBtn.setIcon(resizeButtonImage("/menu/cancel_off1.png", 100, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Cancel");
    }                                     

    private void cancelBtnMouseExited(MouseEvent evt) { 
        try {
            cancelBtn.setIcon(resizeButtonImage("/menu/cancel_on1.png", 100, 32, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Developer");
    }                                    

    private void cancelBtnMousePressed(MouseEvent evt) { 
        try {
            cancelBtn.setIcon(resizeButtonImage("/menu/cancel_click1.png", 102, 32, BufferedImage.TYPE_INT_ARGB));
            cancelBtn.setBorder(compound2);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void cancelBtnMouseReleased(MouseEvent evt) {                                       
        try {
            cancelBtn.setIcon(resizeButtonImage("/menu/cancel_on1.png", 100, 32, BufferedImage.TYPE_INT_ARGB));
            cancelBtn.setBorder(compound);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        back2MainMenu();
    }
    
    
    //Define [Keys] Button Functions
    private void defineBtnMouseEntered(MouseEvent evt) {
        try {
            defineBtn.setIcon(resizeButtonImage("/menu/define_off1.png", 100, 20, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Define Keys");
    }                                     

    private void defineBtnMouseExited(MouseEvent evt) { 
        try {
            defineBtn.setIcon(resizeButtonImage("/menu/define_on1.png", 100, 20, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Controls");
    }                                    

    private void defineBtnMousePressed(MouseEvent evt) { 
        try {
            defineBtn.setIcon(resizeButtonImage("/menu/define_click1.png", 100, 20, BufferedImage.TYPE_INT_ARGB));
            defineBtn.setBorder(compound2);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void defineBtnMouseReleased(MouseEvent evt) {                                       
        try {
            defineBtn.setIcon(resizeButtonImage("/menu/define_on1.png", 100, 20, BufferedImage.TYPE_INT_ARGB));
            defineBtn.setBorder(compound);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        defineKeys();
    }
    
    private void defineKeys() {
        System.out.println("Define Keys Button Clicked!");
        SolarFox.removeOptions();
        Sound.Menu3.stop();
        
        game.setMenu(null);
        game.stateManager.setState("menu");
        SolarFox.setStatusBar("Define Keys Menu");
    }
    
    
    //Default Keys Button Functions
    private void defKeysBtnMouseEntered(MouseEvent evt) {
        try {
            defKeysBtn.setIcon(resizeButtonImage("/menu/defKeys_off1.png", 122, 20, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Default Keys");
    }                                     

    private void defKeysBtnMouseExited(MouseEvent evt) { 
        try {
            defKeysBtn.setIcon(resizeButtonImage("/menu/defKeys_on1.png", 122, 20, BufferedImage.TYPE_INT_ARGB));
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        SolarFox.setStatusBar("Controls");
    }                                    

    private void defKeysBtnMousePressed(MouseEvent evt) { 
        try {
            defKeysBtn.setIcon(resizeButtonImage("/menu/defKeys_click1.png", 124, 20, BufferedImage.TYPE_INT_ARGB));
            defKeysBtn.setBorder(compound2);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void defKeysBtnMouseReleased(MouseEvent evt) {                                       
        try {
            defKeysBtn.setIcon(resizeButtonImage("/menu/defKeys_on1.png", 122, 20, BufferedImage.TYPE_INT_ARGB));
            defKeysBtn.setBorder(compound);
        } catch (IOException ex) {
            Logger.getLogger(OptionsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private ImageIcon resizeButtonImage(String btnImagePath, int width, int height, int type) throws IOException {

        BufferedImage btnImage = ImageIO.read(OptionsMenu.class.getResource(btnImagePath));
        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(btnImage, 0, 0, width, height, null);
        g.dispose();

        return new ImageIcon(resizedImage);
    }
    
    
    

    

    

    

    private void restoreDefaultSettings() {
        System.out.println("Restore Default [Settings] Button Clicked!");
    }

    private void mouseSensitivityStateChanged(ChangeEvent evt) {
        JSlider source = (JSlider)evt.getSource();
        
        if(!source.getValueIsAdjusting()) {
            
            int vol = (int)source.getValue();
            
                if (vol > currentMouseSense){
                    decreaseMouseSensitivity();
                } 
                if(vol < currentMouseSense) {
                    increaseMouseSensitivity();
                }
                                
                currentMouseSense = (int)source.getValue();
                selectedProperties.put("MouseSensitivity", currentMouseSense);
        }
    }

    private void sfxVolumeStateChanged(ChangeEvent evt) {
        JSlider source = (JSlider)evt.getSource();
        
        if(!source.getValueIsAdjusting()) {
            
            int vol = (int)source.getValue();
            
                if (vol > currentSFXVol){
                    decreaseSFXVolume();
                } 
                if(vol < currentSFXVol) {
                    increaseSFXVolume();
                }
                                
                currentSFXVol = (int)source.getValue();
                
                selectedProperties.put("SFXVolume", currentSFXVol);
        }
    }

    private void musicVolumeStateChanged(ChangeEvent evt) {
        JSlider source = (JSlider)evt.getSource();
        
        if(!source.getValueIsAdjusting()) {
            
            int vol = (int)source.getValue();
            
                if (vol > currentMusicVol){
                    decreaseMusicVolume();
                } 
                if(vol < currentMusicVol) {
                    increaseMusicVolume();
                }
                                
                currentMusicVol = (int)source.getValue();
                
                selectedProperties.put("MusicVolume", currentMusicVol);
        }
    }

    private void increaseMouseSensitivity() {
        
    }

    private void decreaseMouseSensitivity() {
        
    }

    private void increaseSFXVolume() {
        
    }

    private void decreaseSFXVolume() {
        
    }

    private void increaseMusicVolume() {
        
    }

    private void decreaseMusicVolume() {
        
    }
    
    
}
