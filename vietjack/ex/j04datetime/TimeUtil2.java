package vietjack.ex.j04datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil2 {
	public static int getTime(String strTime) {
		String[] tokens = strTime.split(":");
		int hours = Integer.parseInt(tokens[0]);
		int minutes = Integer.parseInt(tokens[1]);
		int seconds = Integer.parseInt(tokens[2]);
		return 3600 * hours + 60 * minutes + seconds;
	}

	public static String getDateFromUnixTime(long unixTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date((long) unixTime * 1000);
		return sdf.format(date);
	}

	public static int getTimeFromUnixTime(long unixTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		Date date = new Date((long) unixTime * 1000);
		return getTime(sdf.format(date));
	}

	public static void main(String[] args) throws ParseException {
		Date dt = new Date();
		System.out.println(dt.getTime());
		System.out.println(getTimeFromUnixTime(dt.getTime()));
		System.out.println(getDateFromUnixTime(getTimeFromUnixTime(dt.getTime())));

	}
}
