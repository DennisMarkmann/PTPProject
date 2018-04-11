package logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testMultiplyException() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.calculate());
    }
}
