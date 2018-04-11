package logic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalcLogic() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.calculate());
    }
}
