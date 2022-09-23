package org.example.seccion1;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BExceptionsTest {

    @Test
    void findOneIllegalArgumentExceptionTest() {

        SmartPhoneService smartPhoneService = new SmartPhoneServiceImpl();
        //assertion throwexception
        assertThrows( IllegalArgumentException.class, ()-> smartPhoneService.findOne(null));
    }
}
