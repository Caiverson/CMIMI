package com.jsyunsi.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * @author Caiverson ��¼���棬Ҳ����Ϸ��� �û��� �û�������� ���� ��������� ��¼ ȡ����ť
 *
 */
public class LoginFrame extends JFrame {
	// �û��� ����
	JLabel username, password;
	// �û�������� ���������
	JTextField userText;
	JPasswordField pwdText;
	// ��¼ ȡ����ť
	JButton loginBtn;
	JButton cancelBtn;

	// �û������������
	String nameText;
	// ��������������
	String userpwd;

	public LoginFrame() {
		// this.setLayout(null);
		username = new JLabel("�û���");
		username.setBounds(20, 150, 100, 30);
		username.setForeground(Color.BLUE);
		this.add(username);

		userText = new JTextField(20);
		userText.setBounds(70, 150, 135, 30);
		// �����������Ч��
		userText.setBorder(BorderFactory.createLoweredBevelBorder());
		this.add(userText);
		// ����
		password = new JLabel("����");
		password.setBounds(20, 220, 100, 30);
		// ����ǰ��ɫ
		password.setForeground(Color.BLUE);
		this.add(password);

		pwdText = new JPasswordField(25);
		pwdText.setBounds(70, 220, 135, 30);
		pwdText.setBorder(BorderFactory.createLoweredBevelBorder());
		this.add(pwdText);

		loginBtn = new JButton("��¼");
		loginBtn.setBounds(20, 280, 80, 26);
		loginBtn.setForeground(Color.BLUE);
		loginBtn.setBorder(BorderFactory.createLoweredBevelBorder());
		// ��¼��ť�ļ����¼�
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ��ȡ�û�������������
				nameText = userText.getText();
				// ��ȡ��������������
				userpwd = pwdText.getText();

				if (nameText.length() == 0) {
					JOptionPane.showMessageDialog(null, "�û�������Ϊ��");
				}
				if (userpwd.length() == 0) {
					JOptionPane.showConfirmDialog(null, "���벻��Ϊ��");
				}
				if (nameText.equals("Caiverson") == false || userpwd.equals("123456") == false) {
					JOptionPane.showMessageDialog(null, "��¼ʧ��");
				} else {
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");
					// ������ת
					new MenuFrame();
					// �رյ�ǰ����
					dispose();
				}

			}
		});
		this.add(loginBtn);

		cancelBtn = new JButton("ȡ��");
		cancelBtn.setBounds(140, 280, 80, 26);
		cancelBtn.setForeground(Color.BLUE);
		cancelBtn.setBorder(BorderFactory.createLoweredBevelBorder());
		// ���ȡ����ť�ļ����¼�
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �رյ�ǰ����
				dispose();

			}
		});

		this.add(cancelBtn);

		/** ������壬����ӵ�������ȥ */
		BackImage back = new BackImage();
		this.add(back);

		// ���ô�����������
		this.setSize(599, 330);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		// ���ô���LOGOͼ��
		this.setIconImage(new ImageIcon("image/115.png").getImage());
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new LoginFrame().setVisible(true);
	}

	// �ڲ�����壬��Ҫ�����ǻ��Ʊ���ͼƬ
	class BackImage extends JPanel {
		Image background;// ����ͼƬ����

		public BackImage() {
			try {
				background = ImageIO.read(new File("image/login.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// ���Ʒ���
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			g.drawImage(background, 0, 0, null);
		}
	}

}
