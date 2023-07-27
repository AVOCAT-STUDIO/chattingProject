package org.sp.projectChatting.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.sp.projectChatting.chatting.ChatHome;

public class Main extends JFrame{
	JPanel p_bg;
	Page[] pages;
	public static final int LOGIN = 0;
	public static final int JOIN = 1;
	public static final int HOME = 2;
	

	
	public Main() {
		p_bg = new JPanel();
		pages = new Page[3];
		pages[0] = new LoginPage(this);
		pages[1] = new JoinPage(this);
		pages[2] = new ChatHome();
		p_bg.setPreferredSize(new Dimension(300,500));
		p_bg.setBackground(new Color(222,185,237));
		add(p_bg);
		setLayout(new FlowLayout());
		for(int i=0;i<pages.length;i++) {
			p_bg.add(pages[i]);
		
		}
		
		
		setBounds(1200, 300, 300, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		showHide(0);
		
	}
	
	//화면 전환을 위한 메서드(로그인과 회원가입페이지 화면전환용)
	public void showHide(int n) {
		for(int i=0;i<pages.length;i++) {			
			if(i==n) {
				pages[i].setVisible(true);	
			}else {
				pages[i].setVisible(false);			
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
