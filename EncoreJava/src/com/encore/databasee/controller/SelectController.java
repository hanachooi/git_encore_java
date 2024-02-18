package com.encore.databasee.controller;

import java.util.List;

import com.encore.databasee.EncoreServiceImpl;

// 일단, Controller는 Service의 인스턴스를 생성함. 
public class SelectController {

	private EncoreServiceImpl service;
	
	public SelectController() {
		service = new EncoreServiceImpl();
	}
	
	// 컨트롤러에서는 서비스 계층으로 접근을 해야함. 
	public List<String> selectAll() {
		System.out.println(">>> 컨트롤러 출력 << ");
		List<String> list = null;
		
		try {
			list = service.findAll();
		} catch(Exception e) {
			e.printStackTrace();
		}

		return list;
	}


	
}
