/*

 */

import org.junit.*;

import static org.junit.Assert.*;

public class PenguinTest {
    Penguin penguin;

    @Before
    public void setUp() throws Exception{
        penguin = new Penguin();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Peep!", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(0, h.getPrice());
    }

}
