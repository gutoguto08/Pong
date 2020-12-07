package com.mycompany.pong;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Ball extends JPanel {
	
	private static final int WIDTH = Game.WIDTH/25, HEIGHT = Game.HEIGHT/25;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g.setColor(Color.red);
		g.fillOval(50, 50, 10, 10);
	}
	
	public Ball () {
		
		super.setDoubleBuffered(true);
		super.setBounds(0, 0, Game.WIDTH, Game.HEIGHT);
	}
}
