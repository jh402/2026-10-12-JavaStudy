import java.io.*;
import java.util.*;

public class MovieSystem {
	//목록, 접속자... -> static
	private static Movie[] movies;
	
	
	//정적 변수 초기화 하기 위해 사용
	static {
		/*
		 * 예외 복구 - try~catch
		 * 예외 회피 - throws - 메소드 뒤에
		 * 예외 발생 - throw
		 */
		try {
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();//문자열 임시 저장, 한번에 모아서 처리
			//+연산자로 문자열 결합 시 메모리 변경 - 느림
			int i=0;//한 글자씩
			while((i=fr.read())!=-1) {//EOF
				sb.append((char)i);
			}
			fr.close();//파일 닫기
			//System.out.println(sb.toString());//저장된 모든 데이터를 출력
			
			String[] movie=sb.toString().split("\n");
			
			movies=new Movie[movie.length];
			
			i=0;
			for(String m:movie) {
				String[] info=m.split("\\|");
				movies[i]=new Movie();
				movies[i].setMno(Integer.parseInt(info[0]));
				movies[i].setTitle(info[1]);
				movies[i].setGenre(info[2]);
				movies[i].setActor(info[4]);
				movies[i].setRegdate(info[5]);
				movies[i].setGrade(info[6]);
				movies[i].setDirector(info[7]);
				i++;
			}
			
		}catch(Exception ex) {
			//System.out.println(ex.getMessage());//에러 메시지 출력
			ex.printStackTrace();
		}
	}
	
	//목록 출력
	public Movie[] movieListMovies() {
		return movies;
	}
	//상세보기
	public Movie movieDetailData(int mno) {
		return movies[mno-1];
	}
	//검색
	public Movie[] movieFindData(String fd) {
		int count=0;
		for(Movie m:movies) {
			if(m.getTitle().contains(fd)) {
				count++;
			}
		}
		Movie[] m=new Movie[count];
		int i=0;
		for(Movie fdm:movies) {
			if(fdm.getTitle().contains(fd)) {
				m[i]=fdm;
				i++;
			}
		}
		return m;
	}
}