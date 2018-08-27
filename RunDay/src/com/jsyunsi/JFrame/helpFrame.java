package com.jsyunsi.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class helpFrame extends JFrame implements MouseListener {
	JLabel backbtn;

	public helpFrame() {

		backbtn = new JLabel("·µ»Ø");
		backbtn.setBounds(460, 320, 40, 26);
		backbtn.setForeground(Color.WHITE);
		backbtn.setBorder(BorderFactory.createLoweredBevelBorder());
		backbtn.addMouseListener(this);
		this.add(backbtn);
		BackImage back = new BackImage();
		this.add(back);
		this.setSize(556, 369);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setIconImage(new ImageIcon("image/115.png").getImage());
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new helpFrame();
	}

	public class BackImage extends JPanel {
		Image Background;

		public BackImage() {
			try {
				Background = ImageIO.read(new File("image/bzbg.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			g.drawImage(Background, 0, 0, 556, 369, null);
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == backbtn) {
			dispose();
			new MenuFrame();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

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
