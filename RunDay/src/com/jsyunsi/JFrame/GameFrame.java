package com.jsyunsi.JFrame;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jsyunsi.JPanel.GamePanel;

public class GameFrame extends JFrame{
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 550;
	
	//JButton pauseBtn;
	//JButton ctnueBtn;
	public GameFrame() {
		
		GamePanel bgPanel = new GamePanel();
		bgPanel.action();
		this.addKeyListener(bgPanel);
		this.add(bgPanel);
		
		
		this.setSize(WIDTH,HEIGHT);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setIconImage(new ImageIcon("image/115.png").getImage());
		this.setVisible(true);
		
		/*JButton pauseBtn = new JButton("image/b2.png");
		pauseBtn.setBounds(150, 480, 60, 60);
		pauseBtn.setVisible(true);*/
		
		
				
	}
	
	public static void main(String[] args) {
		
		new GameFrame();
	}

}
