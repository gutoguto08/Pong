package com.mycompany.pong;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Contents extends JPanel {
	
	private static final int MAX_PLAYERS = 4;
	private int playersPlaying = 2;
	
	private final int[][] paddleCoordinates = new int[MAX_PLAYERS][2];
	
	private static final Ball ball = new Ball();
	private static final Paddle[] paddles = new Paddle[MAX_PLAYERS];
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.fillOval(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
		
		for (int i = 0; i < playersPlaying; ++i)
		g.fillRect(paddles[i].getX(), paddles[i].getY(), paddles[i].WIDTH, paddles[i].HEIGHT);
	}
	
	public void setCoordinates() {
		int x = Game.WIDTH/2, y = 0;
		for (int i = 0; i < paddleCoordinates.length; ++i) {
			// 250,0 250,500 0,250 500,250
			paddleCoordinates[i][0] = x;
			paddleCoordinates[i][1] = y;
			
			if (x == Game.WIDTH/2 && y == 0) {
				y = Game.HEIGHT;
			} else if (y == Game.HEIGHT/2 && x == 0) {
				x = Game.WIDTH;
			} else {
				if (x == Game.WIDTH) {
					x = Game.WIDTH/2;
					y = 0;
				} else {
					x = 0;
					y = Game.HEIGHT/2;
				}
			}
		}
	}
	
	public void setPaddles() {
		for (int i = 0; i < playersPlaying; ++i) {
			if (paddleCoordinates[i][0]==0)
			paddles[i].setX(paddleCoordinates[i][0]);
			else
			paddles[i].setX(paddleCoordinates[i][0]-Paddle.WIDTH/2);
			
			if (paddleCoordinates[i][1]==0)
			paddles[i].setY(paddleCoordinates[i][1]);
			else
			paddles[i].setY(paddleCoordinates[i][1]-Paddle.HEIGHT/2);
			
			System.out.println(paddles[i].getX() + ", " + paddles[i].getY());
		}
	}
	
	public void setNumberOfPlayersPlaying(int n) {
		this.playersPlaying = n;
	}
			
	public Contents () {
		for (int i = 0; i < paddles.length; ++i)
		paddles[i] = new Paddle();
		
		super.setBounds(0, 0, Game.WIDTH, Game.HEIGHT);
		super.setDoubleBuffered(true);
		
	}
	
}
