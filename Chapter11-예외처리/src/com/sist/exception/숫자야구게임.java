package com.sist.exception;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * 인터페이스
 * ActionListener
 * -actionPreformed()
 * 
 * 마우스
 * MouseListener
 * -mouseClicked()
 * -mousePressed()
 * -mouseReleased()
 * -mouseEntered()
 * -mouseExited()
 * 
 * 키보드
 * -KeyListener
 * -keyTyped()
 * -keyPressed()
 * -keyReleased()
 * 
 * combobox, list
 * ItemListener
 * -itemStateChange()
 * 
 */

public class 숫자야구게임 extends JFrame implements ActionListener {
	JButton b1, b2, b3;
	JTextField tf;//한 줄 입력
	JTextArea ta;//여러 줄 입력
	
	private int[] com=new int[3];
	private int[] user=new int[3];
	int s, b;
	
	public 숫자야구게임() {
		b1=new JButton("시작");
		b2=new JButton("전송 버튼");
		b3=new JButton("종료");
		
		tf=new JTextField(10);
		tf.setEnabled(false);//편집 막기
		ta=new JTextArea();
		ta.setEditable(false);//편집 막기
		JScrollPane js=new JScrollPane(ta);
		add("Center", js);
		
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);p.add(b2);p.add(b3);
		add("South", p);
		
		setSize(450, 500);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		tf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//x누르면 종료
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b3) {
			dispose();//윈도우 메모리 회수
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			tf.setEnabled(true);
			b1.setEnabled(false);
			tf.requestFocus();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
		}
	}

	public static void main(String[] args) {
		new 숫자야구게임();
	}
}