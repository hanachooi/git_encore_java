package com.encore.structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemoMain {

	public static void main(String[] args) throws IOException{

		List<Integer> lst = new LinkedList<Integer>();
		lst.add(1);
		lst.add(2);
		

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("데이터를 입력하세요! ");
		bw.flush();
		
		int data = Integer.valueOf(br.readLine());
		
		EncoreNodeList mgr = new EncoreNodeList(data);

		while(true) {
			bw.write("메뉴를 선택하세요.\n");
			bw.write("1. 연결리스트 데이터 출력\n");
			bw.write("2. 연결리스트 데이터 추가\n");
			bw.write("3. 연결리스트 데이터 삭제\n");
			bw.write("99. 프로그램 종료\n");
			bw.write("원하시는 번호를 입력 : ");
			
			bw.flush();
			
			int num = Integer.parseInt(br.readLine());
			
			switch(num) {
			case 1 : 
				bw.write(">>> LinkedList 데이터 출력 <<<\n");
				bw.flush();
				mgr.desc();
				break;
			case 2 :
				bw.write(">>> LinkedList 데이터 추가 <<<\n");
				bw.flush();
				int add_data = Integer.parseInt(br.readLine());
				mgr.add(add_data);
				break;
			case 3 :
				System.out.println(">>> LinkedList 데이터 삭제 <<<");
				int remove_data = Integer.parseInt(br.readLine());
				mgr.remove(remove_data);
				break;
			default :
				System.exit(0);
			}
		}
		//bw.close();
	}
}
