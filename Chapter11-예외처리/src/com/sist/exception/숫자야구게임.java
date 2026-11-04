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
	
	//난수값으로 초기화
	public void getRand() {
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			//중복 제거
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		return;
	}
	//반복적으로 수행
	public void sendMessage(String msg) {
		JOptionPane.showMessageDialog(this, msg);
		tf.setText("");
		tf.requestFocus();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//종료버튼
		if(e.getSource()==b3) {
			dispose();//윈도우 메모리 회수
			System.exit(0);
		}
		//시작버튼
		else if(e.getSource()==b1) {
			getRand();
			tf.setEnabled(true);
			b1.setEnabled(false);
			tf.requestFocus();
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
		}
		//엔터를 누르거나 전송버튼을 누를 때
		else if(e.getSource()==tf||e.getSource()==b2) {
			//입력값 읽기
			String temp=tf.getText();
			if(temp.trim().length()!=3) {
				sendMessage("세 자리 정수를 입력해야 합니다");
				return;
			}
			int input=0;
			try {
				//문자열을 정수로 변환할 때 사용하는 함수
				input=Integer.parseInt(temp);
			}catch(Exception ex) {
				sendMessage("잘못된 입력입니다!!\n정수만 입력하세요!!");
				return;
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//0사용 금지
			if(user[0]==0||user[1]==0||user[2]==0) {
				sendMessage("0은 사용할 수 없습니다!!");
				return;
			}
			
			
			s=0;
			b=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					//입력된 중복된 값 확인
					if(user[i]==user[j]&&i!=j) {
						sendMessage("중복된 값은 사용할 수 없습니다!!");
						return;
					}
					//com과 user배열에 같은 수가 있는지 확인
					if(com[i]==user[j]) {
						if(i==j)s++;
						else b++;
					}
				}
			}
			
			//힌트
			String msg=String.format("Input Number:%d, Result:%dS-%dB\n", input, s, b);
			ta.append(msg);
			
			if(s==3) {
				int a=JOptionPane.showConfirmDialog(this, "종료할까요?", "게임종료",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(a==JOptionPane.YES_OPTION) {
					dispose();
					System.exit(0);;
				}
				else {
					ta.setText("");
					tf.setText("");
					getRand();
					JOptionPane.showMessageDialog(this, "새 게임을 시작합니다");
				}
			}
		}
		tf.setText("");
		tf.requestFocus();
	}

	public static void main(String[] args) {
		new 숫자야구게임();
	}
}