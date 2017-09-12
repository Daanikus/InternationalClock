package inttime;

import java.util.TimeZone;

public class DateAndTime {
	
	private static String[] zones = TimeZone.getAvailableIDs();
	public static final String ZONE_NOT_FOUND = "NOTFOUND";
	
	public static void printZones() {
		for (String s : zones) {
			System.out.println(s);
		}
	}
	
	public static String findZone(String[] zone) {
		StringBuilder sb = new StringBuilder();
		int i;
		for (i = 0; i < zone.length - 1; i++) {
			sb.append(zone[i] + "_");
		}
		sb.append(zone[i]);
		
		String temp = sb.toString().toLowerCase();
		
		for (String s : zones) {
			if (s.toLowerCase().matches(".*/" + temp + ".*")) {
				return s;
			}
		}
		return ZONE_NOT_FOUND;
	}
}