
public class Food {
	//필드
	String name;
	
	//생성자
	Food(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		Food f=new Food("고등어");//생성자 호출
		 System.out.println(f.name);//멤버 변수 출력
	}
}
