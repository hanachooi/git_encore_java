package com.encore.compare;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public class EncoreInteger {

	private int data;
	
	public EncoreInteger(int data) {
		this.data = data;
	}
	
}
