package com.skillas.main;

public class If {

	private int a = 1;

	public If() {
		if (a == 1) {
			System.out.println("int a = 1");
		} else {
			System.out.println("int a != 0");
		}
		
		int i = 0;
		
		System.out.println((i != 0 ? "ja" : "ne"));
	}

	public static void main(String[] args) {
		new If();
	}

}
