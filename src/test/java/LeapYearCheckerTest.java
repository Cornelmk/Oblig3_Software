import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {
    @Test
    public void testLeapYearDivisibleBy4NotDivisibleBy100() {
        assertTrue(LeapYearChecker.isLeapYear(2020));
        assertTrue(LeapYearChecker.isLeapYear(2008));
    }

    @Test
    public void testLeapYearDivisibleBy400() {
        assertTrue(LeapYearChecker.isLeapYear(2000));
        assertTrue(LeapYearChecker.isLeapYear(2400));
    }

    @Test
    public void testLeapYearDivisibleBy4() {
        assertFalse(LeapYearChecker.isLeapYear(2022));
        assertFalse(LeapYearChecker.isLeapYear(2026));
    }

    @Test
    public void testNotLeapYearDivisibleBy100NotDivisibleBY400() {
        assertFalse(LeapYearChecker.isLeapYear(1700));
        assertFalse(LeapYearChecker.isLeapYear(1800));
        assertFalse(LeapYearChecker.isLeapYear(1900));
        assertFalse(LeapYearChecker.isLeapYear(2100));
    }
}
