package com.encore.databasee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostResponseDTO {

	private int idx;
	private String title;
	private String content;
	private String writer;
	
	 @Override
	    public String toString() {
	        return "idx= " + idx + 
	                " title= " + title + 
	                " content= " + content + " writer = " + writer;
	    }
	
}
