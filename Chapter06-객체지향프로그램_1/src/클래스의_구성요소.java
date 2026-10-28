/*
 * 1. 클래스의 구성요소
 * 2. 클래스에서 객체 생성 방법
 *   -생명 주기:객체 생성->객체 활용->객체 소멸->메모리 해제
 * 3. 생성자의 역할
 *   -생성자
 *     -변수의 초기화 / 메모리 저장 호출
 *     -프로그램 시작과 동시에 처리하는 기능
 *     -객체 생성 시 한번 호출(호출 시에 반드시 new를 동반)
 *     -만약 없다면 자동으로 생성(디폴트 생성자-매개변수가 없음)
 * 4. 변수 종류
 *   -지역변수: 메소드 영역에서 선언 / 메소드 종료시 소멸 (스택 공간)
 *   -정적변수: 공유변수 / 프로그램 종료시에 소멸 (Method Area)
 *            컴파일 시 생성(자동으로 생성)
 *   -인스턴스 변수: 객체마다 따로 가지고 있는 메모리 / 프로그램 종료시까지 (힙)
 *               new를 이용해서 생성
 * 4.1. 접근지정어
 *  -public, protected, default, private
 * 4.2. 제어어
 *  -static, final, abstract
 * 5. 객체지향의 3대 특성
 *  -캡슐화: 데이터 보호
 *    -Getter(읽기) / Setter(쓰기) - 변수의 기능
 *  -상속: 확장 / 재사용
 *    -extends
 *    -부모 클래스 - 재사용
 *    -자식 클래스 - 확장
 *    -포함 클래스
 *  -다형성: 새로운 기능 추가 / 기존의 기능 변경
 *    -오버로딩
 *    -오버라이딩
 * 6. 다른 클래스와 연동(클래스 종류)
 *   -추상 클래스 / 인터페이스 / 내부 클래스
 * 
 * 
 * 에러 방지 / 비정상 종료 방지
 * - 예외처리
 *   -컴파일 에러: 반드시 예외처리
 *   -실행시 에러: 하거나 안하거나
 * 
 * 메소드
 * -static 메소드: 공유하는 기능
 * -인스턴스 메소드: 객체마다 따로 기능 수행
 * -다른 클래스와 연결을 할 때 사용
 * 
 * 메모리
 * MethodArea: 클래스 정보(메소드), static변수
 * Stack: 지역변수, 매개변수 - 메모리 자체 관리
 *   -코드블록이 끝나면 자동 메모리 회수
 * Heap: 배열, 클래스 - 실제 데이터가 저장
 *   -GC
 *   
 * 초기화 블록
 * - 인스턴스 블록
 * {
 *   a=100;
 * }
 * - static 블록
 * static int b=10;
 * static{
 *   b=1000;
 * }
 *   
 * static메소드 / static 블록에는 인스턴스 사용이 불가능
 * 
*/
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter//자동으로 get 메소드를 만들어줌
@Setter//자동으로 set 메소드를 만들어줌
@NoArgsConstructor//자동으로 (매개변수 없는) 생성자 만들어줌
@AllArgsConstructor//매개변수 있는 생성자 만들어줌
class Sawon{
	private int sabun, pay;
	private String name, sex, deot, job, phone, address;
	
	//생성자, get 메소드, set 메소드가 자동으로 생성되었는지는 Outline에서 확인 가능
}

class A{
	int a=10;
	
	static void display() {
		int a=20;
		System.out.println(a+a);//매개변수 a
	}	
}
public class 클래스의_구성요소 {
	
	public static void main(String[] args) {
		A.display();
		A a=new A();
	}
}
