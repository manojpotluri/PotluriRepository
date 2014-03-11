package org.manojpotluri.com;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int year =  cal.get(Calendar.YEAR);
		System.out.println("The current date is : " +month+":"+day+":"+year);
	}

}
