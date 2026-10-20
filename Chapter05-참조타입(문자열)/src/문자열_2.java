//https://www.genie.co.kr/chart/top200?ditc=D&ymd=20261020&hh=14&rtm=Y&pg=1

import javax.swing.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 문자열_2 {

	public static void main(String[] args) throws Exception {
		String fd=JOptionPane.showInputDialog("검색어 입력: ");
		
		for(int i=1;i<=4;i++) {
			//웹 연결
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20261020&hh=14&rtm=Y&pg=1").get();
			Elements title=doc.select("table.list-wrap a.title");//제목
			Elements singer=doc.select("table.list-wrap a.artist");//가수명
			
			for(int j=0;j<title.size();j++) {
				if(title.get(j).text().contains(fd)) {
					System.out.println(title.get(j).text()+"("+singer.get(j).text()+")");
				}
			}
		}
		
		
	}
}
