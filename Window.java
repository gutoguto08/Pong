package com.mycompany.pong;

import javax.swing.JFrame;

public class Window {
	
	private final JFrame frame = new JFrame();
	private static final Ball ball = new Ball();
	private static final Paddle paddle1 = new Paddle(),  paddle2 = new Paddle();
	
	public Window (int width, int height) {
		frame.setTitle("Pong Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		frame.add(ball);
		frame.add(paddle1);
		frame.add(paddle2);
	}
	
	public void update() {
		frame.repaint();
	}
}
