package com.sist.list;

import java.util.Date;

import lombok.Data;

@Data
public class BookVO {
	private int no;
	private String title;
	private String poster;
	private String author;
	private Date pubdate;
	private String pages;
	private int price;
}
