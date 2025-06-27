package Testing;
import static org.junit.jupiter.api.Assertions.*; // Assertions
import org.junit.jupiter.api.Test;   
public class AssertionsTest {
	 @Test
	    public void testAssertions() {
	        // Assert equals
	        assertEquals(5, 2 + 3, "2 + 3 should equal 5");

	        // Assert true
	        assertTrue(5 > 3, "5 is greater than 3");

	        // Assert false
	        assertFalse(5 < 3, "5 is not less than 3");

	        // Assert null
	        assertNull(null, "Value should be null");

	        // Assert not null
	        assertNotNull(new Object(), "Object should not be null");
	    }
}
