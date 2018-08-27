package com.jsyunsi.Entity;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import com.jsyunsi.JFrame.GameFrame;

public class Barry_2 {
	
	int x, y;
	int xSpeed;	
	public static final int WIDTH = 76;
	public static final int HEIGHT = 40;
	Random random = new Random();
	Image image;

	public Barry_2() {
		initBarry_2();
		xSpeed = 2;
		x = GameFrame.WIDTH;
		y = random.nextInt(160)+90;
	}

	public void initBarry_2() {
		try {
			image = ImageIO.read(new File("image/daodan.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void step() {
		x -= xSpeed;
	}

	public boolean outOfBounds() {
		return x <= -WIDTH;
	}

	public void paintBarry_2(Graphics g) {
		g.drawImage(image, x, y, WIDTH, HEIGHT, null);

	}
}
