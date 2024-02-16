package com.encore.databasee.controller;

import java.util.Map;

import com.encore.databasee.EncoreServiceImpl;
import com.encore.databasee.PostRequestDTO;

// Insert이므로, View로부터 데이터를 넘겨받는다. 
public class InsertController {

	private EncoreServiceImpl service;
	
	public InsertController() {
		service = new EncoreServiceImpl();
	}
	
	public int execute(PostRequestDTO request) {
		System.out.println(">> Ctrl insertRow <<");
		System.out.println(">> params : " + request);
		int flag = service.insertService(request);
		return flag;
	}
	
	public int execute(Map<String, String> request) {
		System.out.println(">> Ctrl insertRow <<");
		System.out.println(">> params : " + request);
		int flag = service.insertService(request);
		return flag;
	}
}
