package com.sist.client;

import java.util.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * TCP:채팅, 이메일, FTP, ...
 * UDP:동영상, 스트림 서버, 게임, ...
 * RTCP: 화상채팅, CCTV, ...
 * 
 * java.awt
 * JFrame - 일반 윈도우 창
 * JWindow - 타이틀 바 없는 창
 * JDialog - 경고 / 설정 ...
 * JPanel - 컴포넌트 여러개 묶어서 처리
 * 버튼 - JButton, JCheckBox, JRadioButton, JMenu
 * 입력 - JTextField, JTextArea, JTextPane, JEditPane, JPasssword
 * 목록 - 
 * 기타
 * 
 * DB
 * Connection : Socket
 * PreparedStatement : BufferedReader/OutputStream
 * ResultSet
 */

public class ChatMain extends JFrame implements ActionListener, Runnable{
	JTextArea ta;
	JTextField tf;
	JButton b1, b2;
	String name;
	JScrollBar bar;
	
	Socket s;
	BufferedReader in;//서버에서 응답한 값 읽기
	OutputStream out;//서버에 요청
	
	
	public ChatMain() {
		ta=new JTextArea();
		ta.setEnabled(false);
		JScrollPane js=new JScrollPane(ta);
		bar=js.getVerticalScrollBar();
		tf=new JTextField(25);
		tf.setEnabled(false);
		b1=new JButton("접속");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("Center", js);
		add("South", p);
		
		setSize(450, 400);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			dispose();//윈도우 메모리 해제
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			name=JOptionPane.showInputDialog("이름 입력:");
			try {
				//서버 연결
				s=new Socket("localhost", 11111);
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
			//서버로부터 값 읽어오기
			new Thread(this).start();//서버에서 들어오는 값을 받아서 계속 출력
			
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf) {
			String msg=tf.getText();
			if(msg.length()<1)
				return;
			//서버로 전송
			try {
				out.write(("["+name+"]"+msg+"\n").getBytes());
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
			tf.setText("");
			tf.requestFocus();
		}
	}
	
	//서버에서 클라이언트는 쓰레드로 처리
	@Override
	public void run() {
		try {
			while(true) {
				// 서버로부터 값을 받는다
				String msg=in.readLine();
				ta.append(msg+"\n");
				bar.setValue(bar.getMaximum());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatMain();
	}
}
