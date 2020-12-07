package com.mycompany.pong;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paddle extends JPanel {
	
	private static final int WIDTH = Game.WIDTH/10, HEIGHT = Game.HEIGHT/25;
	private static final int MAX_VELOCITY = 5;
	private int velocityX = 0, velocityY = 0;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.fillRect(100, 100, WIDTH, HEIGHT);
	}
	
	public Paddle () {
		super.setDoubleBuffered(true);
		super.setBounds(0, 0, Game.WIDTH, Game.HEIGHT);
	}
}
