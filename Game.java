package com.mycompany.pong;

import java.util.logging.Logger;


public class Game implements Runnable {
	
	private Thread thread;
	Window window;
	private boolean running = false;
	private final double UPDATE_CAP = 1.0/60.0;
	public static final int WIDTH = 400, HEIGHT = 400;
	
	enum Level {
		EASY,
		HARD,
		IMPOSSIBLE
	}
	
	public static void main(String[] args) {
		final Game game = new Game();
		game.start();
	}
	
	public void start() {
		window = new Window(WIDTH, HEIGHT);
		
		thread = new Thread(this);
		thread.run();
	}
	
	@Override
	public void run() {
		running = true;
		boolean render = false;
		
		double firstTime;
		double lastTime = System.nanoTime() / 1.0E9; // To Milliseconds
		double passedTime;
		double unprocessedTime = 0;
		
		double frameTime = 0;
		int frames = 0, fps;
		
		while (running) {
			render = false;
			
			firstTime = System.nanoTime() / 1.0E9; // To Milliseconds
			passedTime = firstTime - lastTime;
			lastTime = firstTime;
			
			unprocessedTime += passedTime;
			frameTime += passedTime;
			
			while (unprocessedTime >= UPDATE_CAP) {
				unprocessedTime -= UPDATE_CAP;
				render = true;
				
				if (frameTime >= 1.0) {
					frameTime = 0;
					fps = frames;
					frames = 0;
					System.out.println("FPS: " + fps);
					
				}
				
				//TODO: update game
			}
			
			if (render) {
				//TODO: render game
				
				window.update();
				
				++frames;
			}
			else {
				try {
					Thread.sleep(1);
				} catch (InterruptedException ex) {
					Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}
			}
		}
		dispose();
	}
	
	public void dispose() {
		
	}
	
}
