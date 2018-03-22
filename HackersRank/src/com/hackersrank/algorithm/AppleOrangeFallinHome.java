package com.hackersrank.algorithm;

import java.util.Scanner;

public class AppleOrangeFallinHome {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int orangeFallInsideHome = 0, appleFallInsideHome = 0;
		for (int orange : oranges) {
			if (s <= (b + orange) && (b + orange) <= t) {
				orangeFallInsideHome++;
			}
		}
		for (int apple : apples) {
			if (s <= (a + apple) && (a + apple) <= t) {
				appleFallInsideHome++;
			}
		}
		System.out.println(appleFallInsideHome);
		System.out.println(orangeFallInsideHome);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		in.close();
		countApplesAndOranges(s, t, a, b, apple, orange);
	}
}
