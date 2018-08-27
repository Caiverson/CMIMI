package com.jsyunsi.Entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author Caiverson 做装饰用宠物
 */
public class Pet {
	BufferedImage[] images;
	BufferedImage d1, d2, d3, d4, d5, d6;
	BufferedImage image;
	
	int x1;
	int y1;
	public static final int WIDTH = 40;
	public static final int HEIGHT = 32;
	int index;

	public Pet(Person p) {
	
		x1 = p.getX();
		y1 = p.getY();
		initPet();
		images = new BufferedImage[] { d1, d2, d3, d4, d5, d6 };
		
		index = 0;
	}

	public void step() {

		image = images[index++ / 24 % images.length];
	
	}

	public void paintPet(Graphics g) {
		g.drawImage(image, x1+50, y1, WIDTH, HEIGHT, null);

	}

	private void initPet() {
		try {
			d1 = ImageIO.read(new File("image/d1.png"));
			d2 = ImageIO.read(new File("image/d2.png"));
			d3 = ImageIO.read(new File("image/d3.png"));
			d4 = ImageIO.read(new File("image/d4.png"));
			d5 = ImageIO.read(new File("image/d5.png"));
			d6 = ImageIO.read(new File("image/d6.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public BufferedImage[] getImages() {
		return images;
	}

	public void setImages(BufferedImage[] images) {
		this.images = images;
	}

	public BufferedImage getD1() {
		return d1;
	}

	public void setD1(BufferedImage d1) {
		this.d1 = d1;
	}

	public BufferedImage getD2() {
		return d2;
	}

	public void setD2(BufferedImage d2) {
		this.d2 = d2;
	}

	public BufferedImage getD3() {
		return d3;
	}

	public void setD3(BufferedImage d3) {
		this.d3 = d3;
	}

	public BufferedImage getD4() {
		return d4;
	}

	public void setD4(BufferedImage d4) {
		this.d4 = d4;
	}

	public BufferedImage getD5() {
		return d5;
	}

	public void setD5(BufferedImage d5) {
		this.d5 = d5;
	}

	public BufferedImage getD6() {
		return d6;
	}

	public void setD6(BufferedImage d6) {
		this.d6 = d6;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public int getX() {
		return x1;
	}

	public void setX(int x1) {
		this.x1 = x1;
	}

	public int getY() {
		return y1;
	}

	public void setY(int y1) {
		this.y1 = y1;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public static int getWidth() {
		return WIDTH;
	}

	public static int getHeight() {
		return HEIGHT;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
