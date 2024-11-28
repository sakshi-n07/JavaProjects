package com.cg.test_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date currentDate=new Date();
		System.out.println(currentDate);
		
		String dataString="2024-10-10";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date doj=sdf.parse(dataString);
		System.out.println(doj);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'at' hh:mm:ss a");
        String formattedDate = sdf2.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
        
        
        /*Calendar cd= Calendar.getInstance();

        cd.set(2024, Calendar.JANUARY, 30);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf1.format(cd.getTime()));
		cd.add(Calendar.DAY_OF_MONTH,30);
		
		int year= cd.get(Calendar.YEAR);
		int month= cd.get(Calendar.MONTH) + 1;
		 
		System.out.println("Date after adding 30 days: " + sdf1.format(cd.getTime()));
		cd.add(Calendar.DAY_OF_MONTH,-30);
		System.out.println("Date after removing 30 days: " + sdf1.format(cd.getTime()));
		*/
	}

}