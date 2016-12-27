package cn.shiyanjun.platform.api.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Time {

	public static long now() {
		return System.currentTimeMillis();
	}
	
	public static String formatCurrentHourTime() {
		 DateFormat df = new SimpleDateFormat("HH:mm:ss");
		 return df.format(now());
	}
	
	public static void main(String[] args) {
		String start = "03:00:00".replaceAll(":", "");
		String end = "03:15:30".replaceAll(":", "");
		String current = Time.formatCurrentHourTime().replaceAll(":", "");
		int currentTime = Integer.parseInt(current);
		System.out.println(start);
		System.out.println(end);
		System.out.println(current);
		
		System.out.println();
		
		System.out.println(Integer.parseInt(start));
		System.out.println(Integer.parseInt(end));
		System.out.println(currentTime);
		if(currentTime < Integer.parseInt(start) && currentTime > Integer.parseInt(end)) {
			System.out.println(true);
		}
	}
}
