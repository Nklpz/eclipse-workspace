package com.skillas.main;

import java.util.Scanner;

public class While {

	Scanner sc = new Scanner(System.in);
	private int amk;

	public While() {

		do {
			System.out.println("enter an integer");
			amk = sc.nextInt();
		} while (amk != 0);
	}

	public static void main(String[] args) {
		new While();
		
	}
}
