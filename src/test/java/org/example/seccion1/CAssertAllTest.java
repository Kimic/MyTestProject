package org.example.seccion1;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CAssertAllTest {

    @Test
    void assertAllTest() {

        //System under test (SUT)
        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();

        Integer count = smartPhoneService.count();

        //AssertAll
        assertAll("Comprobaciones",
                ()-> assertNotNull( count ),
                ()-> assertTrue( count > 2 ),
                ()-> assertEquals( 3, count , "Se esperaba que count fuese 3" )
                );

    }
}
