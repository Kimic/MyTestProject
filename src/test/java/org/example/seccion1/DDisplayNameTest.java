package org.example.seccion1;

import org.example.domain.SmartPhone;
import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName( "SmartPhoneService CRUD Testing" )
public class DDisplayNameTest {

    @Test
    @DisplayName( "findOne IllegalArgumentException Test" )
    void test1() {

        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();
        //assertthrows exception
        assertThrows( IllegalArgumentException.class, ()-> smartPhoneService.findOne( null ));
    }

    @Test
    @DisplayName( "finOne SmartPhone id 1" )
    void test2() {

        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();
        SmartPhone result = smartPhoneService.findOne( 1L );
        //assertnotnull
        assertNotNull(result);
        //assertEquals
        assertEquals( 1L, result.getId() );
    }
}
