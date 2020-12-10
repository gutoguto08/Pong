package com.mycompany.pong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paddle extends Object implements ActionListener {
	
	public static final int PADDLE_WIDTH = Game.WIDTH/3, PADDLE_HEIGHT = Game.HEIGHT/25;
	
	public Paddle(int x, int y) {
		
	}
	
	public Paddle() {
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
