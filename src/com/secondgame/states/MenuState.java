package com.secondgame.states;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.secondgame.Handler;

public class MenuState extends State{

	public MenuState(Handler handler)
	{  super(handler);
		this.handler=handler;
	}
	
	
	@Override
	public void tick() {
		//System.out.println(handler.getMouseManager().getMouseX() + "    " + handler.getMouseManager().getMouseY());
		if(handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed())
			State.setState(handler.getGame().gameState);
	}

	@Override
	public void render(Graphics g) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new FileInputStream("res/textures/startmenu.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.setColor(Color.RED);
		g.drawImage(image, 1280,720,null);
		g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 10, 10);
		
	}

	
	
}
