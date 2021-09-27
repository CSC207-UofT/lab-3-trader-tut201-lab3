/*
 * This file contains sample JUnit test cases for Tesla.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class TeslaTest {
    Tesla T;

    @Before
    public void setUp() throws Exception {
        T = new Tesla("Model 3", 10000, 100);
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(200, T.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        T.upgradeSpeed();
        assertEquals(110, T.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        T.downgradeSpeed();
        assertEquals(90, T.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, T.getPrice());
    }

}