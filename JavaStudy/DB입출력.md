[JavaStudy](../README.md)

# JDBC
- 자바는 DB와 연결해서 데이터 입출력 작업을 할 수 있도록 JDBC 라이브러리를 제공한다.
- java.sql 패키지에서 사용한다.
- DBMS의 종류와 상관없이 동일하게 사용할 수 있다.

**java.sql 패키지**
- **DriverManager**
  - JDBC Driver를 관리하며 DB와 연결해서 Connection 구현 객체를 생성
- **Connection** 인터페이스 : Statement, PreparedStatement, CallableStatement 구현 객체를 생성
