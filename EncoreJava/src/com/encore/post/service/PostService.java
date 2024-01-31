package com.encore.post.service;

// xxxxService, xxxxServiceImpl은 비즈니스 로직을 처리하는 역할을 담당
// 사용자가 블로그에 글을 작성, 수정, 삭제, 검색, 읽기 등이 가능하다. 
// 아이디, 제목, 내용, 등록일, 조회수, 공개/비공개
public class PostService {

	String id;
	String title;
	String content;
	int cnt;
	boolean isFlag;

	public String postBlog(String blogPost,String id,
	String content,String uploadDate,String watchNum,String priv) {
		System.out.println("저장");
		return "작성하신 글이 올라갔습니다.";
	}
	
	public String savePost(String id, String title, String content, int cnt, boolean isFlag) {
		return "작성하신 글이 올라갔습니다.";
	}

	public String savePost(PostRequestDTO params) {
		return "작성하신 글이 올라갔습니다.";
	}
	
	public String deletePost(PostRequestDTO id) {
		return "작성하신 글이 삭제되었습니다.";
	}
}
