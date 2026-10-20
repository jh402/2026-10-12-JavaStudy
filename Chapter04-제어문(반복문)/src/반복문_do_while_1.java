/*
 * do~while: 한 번 이상을 반드시 수행할 때 사용
 * 형식
 * do{
 * 	실행문장
 * }while(조건식)
 * 
 */
public class 반복문_do_while_1 {

	public static void main(String[] args) {
        char c='A';
        do {
        	System.out.print(c+" ");//A~Z
        	c++;
        }while(c<='Z');
        
        System.out.println("\n======= 뒤에서 부터 출력 ========");
        c='Z';
        do {
        	System.out.print(c+" ");
        	c--;
        }while(c>='A');
	}
}