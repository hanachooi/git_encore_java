package com.encore.databasee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Service는 Dao를 갖는다.
public class EncoreServiceImpl {

	private EncoreDao dao;
	
	public EncoreServiceImpl() {
		dao = new EncoreDao();
	}
	
	// Dao insertRow() 메서드를 호출해서 결과 반환
	public int insertService(PostRequestDTO params) {
		System.out.println(">>> Service insertService <<<");
		System.out.println(">>> params : " + params);
		int flag = dao.insertRow(params);
		return flag;
	}
	
	public int insertService(Map<String, String> params) {
		System.out.println(">>> Service insertService <<<");
		System.out.println(">>> params : " + params);
		int flag = dao.insertRow(params);
		return flag;
	}
	
	// 출력을 해야 하므로, String의 값으로 출력을 해야 함. 
	// 논리적 실행.
	public List<String> findAll(){
		System.out.println("서비스 전체 출력");
		// 객체 리스트를 dao 에서 받아오고
		List<PostResponseDTO> flag = dao.selectRow();
		List<String> list = new ArrayList<String>();

		// 받아온 객체 리스트를 객체 하나하나 받은 후, toString으로 형변환 후, String list에 받아서, 반환
		// 이때, DTO 에서, toString을 원하는 출력 방식으로, 오버라이딩 해야함. 
		for(PostResponseDTO d : flag) {
			list.add(d.toString());
		}
		
		return list;
	}
	
}
