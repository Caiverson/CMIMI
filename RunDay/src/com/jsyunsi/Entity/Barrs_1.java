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
 * @author Caiverson 螃蟹障碍物
 *
 */
public class Barrs_1 {
	BufferedImage[] images;
	int index;
	BufferedImage rw1, rw2;
	int xSpeed;
	int x, y;
	public static final int WIDTH = 60;
	public static final int HEIGHT = 80;
	BufferedImage image;
	Random random = new Random();

	public Barrs_1() {
		initBarrs_1();
		images = new BufferedImage[] { rw1, rw2 };
		index = 0;
		xSpeed = 1;
		y = 315;
		x = GameFrame.WIDTH + random.nextInt(500);

	}

	public void initBarrs_1() {
		try {
			rw1 = ImageIO.read(new File("image/a4.png"));
			rw2 = ImageIO.read(new File("image/a2.png"));
			images = new BufferedImage[] { rw1, rw2 };

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 移动方法
	public void step() {
		// 图片切换
		image = images[index++ / 60 % images.length];

		// 坐标移动
		x -= xSpeed;

	}

	// 判断是否越界
	public boolean outOfBounds() {
		return x <= -WIDTH;
	}

	public void paintBarrs_1(Graphics g) {
		g.drawImage(image, x, y, WIDTH, HEIGHT, null);
	}

	public BufferedImage[] getImages() {
		return images;
	}

	public void setImages(BufferedImage[] images) {
		this.images = images;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
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

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
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

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
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
