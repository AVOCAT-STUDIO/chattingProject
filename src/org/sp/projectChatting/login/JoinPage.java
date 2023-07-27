package org.sp.projectChatting.login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class JoinPage extends Page {
		JPanel p_main;//컴포넌트들을 담은 페널
		JLabel la_title; //앱이름
		JLabel la_name;
		JLabel la_pass;
		JLabel la_mail;
		JLabel la_dept;
		JLabel la_pos;
		JComboBox boxDept; // 부서 선택박스
		JComboBox boxPos; //직급 선택박스
		JTextField txt_name;
		JPasswordField pass;
		JTextField txt_mail;
		JLabel la_msg; //로그인 오류시 메지시 표시를 위한 라벨
		JButton bt_join;
		Main main;

		
		
		
		
		public JoinPage(Main main) {

			this.main = main;
			p_main = new JPanel();
			la_title = new JLabel("회원가입양식");
			la_name = new JLabel("이름");
			la_mail = new JLabel("이메일");
			la_pass = new JLabel("비밀번호");
			la_dept = new JLabel("부서");
			la_pos = new JLabel("직급");
			txt_name = new JTextField();
			txt_mail = new JTextField();
			boxDept = new JComboBox();
			boxPos = new JComboBox();
			pass = new JPasswordField();
			la_msg = new JLabel("");
			bt_join = new JButton("회원가입");

			
			
			
			//사이즈랑 디자인(색상) 조절
			Dimension d1 = new Dimension(50,15);
			Dimension d2 = new Dimension(140,25);
			la_name.setPreferredSize(d1);
			la_mail.setPreferredSize(d1);
			la_pass.setPreferredSize(d1);
			la_dept.setPreferredSize(d1);
			la_pos.setPreferredSize(d1);
			
			
			la_title.setFont(new Font("dialog", Font.BOLD, 25));
			Color c1 = new Color(135,135,199);
			la_name.setForeground(c1);
			la_mail.setForeground(c1);
			la_pass.setForeground(c1);
			la_dept.setForeground(c1);
			la_pos.setForeground(c1);
			
			
			txt_name.setPreferredSize(d2);
			txt_mail.setPreferredSize(d2);
			pass.setPreferredSize(d2);
			boxDept.setPreferredSize(d2);
			boxPos.setPreferredSize(d2);
			bt_join.setPreferredSize(d2);
			bt_join.setBorder(new LineBorder(c1,1,false));
			la_msg.setPreferredSize(new Dimension(200,30));
			
			
			//p_main.setBackground(Color.WHITE);//디자인중에는잠시 막아두기
			p_main.setPreferredSize(new Dimension(200,350));
			
			
			//컴포넌트 페널에 붙이기
			p_main.add(la_title);
			p_main.add(la_name);
			p_main.add(txt_name);
			p_main.add(la_mail);
			p_main.add(txt_mail);
			p_main.add(la_pass);
			p_main.add(pass);
			p_main.add(la_dept);
			p_main.add(boxDept);
			p_main.add(la_pos);
			p_main.add(boxPos);
			p_main.add(bt_join);
			p_main.add(la_msg);

			
			//페널을 페이지에 붙이기
			add(p_main);
			

			
			bt_join.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//제약조건으로 만족했을때만 창전환
					main.showHide(0);
					//만약 insert 문이 실패되면 알람창뜨기
				}
			});
	}

}
