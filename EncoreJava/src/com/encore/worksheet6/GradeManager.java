package com.encore.worksheet6;

import java.util.Scanner;

public class GradeManager {

	public void main(String[] args) {
		
		Student[] s = new Student[]{
			new Student("kim", "10000", 22, 100, 100, 100),
			new Student("lee", "!0001", 23, 20, 20, 20),
			new Student("park", "10002", 24, 30, 30, 30),
			new Student("choi", "10003", 25, 40, 40, 40),
			new Student("steve", "10004", 26, 50, 50, 50)
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			e[i].setName(sc.next());
			e[i].setEmployeeNo(sc.next());
			e[i].setAge(sc.nextInt());
			sc.nextLine();
		}
		
	}
	
}
