
public class 반복문_5 {

	public static void main(String[] args) {
        for(char c='A';c<='Z';c++)
        	System.out.print(c);
        
        System.out.println("\n==========");
        char c='A';
        for(int i=0;i<26;i++){
        	System.out.print(c++);
        }
        //i, j - 사용하지 않는다 / a, b, m, n  - 권장 
	}

}