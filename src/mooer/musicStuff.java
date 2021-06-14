/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Evistix
 */
public class musicStuff {
    void playMusic(String musicLocation){
	try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else{
                }
	}
	catch(Exception ex){
                   ex.printStackTrace();
	}
    }
}

class play{//播放音乐
    play(){
        String filepath = "music/m2.wav";
        musicStuff musicObject = new musicStuff();
        musicObject.playMusic(filepath);
    }
     
}
