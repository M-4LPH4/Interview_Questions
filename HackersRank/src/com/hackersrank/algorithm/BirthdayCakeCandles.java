package com.hackersrank.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCakeCandles {

	static int birthdayCakeCandles(int n, int[] ar) {
		Map<Integer, Integer> candles = new HashMap<>();
		int maxCandleBlow = 0;
		for (int i : ar) {
			if (candles.containsKey(i)) {
				Integer candleHight = candles.get(i);
				candles.put(i, ++candleHight);
			} else {
				candles.put(i, 1);
			}
		}
		for (int i : ar) {
			if (candles.get(i) > maxCandleBlow) {
				maxCandleBlow = candles.get(i);
			}
		}
		return maxCandleBlow;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        in.close();
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
