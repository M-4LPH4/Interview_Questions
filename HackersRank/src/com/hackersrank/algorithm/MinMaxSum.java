package com.hackersrank.algorithm;

import java.util.Scanner;

public class MinMaxSum {

	static void miniMaxSum(int[] arr) {
		int minNum = arr[0], maxNum = arr[0];
		Long minSum = 0L, maxSum = 0L; 
		int count = 4;
		for (int i : arr) {
			if (minNum > i) {
				minNum = i;
			} else if (maxNum < i) {
				maxNum = i;
			}
		}
		for (int i : arr) {
			if(minNum != maxNum){
				if(maxNum != i) {
					minSum += i;
				}
				if (minNum != i){
					maxSum +=i;
				}
			} else {
				if(count>0){
					minSum += i;
					maxSum += i;
					count--;
				}
			}
		}
		System.out.println(minSum+" "+maxSum);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }

}
