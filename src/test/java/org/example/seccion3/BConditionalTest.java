package org.example.seccion3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BConditionalTest {

    @Test
    @EnabledOnJre( JRE.JAVA_8 )
    void test1() {
        System.out.println( "Start test 1" );
        assertTrue(true);
    }

    @Test
    @EnabledOnJre( JRE.JAVA_16 )
    void test2() {
        System.out.println( "Start test 2" );
        assertTrue(true);
    }

    @Test
    @EnabledForJreRange( min = JRE.JAVA_8, max = JRE.JAVA_16 )
    void test3() {
        System.out.println( "Start test 3" );
        assertTrue(true);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void test4() {
        System.out.println( "Start test 4" );
        assertTrue(true);
    }

    @Test
    void test5() {
        System.getenv().forEach(
                ( key , value ) -> System.out.println( key + " -- " + value )
        );

        System.getProperties().forEach(
                ( key , value ) -> System.out.println( key + " -- " + value )
        );
    }
}
