public class 이중_for_1 {

	public static void main(String[] args) {
		// 알고리즘 / 정보처리 문제 (실기)
        for(int i=1;i<=4;i++) {
        	for(int j=1;j<=4;j++) {
        		if((5-i)==j || i==j)
        		 System.out.print("★");
        		else
        		 System.out.print("☆"); 
        	}
        	System.out.println();
        }
	}

}