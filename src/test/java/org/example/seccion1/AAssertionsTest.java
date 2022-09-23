package org.example.seccion1;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AAssertionsTest {

    @Test
    void count() {

        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();

        Integer count = smartPhoneService.count();

        //assertions
        assertNotNull(count);
        assertTrue(count > 0);
        assertEquals(3, count);
        assertEquals(3, count, "El número esperado era 3");
    }
}
