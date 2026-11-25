[JavaStudy](../README.md)

# JDBC
- 자바는 DB와 연결해서 데이터 입출력 작업을 할 수 있도록 JDBC 라이브러리를 제공한다.
- java.sql 패키지에서 사용한다.
- DBMS의 종류와 상관없이 동일하게 사용할 수 있다.

**java.sql 패키지**
- **DriverManager**
  - 클래스
  - JDBC Driver를 관리
  - DB와 연결해서 Connection 구현 객체를 생성
- **Connection**
  - 인터페이스
  - Statement, PreparedStatement, CallableStatement 구현 객체를 생성
  - 트랜잭션 처리 및 DB 연결을 끊을 때 사용
- **Statement**
  - 인터페이스
  - SQL의 DDL과 DML을 실행할 때 사용
  - 변경되지 않는 정적 SQL문을 실행할 때 사용
- **PreparedStatement**
  - SQL의 DDL과 DML을 실행할 때 사용
  - 매개변수화된 SQL문을 사용
  - Statement보다 편리성과 보안성이 좋다.
- **CallableStatement**
  - DB에 저장되어 있는 프로시저와 함수를 호출할 때 사용
- **ResultSet**
  - DB에서 가져온 데이터를 읽을 때 사용

# DB연결
Class.forName() 메소드는 문자열로 주어진 JDBC Driver 클래스를 Build Path에서 찾고 메모리로 로딩

이 과정에서 JDBC Driver 클래스의 static 블록이 실행되면서 DriverManager에 JDBC Driver 객체를 등록

Build Path에서 JDBC Driver 클래스를 찾지 못하면 ClassNotFoundException 발생하므로 예외처리
```java
Class.forName("oracle.jdbc.OracleDriver");
```

DriverManager에 JDBC Driver가 등록되면 getConnection() 메소드로 DB와 연결

연결 문자열은 DBMS마다 다른 형식

Oracle의 연결 문자열은 `jdbc:oracle:thin:@IP주소:포트/DB명`의 형식
```java
Connection conn=DriverManager.getConnection("연결 문자열", "사용자", "비밀번호");
```
