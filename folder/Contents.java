package com.mycompany.pong;

public class Contents {
	
	private static final int MAX_PLAYERS = 4, DEFAULT_PLAYERS = 2;
	
	private static Ball ball;
	private static Paddle[] paddles;
			
	public Contents () {
		ball = new Ball();
		paddles = new Paddle[MAX_PLAYERS];
	}
	
}
