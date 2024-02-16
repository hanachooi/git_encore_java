package com.encore.databasee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PostRequestDTO {

	private String title;
	private String content;
	private String writer;
	
	
	public PostRequestDTO() {
		
	}
	
}
