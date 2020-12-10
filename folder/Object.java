package com.mycompany.pong;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Object extends JPanel {
	public int x, y, xV, yV;
	
	public Object(int x, int y) {
		this.x = x;
		this.y = y;
		this.xV = 0;
		this.yV = 0;
	}
	
	public Object() {
		this.x = 0;
		this.y = 0;
		this.xV = 0;
		this.yV = 0;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawRect(x, y, WIDTH, HEIGHT);
	}
}
