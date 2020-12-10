package com.mycompany.pong;

public class Ball {
	
	private int x, y, xV, yV, rotation;
	private final int width = Game.WIDTH/25, height = Game.HEIGHT/25;
	
	public Ball(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.rotation = r;
	}
	
	public Ball() {
		this.x = Game.WIDTH/2-width/2;
		this.y = Game.HEIGHT/2-height/2;
		this.rotation = 0;
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
	
	public int getRotation() {
		return rotation;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
