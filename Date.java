
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException();
        }
        this.month = month;

        if (day < 1 || day > 31) {
            throw new IllegalArgumentException();
        }
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
}
