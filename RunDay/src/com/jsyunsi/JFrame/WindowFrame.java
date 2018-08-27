package com.jsyunsi.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 * 
 * @author Caiverson ������棬�ɱ���ͼƬ�ͽ��������ع������
 *
 */
public class WindowFrame extends JFrame implements Runnable {

	JLabel backImage;
	// ������
	JProgressBar jdt;

	// �߳���������
	public void Start() {
		WindowFrame window = new WindowFrame();
		Thread t = new Thread(window);
		t.start();
		dispose();

	}

	public WindowFrame() {
		backImage = new JLabel(new ImageIcon("image/hbg.jpg"));
		jdt = new JProgressBar();
		// ���ý���������ɫ
		jdt.setBackground(Color.ORANGE);
		// ���ý�������ֵ���ַ�����ʽ��ʾ
		jdt.setStringPainted(true);

		this.add(backImage, BorderLayout.NORTH);
		this.add(jdt, BorderLayout.SOUTH);
		/** ���ô����������� 568 339 */
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
		// �������е�ģ��ֵ
		int[] intvalues = { 1, 2, 3, 4, 5, 10, 15, 20, 50, 60, 70, 90, 93, 95, 97, 98, 99, 100 };
		for (int i = 0; i < intvalues.length; i++) {
			// �߳�����
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jdt.setValue(intvalues[i]);

		}
		// ������ת��������
		new GameFrame();
		// �رյ�ǰ����
		dispose();
	}

}
