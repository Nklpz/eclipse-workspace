package com.skillas.main;

public class Case {
	
	private int a = 4;

	public Case() {
		switch(a) {
		case 1:
			System.out.println("int a = 1");
			break;
		case 2:
			System.out.println("int a = 2");
			break;
		case 3:
			System.out.println("int a = 3");
			break;
			default:
				System.out.println("int a = nix davon");
		}
	}
	
	public static void main(String[]args) {
		new Case();
	}
}
