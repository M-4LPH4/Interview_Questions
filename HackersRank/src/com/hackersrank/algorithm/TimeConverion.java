package com.hackersrank.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConverion {

	static String timeConversion(String s) {
		SimpleDateFormat format12Hrs = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat format24Hrs = new SimpleDateFormat("HH:mm:ss");
		Date date12 = null;
		try {
			date12 = format12Hrs.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (null != date12) {
			return format24Hrs.format(date12);
		}
		return null;
	}

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        in.close();
	        String result = timeConversion(s);
	        System.out.println(result);
	    }
}
