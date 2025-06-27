package Testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SettingUpTest {

	SettingUp calc = new SettingUp();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, calc.subtract(5, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calc.divide(10, 2));
    }

}
