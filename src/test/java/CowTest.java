/*
 * Test cases for the cow class.
 */
import org.junit.*;

import static org.junit.Assert.*;


public class CowTest {
    Cow cow;

    @Before
    public void setUp() throws Exception {
        cow = new Cow();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Moo", cow.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(600, cow.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetBreed() {
        assertEquals("Angus", cow.getBreed());
    }
}