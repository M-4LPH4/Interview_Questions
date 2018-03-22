package com.hackersrank.algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BetweenTwoSets {

	static int getTotalX(int[] a, int[] b) {
		int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
		return count;
	}
	
	private static int gcd(int[] a) {
		int result = a[0];
		for (int i = 0; i < a.length; i++) {
			result = gcd(result, a[i]);
		}
		return result;
	}

	private static int lcm(int[] a) {
		int result = a[0];
		for (int i = 0; i < a.length; i++) {
			result = lcm(result, a[i]);
		}
		return result;
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scan.nextLine().split(" ");

		int n = Integer.parseInt(nm[0].trim());

		int m = Integer.parseInt(nm[1].trim());

		int[] a = new int[n];

		String[] aItems = scan.nextLine().split(" ");

		for (int aItr = 0; aItr < n; aItr++) {
			int aItem = Integer.parseInt(aItems[aItr].trim());
			a[aItr] = aItem;
		}

		int[] b = new int[m];

		String[] bItems = scan.nextLine().split(" ");

		for (int bItr = 0; bItr < m; bItr++) {
			int bItem = Integer.parseInt(bItems[bItr].trim());
			b[bItr] = bItem;
		}

		int total = getTotalX(a, b);

		bw.write(String.valueOf(total));
		bw.newLine();

		bw.close();
	}
}
