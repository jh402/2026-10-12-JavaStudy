package com.sist.abs;

import lombok.Data;

@Data
public class Music {
	private int mno;//음악에 대한 고유 번호
	private int idcrement;
	private String title, singer, album, state;
}
