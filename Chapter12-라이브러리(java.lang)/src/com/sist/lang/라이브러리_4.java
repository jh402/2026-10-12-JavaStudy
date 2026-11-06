package com.sist.lang;

class Member{
	private int mno;
	private String name;
	private String address;
	
	public int getMno() {
		return this.mno;
	}
	public void setMno(int mno) {
		this.mno=mno;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getaddress() {
		return this.address;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	
	public void print() {
		System.out.println("===== 회원 정보 =====");
		System.out.println("회원번호: "+mno);
		System.out.println("이름: "+name);
		System.out.println("주소: "+address);
	}
	public void memberUpdate(Member m) {
		m.setMno(1);
		m.setName("홍길동");
		m.setaddress("서울시 마포구");
	}
	public void arryUpdate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
}
public class 라이브러리_4 {
	public static void main(String[] args) {
		Member mm=new Member();
		mm.memberUpdate(mm);
		mm.print();
		
		int[] arr=new int[5];
		mm.arryUpdate(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
