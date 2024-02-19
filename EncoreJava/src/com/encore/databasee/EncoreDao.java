package com.encore.databasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Bussiness계층(Service) - Persistance계층(DAO) 
// DAO는 DB를 전담하는 객체
public class EncoreDao {

	// DAO 에서는 dto 를 가져와야 함. 
	public static final String URL = "jdbc:mariadb://localhost:3306/encore";
	public static final String DRIVER = "org.mariadb.jdbc.Driver";
	public static final String ID = "root";
	public static final String PASSWORD = "netdb3230";
	
	public EncoreDao() {
		
		// db의 드라이버를 생성 
		// 드라이버는 한번만 생성되야 한다.
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	// db에 삽입
	// DTO의 파라미터를 이용해서, 삽입. 
	public int insertRow(PostRequestDTO params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		// 커넥션
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			
			// dto에서 Title을 가져와서, pstmt에 setString 하기. 
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
	
	// 이건 Map 으로 넣기
	public int insertRow(Map<String, String> params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		// 커넥션이랑 상태 정의
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			// 상태에서, 쿼리를 준비함.
			pstmt = conn.prepareStatement(query);
			
			// pstmt에 쿼리 실행으로, setString을 해줌. 
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
		// 가져올 DTO 랑 가져온 DTO 를 담을 객체 List를 생성. 
		PostResponseDTO response = null;
		List<PostResponseDTO> list = new ArrayList<PostResponseDTO>();
		
		// 마찬가지로 connect와 상태 설정.
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 결과를 가져올 때는, ResultSet을 이용.
		ResultSet rs = null;
		int flag = 0;
		
		String query = "select idx, title, content, writer from post_tbl";
		// List 형으로 가져온 후, 리턴하기.
		try {
			// 드라이브 활용.
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			// 사용할 쿼리 설정
			pstmt = conn.prepareStatement(query);
			// 쿼리의 실행 결과를 저장
			// 쿼리의 실행결과. 저장. 
			rs = pstmt.executeQuery();
			
			// 쿼리 실행 결과가 존재하지 않을 때까지, 위에서 생성한, 객체 리스트에 담기. 
			while(rs.next()) {
				// 저장된곳에서, 하나씩 가져오기
				int idx = rs.getInt("idx");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String writer = rs.getString("writer");
				
				// 객체 리스트에 저장.
				response = new PostResponseDTO(idx, title, content, writer);
				list.add(response);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(conn != null) {conn.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		// 결과 리스트 반환
		return list;
	}
	
}
