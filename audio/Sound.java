package com.LOGamez.audio;

import com.LOGamez.SolarFox2023.SolarFox2023;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.*;

/**
 * Sound objects represent the sounds & sfx in the game
 * 
 * @author(s) Ghomez
 */
public final class Sound implements LineListener {   
    

    /**Attributes*/
        
    /**clip Audioclip of Sound*/
    private AudioClip clip;

    /**clip1 Clip of Sound*/
    private static Clip clip1;
    
    
    //Menu sfx
    /**Launcher variable of Sound*/
    public static Sound Launcher = new Sound("/No Monkey.wav");
    
    /**sound5 variable of Sound*/
    public static final Sound sound5 = new Sound("/Pickup_Coin2.wav", 0.5);
    
    /**Paused variable of Sound*/
    public static final Sound Paused = new Sound("/pause.wav");
    
    /**Focus variable of Sound*/
    public static final Sound Focus = new Sound("/SI2015 LostFocus.wav");
    
    /**btnPushed variable of Sound*/
    public static final Sound btnPushed = new Sound("/select.wav");
        
    
    //Game Soundtracks 
    /**Soundtrack variable of Sound*/
    //public static final Sound Soundtrack = new Sound("/Hit N Hide - Space invaders 2013 short.wav");
    
    /**creditsSoundtrack variable of Sound*/
    public static final Sound creditsSoundtrack = new Sound("/credits.wav");
    
    /**creditsSoundtrack variable of Sound*/
    public static final Sound creditsSoundtrackA = new Sound("/creditsB.wav");
    
    
    //Menu Sounds
    /**Menu variable of Sound*/
    public static final Sound Menu = new Sound("/menuStart.wav");
    
    /**Menu1 variable of Sound*/
    public static final Sound Menu1 = new Sound("/Fiddly music.wav");
    
    /**Menu2 variable of Sound*/
    public static final Sound Menu2 = new Sound("/Game Ambient Forest loop.wav");
    
    /**Menu3 variable of Sound*/
    public static final Sound Menu3 = new Sound("/Retro1 140.wav");
    
    /**Menu3 variable of Sound*/
    public static final Sound Menu4 = new Sound("/chargingCannons_RemixA.wav");
    
    
    //Level Sounds
    /**LevelStart variable of Sound*/
    public static final Sound LevelStart = new Sound("/levelStart.wav");
    
    /**LevelComplete variable of Sound*/
    public static final Sound LevelComplete = new Sound("/levelComplete.wav");
    
    /**endOfLevel variable of Sound*/
    public static Sound endOfLevel = new Sound("/levelComplete.wav");
    
    /**Level1 variable of Sound*/
    public static final Sound Level1 = new Sound("/select1.wav");
    
    /**Level2 variable of Sound*/
    public static final Sound Level2 = new Sound("/pause1.wav");
    
    /**Level3 variable of Sound*/
    public static final Sound Level3 = new Sound("/levelComplete1.wav");
    
    /**Level4 variable of Sound*/
    public static final Sound Level4 = new Sound("/Power Bots Loop.wav");
    
    /**Level5 variable of Sound*/
    public static final Sound Level5 = new Sound("/Retro1 140.wav");
    
    /**Level6 variable of Sound*/
    public static final Sound Level6 = new Sound("/Star Commander1.wav");
    
    /**Level7 variable of Sound*/
    public static final Sound Level7 = new Sound("/Traveler.wav");
    
    /**Level8 variable of Sound*/
    public static final Sound Level8 = new Sound("/No Monkey.wav");
    
    /**Level9 variable of Sound*/
    public static final Sound Level9 = new Sound("/Androids.wav");
        
    
    //Ingame Sprite sounds
    /**P1Shoot variable of Sound*/
    public static final Sound P1Shoot = new Sound("/shoot.wav");
    
    /**EnShoot variable of Sound*/
    public static final Sound EnShoot = new Sound("/fire.wav");
    
    /**P1Shoot variable of Sound*/
    public static final Sound P1ShootCannon = new Sound("/laserPistol.wav");
    
