/*
 * 선택문 : 다중조건문을 단순화 시킨 제어문
 * - 한 개만 수행 가능
 * - 네트워크에 주로 사용 / 웹 메뉴 처리
 * - 다중 조건문은 범위를 이용 / 선택문을 한 개의 값을 이용
 *
 * 형식
 * switch(정수 | 문자 | 문자열){
 * 		case 1://정수일 때
 * 			처리문장;
 * 			break;
 * 		case 'A'://문자일 때
 * 			처리문장;
 * 			break;
 * 		case "LOGIN"://문자열일 때
 * 			처리문장;
 * 			break;
 * 		default:
 * 			없는 case가 있는 경우(else의 역할)
 * }
 * 
 * 라벨이 중복되면 x
 * 
 * 
 * JDK 14 (JDK 21)
 * 
 * switch(no)
 * {
 * 		case 1 -> 실행문장 //자동으로 break를 포함
 * 		case 2 -> 실행문장
 * 		case 3, 4, 5 -> 실행문장
 * 		default -> 실행문장
 * }
 * 
*/

/*
 * 12, 1, 2월 -> 겨울
 * 3, 4, 5월 -> 봄
 * 6, 7, 8월 -> 여름
 * 9, 10, 11월 -> 가을
*/
public class 선택문_1 {

	public static void main(String[] args) {
		int month=(int)(Math.random()*12)+1; //1~12
		
		
//		if(month == 12 || month == 1 || month == 2)
//			System.out.println(month+"는(은) 겨울입니다");
//		else if(month >= 3 && month <= 5)
//			System.out.println(month+"는(은) 봄입니다");
//		else if(month >= 6 && month <= 8)
//			System.out.println(month+"는(은) 여름입니다");
//		else if(month >= 9 && month <= 11)
//			System.out.println(month+"는(은) 가을입니다");
//		else
//			System.out.println("없는 달입니다");
		
//		switch(month) {
//		case 3: case 4: case 5:
//			System.out.println(month+"는(은) 봄입니다");
//			break;
//		case 6: case 7: case 8:
//			System.out.println(month+"는(은) 여름입니다");
//			break;
//		case 9: case 10: case 11:
//			System.out.println(month+"는(은) 가을입니다");
//			break;
//		case 12: case 1: case 2:
//			System.out.println(month+"는(은) 겨울입니다");
//			break;
//		default:
//			System.out.println("없는 달입니다");
//		}
		
		switch(month) {
		case 12, 1, 2->System.out.println(month+"는(은) 겨울입니다");
		case 3, 4, 5->System.out.println(month+"는(은) 봄입니다");
		case 6, 7, 8->System.out.println(month+"는(은) 여름입니다");
		case 9, 10, 11->System.out.println(month+"는(은) 가을입니다");
		default->System.out.println("없는 달입니다");
		}
	}
}
