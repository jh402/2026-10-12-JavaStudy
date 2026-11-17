package com.sist.thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Thread_5 extends JFrame implements ActionListener{
	JProgressBar[] bar=new JProgressBar[5];
	BarThread[] bt=new BarThread[5];
	JButton b1, b2;
	
	static int rank=1;
	
	//중첩 클래스 - 멤버 클래스 - 밖에 있는 클래스의 모든 변수/메소드 사용 가능
	class BarThread extends Thread{
		int index;
		public BarThread(int index) {
			this.index=index;
		}
		public void run() {
			for(int i=0;i<100;i++) {
				bar[index].setValue(i);
				int a=(int)(Math.random()*300);
				try {
					Thread.sleep(a);
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				if(i==100) {
					interrupt();//쓰레드 종료
				}
			}
			System.out.println((index+1)+"번째 "+rank+"등");
			rank++;
		}
	}
	
	
	public Thread_5() {
		b1=new JButton("시작"	);
		b2=new JButton("종료");
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5, 1, 5, 5));
		Color[] color= {Color.cyan, Color.yellow, Color.orange, Color.magenta, Color.pink};
		for(int i=0;i<bar.length;i++) {
			bar[i]=new JProgressBar();
			bar[i].setMinimum(0);
			bar[i].setMaximum(100);
			bar[i].setStringPainted(true);
			bar[i].setBackground(Color.white);
			bar[i].setForeground(color[i]);
			p.add(bar[i]);
		}
		JPanel p2=new JPanel();
		p2.add(b1);p2.add(b2);
		
		add("Center", p);
		add("South", p2);
		
		setSize(640, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	//동기화
	public void go() {
		for(int i=0;i<100;i++) {
			bar[0].setValue(i);
			try {
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			for(int i=0;i<5;i++) {
				bt[i]=new BarThread(i);
				bt[i].start();
			}
			
		}
		else if(e.getSource()==b2) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Thread_5();
	}
}
