package com.sist.lang;

/*
 * Object
 *-모든 클래스에 상속을 내리는 클래스
 *-최상위 클래스
 *-Object 클래스는 가장 큰 데이터형
 *-모든 데이터값을 받을 수 있다-기본형, 참조형
 *-Object가 가지고 있는 모든 메소드 사용 가능
 *
 * Object 메소드
 * -소멸자: finalize()
 * -객체 복제: clone()-메모리를 따로 생성(깊은 복사)
 * -객체 문자열화: toString()-생략 가능
 * -객체 비교: equals()-객체 주소값 리턴-필요하다면 재졍의해서 사용 가능
 * -객체 구분: hashCode()
 * -객체 얻기: getClass()-.class로 값을 가져옴/리플렉션 이용
 *
 * 라이브러리: 메소드(어떤 기능, 리턴형, 매개변수, 매소드명 확인)
 * 
 * java.lang
 * -자바 프로그램의 기본
 * -Object를 제외하고 다른 클래스는 final클래스
 * -상속 불가능, 고정된 클래스
 * -String, System, Math 등등
 * 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Object_1 extends JFrame implements ItemListener{
	JComboBox box=new JComboBox();
	JLabel la=new JLabel();
	public Object_1() {
		//초기화
		
		//화면UI
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		box.addItem("이순신");
		box.addItem("김두한");
		
		add("North", box);
		add("Center", la);
		
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		box.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==box) {
			String name=(String)box.getSelectedItem();
			//String name=(String)box.getSelectedItem().toString();
			la.setText(name);
		}
	}
	
	public static void main(String[] args) {
		new Object_1();
	}
}
