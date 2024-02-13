package com.encore.hms.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.encore.inheritance.EmployeeDTO;
import com.encore.inheritance.Person;
import com.encore.inheritance.StudentDTO;
import com.encore.inheritance.TeacherDTO;


/* 비지니스 로직 
1. 배열을 관리
2. 생성된 배열에 객체를 담음
3. 배열의 인덱스를 이용해 찾기, 수정, 삭제 등의 기능을 수행. 
*/
public class HmsService {
	private Person [] perAry ;  
	private int idx ; 
	
	public HmsService() {
	}
	
	public HmsService(int size) {
		perAry = new Person[size] ; 
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
		return (idx-1) + "번지에 데이터를 담았습니다." ; 
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
		perAry[idx++] = per ; 
	}
	
	public Person[] getAry() {
		return perAry;
	}
	
	public int getIdx() {
		return idx;
	}
	
	// 배열에 null값이 들어갈 가능성이 있을 때는, return 값을 넘길 때,
	// null 값의 여부를 확인해야 함. 
	public Person searchPerson(String name) {
		// null 값
		Person person = null;
		for(int i = 0; i<perAry.length; i++) {
			person = perAry[i];
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
		for(int i = 0; i<perAry.length; i++) {
			Person person = perAry[i];
			if(person.getName().equals(name)) {
				for(int j = i; j<perAry.length-1; j++) {
					perAry[j] = perAry[j+1];
				}
				idx = idx-1;
				perAry[idx] = null;
				return true;
			}
		}
		return false;
	}

	public void saveToFile() {
		//String msg = "난 직렬화된 객체여서 바이너리 형태로 저장이 가능함";
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		
		try {
			fis = new FileOutputStream("C:/encore_file/hmo.txt");
			oos = new ObjectOutputStream(fis);
			oos.writeObject(perAry);
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
			perAry = (Person[])oos.readObject();
			
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