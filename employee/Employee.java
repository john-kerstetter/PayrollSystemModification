package employee;
// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 4 - Payroll System Modification
// File: Employee.java

import date.Date;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

    // construct an employee
    public Employee(String firstName, String lastName, String socialSecurityNumber, int month,
            int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

        this.birthDate = new Date(year, month, day);
    }

    // gets first name
    public String getFirstName() {
        return this.firstName;
    }

    // gets last name
    public String getLastName() {
        return this.lastName;
    }

    // get social security number
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    // get birth date
    public Date getBirthDate() {
        return this.birthDate;
    }

    // return a string representation
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s", "Name", this.firstName, this.lastName, "SSN",
                this.socialSecurityNumber);
    }

    public abstract double earnings();
}
