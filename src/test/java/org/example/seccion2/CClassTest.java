package org.example.seccion2;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CClassTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Start beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Start afterAll");
    }

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

    @Order(2)
    @Test
    void test1() {
        System.out.println("Start test 1");
        assertTrue(true);
    }

    @Order(1)
    @Test
    void test2() {
        System.out.println("Start test 2");
        assertEquals(1, 1);
    }
}
