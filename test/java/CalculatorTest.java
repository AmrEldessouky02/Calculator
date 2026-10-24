import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSumPositive() {


        int expected = 3;
        int actual = calculator.sum(1,2 );
        assertEquals(expected, actual);
    }

    @Test
    public void testSumNegative() {
        int expected = -8;
        int actual = calculator.sum(-4,-4);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumZero() {
        int expected = 5;
        int actual = calculator.sum(5,0);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractNegative() {


        int expected = -1;
        int actual = calculator.subtract(1,2 );
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractPositive() {
        int expected = 3;
        int actual = calculator.subtract(4,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {


        int expected = 2;
        int actual = calculator.multiply(1,2 );
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyNegative() {
        int expected = -10;
        int actual = calculator.multiply(-5,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyZero() {
        int expected = 0;
        int actual = calculator.multiply(5,1);
        assertEquals(expected, actual);

    }
    @Test
    public void testDivide() {


        int expected = 2;
        int actual = calculator.multiply(2,1);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        boolean expected = true;
        boolean actual = calculator.isEven(2 );
        assertEquals(expected, actual);
    }
}
