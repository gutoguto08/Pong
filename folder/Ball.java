package com.mycompany.pong;

import java.awt.Graphics;

public class Ball extends Object{
	
	public static final int BALL_WIDTH = Game.WIDTH/25, BALL_HEIGHT = Game.HEIGHT/25;
	
	public Ball() {
		this.x = Game.WIDTH/2-WIDTH/2;
		this.y = Game.HEIGHT/2-HEIGHT/2;
	}
	
	public void update() {
		updateLocation();
		checkCollisionWithSides();
		checkVictoryConditions();
		checkCollisionWithRackets();
	}
	
	private void updateLocation() {
		this.x += xV;
		this.y += yV;
	}
	
	private void checkCollisionWithSides() {
		
	}
	
	private void checkVictoryConditions() {
		
	}
	
	private void checkCollisionWithRackets() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawOval(x, y, WIDTH, HEIGHT);
	}
}
