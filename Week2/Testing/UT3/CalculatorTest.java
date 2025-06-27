package Testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    // Setup method – runs before each test
    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("Setup completed.");
    }

    // Teardown method – runs after each test
    @AfterEach
    void tearDown() {
        calc = null;
        System.out.println("Teardown completed.");
    }

    @Test
    void testAddition() {
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {
        int result = calc.subtract(5, 2);
        assertEquals(3, result);
    }

    @Test
    void testMultiplication() {
        int result = calc.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    void testDivision() {
        int result = calc.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
