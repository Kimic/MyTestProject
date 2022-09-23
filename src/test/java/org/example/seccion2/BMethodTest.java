package org.example.seccion2;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BMethodTest {

    SmartPhoneService smartPhoneService;
    @BeforeEach
    void setUp() {
        System.out.println("Ejecuta setUp");
        smartPhoneService = new SmartPhoneServiceImpl();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Ejecuta tearDown");
    }

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
