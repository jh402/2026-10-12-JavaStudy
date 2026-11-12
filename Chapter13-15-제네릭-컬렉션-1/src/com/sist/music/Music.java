package com.sist.music;

import lombok.Data;

@Data
public class Music {
	private int mno;
	private String title;
	private String singer;
	private String poster;
	private String key;//정규식 / 검색
}
