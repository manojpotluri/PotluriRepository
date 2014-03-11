package org.manojpotluri.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a 4 digit year");
		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);
		try {
			int year = Integer.parseInt(br.readLine());
			GregorianCalendar cal = new GregorianCalendar();
			boolean yearresult = cal.isLeapYear(year);
			if(yearresult)
				System.out.println("yes it is a leap year");
			else
				System.out.println("no its not");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