    /**P1Exp variable of Sound*/
    public static final Sound P1Exp = new Sound("/explosion.wav");
    
    /**P1Collect variable of Sound*/
    public static final Sound P1Collect = new Sound("/collect.wav");
    
    /**EnExp variable of Sound*/
    public static final Sound EnExp = new Sound("/invaderkilled.wav");
    
    /**UFOsnd variable of Sound*/
    public static final Sound UFOsnd = new Sound("/ufo_highpitchA.wav");
    
    /**UFOsndA variable of Sound*/
    public static final Sound UFOsndA = new Sound("/ufo_lowpitchA.wav");
    
    /**ricochet variable of Sound*/
    public static final Sound ricochet = new Sound("/ricochet.wav");
    
    /**EnMove variable of Sound*/
    public static final Sound EnMove = new Sound("/fastinvader1.wav");
    
    /**extraLife variable of Sound*/
    public static final Sound extraLife = new Sound("/extraLife.wav");
    
    /**chargeCannon variable of Sound*/
    public static final Sound chargeCannon = new Sound("/chargingCannons.wav");
    
    /**shieldOn variable of Sound*/
    public static final Sound shieldOn = new Sound("/shieldsOn.wav");
    
    /**shieldOn variable of Sound*/
    public static final Sound shieldDown = new Sound("/shieldsDown.wav");
    
    /**shieldOn variable of Sound*/
    public static final Sound speedOn = new Sound("/speedOn.wav");
    
    
    /**soundFile File of Sound*/
    private File soundFile;
    
    /**ai AudioInputStream of Sound*/
    private AudioInputStream ai;
    
    /**format AudioFormat of Sound*/
    private AudioFormat format;
    
    /**info DataLine.Info of Sound*/
    private DataLine.Info info;
    
    /**aClip Clip of Sound*/
    private Clip aClip;
    
    /**playing boolean of Sound*/
    private boolean playing;
    
    /**gainControl FloatControl of Sound*/
    private FloatControl gainControl;
    
    /**fileName variable of Sound*/
    private String fileName;
    
    /**audioFileName variable of Sound*/
    private String audioFileName;
    
    
    
    /**Constructors*/
        
    
    /**
    * Sound(String filename, double vol)
    * 
    * Initialises a new Sound object with 
    * (Sound file) filename as the argument
    * 
    * @param filename - the filename variable of Sound object
    * @param vol - the vol variable of Sound object
    */    
    public Sound(String filename, double vol){
        audioFileName = filename;
        soundFile = new File("snd"+filename);
        
        Clip oldSnd = SolarFox2023.sndMap.get(filename);
        if(oldSnd != null){
            this.aClip = oldSnd;
        } else {
            try{
                System.out.println("Loading Sound: "+SolarFox2023.soundCount+": " + audioFileName);
                ai = AudioSystem.getAudioInputStream(soundFile);
                format = ai.getFormat();
                info = new DataLine.Info(Clip.class, format);
                aClip = (Clip) AudioSystem.getLine(info);
                aClip.addLineListener(this);
                aClip.open(ai);
                gainControl = (FloatControl) aClip.getControl(FloatControl.Type.MASTER_GAIN);
                setVolume(vol);
                SolarFox2023.sndMap.put(filename, aClip);
                SolarFox2023.soundCount++;
            } catch(Exception e){
            }
        }
    }
	
    
    /**
    * Sound(String filename)
    * 
    * Initialises a new Sound object with 
    * (Sound file) filename as the argument
    * 
    * @param filename - the filename variable of Sound object
    */    
    public Sound(String filename){
        this.fileName = filename;
        AudioClip oldAudio = SolarFox2023.audioMap.get(filename);
        if(oldAudio != null){
            this.clip = oldAudio;
        } else {
            try{
                System.out.println("Loading Audio: "+SolarFox2023.audioCount+": "+"/snd"+ filename);
                clip = Applet.newAudioClip(Sound.class.getResource("/snd"+filename));
                SolarFox2023.audioMap.put(filename, clip);
                SolarFox2023.audioCount++;
            } catch (Exception e) {
            }
        }
    }
    
    
    
