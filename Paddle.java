package com.mycompany.pong;

public class Paddle {
	
	private int x, y, xV, yV;
	public static final int WIDTH = Game.WIDTH/3, HEIGHT = Game.HEIGHT/25;
	
	public Paddle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Paddle() {
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
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
