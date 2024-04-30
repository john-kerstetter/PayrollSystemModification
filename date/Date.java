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
}
