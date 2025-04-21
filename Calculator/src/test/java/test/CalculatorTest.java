package test;

import org.example.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-5, calculator.subtract(0, 5));
    }
    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(0, 10));
    }
    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(3, calculator.divide(7, 2)); // Java'da tamsayı bölme
    }
    @Test
    void testMod() {
        assertEquals(1, calculator.mod(10, 3));
        assertEquals(0, calculator.mod(10, 5));
    }

    @Test
    void testSquare() {
        assertEquals(9, calculator.square(3));
        assertEquals(100, calculator.square(10));
    }

    @Test
    void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(7));
    }
}
