package com.sist.regex;

/*
 * [abc]->a|b|c 
 * [(abc)]->abc
 * 순차적이지 않을 경우 그대로 사용
 * [adad]->adad
 * [asfkpo]->asfkpo
 */
public class Regex_5 {
	public static void main(String[] args) {
		System.out.println("a".matches("[a-z]"));
		System.out.println("A".matches("[A-Z]"));
		System.out.println("박".matches("[가-힣]"));
		System.out.println("1".matches("[0-9]"));
		System.out.println("코미디".matches("^코[가-힣]*"));
		System.out.println("dog".matches("dog|cat|pig"));
		System.out.println("gif".matches("gif|jpg|png"));
		System.out.println("yes".matches("y(es)?"));
		
		//그룹
		System.out.println("abcabc".matches("(abc)+"));
		System.out.println("abc".matches("(abc)*"));
		System.out.println("hahahe".matches("(ha)+he"));
		System.out.println("aabb".matches("(a+b+)+"));
		System.out.println("123123".matches("(\\d+)+"));//([0-9]+)+
		System.out.println("a1b2c3".matches("(\\w\\d)+"));//([A-Za-z][0-9])+
		
		//공백
		System.out.println(" ".matches("\\s"));//공백
		System.out.println("1 2".matches("\\d\\s\\d"));
		System.out.println("a 1".matches("\\w\\s\\d"));
		
		//특수 문자 출력
		System.out.println("1+2".matches("\\d\\+\\d"));
		System.out.println("a\\b".matches("\\w\\\\\\w"));// \\->\
		System.out.println("c++".matches("\\w\\++"));
		System.out.println("^abc$".matches("\\^\\w{3}\\$"));
		
		System.out.println("\\");
	}
}
