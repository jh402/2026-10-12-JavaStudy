 /*
 * 변수의 범위 
 *    
 * if(조건){
 *   int a=10;
 *   if(조건){
 *     int b=20;
 *     if(조건){
 *       int c=30;
 *     }// c
 *   }// b    
 * }// a
 * 
 */
public class 반복문_2 {
	
	public static void main(String[] args) {
        //1~100까지의 합 
		int sum=0;  
		for(int i=1;i<=100;i++){
			System.out.println("sum="+sum+",i="+i);
			sum+=i;
		}
		System.out.println("1~100까지의 합:"+sum);
	}

}