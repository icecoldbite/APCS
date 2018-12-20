public class DateOfBirthV1 {
    private int month;
    private int day;
    private int year;

    public DateOfBirthV1(int month,int day,int year) {
        this.month= month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date of birth: " + month + "/" + day + "/" + year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
