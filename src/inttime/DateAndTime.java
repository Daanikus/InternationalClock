package inttime;

import java.util.Date;
import java.util.TimeZone;

public class DateAndTime {
	
	private String time;
	private Date date;
	private static String[] zones = TimeZone.getAvailableIDs();
	public static final String ZONE_NOT_FOUND = "NOTFOUND";
	
	public DateAndTime() {
		date = new Date();
		time = date.toString();	
	}
	
	public void printDate() {
		System.out.println(time);
	}
	
	public static void printZones() {
		for (String s : zones) {
			System.out.println(s);
		}
	}
	
	public static String findZone(String zone) {
		for (String s : zones) {
			if (s.toLowerCase().matches(".*/" + zone.toLowerCase())) {
				return s;
			}
		}
		return ZONE_NOT_FOUND;
	}
}