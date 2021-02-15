//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;
    private int day;

    /*Creates a MyDate object for the current date */
    MyDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }


    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /* Return year */
    public int getYear() {
        return year;
    }

    /* Return month */
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    /* Return day */
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }


    public void setDate(long elapsedTime) {
        GregorianCalendar calander = new GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }
}