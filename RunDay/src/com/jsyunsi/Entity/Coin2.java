package com.jsyunsi.Entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.jsyunsi.JFrame.GameFrame;

/**
 * 
 * @author Caiverson Í­±Ò 
 *
 */
public class Coin2 {
	BufferedImage [] images;
	int x, y;
	int index;
	int xSpeed;
	public static final int WIDTH = 20;
	public static final int HEIGHT = 20;
	Random random = new Random();
	BufferedImage rw1,rw2;
	BufferedImage image;

	public Coin2() {
		initCoin2();
		xSpeed = 1;
		index = 0;
		x = GameFrame.WIDTH + random.nextInt(200);
		y = random.nextInt(140) + 140;
		
	}
	private void initCoin2() {
		try {
			rw1 = ImageIO.read(new File("image/23.png"));
			rw2 = ImageIO.read(new File("image/24.png"));
			images = new BufferedImage[] {rw1,rw2};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void step() {
		image = images[index++ / 120 %images.length];
		x -= xSpeed;
		
	}
	public void paintCoin2(Graphics g) {
		g.drawImage(image, x, y, WIDTH, HEIGHT, null);
	}
	public boolean outOfBounds() {
		return x <= -WIDTH;
	}
	public BufferedImage[] getImages() {
		return images;
	}
	public void setImages(BufferedImage[] images) {
		this.images = images;
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
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
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
	public BufferedImage getRw1() {
		return rw1;
	}
	public void setRw1(BufferedImage rw1) {
		this.rw1 = rw1;
	}
	public BufferedImage getRw2() {
		return rw2;
	}
	public void setRw2(BufferedImage rw2) {
		this.rw2 = rw2;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	public static int getWidth() {
		return WIDTH;
	}
	public static int getHeight() {
		return HEIGHT;
	}
	
}
