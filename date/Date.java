// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 4 - Payroll System Modification
// File: DateEmployeeEmployee.java

package date;

public class Date {
    private int year;
    private int month;
    private int day;

    // constructor
    public Date(int year, int month, int day) throws IllegalArgumentException {
        this.year = year;

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException();
        }
        this.month = month;

        if (day < 1 || day > Date.daysInMonth(month)) {
            throw new IllegalArgumentException();
        }
        this.day = day;
    }

    // returns year
    public int getYear() {
        return this.year;
    }

    // returns month
    public int getMonth() {
        return this.month;
    }

    // returns day
    public int getDay() {
        return this.day;
    }

    // gets number of days in a given month
    public static int daysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return 28;

            default:
                return -1;
        }
    }

    // gets number of days in current month
    public int daysInMonth() {
        return Date.daysInMonth(this.month);
    }

    // get name of a given month
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }

    // get name of current month
    public String getMonthName() {
        return Date.getMonthName(this.month);
    }

    // get name of given month
    public static int getFirstWeekdayOfMonth(int month) {
        int weekday = 0;

        for (int m = 1; m < month; m++) {
            weekday += daysInMonth(m);
        }

        return weekday % 7;
    }

    // get first weekday of current month
    public int getFirstWeekdayOfMonth() {
        return Date.getFirstWeekdayOfMonth(this.month);
    }
}
