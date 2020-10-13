package com.secondgame.tilegame.tiles;

import com.secondgame.gfx.Assets;

public class BushTile extends Tile{
	public BushTile(int id) {
		super(Assets.bush, id);
		
	}
	
	@Override
	public boolean isSolid()
	{
		return true;
	}
}
