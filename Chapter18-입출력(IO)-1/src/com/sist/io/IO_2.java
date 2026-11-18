package com.sist.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 바이트 스트림(1byte)
 * -이미지, PDF, ...
 * 
 * 문자 스트림(2byte)
 * -txt, csv, ...
 * 
 * 
 * InputSream
 *   -FileInputStream-파일 읽기(다른 폴더 / 컴퓨터)
 *   -ObjectInputStream-객체 단위 읽기
 * OutputStream
 *   -FileOutputStream-파일 쓰기(다른 폴더 / 컴퓨터)
 *   -ObjectOutputStream-객체 단위 쓰기
 * 
 * Reader
 *   -FileReader - 파일 읽기
 * Writer
 *   -FileWriter - 파일 쓰기
 * 단점: 한 글자 읽기->성능 저하
 * 
 * 
 * 보조스트림
 * BufferedInputStream
 * BufferedOutputStream
 * 
 * BufferedReader
 * BufferedWriter
 *   
 * 
 * 변환하는 클래스:1byte 송신(인코딩) -> 2byte 수신(디코딩)
 * InputStreamReader - 1byte->2byte변환(한글 깨짐 방지)
 * 
 * File - 파일 정보 - java.io 
 * Files - 파일 전송 - java.nio.file
 *   - read()
 *   - write()
 *   - close()
 *   - getName() - 파일명만 가져오기
 *   - getPath - 경로~파일명 가져오기
 *   - getParent() - 경로명만 가져오기
 *   - length() - 파일 크기(Long형)
 *   - lastModeified - long - new Date() - 최종 수정일
 *   - boolean isHidden() - 숨긴 파일
 *   - boolean canRead() - 읽기 전용
 *   - boolean canWrite() - 쓰기 전용
 *   - isFile() / isDirectory()
 *   파일제어
 *   - listFile() - 지정된 폴더 안에 있는 모든 파일/폴더 정보
 *   - mkdir() - 폴더 생성
 *   - mkdirs() - 폴더 안에 폴더 생성
 *   - createNewFile() - 파일 생성
 *   - delete() - 파일 삭제
 *   - exists() - 파일 존재 여부
 * 
 * 입출력
 * Scanner - System.in
 * BufferedReader - System.out
 * 
 * 네트워크 입출력 - 저장하는 공간: Socket
 * 
 * 숨겨야 하는 데이터
 * - 공통IP
 * - user
 * - password
 * - API Key - AI / AWS
 * 
 * 
 * 파일 종류
 * xml: 다른 프로그램에서 연동-설정 파일
 * json: 자바스크립트 연동(전송하는 파일)
 * yml, properties: SpringBoot 설정파일
 * txt/csv/doc ...
 * 
 * 파일 단점
 * 1. 데이터 노출
 * 2. 파일 깨짐
 * 3. 삭제될 가능성
 * 4. 구분자 없음
 * 
 * 오라클
 * - 컬럼으로 구분
 * - 이미지파일로 저장-보안
 * - 사용 편리
 * 
 * java.io는 반드시 예외처리
 * CheckedException이기 때문
*/
public class IO_2 {
	public static void main(String[] args) {
		try {
			//File은 file / directory 동시 제어
			//파일 정보 읽기
			File file=new File("C:\\javaDev\\javaStudy\\Chapter18-입출력(IO)-1\\src\\com\\sist\\io\\IO_2.java");
			//파일명, 경로명 확인
			System.out.println("파일명:"+file.getName());
			System.out.println("경로명:"+file.getParent());
			System.out.println("경로+파일:"+file.getPath());
			
			//속성
			System.out.println("숨긴 파일:"+file.isHidden());
			System.out.println("읽기 전용:"+file.canRead());
			System.out.println("쓰기 전용:"+file.canWrite());
			System.out.println("파일인가?"+file.isFile());
			System.out.println("폴더인가?"+file.isDirectory());
			
			//수정일
			System.out.println("수정일:"+
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
				.format(new Date(file.lastModified()))
			);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
