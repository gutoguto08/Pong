package com.mycompany.pong;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Window implements ActionListener {
	
	private final JFrame frame = new JFrame();
	private static final Contents container = new Contents();
	
	public Window (int width, int height) {
		frame.setTitle("Pong Game");
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setSize(width, height);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.setVisible(true);
		
		container.setNumberOfPlayersPlaying(2);
		container.setCoordinates();
		container.setPaddles();
		
		frame.add(container);
	}
	
	public void update() {
		frame.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
