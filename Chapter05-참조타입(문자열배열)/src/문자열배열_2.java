import java.util.*;
import java.awt.print.PrinterException;
import java.io.*;

/*
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 * 
 * 
*/
public class 문자열배열_2 {

	public static void main(String[] args) {
		try {
		//파일읽기
		FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
		int i=0;//문자 한 개 읽을 때 사용
		//String movies="";
		StringBuffer sb=new StringBuffer();
		while((i=fr.read())!=-1) {//-1 파일의 끝(EOF)
			sb.append((char)i);
		}
		fr.close();
		
		String[] movies=sb.toString().split("\n");
		String[] rank=new String[movies.length];
		String[] title=new String[movies.length];
		String[] genre=new String[movies.length];
		String[] actor=new String[movies.length];
		String[] grade=new String[movies.length];
		String[] director=new String[movies.length];
		
		i=0;
		//영화데이터 초기화
		for(String movie:movies) {
			//System.out.println(movie);
			String[] total=movie.split("\\|");
			rank[i]=total[0];
			title[i]=total[1];
			genre[i]=total[2];
			actor[i]=total[4];
			grade[i]=total[6];
			director[i]=total[7];
			i++;
		}
		
		Scanner scan=new Scanner(System.in);
//		for(i=0;i<10;i++) {
//			System.out.println(rank[i]+"."+title[i]);
//		}
		
//		System.out.println("============ 관람가 ============");
//		System.out.print("등급 선택:");
//		String g=scan.next();
//		
//		for(i=0;i<grade.length;i++) {
//			if(grade[i].contains(g))
//				System.out.println(title[i]+" "+grade[i]);
//		}
		
//		System.out.println("============ 출연진 ============");
//		System.out.print("출연진 입력:");
//		String a=scan.next();
//		
//		for(i=0;i<actor.length;i++) {
//			if(actor[i].contains(a))
//				System.out.println(title[i]);
//		}
		
//		System.out.println("============ 영화 제목 검색 ============");
//		System.out.print("영화명 입력:");
//		String name=scan.next();
//		for(String n:title) {
//			if(n.contains(name))
//				System.out.println(n);
//		}
		
//		int totalpage=(int)(Math.ceil(title.length/10.0));//총 페이지 구하기 ceil - 올림
//		System.out.print("페이지 입력(1~"+totalpage+"):");
//		int page=scan.nextInt();
//		i=0;
//		int pageCnt=(page*10)-10;
//		
//		for(int j=0;j<title.length;j++) {
//			if(i<10 && j>=pageCnt) {
//				System.out.println(rank[j]+"."+title[j]);
//				i++;
//			}
//		}
		
		System.out.print("주인공 이름을 입력:");
		String ac=scan.next();
		
		System.out.println("==========="+ac+"님의 출연작 ============");
		int cnt=0;
		
		for(i=0;i<actor.length;i++) {
			if(actor[i].contains(ac)) {
				System.out.println(title[i]);
				cnt++;
			}
		}
		System.out.println("총 출연작은 "+cnt+"편입니다");
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
