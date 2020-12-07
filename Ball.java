package com.mycompany.pong;

public class Ball {
	
	private int x, y, xV, yV;
	private final int width = Game.WIDTH/25, height = Game.HEIGHT/25;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Ball() {
		x = Game.WIDTH/2-width/2; y = Game.HEIGHT/2-height/2;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getXVelocity() {
		return xV;
	}
	
	public int getYVelocity() {
		return yV;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
