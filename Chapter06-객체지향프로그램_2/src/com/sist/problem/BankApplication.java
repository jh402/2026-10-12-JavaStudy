package com.sist.problem;

import java.util.Scanner;

public class BankApplication {
	private final int size=100;
	private Account[] account=new Account[size];
	private static int count=0;
	
	static Scanner scan=new Scanner(System.in);
	
	public BankApplication(){
		for(int i=0;i<size;i++) {
			account[i]=new Account();
		}
	}
	//계좌생성
	public void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		account[count].setNum(scan.next());
		System.out.print("계좌주: ");
		account[count].setName(scan.next());
		System.out.print("초기입금액: ");
		account[count].setBalance(scan.nextInt());
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		count++;
	}
	//계좌목록
	public void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for(int i=0;i<count;i++) {
			System.out.println(account[i].getNum()+"\t"
					+account[i].getName()+"\t"
					+account[i].getBalance());
		}
	}
	//예금
	public void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String num=scan.next();
		
		for(int i=0;i<count;i++) {
			if(account[i].getNum().equals(num)) {
				System.out.print("예금액: ");
				account[i].setBalance(account[i].getBalance()+scan.nextInt());
				return;
			}
		}
		System.out.println("없는 계좌번호입니다.");
		return;
	}
	//출금
	public void withdrawal() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		
		String num=scan.next();
		int balance;
		
		for(int i=0;i<count;i++) {
			if(account[i].getNum().equals(num)) {
				System.out.print("출금액: ");
				balance=scan.nextInt();
				
				if(account[i].getBalance()>balance) {
					account[i].setBalance(account[i].getBalance()-balance);
					System.out.println("출금이 성공되었습니다.");
					return;
				}
				else {
					System.out.println("출금이 실패되었습니다.");
					return;
				}
			}
		}
		System.out.println("없는 계좌번호입니다.");
	}
	public void exit() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	//실행과정
	public void process() {
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int type=scan.nextInt();
			
			switch(type) {
			case 1->createAccount();
			case 2->accountList();
			case 3->deposit();
			case 4->withdrawal();
			case 5->exit();
			default->System.out.println("잘못된 입력값입니다.");
			}
			
		}
	}
	public static void main(String[] args) {
		BankApplication bankApplication=new BankApplication();
		bankApplication.process();
	}
}
