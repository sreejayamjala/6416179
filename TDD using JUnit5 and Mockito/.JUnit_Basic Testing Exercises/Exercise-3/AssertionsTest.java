import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals("Expected 5 + 3 to equal 5", 8, 5 + 3);
        assertTrue("Expected 5 > 3 to be true", 5 > 3);
        assertFalse("Expected 5 < 3 to be false", 5 < 3);
        assertNull("Expected value to be null", null);
        assertNotNull("Expected object to not be null", new Object());
    }
}
