import com.encore.post.service.PostRequestDTO;
import com.encore.post.service.PostService;

public class PostMain {

	public static void main(String[] args) {

		PostService service = new PostService();
		
		System.out.println("debug >> main caller -> service postBlog working method");
		
		/* case1
		String str = service.postBlog("jslim", "공지사항", "내일 휴강입니다.", null, null, null);
		System.out.println(str);
		*/
		
		// case2
		PostRequestDTO request = new PostRequestDTO();
		request.setId("jslim");
		request.setTitle("휴강안내");
		request.setContent("dd");
		request.setCnt(0);
		request.setFlag(true);
		
		PostRequestDTO request2 = new PostRequestDTO("jslim", "휴강안내", "ㅇㅇ", 0, true);
		String msg = service.savePost(request2);
		System.out.println(msg);
		
		
		// case03
		// view를 이용한 사용자 입력과 연결...
		PostView view = new PostView();
		view.menu();
		
		
	}

}
