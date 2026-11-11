package com.sist.math;
// abs / min / max 
public class Math_2 {

	public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=Math.max(a, b);//b
        int d=Math.min(a, b);//a
        int e=-1;
        int f=Math.abs(e);//절댓값
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("f="+f);
	}

}