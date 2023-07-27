package org.sp.projectChatting.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class LoginPage extends Page {
	JPanel p_main;//컴포넌트들을 담은 페널
	JLabel la_title; //앱이름
	JLabel la_id;
	JLabel la_pass;
	JTextField txt_id;
	JPasswordField pass;
	JLabel la_msg; //로그인 오류시 메지시 표시를 위한 라벨
	JButton bt_login;
	JLabel la_join;
	Main main;
	
	
	
	
	public LoginPage(Main main) {
		this.main = main;
		p_main = new JPanel();
		la_title = new JLabel("WorkTalk");
		la_id = new JLabel("username");
		la_pass = new JLabel("password");
		txt_id = new JTextField(15);
		pass = new JPasswordField(15);
		la_msg = new JLabel("");
		bt_login = new JButton("Log-in");
		la_join = new JLabel("회원 가입");

		
		//사이즈랑 디자인(색상) 조절
		Dimension d1 = new Dimension(150,15);
		Dimension d2 = new Dimension(150,30);
		Color c1 = new Color(135,135,199);
		Font f1 = new Font("dialog", Font.BOLD, 30);
		
		p_main.setPreferredSize(new Dimension(200,350));
		la_id.setPreferredSize(d1);
		la_pass.setPreferredSize(d1);
		txt_id.setPreferredSize(d2);
		pass.setPreferredSize(d2);
		bt_login.setPreferredSize(d2);
		la_msg.setPreferredSize(new Dimension(200,30));
		
		la_title.setFont(f1);
		
		
		la_id.setForeground(c1);
		la_pass.setForeground(c1);
		la_join.setForeground(c1);
		bt_login.setBorder(new LineBorder(c1,1,false));
		
		//p_main.setBackground(null);//디자인중에는잠시 막아두기
		
		//컴포넌트 페널에 붙이기
		p_main.add(la_title);
		p_main.add(la_id);
		p_main.add(txt_id);
		p_main.add(la_pass);
		p_main.add(pass);
		p_main.add(la_msg);
		p_main.add(bt_login);
		p_main.add(la_join);
		
		//페널을 페이지에 붙이기
		add(p_main);


		
		la_join.setFocusable(true);
		la_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				main.showHide(1);
			}
		
		});
		
		bt_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//아이디 비번이 맞았다면 화면 전환
				main.showHide(2);
				//아이디 비번이 틀리다면 알림문구 뜨기
			}
		});
		
	}

}
