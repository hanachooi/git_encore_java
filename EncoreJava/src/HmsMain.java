import com.encore.hms.service.HmsService;
import com.encore.hms.service.HmsType;
import com.encore.hms.service.HmsView;

public class HmsMain {

	public static void main(String[] args) {

		/*
		HmsService service = new HmsService();
		String msg = service.makePerson(HmsType.STU , "임정섭", 20, "서울", "1992");
		
		// 출력예시 ) 학생[강사] 직원 객체를 배열에 담았습니다.
		System.out.println(msg);
		msg = service.makePerson(HmsType.EMP, "임정섭", 20, "서울", "자바");
		System.out.println(msg);
		
		msg = service.makePerson(HmsType.TEA, "임정섭", 20, "서울", "교육 서비스팀");
		System.out.println(msg);
		*/
		
		HmsView view = new HmsView(10);
		view.mainMenu();
	}

}
