import java.util.*;
/*
 * 3자리 정수 맞추는 프로그램 
 * 
 * 힌트 
 * 포함 숫자가 있다 
 * 같은 자리 : S
 * 다른 자리 : B
 * 123 -> 235 -> 0S-2B
 * 135 -> 1S-1B
 * 123 -> 3S -> 종료
 * 
 */
public class 배열_6 {

	public static void main(String[] args) {
        int[] com=new int[3];
        
        for(int i=0;i<com.length;i++) {
        	com[i]=(int)(Math.random()*9)+1; // 1~9
        	for(int j=0;j<i;j++) {//중복제거
        		if(com[j]==com[i]) {
        			i--;
        			break;
        		}
        	}
        }
        //3자리 입력
        Scanner scan=new Scanner(System.in);
        int input, S=0, B=0;
        int[] val=new int[3];
        
        while(true) {
        	S=0;
        	B=0;
        	System.out.print("3자리 숫자 입력: ");
            input=scan.nextInt();
            
            for(int i=val.length-1;i>=0;i--) {
            	val[i]=input%10;
                input/=10;
            }
            
            for(int i=0;i<val.length;i++) {
            	for(int j=0;j<val.length;j++) {
            		if(val[i]==com[j]) {
            			B++;
            		}
            		if(i==j && val[i]==com[j]) {
            			B--;
            			S++;
            		}
            	}
            }
            //출력
            if(B==0&&S==0)
            	System.out.println("포함된 숫자가 없다.");
            else if(B==0)
            	System.out.println(S+"S");
            else if(S==0)
            	System.out.println(B+"B");
            else
            	System.out.println(S+"S-"+B+"B");
            
            if(S==3)
            	break;
        }
        
	}
}