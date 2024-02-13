package com.encore.worksheet5;

public class SubwayServiceImpl implements SubwayService{

	public static final int BASIC_FEE = 800;
	private int distance;
	Math math;
	
	@Override
	public int chargeFree(CardDTO card, StationDTO start, StationDTO end) {
		int distance = getDistance(start, end);
		if(distance <= 12) {
			return BASIC_FEE;
		}else if(distance > 12 && distance <= 42) {
			return BASIC_FEE + (int)math.ceil((distance-12) / 6.0)*100;
		}else {
			return BASIC_FEE + 500 + (int)math.ceil((distance-42) / 12.0)*100;
		}
	}

	@Override
	public boolean substractBalance(CardDTO card, int amount) {
		
		int balance = (int)card.getBalance() - amount;
		System.out.println("dd " + balance);
		
		if(balance >= 0) {
			card.setBalance(balance);
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public int getDistance(StationDTO start, StationDTO end) {
		
		distance = math.abs(start.getLocation() - end.getLocation());
		
		return distance;
	}

}
