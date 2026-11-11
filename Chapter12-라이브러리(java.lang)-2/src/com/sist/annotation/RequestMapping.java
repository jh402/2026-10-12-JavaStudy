package com.sist.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)//프로그램 종료할 때 까지
@Target(METHOD)//메소드 구분
public @interface RequestMapping {
	public String value();
}