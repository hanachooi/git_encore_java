package com.encore.databasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseMain {
// DAO 로만 연동이 되어야 한다. 
	public static void main(String[] args) {

		// url, druver, ud, pwd
		// mariadb의 url, driver, id, password 정보를 입력
		String URL = "jdbc:mariadb://localhost:3306/encore";
		String DRIVER = "org.mariadb.jdbc.Driver";
		String ID = "root";
		String PASSWORD = "netdb3230";
		
		/*	orm 없이, jdbc를 직접 import 해서, 사용하는 걸 배움. 
		 	JDBC
		 	try{
		 	===================== ORM (Mybatis, JPA)
		 	1. 벤더사에서 제공하는 드라이버 로딩
		 	2. 연결( url, id, password)
		 	3. 실행 구문을 담을 수 있는 그릇이 필요 (Statement, PreparedStatement)
		 	4. 실행 (execute) - executeQuery, executeUpdate
		 	5. 실행 결과를 반환 받는다.
		 	======================
		 	6. 결과를 객체화 시키고 다건일 경우 자료구조를 이용해서 담는 것 
		 	7. 외부리소스(디비연결)를 담는 것
		 	} catch(){
		 	
		 	}
		 	finally{
		 	
		 	}
		 	
		 */
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try{
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 완료 !!!");
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			System.out.println("디비 연결 완료 >>> " + conn);
			
			/* Single find 
			String sql = "select dept_id, dept_name, loc_id from department where dept_id = ?";
			// dbms 는 sql의 결과를 테이블로 관리. 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "10");
			// rset에 sql 이 결과값인 테이블이 담기게 된다. 이를, dto에 담아야 함.  
			rset = pstmt.executeQuery();
			DepartmmentResponseDTO response = null;
			while(rset.next()) {
				// 디비에 저장되어 있는 거를, dto 로 저장을 시키는 방법. 
				response = new  DepartmmentResponseDTO();
				response.setDept_id(rset.getString(1));
				response.setDept_name(rset.getString(2));
				response.setLoc_id(rset.getString(3));
			}
			System.out.println("Result >>> " + response);
			*/
			
			String sql = "insert into department values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "70");
			pstmt.setString(2, "교육");
			pstmt.setString(3, "A3");
			int result = pstmt.executeUpdate();
			System.out.println("DML Result >>> " + result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
