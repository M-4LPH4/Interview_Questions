package com.hackersrank.algorithm;

import java.util.Scanner;

public class Staircase {

	static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = n - i - 2; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}