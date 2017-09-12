package inttime;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
	
	private static TimeZone zone;
	private static Calendar cal;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		input = input.trim();
		String[] tempSplit = input.split(" ");
		String temp = DateAndTime.findZone(tempSplit);
		
		if (temp.compareTo(DateAndTime.ZONE_NOT_FOUND) == 0) {
			System.out.println("TimeZone not found");
		} else {
			zone = TimeZone.getTimeZone(temp);
			cal = Calendar.getInstance(zone);
			System.out.println("The TimeZone in " + temp + " is " + zone.getDisplayName());
			System.out.print("The local time is: ");
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			boolean morning = (hour < 12);
			System.out.println((hour % 12) + ":" + cal.get(Calendar.MINUTE)+":" 
					+ cal.get(Calendar.SECOND) + (morning ? " a.m." : " p.m."));
		}
	}

}