    /**Public Protocol*/
           
    
    
    /**
     * finalize()
     * 
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        if(!fileName.isEmpty()){ 
            SolarFox2023.sndMap.remove(fileName);
            System.out.println("Removing Sound from memory: " + fileName);
        }
        if(!audioFileName.isEmpty()){ 
            SolarFox2023.audioMap.remove(audioFileName);
            System.out.println("Removing Audio from memory: " + audioFileName);
        }
        super.finalize();
    }
    
    
    /**
    * play()
    * 
    * Plays reciever Sound object.
    */
    public void play(){
        if(aClip != null){
            aClip.stop();
            aClip.start();
            playing = true;
        }
	try{
            if (clip != null) {
		new Thread(){
                    @Override
                    public void run(){
			synchronized (clip) {
				clip.stop();
				clip.play();
			}					
                    }
		}.start();
            }
	}catch(Exception ex){
	}		
    }

    
    /**
    * stop()
    * 
    * Stops reciever Sound object.
    */
    public void stop() {
	try{
            clip.stop();
	} catch(Exception exc){
	}
    }
    
    
    /**
    * stopAll()
    * 
    * Stops All Sound object.
    */
    public static void stopAll() {
        Sound.Level1.stop();
        Sound.Level2.stop();
        Sound.Level3.stop();
        Sound.Level4.stop();
        Sound.Level5.stop();
        Sound.Level6.stop();
        Sound.Level7.stop();
        Sound.Level8.stop();
        Sound.Level9.stop();
        //Sound.Soundtrack.stop();
        Sound.creditsSoundtrack.stop();
        Sound.Paused.stop();
        Sound.Menu1.stop();
        Sound.Menu2.stop();
        Sound.Menu3.stop();
        Sound.Menu4.stop();
        Sound.UFOsnd.stop();
        Sound.UFOsndA.stop();
        Sound.EnMove.stop();
        Sound.EnExp.stop();
        Sound.Focus.stop();
        Sound.Launcher.stop();
        Sound.ricochet.stop();
        Sound.sound5.stop();
    }

    
    /**
    * loop()
    * 
    * Loops reciever Sound object.
    */
    public void loop(){
    	try{
            if (clip != null) {
		new Thread(){
                    @Override
                    public void run(){
			synchronized (clip) {
				clip.stop();
				clip.loop();
			}
                    }
		}.start();
            }
	}catch(Exception ex2){
	}
    }
        

    /**
    * setVolume(double vol)
    * 
    * Sets Volume of reciever Sound object.
    * 
    * @param vol - the volume variable of Sound object
    */
    private void setVolume(double vol) {
        float db = (float) (Math.log(vol) / Math.log(10) * 20);
        gainControl.setValue(db); // Reduce volume by 10 decibels.
    }

    
    /**
    * update(LineEvent le)
    * 
    * Updates reciever Sound object.
    * 
    * @param le
    */
    @Override
    public void update(LineEvent le) {
        if(le.getType() == LineEvent.Type.START){
            playing = true;
        } else if(le.getType() == LineEvent.Type.STOP){
            aClip.stop();
            aClip.flush();
            aClip.setFramePosition(0);
            playing = false;
        }
    }
    
    
    /**
    * isPlaying()
    * 
    * @return playing
    */
    public boolean isPlaying() {
        return playing;
    }
 
    
    /**
    * reloopLevel(int levelNo)
    * 
    * @param levelNo
    */
    public static void reloopLevel(int levelNo) {
        
        switch(levelNo){
            case 1:
                Sound.Level1.loop();
                break;
            case 2:
                Sound.Level2.loop(); 
                break;
            case 3:
                Sound.Level3.loop();
                break;
            case 4:
                Sound.Level4.loop();
                break;
            case 5:
                Sound.Level5.loop();
                break;
            case 6:
                Sound.Level6.loop();
                break;
            case 7:
                Sound.Level7.loop();
                break;
            case 8:
                Sound.Level8.loop();
                break;
            case 9:
                Sound.Level9.loop();
                break;
        }
                
    }
}