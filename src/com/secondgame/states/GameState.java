package com.secondgame.states;


import java.awt.Graphics;

import com.secondgame.Handler;
import com.secondgame.entities.Player;
import com.secondgame.entities.statics.Tree;
import com.secondgame.world.World;

public class GameState extends State {
	
	
	private World world;
	
	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
	
		
	}
	
	@Override
	public void tick() {
		world.tick();
		
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	
		
	}

}