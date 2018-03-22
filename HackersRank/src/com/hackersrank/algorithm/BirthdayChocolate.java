package com.hackersrank.algorithm;

import java.util.Scanner;

public class BirthdayChocolate {

	static int solve(int n, int[] s, int d, int m) {
		int result = 0;
		for (int i = m; (i < s.length||s.length==i); i++) {
			if (calcChocolateSum(s, i, m) == d) {
				result++;
			}
		}
		return result;
	}

	private static int calcChocolateSum(int[] s, int i, int m) {
		int sum = 0;
		if(i==m) {
			for (int j = 0; j < i; j++) {
				sum += s[j];
			}
		} else {
			for (int j = i-m; j < i; j++) {
				sum += s[j];
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		in.close();
		int result = solve(n, s, d, m);
		System.out.println(result);
	}
}
