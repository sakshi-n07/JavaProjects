package com.cg.date_demo;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateDemo {
    public static void main(String[] args) throws ParseException {

        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);
        String dateString = "2024-10-10";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //try {
            Date parsedDate = sdf.parse(dateString);
            System.out.println("Parsed Date: " + parsedDate);
        /*} catch (ParseException e) {
            e.printStackTrace();
        }*/

        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'at' hh:mm:ss a");
        String formattedDate = sdf2.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

     // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set a specific date: January 1, 2024
        calendar.set(2024, Calendar.JANUARY, 5);
        // Format the date for display
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Original date: " + dateFormat.format(calendar.getTime()));

        // Add 30 days to the date
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        System.out.println("Date after adding 30 days: " + dateFormat.format(calendar.getTime()));

        // Subtract 10 days from the date
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println("Date after subtracting 10 days: " + dateFormat.format(calendar.getTime()));

        // Display the year, month, and day
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are zero-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);
    }
}
