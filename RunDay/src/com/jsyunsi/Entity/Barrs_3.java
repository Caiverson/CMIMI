package com.jsyunsi.Entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.jsyunsi.JFrame.GameFrame;

public class Barrs_3 {
	BufferedImage image;
	int x,y;
	int xSpeed;
	public static final int WIDTH = 40;
	public static final int HEIGHT = 130;
	Random random = new Random();
	public Barrs_3() {
		xSpeed = 2;
		y = 0;
		x = GameFrame.WIDTH + random.nextInt(700);
		
		
		
		try {
			image = ImageIO.read(new File("image/"+(11+random.nextInt(4))+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void step() {
		x -= xSpeed;
	}
	public void paintBarrs_3(Graphics g) {
		g.drawImage(image, x, y, WIDTH, HEIGHT, null);
	}
	public boolean outOfBounds() {
		return x <= -WIDTH;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public Random getRandom() {
		return random;
	}
	public void setRandom(Random random) {
		this.random = random;
	}
	public static int getWidth() {
		return WIDTH;
	}
	public static int getHeight() {
		return HEIGHT;
	}
	
}
