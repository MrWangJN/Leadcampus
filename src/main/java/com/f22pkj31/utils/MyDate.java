package com.f22pkj31.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate extends Date{
	private Date Date;
	private SimpleDateFormat sdf;

	public MyDate(Date date) {
		super();
		this.Date = date; 
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		
	}

	@Override
	public String toString() {
		return sdf.format(Date);
	}
	
}
