import java.util.*;

public class Main {
	public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("========== Menu ==========");
			System.out.println("1. 영화 전체 목록");
			System.out.println("2. 영화 상세 보기");
			System.out.println("3. 영화 검색");
			System.out.println("4. 종료");
			System.out.println("==========================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			
			//종료
			if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			//전체 목록
			else if(menu==1) {
				Movie[] movie=ms.movieListMovies();
				for(Movie m:movie) {
					System.out.println(m.getMno()+"."+m.getTitle());
				}
			}
			//상세 보기
			else if(menu==2) {
				System.out.print("1~1938 사이의 영화 번호 입력:");
				int mno=scan.nextInt();
				Movie movie=ms.movieDetailData(mno);
				System.out.println("========== 영화 상세 ==========");
				System.out.println("영화번호:"+movie.getMno());
				System.out.println("영화명:"+movie.getTitle());
				System.out.println("장르:"+movie.getGenre());
				System.out.println("출연진:"+movie.getActor());
				System.out.println("개봉일:"+movie.getRegdate());
				System.out.println("등급:"+movie.getGrade());
				System.out.println("감독:"+movie.getDirector());
			}
			//검색
			else if(menu==3) {
				System.out.print("검색어 입력:");
				String fd=scan.next();
				Movie[] movie=ms.movieFindData(fd);
				
				System.out.println("검색된 영화 갯수 "+movie.length+"개");
				for(Movie m:movie) {
					System.out.println(m.getMno()+"."+m.getTitle());
				}
			}
		}
	}
}
