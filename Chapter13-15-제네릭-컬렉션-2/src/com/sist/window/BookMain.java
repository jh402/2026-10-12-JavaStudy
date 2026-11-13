package com.sist.window;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.Font;
import java.awt.color.*;
import java.util.*;

import com.sist.list.*;


public class BookMain extends JFrame implements ActionListener, MouseListener{
	JLabel la1, la2;
	JTextField tf;
	JButton b1, b2, b3, b4;
	JTable table;
	DefaultTableModel model;
	JPanel p=new JPanel();
	
	int totalpage=0;//총 페이지
	int curpage=1;//현재 페이지
	
	BookSystem bs=new BookSystem();
	public BookMain(){
		//초기화
		la1=new JLabel("Book Center", JLabel.CENTER);
		la1.setFont(new Font("맑은 고딕", Font.BOLD, 45));
		setLayout(null);//직접 배치
		la1.setBounds(10, 15, 770, 55);
		add(la1);
		
		tf=new JTextField();
		tf.setBounds(10, 80, 350, 30);
		add(tf);
		
		b1=new JButton("검색");
		b1.setBounds(365, 80, 100, 30);
		add(b1);
		
		b4=new JButton("목록"	);
		b4.setBounds(470, 80, 100, 30);
		add(b4);
		
		String[] col= {"번호", "", "제목", "저자", "가격"};
		String[][] row=new String[0][5];
		//상속 없이 메소드 재정의
		model=new DefaultTableModel(row, col) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 115, 770, 400);
		add(js);
		
		b2=new JButton("이전");
		b3=new JButton("다음");
		la2=new JLabel("0 page / 0 pages");
		
		p.add(b2);p.add(la2);p.add(b3);
		
		p.setBounds(10, 525, 770, 35);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		tf.addActionListener(this);
		table.addMouseListener(this);
		
		setSize(800, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		bookPrint();
	}
	
	public void bookPrint() {
		p.setVisible(true);
		//테이블-모든 내용 지우기
		for(int i=model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		totalpage=(int)(Math.ceil(BookSystem.getBList().size()/10.0));
		
		ArrayList<BookVO> list=bs.bookListDate(curpage);
		DecimalFormat df=new DecimalFormat("###,###");
		
		for(BookVO vo:list) {
			String[] data= {
				String.valueOf(vo.getNo()),
				"",
				vo.getTitle(),
				vo.getAuthor(),
				df.format(vo.getPrice())+"원"
			};
			model.addRow(data);
		}
		la2.setText(curpage+" page / "+totalpage+" pages");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==b1||e.getSource()==tf) {
			String fd=tf.getText();
			if(fd.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			findData(fd);
		}
		//이전 버튼 클릭
		else if(e.getSource()==b2) {
			if(curpage>1) {
				curpage--;
				bookPrint();
			}
		}
		//다음 버튼 클릭
		else if(e.getSource()==b3) {
			if(curpage<totalpage) {
				curpage++;
				bookPrint();
			}
		}
		else if(e.getSource()==b4) {
			curpage=1;
			bookPrint();
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==table) {
			if(e.getClickCount()==2) {
				int row=table.getSelectedRow();
				String no=model.getValueAt(row, 0).toString();
				BookVO vo=bs.bookDetailData(Integer.parseInt(no));
				String msg="제목:"+vo.getTitle()
					+"\n저자:"+vo.getAuthor()
					+"\n가격:"+vo.getPrice()
					+"\n총 페이지:"+vo.getPages()
					+"\n출판일:"+vo.getPubdate();
				JOptionPane.showMessageDialog(this, msg);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	public void findData(String fd) {
		p.setVisible(false);
		for(int i=model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		
		ArrayList<BookVO> list=bs.bookFindData(fd);
		if(list.size()==0) {
			JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다");
			tf.setText("");
			tf.requestFocus();
			return;
		}
		DecimalFormat df=new DecimalFormat("###,###");
		
		for(BookVO vo:list) {
			String[] data= {
				String.valueOf(vo.getNo()),
				"",
				vo.getTitle(),
				vo.getAuthor(),
				df.format(vo.getPrice())+"원"
			};
			model.addRow(data);
		}
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		new BookMain();
	}
}
