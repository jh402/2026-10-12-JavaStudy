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
## JDBC Driver 클래스를 메모리로 로딩
Class.forName() 메소드는 문자열로 주어진 JDBC Driver 클래스를 Build Path에서 찾고 메모리로 로딩

이 과정에서 JDBC Driver 클래스의 static 블록이 실행되면서 DriverManager에 JDBC Driver 객체를 등록

Build Path에서 JDBC Driver 클래스를 찾지 못하면 ClassNotFoundException 발생하므로 예외처리
```java
Class.forName("oracle.jdbc.OracleDriver");
```
## DB와 연결
DriverManager에 JDBC Driver가 등록되면 getConnection() 메소드로 DB와 연결

연결 문자열은 DBMS마다 다른 형식

Oracle의 연결 문자열은 `jdbc:oracle:thin:@IP주소:포트/DB명`의 형식
```java
Connection conn=DriverManager.getConnection("연결 문자열", "사용자", "비밀번호");
```

## 연결 끊기
close() 함수로 연결 끊기

null인 경우 연결이 끊겼다는 의미
```java
//연결하기
Connection conn=DriverManager.getConnection("연결 문자열", "사용자", "비밀번호");
//연결 끊기
if(conn!=null) conn.close();
```

## SQL문 실행
1. sql문을 실행하려면 PreparedStatement가 필요
2. Connection의 prepareStatement() 메소드에 sql문을 주고 PreparedStatement를 얻기
3. sql문의 ?에 들어갈 값을 Setter 메소드를 이용하여 값의 타입에 따라 메소드 선택
4. sql문의 ?는 순서에 따라 1번부터 번호 부여
5. executeQuery() 메소드로 Select문 실행 후 데이터를 ResultSet에 저장하고 리턴
6. PreparedStatement와 ResultSet를 사용하지 않는다면 close()

```java
String sql="SELECT * FROM user where name=?"
PreparedStatement ps=conn.prepareStatement(sql);
ps.setString(1, "이름");
ResultSet rs=ps.executeQuery();

rs.close();
ps.close();
```

### ResultSet
- SQL문의 SELECT문에 기술된 컬럼으로 구성된 행의 집합
- 커서(행을 가리키는 포인터)가 있는 행의 데이터만 읽을 수 있다.
- 실제 가져온 데이터 행의 앞과 뒤에 beforeFirst행과 afterLast행이 붙는다.
- 최초 커서는 beforeFirst커서를 가리킨다.
- first행을 읽기 위해 next() 메소드 사용
- 이동한 행에 데이터가 있다면 true, 없다면 false
- 각 컬럼의 값은 Getter 메소드로 데이터 타입에 따라 읽을 수 있다.

```java
ResultSet rs=ps.executeQuery();
while(rs.next()){
  //last행까지 이동하면서 데이터 행 처리
  String value=rs.getString("컬럼 이름 또는 순번");
}
//afterLast 행으로 이동한 경우
```
