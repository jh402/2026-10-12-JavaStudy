package com.sist.problem;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}
