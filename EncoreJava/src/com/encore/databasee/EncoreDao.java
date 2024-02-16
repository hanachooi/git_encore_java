package com.encore.databasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

// Bussiness계층(Service) - Persistance계층(DAO) 
// DAO는 DB를 전담하는 객체
public class EncoreDao {

	public static final String URL = "jdbc:mariadb://localhost:3306/encore";
	public static final String DRIVER = "org.mariadb.jdbc.Driver";
	public static final String ID = "root";
	public static final String PASSWORD = "netdb3230";
	
	public EncoreDao() {
		
		// 드라이버는 한번만 생성되야 한다.
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public int insertRow(PostRequestDTO params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, params.getTitle());
			pstmt.setString(2, params.getContent());
			pstmt.setString(3, params.getWriter());
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(conn != null) {conn.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// int flag = executeUpdate();
		return 1;
	}
	public int insertRow(Map<String, String> params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, params.get("title"));
			pstmt.setString(2, params.get("content"));
			pstmt.setString(3, params.get("writer"));
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(conn != null) {conn.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		// int flag = executeUpdate();
		return 1;
	}
	
	// PostResponseDto - idx, title, content, writer
	// return list.add(PostResponseDto)
	public List<PostResponseDTO> selectRow(){
		System.out.println(">>> Dao selectRow <<<");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		
		String query = "select idx, title, content, writer from post_tbl";
		// List 형으로 가져온 후, 리턴하기.
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			
			pstmt.get
			
			pstmt.setString(1, params.get("title"));
			pstmt.setString(2, params.get("content"));
			pstmt.setString(3, params.get("writer"));
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(conn != null) {conn.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		// int flag = executeUpdate();
		return 1;
		return null;
	}
	
}
