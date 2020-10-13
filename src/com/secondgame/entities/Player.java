package com.secondgame.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.secondgame.Handler;
import com.secondgame.gfx.Animation;
import com.secondgame.gfx.Assets;

public class Player extends Creature {
	
	
	private Animation animLeft,animRight,animIdle,animJump,animAttack;
	
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 16;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 32;
		
		animLeft=new Animation(500,Assets.player_walkleft);
		animRight=new Animation(500,Assets.player_walkright);
		animIdle=new Animation(500,Assets.player_idle_test);
		animJump=new Animation(500,Assets.player_jump);
		animAttack=new Animation(500,Assets.player_attack);
	}

	@Override
	public void tick() {
		animLeft.tick();
		animRight.tick();
		animIdle.tick();
		animJump.tick();
		animAttack.tick();
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
	
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
		//g.setColor(Color.red);
	//	g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
			//	(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
			//	bounds.width, bounds.height);
	}
	private BufferedImage getCurrentAnimationFrame()

	{ 
		
		if(xMove<0)
		{
			
			return animLeft.getCurrentFrame();
		}
		else if(xMove>0)
		{
			return animRight.getCurrentFrame();
		}
		else if(handler.getKeyManager().jump)
			return animJump.getCurrentFrame();
		else return animIdle.getCurrentFrame();
		
		
	}
}