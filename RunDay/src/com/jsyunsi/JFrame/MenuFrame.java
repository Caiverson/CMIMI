package com.jsyunsi.JFrame;
/**
 * 
 * @author Caiverson
 * �˵����棬ͼƬ��ť
 *
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuFrame extends JFrame implements MouseListener {
	// ��ʼ��ť
	JLabel start;
	// ������ť
	JLabel help;
	// �˳���ť
	JLabel exit;

	public MenuFrame() {
		start = new JLabel(new ImageIcon("image/hh1.png"));
		start.setBounds(300, 270, 150, 40);
		// ���øÿؼ�����(������Ϊfalse)
		start.setEnabled(false);
		// ���������
		start.addMouseListener(this);
		this.add(start);

		help = new JLabel(new ImageIcon("image/hh2.png"));
		help.setBounds(300, 325, 150, 40);
		help.setEnabled(false);
		help.addMouseListener(this);
		this.add(help);

		exit = new JLabel(new ImageIcon("image/hh3.png"));
		exit.setBounds(300, 380, 150, 40);
		exit.setEnabled(false);
		exit.addMouseListener(this);
		this.add(exit);

		BackImage back = new BackImage();
		this.add(back);
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setIconImage(new ImageIcon("image/115.png").getImage());
		this.setVisible(true);
	}

	private void setIconImage(ImageIcon imageIcon) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new LoginFrame();
	}

	class BackImage extends JPanel {
		Image background;

		public BackImage() {
			try {
				background = ImageIO.read(new File("image/main.png"));
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			g.drawImage(background, 0, 0, 1000, 500, null);
		}
	}

	@Override

	public void mouseClicked(MouseEvent e) {
		// ������¼�
		if (e.getSource().equals(start)) {
			new WindowFrame().Start();
			dispose();
		} else if (e.getSource().equals(help)) {
			new helpFrame();
		} else if (e.getSource().equals(exit)) {
			dispose();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// ��������¼�
		if (e.getSource() == start || e.getSource() == help || e.getSource() == exit) {
			start.setEnabled(true);
			help.setEnabled(true);
			exit.setEnabled(true);
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// ����Ƴ��¼�
		if (e.getSource() == start || e.getSource() == help || e.getSource() == exit) {
			start.setEnabled(false);
			help.setEnabled(false);
			exit.setEnabled(false);
		}
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
