package com.encore.workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Workshop3Main {

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("=======================");
		
		System.out.println("고객번호 : ");
		String custid = br.readLine();
		
		System.out.println("고객명 : ");
		String custName = br.readLine();
		
		System.out.println("계좌번호 : ");
		String accountNumber = br.readLine();
		
		System.out.println("잔액 : ");
		int balance = Integer.parseInt(br.readLine());
		
		Workshop3Demo account = new Workshop3Demo(custid, custName, accountNumber, balance);
		
		account.setBalance((account.getBalance() + 10000));
		System.out.println("10000원을 입금합니다." + "\n" + "증가 후 잔액 : " +  account.getBalance());
		
		
		account.setBalance(account.getBalance() - 20000);
		System.out.println("20000원을 출금합니다. \n 감소 후 잔액 : " + account.getBalance());
	}

}
