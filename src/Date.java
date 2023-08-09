public class Date {

    private int Day;
    private int month;
    private int year;

    public Date() {
        Day = 4;
        month = 8;
        year = 2000;

    }

    public Date(int day, int month, int year) {
        if (day < 31) {
            this.Day = day;
        }
        if (month < 12) {
            this.month = month;
        }
        this.year = year;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
