package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountReps {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("input:");
		Map<Integer, Integer> repsCount = new HashMap<>();
		String numbers = sc.nextLine().trim();
		sc.close();
		for (String string : numbers.split(",")) {
			if(repsCount.containsKey(Integer.valueOf(string))) {
				Integer count = repsCount.get(Integer.valueOf(string));
				repsCount.put(Integer.valueOf(string), ++count);
			} else {
				repsCount.put(Integer.valueOf(string), 1);
			}
		}
		
		for (Integer number : repsCount.keySet()) {
			if(repsCount.get(number)>1) {
				System.out.println("repeating nos:"+number+","+repsCount.get(number));
			}
		}
	}

}
