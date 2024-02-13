package com.encore.worksheet5;

public interface SubwayService {
	// 인터페이스는 추상과 static final 만 가질 수 있음. 
	
	// public static final int x = 10;
	// private static final 도 가능. 대신 , 해당 인터페이스 외부에서는 접근할 수 없음.
	
	// 1. constance
	// public int x = 10;
	
	// 은행요금을 반환하는 메서드(잔액 부족할 경우 : -1 리턴)
	// CardDTO card : 소유카드(충전), StationDTO start : 출발역, StationDTO end : 종착역
	public int chargeFree(CardDTO card, StationDTO start, StationDTO end);
	
	// 카드 요금을 차감하는 메서드
	// amount : 차감 금액
	// 차감이 성공이 되면, true.. 실패하면, false.. 
	public boolean substractBalance(CardDTO card, int amount);
	
	// 출발역과 종착역 사이의 거리를 계산
	// 역간의 거리를 반환하는 메서드
	public int getDistance(StationDTO start, StationDTO end);

}
