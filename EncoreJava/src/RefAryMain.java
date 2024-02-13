import com.encore.oop.StudentDTO;

public class RefAryMain {

	public static void main(String[] args) {

		/*
		 * 배열이란 ? (Collection)
		 * 객체로 취급, [] 0 ~, length, 고정길이, sameType만 담는다.
		 * 배열에 담을 수 있는 요소의 타입 (기본, 참조)
		 * 
		 * int[] ary;	 -- 선언
		 * ary = new int[10];  -- 배열 생성(10방을 가지는)
		 * String[] arg = {};
		 * */
		
		// 학생 객체 30명을 만드렁서 관리하고 싶다면?
		// EmployeeDTO emp01, emp02, emp03, ... , emp30;
		
		//Person stu = new StudentDTO();
		// stu.setStudId("2000"); -- 부모타입은 자식에 접근할 수 없다.
		// ((StudentDTO)stu).setSttudId("2000"); -- 캐스팅을 통한 자식의 구성요소에 접근
		
		// 타입의 다형성을 배열에 적용한다면?
		/*
		int perIdx = 0;
		Person[] perAry = new Person[10];
		perAry[perIdx++] = new StudentDTO("임정섭", 20, "서울", "1992");
		
		System.out.println("ary person idx = " +  perIdx);
		for(int i=0; i<perAry.length; i++) {
			Person per = perAry[i];
			if(per instanceof StudentDTO) {
				StudentDTO OBJ = (Student) per;
				System.out.println(obj.studentInfo());
			}
			if(per instanceof TeacherDTO) {
				TeacherDTO obj = (TeacherDTO) per;
				System.out.println(obj.teacherInfo());
			}
			if(per instanceof EmployDTO) {
				EmployeeDTO obj = (EmployeeDTO) per;
				System.out.println(obj.employeeInfo());
			}
		}
		*/
		
		
		
		
		
		
		
	}

}
