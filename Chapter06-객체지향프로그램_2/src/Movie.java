import lombok.Data;

@Data//Getter, Setter 메소드 자동 생성
public class Movie {//영화 한 개에 대한 정보 저장
	private int mno;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String director;
	//생성자는 자동 추가
}