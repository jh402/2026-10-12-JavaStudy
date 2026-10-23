
public class 배열_4 {

	public static void main(String[] args) {
		char[] alpha=new char[10];
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)((Math.random()*26)+'A');
		}
		for(char c:alpha) {
			System.out.print(c+" ");
		}
	}
}
