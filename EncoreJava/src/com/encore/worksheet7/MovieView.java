package com.encore.worksheet7;

import java.awt.print.PrinterException;
import java.util.Scanner;

public class MovieView {

	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		System.out.println(" ================================================\r\n"
				+ "  영화제목을맞춰보세요\r\n"
				+ " 5번까지틀릴수있는기회가있습니다.\r\n"
				+ " ================================================\r\n");
		
	}
	
	
	public char getOneLetter() {
		char c = ' ';
		String r =  sc.next();
		// System.out.println("debug >>> " + r);
		
		return r.charAt(0);
	}
	
}
