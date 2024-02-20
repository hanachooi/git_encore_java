package com.encore.compare;

import java.util.Comparator;

import lombok.Getter;
import lombok.Setter;

/*
 Comparable [특징]
 - 자기 자신과 매개변수를 비교하는 것
 - 구현 메서드는 compareTo() 
 */

@Setter @Getter
public class Teacher implements Comparable<Teacher>{

	private int age;
	private int classNumber;
	
	
	public Teacher(int age, int ClassNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}


	// implements Comparable<Teacher>
	// 본인과 인자를 비교
	@Override
	public int compareTo(Teacher o) {
		return this.age - o.age;
	}
	
	/* implements Comparator<Teacher>
	// 두 인자 간의 비교
	@Override
	public int compare(Teacher o1, Teacher o2) {
		// 양수면, o1이 더 큼. 
		return o1.age - o2.age;
	}
	*/
	
	
}