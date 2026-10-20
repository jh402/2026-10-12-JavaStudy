/*
 * 반복문 
 * for: 반복 횟수 지정 
 * -> 화면 UI / 페이지 나누기 / 배열 / 컬렉션 
 * while: 반복 횟수가 없는 경우 
 * -> Back-End / 데이터베이스 연동 / 게임 
 * do~while: 1번이상 반드시 반복할 경우에 사용 
 *  
 * 반복 제어문: 반복 중단 / 반복을 건너뛴다 
 * break, continue
 *     
 * for문 형식
 * for(초기값; 조건문; 증가식){
 * 		반복 문장
 * }
 * 조건문이 false면 반복 종료
 */
public class 반복문_1 {

	public static void main(String[] args) {
		System.out.println("======== 대문자 =======");
        for(char c='A';c<='Z';c++){
        	System.out.print(c);
        }
        // c변수는 자동으로 소멸
        System.out.println("\n====== 소문자 =======");
        for(char c='a';c<='z';c++){
        	System.out.print(c);
        }
        System.out.println("\n====== 대문자 거꾸로 ======");
        for(char c='Z';c>='A';c--){
        	System.out.print(c);
        }
        System.out.println("\n====== 소문자 거꾸로 ======");
        for(char c='z';c>='a';c--){
        	System.out.print(c);
        }
        System.out.println("\n====== 1~10 까지 출력 ======");
        for(int i=1;i<=10;i++){
        	System.out.print(i+" ");
        }
        System.out.println("\n====== 1~10 까지 홀수 출력 ======");
        for(int i=1;i<=10;i+=2){
        	System.out.print(i+" ");
        }
	}

}