package com.sist.inter2;

import java.awt.*;//1.0~1.1 -> java
import javax.swing.*;//1.2 -> javax
import java.awt.event.*;//interface가 주로 있다

public class 퍼즐게임 extends JFrame implements ActionListener, MouseListener{
	JButton[] btns=new JButton[9];
	JButton b1, b2;
	//난수 저장
	int[] panCount=new int[9];
	int last=0;
	
	//생성자에서 초기화, UI, 네트워크 서버 연결, DB연결 등등
	public 퍼즐게임() {
		setTitle("퍼즐게임");
		b1=new JButton("시작");
		b2=new JButton("종료"	);
		
		JPanel pan=new JPanel();
		pan.setLayout(new GridLayout(3, 3, 5, 5));
		
		for(int i=0;i<btns.length;i++) {
			btns[i]=new JButton(String.valueOf(i+1));
			btns[i].setFont(new Font("궁서체", Font.BOLD, 45));
			btns[i].addActionListener(this);
			btns[i].addMouseListener(this);
			pan.add(btns[i]);
		}
		setLayout(null);
		pan.setBounds(10, 15, 350, 350);
		add(pan);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		p.setBounds(10, 370, 350, 35);
		add(p);
		
		setSize(380, 470);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b1.addMouseListener(this);
		b2.addMouseListener(this);
	}
	//버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			JOptionPane.showMessageDialog(this, "게임을 종료합니다");
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			getRand();
			puzzleLayout();
		}
		for(int i=0;i<9;i++) {
			if(e.getSource()==btns[last])
				return;
			if(e.getSource()==btns[i]) {
				panCount[i]=8;
				panCount[last]=Integer.parseInt(btns[i].getText())-1;
				last=i;
				puzzleLayout();
				if(isEnd()) {
					int n=JOptionPane.showConfirmDialog(this, "종료하겠습니까?", "종료",
							JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(n==JOptionPane.YES_OPTION)
						System.exit(0);
					else {
						getRand();
						puzzleLayout();
					}
				}
			}
		}
	}
	
	//숫자 난수
	public void getRand() {
		for(int i=0;i<9;i++) {
			panCount[i]=(int)(Math.random()*9);
			for(int j=0;j<i;j++) {
				if(panCount[i]==panCount[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<9;i++) {
			if(panCount[i]==8) {
				last=i;
				break;
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==b1) {
			b1.setBackground(Color.green);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==b1) {
			b1.setBackground(Color.white);
		}
	}
	public void puzzleLayout() {
		for(int i=0;i<9;i++) {
			if(last==i) {
				btns[i].setText("\0");
			}
			else {
				btns[i].setText(String.valueOf(panCount[i]+1));
			}
		}
	}
	//종료 여부
	public boolean isEnd() {
		for(int i=0;i<9;i++) {
			if(panCount[i]!=i)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		new 퍼즐게임();
	}
}