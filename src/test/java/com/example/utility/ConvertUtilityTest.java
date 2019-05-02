package com.example.utility;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class ConvertUtilityTest {

	@Test
	public void testDateToString() {

		LocalDate date = LocalDate.of(2019, 4, 30);

		String expect = "2019/04/30";
		String actual = ConvertUtility.dateToString(date);

		assertEquals(expect, actual);
	}

	@Test
	public void testDateTimeToString() {
		LocalDateTime dateTime = LocalDateTime.of(2019, 4, 30, 17, 40, 25);

		String expect = "2019/04/30 17:40:25";
		String actual = ConvertUtility.dateTimeToString(dateTime);

		assertEquals(expect, actual);
	}

}
