import java.util.Arrays;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH, Month.MAY,
            Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER};

    public boolean has31Days(Month month) {
        // Always returns false since February never has 31 days
        if (month == Month.FEBRUARY) {
            return false;
        }

        if (Arrays.asList(monthThirtyOneDays).contains(month)){
            return true;
        }
        else {
            return false;
        }
    }
}
