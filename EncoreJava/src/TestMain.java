import java.io.IOException;
import java.util.Scanner;

import com.encore.test.StudentVO;

public class TestMain {
	
	//참조 타입은 선언과 동시에 값을 할당할 수 없다.
	//참조타입은 값을 담는 변수가 아니라 주소값을 담는 변수이다.
	// 객체 생성 시 사용하는 연산자는 new
	// new 뒤에는 생성자(Constructor) 호출

	public static void main(String[] args) {

		/*
		// 객체의 관계가 강하게 -> Composition (합성)
		// 객체의 관계가 약하게 -> Aggregation (집합)
		// 참조타입 
		StudentVO sv = new StudentVO();
		StudentVO stuObj = new StudentVO();
		System.out.println(stuObj);
		stuObj.setA("a");
		System.out.println(stuObj.getA());
		*/
		/*
		int inputData = 0;
		try {
			inputData = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result >>> " + inputData);
		*/
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
	}
	
}
