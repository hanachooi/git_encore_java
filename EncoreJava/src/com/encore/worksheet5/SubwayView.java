package com.encore.worksheet5;

import java.util.Scanner;

public class SubwayView {

	private StationDTO [] stations;
	Scanner sc = new Scanner(System.in);
	private int charge;
	// 배열은 무조건 초기화를 해주어야 한다.
	private StationDTO[] selectedStation = new StationDTO[2];
	private SubwayService service = new SubwayServiceImpl();
	CardDTO card = new CardDTO();
	
	public SubwayView() {
		stations = new StationDTO [] {
				new StationDTO("A1105", "합정", 0),
				new StationDTO("A1106", "홍대입구", 10),
				new StationDTO("A1107", "신촌", 15),
				new StationDTO("A1108", "이대", 20),
				new StationDTO("A1109", "아현", 30),
				new StationDTO("A1110", "충정로", 35),
				new StationDTO("A1111", "시청", 40),
				new StationDTO("A1112", "을지로입구", 50),
				new StationDTO("A1113", "을지로3가", 58),
				new StationDTO("A1114", "을지로4가", 67),
				new StationDTO("A1115", "동대문운동장", 77)
				
		};
	}
	
	public void menu() {
		System.out.println("교통카드 충전 금액을 입력하세요 : ");
		// int 다음에 다른 형식의 입력을 받게 될 경우, 무조건 sc.nextLine()을 해주어야 한다. 
		charge = sc.nextInt();
		sc.nextLine();
		card.setBalance(charge);
		System.out.println(card.getBalance());
		
		selectedStation[0] = selectNumber(stations, "승차역을 선택하세요. 1~11 : ");
		selectedStation[1] = selectNumber(stations, "하차역을 선택하세요. 1~11 : ");
		
		sc.nextLine();
		
		getUserInput(selectedStation[0], selectedStation[1]);
	}
	
	// 역 정보 출력 -> dto 에서 출력.
	public void printStationList(StationDTO[] stations) {
		System.out.println("===============================");
		for(int i =0; i<stations.length; i++) {
			System.out.println((i+1)+ "." + stations[i].getName());
		}
		System.out.println("===============================");
	}
	
	/*
	 * @ params card : 소유카드
	 * @ params start : 출발역
	 * @ params end : 종착역
	 * @ params chargedFee : 요금
	 * 요금 정산 성공 메시지를 출력
	 * */
	
	public void printSuccess(CardDTO card, StationDTO s1, StationDTO s2, int tax) {
		System.out.println("정상처리 되었습니다.");
		System.out.println("승차역은 " + s1.getName() +"역이고, 하차역은 " + s2.getName() + "역입니다.");
		System.out.println("요금은 " + tax +"원 이며, 잔액은 " + card.getBalance() + "원 입니다.");
	}
	
	// 요금 정산 실패 메시지 출력
	public void printFail() {
		System.out.println("잔액 부족입니다. \n 직원에게 문의하세요.");
	}
	
	// 데이터베이스에 존재하는 역을 선택하는 메서드. 
	/*
	 * 역 선택 메서드
	 * @ params statiosn 역 정보를 담는 배열
	 * @ params msg 	출력 메세지
	 * */
	public StationDTO selectNumber(StationDTO[] stations, String msg) {
		int station;
		StationDTO s = new StationDTO();
		printStationList(stations);
		System.out.println(msg);
		station = sc.nextInt();
		s = stations[station-1];
		
		return s;
		
	}
	
	public void getUserInput(StationDTO s1, StationDTO s2) {
		if((s1 != null) && (s2 != null)) {
			int tax = service.chargeFree(card,s1, s2);
			boolean b = service.substractBalance(card, tax);
			if(b == false) {
				printFail();
			}else if(b == true){
				printSuccess(card, s1, s2, tax);
			}
		}else {
			System.out.println("다시 실행해주세용.");
		}
		
	}
	
}
