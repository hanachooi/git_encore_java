package com.encore.databasee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.encore.databasee.controller.InsertController;
import com.encore.databasee.controller.SelectController;

public class MVCMain {

	public static void main(String[] args) {

		// 사용자의 입력화면을 통해서, 게시글 작성을 요청하는 영역
		InsertController insert = new InsertController();
		
		/* dto에 담기
		// 사용자가 입력한 값을 dto에 담아서 controller에게 전달 
		PostRequestDTO params = new PostRequestDTO();
		params.setTitle("불금");
		params.setContent("간소해야함");
		params.setWriter("섭섭해");
		int flag = insert.execute(params);
		*/
		
		/*
		Map<String ,String> map = new HashMap<String, String>();
		map.put("title", "불금");
		map.put("content", "간소해야함");
		map.put("writer", "섭섭해");
		int flag = insert.execute(map);
		System.out.println(">>>> insert Result : " + flag);
		*/
		
		System.out.println(">>> 전체 출력 <<<");
		SelectController select = new SelectController();
		//List<PostResponseDTO> list = select.execute();
		// 출력 
		
	}

}
