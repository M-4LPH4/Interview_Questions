package com.test;

import java.util.Scanner;

public class WordWeight {

	private static final int _64 = 64;

	public static void main(String[] args) {
		System.out.println("Input: A word");
		Scanner sc= new Scanner(System.in);
		sc.close();
		String wordWeight = sc.nextLine();
		wordWeight = wordWeight.toUpperCase();
		Integer totalWeight = 0;
		for (char character : wordWeight.toCharArray()) {
			System.out.println(((int)character -_64));
			totalWeight += ((int)character -_64);
		}
		System.out.println("Weight of the input word: "+totalWeight);
	}

}
