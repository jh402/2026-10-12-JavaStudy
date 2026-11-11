package com.sist.reflect;

import java.lang.reflect.Method;

/*
 * 리플렉션
 * -실행 중인 프로그램의 클래스, 변수, 생성자, 메소드 정보를 얻어서 직접 조작하는 기술
 * 1. 클래스 정보 읽기
 * Class.forName("패키지.메소드명")
 * 2. 구성 요소 확인
 * 변수-Field 클래스
 *   -getName() - 변수명 가져오기
 *   -set() - 변수값 설정
 *   -get() - 변수값 가져오기
 *   
 * 생성자-Constructor 클래스
 * Class cls=Class.forName("A")//A클래스 가져오기
 * cls.getDeclareConstructor("Hello").newInstance()//객체 생성하고 (매개변수 있는) 생성자 호출
 * 
 * 메소드-Method 클래스
 * invoke() - 클래스에 있는 모든 메소드 호출 가능
 * 
 * 3. 조작
 * -변수값 설정
 * -생성자 호출
 * -메소드 호출
 * 4. 실행
 * 
 * 
 * 어노테이션
 * -클래스, 변수, 메소드에 표시를 하여 바로 찾을 수 있게 만드는 기술
 * -인덱스, if문 없이 추가
 * -기능은 없음
 * 
 * Spring에서의 예시)
 * @Controller / @Service / @Autowired / @GetMapping / @RequestMapping
 * MyBatis에서의 예시)
 * @Select / @Insert / @Update / @Delete
*/

import java.util.Scanner;

import com.sist.annotation.RequestMapping;

class Board{
	@RequestMapping("1")
	public void list() {
		System.out.println("게시판 목록 요청");
	}
	@RequestMapping("2")
	public void insert() {
		System.out.println("게시물 추가 요청");
	}
	@RequestMapping("3")
	public void detail() {
		System.out.println("게시판 상세보기");
	}
	@RequestMapping("4")
	public void update() {
		System.out.println("게시물 수정");
	}
	@RequestMapping("5")
	public void delete() {
		System.out.println("게시물 삭제 요청");
	}
	@RequestMapping("6")
	public void find() {
		System.out.println("게시물 검색 요청");
	}
	@RequestMapping("7")
	public void reply() {
		System.out.println("게시물 댓글 달기");
	}
}
public class 리플렉션_3 {
	public static void main(String[] args) {
		Board board=new Board();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("=========== 메뉴 ==========");
			System.out.println("1. 목록요청");
			System.out.println("2. 글쓰기");
			System.out.println("3. 상세보기");
			System.out.println("4. 수정하기");
			System.out.println("5. 삭제하기");
			System.out.println("6. 검색하기");
			System.out.println("7. 댓글쓰기");
			System.out.println("0. 종료");
			System.out.println("==========================");
			
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==0) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			/*
			else if(menu==1) {
				board.list();
			}
			else if(menu==2) {
				board.insert();
			}
			else if(menu==3) {
				board.detail();
			}
			else if(menu==4) {
				board.update();
			}
			else if(menu==5) {
				board.delete();
			}
			else if(menu==6) {
				board.find();
			}
			*/
			
			try {
				//class 읽기
				Class clsName=Class.forName("com.sist.reflect.Board");
				
				//newInstance() - 메모리 할당
				//getDeclaredConstructor() - 생성자 호출
				Object obj=clsName.getDeclaredConstructor().newInstance();
				
				//Method 전체 읽기
				Method[] methods=clsName.getDeclaredMethods();
				
				//Method 위에 있는 어노테이션(구분자) 찾기
				for(Method m:methods) {
					RequestMapping rm=m.getAnnotation(RequestMapping.class);//.class로 RequestMapping 객체 가져오기
					if(rm.value().equals(String.valueOf(menu))) {
						m.invoke(obj, null);
					}
				}
			}catch(Exception ex) {}
		}
		
	}
}