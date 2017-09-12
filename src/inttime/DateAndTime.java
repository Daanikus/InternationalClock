package inttime;

import java.util.ArrayList;
import java.util.TimeZone;

public class DateAndTime {
	
	private static String[] zones = TimeZone.getAvailableIDs();
	public static final String ZONE_NOT_FOUND = "NOTFOUND";
	public static final String MULTI_FOUND = "MULTIFOUND";
	public static final String EXIT = "EXITPROGRAM";
	
	public static void printZones() {
		for (String s : zones) {
			System.out.println(s);
		}
	}
	
	public static String findZone(String[] zone) {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> al = new ArrayList<String>();
		int i;
		
		for (i = 0; i < zone.length - 1; i++) {
			sb.append(zone[i] + "_");
		}
		sb.append(zone[i]);
		
		String temp = sb.toString().toLowerCase();
		
		for (String s : zones) {
			if (s.toLowerCase().matches(".*/.*" + temp + ".*")) {
				al.add(s);
			}
		}
		
		if (al.size() == 1) return al.get(0);
		else if (al.size() > 1) {
			System.out.println("--Search found multiple results--");
			for (String s : al) {
				System.out.println(s);
			}
			return MULTI_FOUND;
		} else if (zone[0].compareTo("exit") == 0) {
			return EXIT;
		}
		else {
			return ZONE_NOT_FOUND;
		}
	}
}