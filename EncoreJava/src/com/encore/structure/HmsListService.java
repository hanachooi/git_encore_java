package com.encore.structure;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.encore.hms.service.HmsType;
import com.encore.inheritance.EmployeeDTO;
import com.encore.inheritance.Person;
import com.encore.inheritance.StudentDTO;
import com.encore.inheritance.TeacherDTO;


/* 비지니스 로직 
1. Collection(List)를 관리
2. 생성된 Collection 에 학생, 강사, 직우너 객체를 담을 것.
3. 자료구조화 되어있는 메서드를 이용하여 찾기, 수정, 삭제 등의 기능을 수행할 것. 
*/
public class HmsListService {

	private List<Person> lst;
	
	public HmsListService() {
	}
	
	public HmsListService(int size) {
		lst = new ArrayList<Person>();
	}
	
	// 객체 생성 후 배열에 담는 로직.
	public String makePerson(HmsType flag , String name, int age, String address, String comm) {
		String msg = null ;
		Person obj= null;
		switch(flag) {
			case STU : 
				obj = new StudentDTO(name, age, address, comm);
				break;
			case TEA : 
				obj = new TeacherDTO(name, age, address, comm);
				break;
			case EMP :
				obj = new EmployeeDTO(name, age, address, comm);
				break;
		}
		setAry(obj);
		return lst.size() + "번지에 데이터를 담았습니다." ; 
	}
	
	public Person updatePerson(String name) {
		
		/* 깊은 복사 첫번째 방법
		Person[] copyAry = perAry.clone();
		
		or
		깊은 복사 두번째 방법
		import java.util.Arrays;
		Person[] copyAry = Arrays.copyOf(perAry, perAry.length);
		
		
		System.out.println("original ary address : " + perAry);
		System.out.println("copy ary address : " + copyAry);
		
		*/
		return searchPerson(name);
	}
	
	// 배열을 사용할 경우, 꼭 구현이 되어야 함. 
	public void setAry(Person per) {
		lst.add(per); 
	}
	
	// 반환 타입은 우리가 선언한 타입에 맞추어야 함. 
	public List<Person> getAry() {
		return lst;
	}
	
	public int getIdx() {
		return lst.size();
	}
	
	// 배열에 null값이 들어갈 가능성이 있을 때는, return 값을 넘길 때,
	// null 값의 여부를 확인해야 함. 
	public Person searchPerson(String name) {
		// null 값
		Person person = null;
		for(int i = 0; i<lst.size(); i++) {
			person = lst.get(i);
			if(person.getName().equals(name)) {
				if(person != null) {
					return person;
				}
			}
		}
		return person;
	}
	
	public boolean removePerson(String name) {
		boolean flag = false;
		for(int i = 0; i<lst.size(); i++) {
			Person person = lst.get(i);
			if(person.getName().equals(name)) {
				lst.remove(i);
				return true;
			}
		}
		return false;
	}

	// 직렬화
	public void saveToFile() {
		//String msg = "난 직렬화된 객체여서 바이너리 형태로 저장이 가능함";
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		
		try {
			fis = new FileOutputStream("C:/encore_file/hmo_list.txt");
			oos = new ObjectOutputStream(fis);
			oos.writeObject(lst);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void loadToFile() {
		FileInputStream fls = null;
		ObjectInputStream oos = null;
		
		try {
			
			fls = new FileInputStream("c:/encore_file/hmo.txt");
			oos = new ObjectInputStream(fls);
			lst = (List<Person>)oos.readObject();
			// readObject는 Object 타입으로 return 되므로
			// Casting을 (List<Person>) 으로 해야함. 
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}