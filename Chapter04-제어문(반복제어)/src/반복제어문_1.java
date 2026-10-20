/*
 * 1. 반복 제어문-반복문 안에서 사용
 * (break는 switch에서도 사용)
 * 
 * break:반복문을 중단
 * continue:반복문에서 특정 부분을 건너뛸 때
 * 		    for문은 증가식, while문과 do~while문은 조건식으로 이동
 * 
 * 주의점!!
 * break, continue 밑에는 소스코딩이 불가능
 * 
 * for(){
 *   if(){
 *     break;
 *     System.out.println()//오류-실행 불가능하기 때문
 *   }
 * }
 * 
 * 자신의 반복문만 제어 가능
 * for(){
 *   for(){//break가 이 for문만 제어
 *     break;
 *   }
 * }
 * 
*/
public class 반복제어문_1 {

	public static void main(String[] args) {
		
		System.out.println("====== break =======");
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
				//System.out.println("종료");//오류
			}
			System.out.print(i+" ");
		}
		
		
		System.out.println("\n====== continue =======");
		for(int i=0;i<=10;i++) {
			if(i==5) continue;//증가식으로 이동
			System.out.print(i+" ");
		}
		
		
//		int i=1;
//		//무한루프
//		while(i<=10) {
//			if(i==5) continue;
//			System.out.print(i+" ");
//			i++;
//		}
//		
//		i=1;
//		//무한루프
//		do {
//			if(i==5) continue;
//			System.out.print(i+" ");
//			i++;
//		}while(i<=10);
	}
}
