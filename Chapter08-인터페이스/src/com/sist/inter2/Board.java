package com.sist.inter2;

public interface Board {
	//댓글, 자료실, 파일 등등
	public void write();
	public void list();
	public void detail();
	public void update();
	public void delete();
	
	//모든 게시판 종류가 동일한 경우 구현
	public default void paging() {
		
	}
}
