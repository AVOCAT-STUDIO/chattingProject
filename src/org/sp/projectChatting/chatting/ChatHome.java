package org.sp.projectChatting.chatting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.sp.projectChatting.login.Page;

//채팅 가능한 사람들의 목록이 뜨는 가장 기본적인 홈화면
public class ChatHome extends Page {
	JPanel p_main;
	JTextField txt_search; //검색창
	JButton bt_search; //검색버튼
	JScrollPane scroll;
	JPanel p_south; //기능선택창
	
	public ChatHome() {

		p_main = new JPanel();
		txt_search = new JTextField();
		bt_search = new JButton("조회");
		scroll = new JScrollPane();
		p_south = new JPanel();
		
		//디자인과 사이즈 조정
		
		
		//p_main.setBackground(null); //디자인중에는잠시 막아두기
		
		p_main.setPreferredSize(new Dimension(290,480));
		p_main.add(txt_search);
		p_main.add(bt_search);
		p_main.add(scroll);
		
		add(p_main);
		add(p_south);
		
		
		
		
		setVisible(true);
		
		
		
		
		
		
		
	}
	
	
	
}
