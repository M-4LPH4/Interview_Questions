package com.hackersrank.strange;

import java.util.Scanner;

public class StrangeCounter {
	static long strangeCode(long t) {
		/*
		 * long time = 1; long value = 3; for (long i = value; i > 0; i--,
		 * time++) { if (time == t) { return i; } if (i == 1) { i = value * 2;
		 * value = i; i++; } } return value;
		 */
		long rem = 3;
		while (t > rem) {
			t = t - rem;
			rem *= 2;
		}
		return (rem - t + 1);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		in.close();
		long result = strangeCode(t);
		System.out.println(result);
	}
}
