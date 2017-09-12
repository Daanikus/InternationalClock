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
		//DateAndTime dat = new DateAndTime();
		scan.close();
		
		zone = TimeZone.getTimeZone(DateAndTime.findZone(input));
		cal = Calendar.getInstance(zone);
		System.out.println(zone.getDisplayName());

	}

}
