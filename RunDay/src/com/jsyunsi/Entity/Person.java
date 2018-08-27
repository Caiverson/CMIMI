package com.jsyunsi.Entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author Caiverson 玩家实体类
 */
public class Person {
	// 图片数组
	BufferedImage[] images;
	BufferedImage rw1, rw2, rw3, rw4, rw5, rw6, rw7, rw8, rw9;
	// 当前显示图片
	BufferedImage image;
	// 玩家生命值
	int life;
	// 玩家得分
	int score;
	// 玩家跑酷距离
	int distance;
	// 玩家位置
	int x, y;
	// 玩家图片宽高
	public static final int WIDTH = 80;
	public static final int HEIGHT = 100;
	// 切换图片的参数变量
	int index;

	// 在构造方法中赋值
	public Person() {
		life = 3;
		score = 0;
		distance = 0;
		x = 200;
		y = 315;
		initPerson();
		images = new BufferedImage[] { rw1, rw2, rw3, rw4, rw5, rw6, rw7, rw8, rw9 };
		index = 0;

	}

	// 移动方法

	public void step() {
		// 图片的切换
		image = images[index++ / 28 % images.length];

		// 坐标的改变
		
	}

	// 判断是否越界的方法
	public boolean outOfBounds() {
		return false;
	}
	//绘制玩家的方法
	public void paintPerson(Graphics g) {
		g.drawImage(image,x,y,WIDTH,HEIGHT,null);
	}
	
	//玩家的自由下落功能
	public void drop() {
		y ++;
		if(y>315) {
			y = 315;
		}
	}

	public BufferedImage[] getImages() {
		return images;
	}

	public void setImages(BufferedImage[] images) {
		this.images = images;
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

	public BufferedImage getRw3() {
		return rw3;
	}

	public void setRw3(BufferedImage rw3) {
		this.rw3 = rw3;
	}

	public BufferedImage getRw4() {
		return rw4;
	}

	public void setRw4(BufferedImage rw4) {
		this.rw4 = rw4;
	}

	public BufferedImage getRw5() {
		return rw5;
	}

	public void setRw5(BufferedImage rw5) {
		this.rw5 = rw5;
	}

	public BufferedImage getRw6() {
		return rw6;
	}

	public void setRw6(BufferedImage rw6) {
		this.rw6 = rw6;
	}

	public BufferedImage getRw7() {
		return rw7;
	}

	public void setRw7(BufferedImage rw7) {
		this.rw7 = rw7;
	}

	public BufferedImage getRw8() {
		return rw8;
	}

	public void setRw8(BufferedImage rw8) {
		this.rw8 = rw8;
	}

	public BufferedImage getRw9() {
		return rw9;
	}

	public void setRw9(BufferedImage rw9) {
		this.rw9 = rw9;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
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

	public static int getWidth() {
		return WIDTH;
	}

	public static int getHeight() {
		return HEIGHT;
	}

	private void initPerson() {
		try {
			rw1 = ImageIO.read(new File("image/1.png"));
			rw2 = ImageIO.read(new File("image/2.png"));
			rw3 = ImageIO.read(new File("image/3.png"));
			rw4 = ImageIO.read(new File("image/4.png"));
			rw5 = ImageIO.read(new File("image/5.png"));
			rw6 = ImageIO.read(new File("image/6.png"));
			rw7 = ImageIO.read(new File("image/7.png"));
			rw8 = ImageIO.read(new File("image/8.png"));
			rw9 = ImageIO.read(new File("image/9.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
