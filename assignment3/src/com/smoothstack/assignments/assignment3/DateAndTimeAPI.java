package com.smoothstack.assignments.assignment3;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;

public class DateAndTimeAPI {
	
	public static void main(String[] args) {
		previousThursday(LocalDate.now());
		previousThursday(LocalDate.of(2018, 2, 13));
		lengthOfEachMonth(2011);
		lengthOfEachMonth(2012);
		allMondays(Month.MARCH);
		// false
		System.out.println(isFridayTheThirteenth(LocalDate.now()));
		// true
		System.out.println(isFridayTheThirteenth(LocalDate.of(2019, 12, 13)));
	}
	
	// 1) Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds? 
	// LocalDateTime represents a data-time with default format as yyyy-MM-dd-HH-mm-ss.zzz.
	
	// 2) Given a random date, how would you find the date of the previous Thursday?
	public static void previousThursday(LocalDate date) {
		System.out.printf("The previous Thursday is: %s%n",
		          date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
		
	}

	
	// 3) What is the difference between a ZoneId and a ZoneOffset?
	// ZoneOffset uses ZoneId as the rules to get a fully resolved offset from UTC/Greenwich.
	// ZoneOffset extends ZoneId.
	
	// 4 a) 
	// How would you convert an Instant to a ZonedDateTime? 
	public static ZonedDateTime toInstant(Instant instant) {
		return ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
	}
	
	// 4 b)
	// How would you convert a ZonedDateTime to an Instant?
	public static Instant toZoneDateTime(ZonedDateTime date) {
		return date.toInstant();
	}
	
	// 5) Write an example that, for a given year, reports the length of each month within that year.
	public static void lengthOfEachMonth(int year) {
		try {
            @SuppressWarnings("unused")
			Year test = Year.of(year);
        } catch (DateTimeException exc) {
            System.out.printf("%d is not a valid year.%n", year);
        }

        System.out.printf("For the year %d:%n", year);
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
        }
	}
	
	// 6) Write an example that, for a given month of the current year, lists all of the Mondays in that month.
	public static void allMondays(Month month) {
		LocalDate date = Year.now().atMonth(month).atDay(1).
	              with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
	    Month mi = date.getMonth();
	    while (mi == month) {
	    	System.out.printf("%s%n", date);
	    	date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	    	mi = date.getMonth();
	     }
	}
	
	// 7) Write an example that tests whether a given date occurs on Friday the 13th.
	public static boolean isFridayTheThirteenth(LocalDate date) {
		if (date.getDayOfMonth() == 13 && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
			return true;
		}
		return false;
	}
	
	
	
	

}
