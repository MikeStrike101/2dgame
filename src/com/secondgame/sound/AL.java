package com.secondgame.sound;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.IOException;

import com.secondgame.Handler;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class AL  {
	
	
	
	public static void music()
	{
		AudioPlayer MP = AudioPlayer.player;
		AudioStream BGM;
		
		ContinuousAudioDataStream loop=null;
		
		try {
			BGM=new AudioStream(new FileInputStream("sound.wav"));
			MP.start(BGM);
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		MP.start(loop);
	}
	
}
