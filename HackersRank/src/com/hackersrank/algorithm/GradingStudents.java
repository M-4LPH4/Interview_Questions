package com.hackersrank.algorithm;

import java.util.Scanner;

public class GradingStudents {
	static int[] solve(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 37) {
				grades[i] = roundScore(grades[i]);
			}
		}
		return grades;
	}
	 
	static int roundScore(int mark) {
		for (int i = 1; i < 3; i++) {
			if ((mark + i) % 5 == 0) {
				mark += i;
			}
		}
		return mark;
	}

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] grades = new int[n];
	        for(int grades_i=0; grades_i < n; grades_i++){
	            grades[grades_i] = in.nextInt();
	        }
	        in.close();
	        int[] result = solve(grades);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	        }
	        System.out.println("");
	    }
}
