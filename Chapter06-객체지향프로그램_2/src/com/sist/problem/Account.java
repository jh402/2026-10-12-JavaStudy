package com.sist.problem;

public class Account {
	private final int MIN_BALANCE=0;
	private final int MAX_BALANCE=1_000_000;
	private int balance;
	private String num;
	private String name;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance<MIN_BALANCE)
			return;
		else if(balance>MAX_BALANCE)
			return;
		else
			this.balance=balance;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Account account=new Account();
		
		account.setBalance(10_000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(2_000_000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(300_000);
		System.out.println("현재 잔고: "+account.getBalance());
	}
}
