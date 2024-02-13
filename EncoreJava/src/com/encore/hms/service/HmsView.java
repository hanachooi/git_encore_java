package com.encore.hms.service;

import java.io.IOException;
import java.util.Scanner;

import com.encore.inheritance.EmployeeDTO;
import com.encore.inheritance.Person;
import com.encore.inheritance.StudentDTO;
import com.encore.inheritance.TeacherDTO;

public class HmsView {

	// static으로 생성을 하게 되면, 함수 내에서 인스턴스의 소유가 아니게 됌. 
	// View 함수 내에서 사용할 거라면, static을 붙여주는 것이 좋음. 
	
	public static Scanner sc = new Scanner(System.in);
	
	// HmsView는 HmsService와 의존성 중입(Dependenccy Injection) 관계가 형성
	// 즉, HmsView는 HmsService의 객체 생성을 통한 접근을 필요로 하는 것. 
	
	private HmsService service;
	
	public HmsView(int size) {
		service = new HmsService(size);
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println(">>> HMS Ver1.0");
			System.out.println("1.전체출력");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이름으로 찾아서 수정");
			System.out.println("4. 이름으로 찾아서 삭제");
			System.out.println("5. 생성");
			System.out.println("99. 종료");
		
			try{
				int number = sc.nextInt();
				sc.nextLine();
				switch(number) {
				case 1 : 
					// view에서 print를 요청하게 되면, dto 로 가야함. 
					perPrint();
					break;
				case 2 :
					search();
					break;
				case 3 : 
					update();
					break;
				case 4 :
					remove();
					break;
				case 5 :
					setMenu();
					break;
				case 99 :
					System.out.println("종료");
					String confirmYN = sc.next();
					if(confirmYN.equalsIgnoreCase("y")) {
						System.out.println("데이터 저장 완료!!");
					}
					else {
						System.out.println("프로그램을 종료하고 데이터는 보관노디지 않습니다.");
					}
					System.exit(0);
					break;
				default : 
					System.out.println("메뉴에 정해진 숫자만 입력해주세요.");
				}
			} catch(Exception e) {
				System.out.println("숫자만 입력하세요.");
				sc.nextLine();
			}
		}
	}
	
	public void perPrint() {
		System.out.println();
		System.out.println(">>> 전체 출력 <<<");
		
		Person[] perAry = service.getAry();
		if(service.getIdx() == 0) {
			System.out.println();
			System.out.println("데이터가 존재하지 않습니다.");
			System.out.println();
		}else {
		
			for(int idx = 0 ; idx < perAry.length ; idx++) {
				Person per = perAry[idx] ;
				if(per == null) {
					break ;
				}
				System.out.println(per.personInfo()) ;
			}
			/*
			for(Person per : perAry) {
				System.out.println(per.personInfo());
			}
			*/
		}
	}
	
	public void makePerson() {
		
	}
	
	public void setMenu() {
		while(true) {
			System.out.println();
			System.out.println(">>> 객체 생성을 위한 Sub Menu <<<");
			System.out.println("1. 학생");
			System.out.println("2. 강사");
			System.out.println("4. 직원");
			System.out.println("99. 상위메뉴 이름");
			System.out.println("Input Number : ");
			int number = sc.nextInt();
			sc.nextLine();
			switch(number) {
			case 1 :
			case 2 :
			case 3 :	
				makePerson(number);
			case 99 :
				return ;
			}
		}
	}
	
	public void makePerson(int number) {
		String msg = " ";
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("주소를 입력하세요.");
		String address = sc.nextLine();
		System.out.println("comm을 입력하세요.");
		String comm = sc.nextLine();
				
		switch(number) {
		case 1 :
			msg = service.makePerson(HmsType.STU, name, age, address, comm);
			break;
		case 2 :
			msg = service.makePerson(HmsType.TEA, name, age, address, comm);
			break;
		case 3 :
			msg = service.makePerson(HmsType.EMP, name, age, address, comm);
			break;
			
		}
		System.out.println(msg);
		
	}
	
	/* Scanner 객체를 이용해서 찾고자 하는 이름을 입력받아서
	 * 존재할 경우 해당 객체의 정보를 출력하고
	 * 존재하지 않을 경우 '정보가 존재하지 않습니다'라는 메시지를 출력
	 * HmsView - HmsService(searchPerson(String name))
	 * */
	public void search() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Person p = service.searchPerson(name);
		if(p == null) {
			System.out.println("정보가 존재하지 않습니다.");
		}else{
			System.out.println(p.personInfo());
		}
	}
	/* Scanner 객체를  이용해서 찾고자 하는 이름을 입력받아서
	 * 존재할 경우 해당 객체의 학생-학번, 강사-과목, 직원-부서를 수정
	 * '정보를 수정하였습니다.' 라는 메시지 출력,, 삭제된거의 주소에 뒤의 번지가 들어가게 되게 함.
	 * 이중 for loop를 이용해야함. 
	 * HmsView - HmsService(searchPerson(String name, String comm))
	 * */
	public void update() {
		System.out.println(">>> 수정 <<<");
		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();
		Person obj = service.updatePerson(name);
		// 얕은 카피 -> 여러 곳에서 변경이 가능함. 
		// 주소값을 카피하는 것. 
		if(obj != null) {
			if(obj instanceof StudentDTO) {
				System.out.println("수정할 학번을 입력하세요 : ");
				String stuId = sc.next();
				((StudentDTO)obj).setStuId(stuId);
			}
			if(obj instanceof TeacherDTO) {
				System.out.println("수정할 학번을 입력하세요 : ");
				String stuId = sc.next();
				((TeacherDTO)obj).setSubject(stuId);
			}
			if(obj instanceof EmployeeDTO) {
				System.out.println("수정할 학번을 입력하세요 : ");
				String stuId = sc.next();
				((EmployeeDTO)obj).setDept(stuId);
			}
		}else {
			System.out.println("정보가 존재하지 않습니다.");
		}
	}
	
	/* Scanner 객체를  이용해서 찾고자 하는 이름을 입력받아서
	 * 존재할 경우 해당 객체를 배열에서 삭제하고
	 * "객체를 수정하였습니다." 라는 메시지 출력
	 * 그리고
	 * 전체 출력했을 때 정상적으로 출력되면 OK
	 * HmsView - HmsService(searchPerson(String name, String comm))
	 * */
	public void remove() {
		System.out.println();
		System.out.println(">>>remove<<<");
		System.out.println("이름을 압력하세요 : ");
		String name = sc.next();
		Person person = service.searchPerson(name);
		if(person == null) {
			System.out.println("정보가 존재하지 않습니다.");
		}else {
			boolean flag = service.removePerson(name);
			if(flag == true) {
				System.out.println("객체를 삭제하였습니다.");
			}
		}
	}
	
}
