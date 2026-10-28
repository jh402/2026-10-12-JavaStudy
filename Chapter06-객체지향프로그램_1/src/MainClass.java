
class Student{
	int hakbun; //0으로 자동 초기화
	String name; //null
	int kor, eng, math; //0
	static String schoolName;
	
	public Student() {
		System.out.println("변수의 초기화 담당");
		System.out.println("처음 실행 시 기능이 필요한 경우...");
		System.out.println("this="+this);
	}
	//매개변수가 있는 생성자 - 초기값을 다르게 만드는 경우

	public Student(int hakbun, String name, int kor, int eng, int math) {
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		Student std1=new Student();
		System.out.println("std="+std1);
		
		Student std2=new Student();
		System.out.println("std="+std2);
		
		Student s1=new Student(20261234, "홍길동", 30, 80, 60);
		Student s2=new Student(20261235, "심청이", 70, 60, 60);
		Student s3=new Student(20261236, "박문수", 90, 100, 80);
		//Student[] s=new Student[3];
		
		System.out.println("학번:"+s1.hakbun);
		System.out.println("이름:"+s1.name);
		System.out.println("국어:"+s1.kor);
		System.out.println("영어:"+s1.eng);
		System.out.println("수학:"+s1.math);
		System.out.println();
		
		System.out.println("학번:"+s2.hakbun);
		System.out.println("이름:"+s2.name);
		System.out.println("국어:"+s2.kor);
		System.out.println("영어:"+s2.eng);
		System.out.println("수학:"+s2.math);
		System.out.println();
		
		System.out.println("학번:"+s3.hakbun);
		System.out.println("이름:"+s3.name);
		System.out.println("국어:"+s3.kor);
		System.out.println("영어:"+s3.eng);
		System.out.println("수학:"+s3.math);
	}
}