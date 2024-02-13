package com.encore.worksheet5;

// 약 정보를 담는 엔티티
public class StationDTO {

	private String id;
	private String name;
	private int location;
	
	public StationDTO() {
		super();
	}

	public StationDTO(String id, String name, int location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
	}
	
	public int getLocation() {
		return location;
	}
	
	public void setLocation() {
		
	}
}
