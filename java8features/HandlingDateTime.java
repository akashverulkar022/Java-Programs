package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDtae = LocalDate.now();
		System.out.println("Current Date : " + currentDtae);

		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : " + currentTime);

		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current date and time : " + current);

		LocalDate ownDate = LocalDate.parse("2000-10-30");
		System.out.println("Setting date using String : " + ownDate);

		LocalDate ownDate2 = LocalDate.of(2000, Month.APRIL, 1);
		System.out.println("Setting date using int : " + ownDate2);

		// retrieving yesterday's and tomorrow's date
		LocalDate yesterday = currentDtae.minusDays(1);
		System.out.println("YesterDay Date : " + yesterday);

		LocalDate tomorrow = currentDtae.plusDays(1);
		System.out.println("Tomorrow's day : " + tomorrow);

		System.out.println("is leap year? : " + currentDtae.isLeapYear());

		// Changing time / date Format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String FormattedDate = current.format(formatter);
		System.out.println("Setting date and time Pattern : " + FormattedDate);

		// handling zones

		ZonedDateTime currentzone = ZonedDateTime.now();
		System.out.println("Cuurent date and time with zone : " + currentzone);

		System.out.println("Current zone : " + currentzone.getZone());

		// Setting tokyo Zone
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoZone = currentzone.withZoneSameInstant(tokyo);
		System.out.println("Tokyo zone date and time : " + tokyoZone);

	}

}
