package com.sist.problem;

public class Printer {
	
	static void println(int print) {
		System.out.println(print);
	}
	static void println(boolean print) {
		System.out.println(print);
	}
	static void println(double print) {
		System.out.println(print);
	}
	static void println(String print) {
		System.out.println(print);
	}
	public static void main(String[] args) {
		Printer printer=new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}
}
