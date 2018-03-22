package com.hackersrank.algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Set<Integer> universalList = new HashSet<Integer>();
		int lastChar = 0;
		int tempChar = 0;
		for (char character : s.toCharArray()) {
			int charAscii = (int) character - 96;
			if (charAscii == tempChar) {
				lastChar += charAscii;
				universalList.add(lastChar);
			} else {
				lastChar = charAscii;
				universalList.add(lastChar);
			}
			tempChar = charAscii;
		}
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();
			if (universalList.contains(x)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		in.close();
	}

}
