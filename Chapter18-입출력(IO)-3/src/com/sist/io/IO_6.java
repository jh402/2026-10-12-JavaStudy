package com.sist.io;

import java.nio.file.*;

/*
 * java.nio.file
 * Files-파일/폴더를 쉽게 관리할 수 있게 만든 클래스
 * 사용처-파일생성/삭제/복사/이동/읽기/쓰기
 * 
 * 1. Path - 파일 경로 지정
 * 2. Files - 파일 생성/읽기/쓰기
 * 3. 파일 시스템 - 실제 파일/폴더 처리
 * 
 *   exists() - 파일 존재 여부
 *   createFile() - 파일 생성
 *   writeString() - 문자열 저장
 *   readString() - 문자열 읽기
 *   copy() - 파일 복사
 *   move() - 파일 이동
 *   delete() - 파일 삭제
*/
public class IO_6 {
	public static void main(String[] args) {
		try {
			//파일 경로 지정
			Path path=Paths.get("test.txt");
			//파일 생성, 존재 여부
			if(Files.exists(path)) {
				System.out.println("test.txt 파일이 존재");
			}
			else {
				Files.createFile(path);
				System.out.println("파일 생성 완료");
			}
			path=Paths.get("C:\\java_data\\melon.txt");
			if(Files.exists(path)) {
				System.out.println("melon.txt 파일이 존재");
			}
			else {
				Files.createFile(path);
				System.out.println("파일 생성 완료");
			}
			
			//파일에 문자열 저장
			Files.writeString(path, "Hello Files!");
			System.out.println("파일 저장 완료!");
			
			//파일 읽기
			path=Paths.get("C:\\java_data\\genie.txt");
			String data=Files.readString(path);
			//System.out.println(data);
			
			//파일 복사
			Path source=Paths.get("test.txt");
			Path target=Paths.get("copy.txt");
			
			Files.copy(source, target);
			System.out.println("복사 완료");
			
			//파일 이동
			source=Paths.get("copy.txt");
			target=Paths.get("new.txt");
			Files.move(source, target);
			System.out.println("이동 완료/이름 변경");
			
			//파일 삭제
			//Files.delete(target);
			Files.deleteIfExists(target);//target 파일이 존재한다면 삭제
			System.out.println("삭제 완료");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
