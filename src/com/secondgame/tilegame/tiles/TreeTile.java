package com.secondgame.tilegame.tiles;

import java.awt.image.BufferedImage;

import com.secondgame.gfx.Assets;

public class TreeTile extends Tile {

	public TreeTile( int id) {
		super(Assets.tree, id);
		
	}
public boolean isSolid()
{
	return false;
}
	
	
}
