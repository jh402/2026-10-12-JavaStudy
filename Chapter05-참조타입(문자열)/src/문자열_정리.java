/*
 * 문자열
 * String - 문자열 저장 - 관리 / 제어
 * 
 * 관리-저장
 * String s="";
 * String s=new String(""); - 새로운 메모리 생성 후 저장
 * 
 * 제어-메소드
 * **equals() - 문자열 비교
 * **length() - 문자열 갯수
 * indexOf() - 문자 위치 찾기(index번호) - 없는경우 -1
 * lastIndexOf() - 문자 위치 찾기(index번호) - 없는경우 -1
 * **trim(), strip()- 문자열의 좌우 공백 제거
 * toUpperCase() - 소문자를 대문자로
 * toLowerCase() - 대문자를 소문자로
 * **replace() - 문자, 문자열 변환
 * concat() - 문자열 결합 (거의 사용x)
 * **startsWith() - 앞의 문자열 같은 경우
 * endsWith() - 뒤의 문자열 같은 경우
 * contains() - 문자열 포함 되어 있을 때
 * **valueOf() - 모든 데이터형을 문자열로 변경
 * format() - 형식에 맞게 문자열 변환
 * **split() - 지정된 문자를 잘라서 배열에 저장
 * **substring - 문자열을 자르는 경우에 사용
 *   -substring(int start) - 자르는 위치가 start부터 끝까지
 *   -substring(int start, int end) - 인덱스 번호가 start부터 end-1까지
 * 
*/
public class 문자열_정리 {

	public static void main(String[] args) {
		String s="Hello Java";
		int a=s.indexOf("b");
		if(a==-1)
			System.out.println("찾는 문자열이 없습니다.");
		
		s=" Hello Java ";
		System.out.println(s.strip());
		System.out.println(s.trim());
	}

}
