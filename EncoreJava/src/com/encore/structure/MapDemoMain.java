package com.encore.structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 Map Interface
 - 비선형 자료구조
 - key, value로 데이터를 관리
 - 값은 중복허용하지만, key는 중복허용하지 않음. 
 - 직접 파일 형식처럼 direct access 가능하여 검색에 용이하다. 
 - HashMap
 */
public class MapDemoMain {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		// 키 값만 반환하는, set이 만들어짐. 
		// map.entrySet();
		
		System.out.println("value 추가 >>>>> ");
		// key 를 통해, 값을 넣기 때문에 순서를 신경쓸 필요가 없다. 
		map.put("title", "불필요한 금요일");
		map.put("content", "병원에 가자");
		map.put("writer", "임섭순");
		map.put("writer", "임섭순");		// 중복을 넣게 되면, 뒤에 넣은 걸로 put이 된다. 
		
		System.out.println("출력 >>>>> ");
		System.out.println(map);
		
		System.out.println("entrySet >>>> Entry(key, value)");
		for(Entry<String, String> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey() + " , " + entrySet.getValue());
		}
		System.out.println();
		System.out.println(" keySet >>>> ");
		for(String key : map.keySet()) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		//////////////////////////////////
		// 현업에서 Map 사용 케이스 : List 두 개를 만든 후에, Map 에 담는다. 
		List<String> lst01 = new ArrayList<String>();
		lst01.add("A");
		lst01.add("B");
		lst01.add("C");
		
		List<String> lst02 = new ArrayList<String>();
		lst02.add("D");
		lst02.add("E");
		lst02.add("F");
		
		Map<String, List<String>> multiList = new HashMap<String, List<String>>();
		multiList.put("a_section", lst01);
		multiList.put("b_section", lst02);
		//////
		List<String> a_section_lst = multiList.get("b_section");
		for(String data : a_section_lst) {
			System.out.println(data);
		}
	}
}
