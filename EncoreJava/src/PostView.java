import java.util.Scanner;

import com.encore.post.service.PostRequestDTO;
import com.encore.post.service.PostService;

public class PostView {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println(">>> 한화sw camp Beyond 5th <<<");
		System.out.println("1. login");
		System.out.println("2. join");
		System.out.println("3. post write");
		System.out.println("4. delete");
		System.out.println("99. exit");
		System.out.println("input number : ");
		int number = sc.nextInt();
		
		if(number == 99) {
			System.out.println("종료합니다.");
			System.exit(0);
		}
		if(number == 1) {
			login();
		}
		if(number == 4) {
			requestDelete();
		}
	}
	}
	public void login() {
		System.out.println("debug >>>> client post view");
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = scan.nextLine();
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String content = scan.nextLine();
		System.out.println("조회수 : ");
		int cnt = scan.nextInt();
		System.out.println("공개여부 : ");
		boolean isFlag = scan.nextBoolean();
		
		PostService service = new PostService();
		PostRequestDTO request = new PostRequestDTO();
		String str = service.savePost(request);
		System.out.println("회원가입이 완료 되었습니다.");
	}
	
	// request delete
	// terminal 부터 사용자의 아이디만 입력을 받아서, 해당 아이디를 dto에 담고, 
	// PostService 클래스에 정의된 postDelete(PostRequestDTO params) 메서드를 호출하여 '작성하신 글이 삭제되었습니다.'
	// 메시지를 반환 받아서 출력. 
	public void requestDelete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		PostRequestDTO request = new PostRequestDTO(id);
		PostService service = new PostService();
		String str = service.deletePost(request);
		System.out.println(str);
	}
	
	
}
