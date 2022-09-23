package org.example.seccion3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
public class ADisabledTest {
    //@Disabled
    @Test
    void test1() {
        System.out.println("Start test 1");
        assertTrue(true);
    }

    @Test
    void test2() {
        System.out.println("Start test 2");
        assertEquals(1, 1);
    }
}
