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
	public List<String> findAll(){
		System.out.println("서비스 전체 출력");
		List<PostResponseDTO> flag = dao.selectRow();
		List<String> list = new ArrayList<String>();

		for(PostResponseDTO d : flag) {
			list.add(d.toString());
		}
		
		return list;
	}
	
}
