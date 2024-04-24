// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 4 - Payroll System Modification
// File: BasePlusCommissionEmployee.java

package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    // base salary per week
    private double baseSalary;

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, int month, int day, int year, double grossSales,
            double commissionRate, double baseSalary) throws IllegalArgumentException {

        super(firstName, lastName, socialSecurityNumber, month, day, year, grossSales,
                commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // return base-salaried commission employee's base salary
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // calculate base-salaried commission employee's earnings
    public double earnings() {
        return this.getBaseSalary() + this.earnings();
    }

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                "base-salaried commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(), "gross sales", getGrossSales(),
                "commission rate", getCommissionRate(), "base salary", getBaseSalary());
    }
}
