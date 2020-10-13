package com.secondgame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
private static final int width=32,height=32;
	
	public static BufferedImage dirt,grass,stone,bush,tree,house,player_idle;
	public static BufferedImage[] player_walkleft,player_walkright,player_idle_test,player_jump,player_attack;
	
	public static void init()
	{
		SpriteSheet sheet=new SpriteSheet(ImageLoader.loadImage("res/textures/sheet5.png"));
		SpriteSheet sheet2=new SpriteSheet(ImageLoader.loadImage("res/textures/sheet.png"));
		SpriteSheet sheet3=new SpriteSheet(ImageLoader.loadImage("res/textures/running sheet.png"));
		SpriteSheet sheet4=new SpriteSheet(ImageLoader.loadImage("res/textures/running sheet 2.png"));
		SpriteSheet sheet5=new SpriteSheet(ImageLoader.loadImage("res/textures/jump sheet.png"));
		SpriteSheet sheet6=new SpriteSheet(ImageLoader.loadImage("res/textures/attack sheet.png"));
		
		player_walkleft=new BufferedImage[6];
		player_walkright=new BufferedImage[6];
		player_idle_test=new BufferedImage[4];
		player_jump=new BufferedImage[4];
		player_attack=new BufferedImage[4];
		
		player_walkleft[0]=sheet4.crop(0, 0, 64,64);
		player_walkleft[1]=sheet4.crop(64, 0, 64,64);
		player_walkleft[2]=sheet4.crop(128, 0, 64,64);
		player_walkleft[3]=sheet4.crop(0, 64, 64,64);
		player_walkleft[4]=sheet4.crop(64, 64, 64,64);
		player_walkleft[5]=sheet4.crop(128, 64, 64,64);
		
		player_attack[0]=sheet6.crop(0, 0, 64, 64);
		player_attack[1]=sheet6.crop(64, 0, 64, 64);
		player_attack[2]=sheet6.crop(0, 64, 64, 64);
		player_attack[3]=sheet6.crop(64, 64, 64, 64);
		
		player_walkright[0]=sheet3.crop(0, 0, 64,64);
		player_walkright[1]=sheet3.crop(64, 0, 64,64);
		player_walkright[2]=sheet3.crop(128, 0, 64,64);
		player_walkright[3]=sheet3.crop(0, 64, 64,64);
		player_walkright[4]=sheet3.crop(64, 64, 64,64);
		player_walkright[5]=sheet3.crop(128, 64, 64,64);
		
		//player_idle=sheet2.crop(0,0,64,64);
		player_jump[0]=sheet5.crop(0, 0, 64, 64);
		player_jump[1]=sheet5.crop(64, 0, 64, 64);
		player_jump[2]=sheet5.crop(0, 64, 64, 64);
		player_jump[3]=sheet5.crop(64, 64, 64, 64);
		
		
		player_idle_test[0]=sheet2.crop(0,0,64,64);
		player_idle_test[1]=sheet2.crop(64, 0, 64, 64);
		player_idle_test[2]=sheet2.crop(0, 64, 64, 64);
		player_idle_test[3]=sheet2.crop(64, 64, 64, 64);
		
		house=sheet.crop(0, 0, width, height);
		//player=sheet.crop(0, height*2, 32, 32);
		dirt=sheet.crop(width, 0, width, height);
		bush=sheet.crop(width*2, 0, width, height);
		stone=sheet.crop(width*3, 0, width, height);
		grass=sheet.crop(0, height, width, height);
		tree=sheet.crop(width, height, width, height);
				
	}
	
	
}
