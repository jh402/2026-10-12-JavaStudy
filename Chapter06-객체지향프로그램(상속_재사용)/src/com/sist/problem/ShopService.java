package com.sist.problem;

public class ShopService {
	private static ShopService singleton=new ShopService();
	
	private ShopService() {
		
	}
	public static ShopService getInstance(){
		return singleton;
	}
	public static void main(String[] args) {
		ShopService obj1=ShopService.getInstance();
		ShopService obj2=ShopService.getInstance();
		
		
	}
}
