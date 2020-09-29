package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        System.out.println(myCal.get(Calendar.DATE));
        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument
        myCal.get(Calendar.DAY_OF_WEEK);

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.
        System.out.println("myCal month:" + Calendar.SEPTEMBER);
        System.out.println("Expected 8");

        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html

        myCal.add(myCal.DAY_OF_MONTH,100);
        System.out.println(myCal.DATE);
        System.out.println(myCal.DAY_OF_WEEK);

        //This works because my actual IRL birthday is today
        myCal.get(Calendar.DATE);
        System.out.println(myCal.get(Calendar.DAY_OF_WEEK));


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)
        myCal.get(Calendar.DATE);
        myCal.add(Calendar.DATE, 10000);
        System.out.println(myCal.get(Calendar.DATE));
        

    }

}