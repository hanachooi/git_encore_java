package com.encore.databasee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// DTO(instance) == Table(record)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DepartmmentResponseDTO {

	private String dept_id;
	private String dept_name;
	private String loc_id;
	
}
