package com.jsyunsi.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * 
 * @author Caiverson 缓冲界面，由背景图片和进度条加载过程组成
 *
 */
public class WindowFrame extends JFrame implements Runnable {

	JLabel backImage;
	// 进度条
	JProgressBar jdt;

	// 线程启动方法
	public void Start() {
		WindowFrame window = new WindowFrame();
		Thread t = new Thread(window);
		t.start();
		dispose();

	}

	public WindowFrame() {
		backImage = new JLabel(new ImageIcon("image/hbg.jpg"));
		jdt = new JProgressBar();
		// 设置进度条的颜色
		jdt.setBackground(Color.ORANGE);
		// 设置进度条的值以字符串形式显示
		jdt.setStringPainted(true);

		this.add(backImage, BorderLayout.NORTH);
		this.add(jdt, BorderLayout.SOUTH);
		/** 设置窗体的相关属性 568 339 */
		this.setSize(568, 339);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setIconImage(new ImageIcon("image/115.png").getImage());
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowFrame().Start();
	}

	@Override
	public void run() {
		// 进度条中的模拟值
		int[] intvalues = { 1, 2, 3, 4, 5, 10, 15, 20, 50, 60, 70, 90, 93, 95, 97, 98, 99, 100 };
		for (int i = 0; i < intvalues.length; i++) {
			// 线程休眠
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jdt.setValue(intvalues[i]);

		}
		// 界面跳转到主界面
		new GameFrame();
		// 关闭当前界面
		dispose();
	}

}
