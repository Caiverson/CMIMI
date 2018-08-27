package com.jsyunsi.Entity;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.jsyunsi.JFrame.GameFrame;

public class Yunti {
	int x,y;
	int xSpeed;
	public static final int WIDTH = 90;
	public static final int HEIGHT = 20;
	Random random = new Random();
	Image image;
	
	
	public Yunti() {
		x = GameFrame.WIDTH + random.nextInt(760);
		y = random.nextInt(230)+80;
		xSpeed = 1;
		try {
			image = ImageIO.read(new File("image/hhh.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paintYunti(Graphics g) {
		g.drawImage(image, x, y, WIDTH, HEIGHT, null);
	}
	
	public void step() {
		x -= xSpeed;
	}
	public boolean outOfBounds() {
		return x <= -WIDTH;
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
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public static int getWidth() {
		return WIDTH;
	}
	public static int getHeight() {
		return HEIGHT;
	}
	
}
