public class 이중_for_2 {

	public static void main(String[] args) {
		//구구단
        for(int i=1;i<=9;i++){
        	for(int j=2;j<=9;j++){
        		System.out.printf("%2d * %2d = %2d\t", j, i, j*i);
        	}
        	System.out.println();
        }
	}

}