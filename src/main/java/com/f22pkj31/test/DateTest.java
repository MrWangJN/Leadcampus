package com.f22pkj31.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		System.out.println(format.format(new Date()));
		Date date = format.parse("2018-03-28 18:03:06");
		System.out.println(date);
	}
}
