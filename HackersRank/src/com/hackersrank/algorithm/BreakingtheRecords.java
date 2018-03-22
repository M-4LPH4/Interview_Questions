package com.hackersrank.algorithm;

import java.io.IOException;
import java.util.Scanner;

public class BreakingtheRecords {

	static int[] breakingRecords(int[] score) {
		int[] result = new int[2];
		int worstScore = score[0], bestScore = score[0], firstScore = score[0], worstScoreCounter = 0,
				bestScoreCounter = 0;
		for (int i = 0; i < score.length; i++) {
			if (bestScore < score[i]) {
				bestScore = score[i];
				bestScoreCounter++;
			}
			if ((firstScore > score[i]) && (worstScore > score[i])) {
				worstScore = score[i];
				worstScoreCounter++;
			}
		}
		result[0] = bestScoreCounter;
		result[1] = worstScoreCounter;
		return result;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] score = new int[n];

		String[] scoreItems = scan.nextLine().split(" ");

		for (int scoreItr = 0; scoreItr < n; scoreItr++) {
			int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
			score[scoreItr] = scoreItem;
		}

		int[] result = breakingRecords(score);

		System.out.println(result[0] + " " + result[1]);

	}
}
