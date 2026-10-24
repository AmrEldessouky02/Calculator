import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DateCheckerTest {

    DateChecker dateChecker = new DateChecker();


    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST",
                                                            "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month), month + " should have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testDoesNotHave31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month), month + " should not have 31 days");
    }

    @Test
    public void testFebruaryDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(DateChecker.Month.FEBRUARY), "February should never have 31 days");
    }

    @Test
    public void testNullMonth() {

        assertThrows(IllegalArgumentException.class, () -> {
            dateChecker.has31Days(null);
        });
    }
}