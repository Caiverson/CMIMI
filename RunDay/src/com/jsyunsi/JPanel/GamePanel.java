package com.jsyunsi.JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.jsyunsi.Entity.Barrs_1;
import com.jsyunsi.Entity.Barrs_3;
import com.jsyunsi.Entity.Barry_2;
import com.jsyunsi.Entity.Coin1;
import com.jsyunsi.Entity.Coin2;
import com.jsyunsi.Entity.Coin3;
import com.jsyunsi.Entity.Person;
import com.jsyunsi.Entity.Pet;
import com.jsyunsi.Entity.Yunti;
import com.jsyunsi.JFrame.GameFrame;

/**
 * 
 * @author Caiverson ������Ĵ���� ��Ҫ�߼����д�
 * 
 */
public class GamePanel extends JPanel implements KeyListener {

	Image background;
	Image pause;
	Image ctnue;
	// �������Person����
	Person person = new Person();
	Pet pet = new Pet(person);
	// �����з�ϰ������
	Barrs_1[] barrs1 = {};
	// ������������
	Barry_2[] barrs2 = {};
	Barrs_3[] barrs3 = {};
	Coin1[] coin1 = {};
	Coin2[] coin2 = {};
	Coin3[] coin3 = {};
	Yunti[] yt = {};

	public GamePanel() {

		try {
			background = ImageIO.read(new File("image/cc.png"));
			pause = ImageIO.read(new File("image/b2.png"));
			ctnue = ImageIO.read(new File("image/b1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	int x = 0;

	@Override
	public void paint(Graphics g) {
		x--;
		super.paint(g);

		g.drawImage(background, x, 0, GameFrame.WIDTH, GameFrame.HEIGHT, null);
		g.drawImage(background, GameFrame.WIDTH + x, 0, GameFrame.WIDTH, GameFrame.HEIGHT, null);
		g.drawImage(pause, 150, 480, 60, 60, null);
		g.drawImage(ctnue, 790, 480, 60, 60, null);
		if (x == -GameFrame.WIDTH) {
			x = 0;
		}
		// �������
		person.paintPerson(g);
		pet.paintPet(g);
		// �����з�ϰ���
		for (int i = 0; i < barrs1.length; i++) {
			barrs1[i].paintBarrs_1(g);
		}
		// ���Ƶ����ϰ���
		for (int j = 0; j < barrs2.length; j++) {
			barrs2[j].paintBarry_2(g);
		}
		for (int j = 0; j < barrs3.length; j++) {
			barrs3[j].paintBarrs_3(g);
		}
		for (int i = 0; i < coin1.length; i++) {
			coin1[i].paintCoin1(g);
		}
		for (int i = 0; i < coin2.length; i++) {
			coin2[i].paintCoin2(g);
		}
		for (int i = 0; i < coin3.length; i++) {
			coin3[i].paintCoin3(g);
		}
		for (int i = 0; i < yt.length; i++) {
			yt[i].paintYunti(g);
		}
	}

	// �ϰ����볡����
	int index = 0;

	public void enteredAction() {
		index++;

		if (index % 600 == 0) {
			Barrs_1 bar1 = new Barrs_1();// ����һ���з
			barrs1 = Arrays.copyOf(barrs1, barrs1.length + 1);
			barrs1[barrs1.length - 1] = bar1;
		}
		if (index % 1200 == 0) {
			Barry_2 bar2 = new Barry_2();// ����һ������
			barrs2 = Arrays.copyOf(barrs2, barrs2.length + 1);
			barrs2[barrs2.length - 1] = bar2;
		}
		if (index % 1800 == 0) {
			Barrs_3 bar1 = new Barrs_3();// ����һ���з
			barrs3 = Arrays.copyOf(barrs3, barrs3.length + 1);
			barrs3[barrs3.length - 1] = bar1;
		}
		if (index % 2000 == 0) {
			Coin1 cn1 = new Coin1();
			coin1 = Arrays.copyOf(coin1, coin1.length + 1);
			coin1[coin1.length - 1] = cn1;
		}
		if (index % 900 == 0) {
			Coin2 cn2 = new Coin2();
			coin2 = Arrays.copyOf(coin2, coin2.length + 1);
			coin2[coin2.length - 1] = cn2;
		}
		if (index % 1600 == 0) {
			Coin3 cn3 = new Coin3();
			coin3 = Arrays.copyOf(coin3, coin3.length + 1);
			coin3[coin3.length - 1] = cn3;
		}
		if (index % 800 == 0) {
			Yunti cn3 = new Yunti();
			yt = Arrays.copyOf(yt, yt.length + 1);
			yt[yt.length - 1] = cn3;
		}
	}

	// �ϰ����ƶ��ķ���
	public void stepAction() {
		pet.step();
		person.step();
		person.drop();

		// �з�ϰ����ƶ�

		for (int i = 0; i < barrs1.length; i++) {
			barrs1[i].step();
		}
		// �����ƶ�
		for (int j = 0; j < barrs2.length; j++) {
			barrs2[j].step();
		}
		for (int i = 0; i < barrs3.length; i++) {
			barrs3[i].step();
		}
		for (int i = 0; i < coin1.length; i++) {
			coin1[i].step();
		}
		for (int i = 0; i < coin2.length; i++) {
			coin2[i].step();
		}
		for (int i = 0; i < coin3.length; i++) {
			coin3[i].step();
		}
		for (int i = 0; i < yt.length; i++) {
			yt[i].step();
		}
	}

	// ��Һ��ϰ�����ײ�ķ���
	public void wardAction() {
		// ���з�ϰ�����ײ
		for (int i = 0; i < barrs1.length; i++) {
			Barrs_1 b1 = barrs1[i];
			if (person.getX() + person.getWidth() > b1.getX() && person.getX() < b1.getX() + b1.getWidth()
					&& person.getY() + person.getHeight() > b1.getY() && person.getY() < b1.getHeight() + b1.getY()) {
				// ��ײ��Ĵ���
				if (person.getX() + person.getWidth() < b1.getX() + b1.getWidth() / 2) {
					person.setX(b1.getX() - person.getWidth());
				} else {
					person.setX(b1.getX() + b1.getWidth());
				}
			}
		}

	}

	// �̷߳���
	public void action() {
		new Thread() {
			public void run() {
				while (true) {
					enteredAction();
					stepAction();
					wardAction();
					repaint();// �ػ淽��

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			};

		}.start();
	}

	public static void main(String[] args) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// ��ȡ��ҵ�ǰ������
		int x = person.getX();
		int y = person.getY();
		int x1 = pet.getX();
		int y1 = pet.getY();
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			// ��ҵ�Y�������
			person.setY(y - 160);
			if (person.getY() <= 100) {
				person.setY(y);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			person.setX(x + 120);
			if (person.getX() >= (GameFrame.WIDTH - person.WIDTH)) {
				person.setX(x);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			person.setX(x - 120);
			if (person.getX() < (person.WIDTH)) {
				person.setX(x);
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
