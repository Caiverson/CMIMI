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
 * @author Caiverson 登录界面，也是游戏入口 用户名 用户名输入框 密码 密码输入框 登录 取消按钮
 *
 */
public class LoginFrame extends JFrame {
	// 用户名 密码
	JLabel username, password;
	// 用户名输入框 密码输入框
	JTextField userText;
	JPasswordField pwdText;
	// 登录 取消按钮
	JButton loginBtn;
	JButton cancelBtn;

	// 用户名输入的内容
	String nameText;
	// 密码输入框的内容
	String userpwd;

	public LoginFrame() {
		// this.setLayout(null);
		username = new JLabel("用户名");
		username.setBounds(20, 150, 100, 30);
		username.setForeground(Color.BLUE);
		this.add(username);

		userText = new JTextField(20);
		userText.setBounds(70, 150, 135, 30);
		// 设置输入框凹陷效果
		userText.setBorder(BorderFactory.createLoweredBevelBorder());
		this.add(userText);
		// 密码
		password = new JLabel("密码");
		password.setBounds(20, 220, 100, 30);
		// 设置前景色
		password.setForeground(Color.BLUE);
		this.add(password);

		pwdText = new JPasswordField(25);
		pwdText.setBounds(70, 220, 135, 30);
		pwdText.setBorder(BorderFactory.createLoweredBevelBorder());
		this.add(pwdText);

		loginBtn = new JButton("登录");
		loginBtn.setBounds(20, 280, 80, 26);
		loginBtn.setForeground(Color.BLUE);
		loginBtn.setBorder(BorderFactory.createLoweredBevelBorder());
		// 登录按钮的监听事件
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 获取用户名输入框的内容
				nameText = userText.getText();
				// 获取密码输入框的内容
				userpwd = pwdText.getText();

				if (nameText.length() == 0) {
					JOptionPane.showMessageDialog(null, "用户名不能为空");
				}
				if (userpwd.length() == 0) {
					JOptionPane.showConfirmDialog(null, "密码不能为空");
				}
				if (nameText.equals("Caiverson") == false || userpwd.equals("123456") == false) {
					JOptionPane.showMessageDialog(null, "登录失败");
				} else {
					JOptionPane.showMessageDialog(null, "登录成功");
					// 界面跳转
					new MenuFrame();
					// 关闭当前界面
					dispose();
				}

			}
		});
		this.add(loginBtn);

		cancelBtn = new JButton("取消");
		cancelBtn.setBounds(140, 280, 80, 26);
		cancelBtn.setForeground(Color.BLUE);
		cancelBtn.setBorder(BorderFactory.createLoweredBevelBorder());
		// 添加取消按钮的监听事件
		cancelBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 关闭当前界面
				dispose();

			}
		});

		this.add(cancelBtn);

		/** 创建面板，并添加到窗体上去 */
		BackImage back = new BackImage();
		this.add(back);

		// 设置窗体的相关属性
		this.setSize(599, 330);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		// 设置窗体LOGO图标
		this.setIconImage(new ImageIcon("image/115.png").getImage());
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new LoginFrame().setVisible(true);
	}

	// 内部类面板，主要作用是绘制背景图片
	class BackImage extends JPanel {
		Image background;// 背景图片变量

		public BackImage() {
			try {
				background = ImageIO.read(new File("image/login.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 绘制方法
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			g.drawImage(background, 0, 0, null);
		}
	}

}
