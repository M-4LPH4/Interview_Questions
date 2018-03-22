package com.hackersrank.algorithm;

import java.util.Scanner;

public class KangarooTest {

	static String kangaroo(int x1, int v1, int x2, int v2) {
		if (((x2 > x1) && (v2 > v1)) || (x1 > x2) && (v1 > v2) || (v1 == v2)) {
			return "NO";
		} else {
			if ((x1 - x2) % (v2 - v1) == 0) {
				return "YES";
			}
		}
		return "NO";
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
