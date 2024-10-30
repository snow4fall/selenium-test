package org.test.my_app_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSumMethod() {
        Calculator cal = new Calculator();
        int add = cal.add(10, 20);
        assertEquals(add, 30);
    }
}
