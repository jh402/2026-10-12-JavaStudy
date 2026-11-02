package com.sist.main;

import javax.swing.*;

public class 재사용기법 /*extends JFrame*/{//윈도우를 변경해서 사용(is-a)
	JFrame f=new JFrame();//포함클래스-변경없이 사용(has-a)
	
	public 재사용기법() {
//		setSize(640, 400);
//		setVisible(true);
		f.setSize(640,400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new 재사용기법();
	}
}
