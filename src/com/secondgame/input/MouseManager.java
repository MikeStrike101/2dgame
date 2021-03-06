package com.secondgame.input;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener,MouseMotionListener {


	
	private boolean leftPressed,rightPressed;
	private int mouseX,mouseY;
	private boolean[] buttons;
	public boolean leftclick,rightclick;
	public MouseManager()
	{
		
			buttons=new boolean[256];
	}
	 public void tick()
	 {
		 leftclick=buttons[MouseEvent.BUTTON1];
		 rightclick=buttons[MouseEvent.BUTTON3];
		 
	 }
	public boolean isLeftPressed()
	{
		return leftPressed;
	}
	public boolean isRightPressed()
	{
		return rightPressed;
	}
	
	public int getMouseX() {
		return mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseMoved(MouseEvent e) {
	mouseX=e.getX();
	mouseY=e.getY();
		
	}


	public void mouseClicked(MouseEvent e) {
		buttons[e.getButton()]=true;
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1)
			leftPressed=true;
		else if(e.getButton()==MouseEvent.BUTTON3)
			rightPressed=true;
		
	}


	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1)
			leftPressed=false;
		else if(e.getButton()==MouseEvent.BUTTON3)
			rightPressed=false;
		buttons[e.getButton()]=false;
	}

	
	
	
}
