package com.jetbrains.switchexpressions;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class UtilTest {
    @Disabled
    @RepeatedTest(4)
    @Tag("Maths")
    void test(RepetitionInfo repetitionInfo) {
        if (repetitionInfo.getCurrentRepetition() == 1) {
            // IDK
        }
        System.out.println("ok");
        assertEquals(10, 19);
    }


    @Disabled
    @Tag("Circle")
    @Nested
    class TestsForMultiply {
        @Test
        @DisplayName("multiply Test")
        void multiplyTest() {
//            final var planet = new Planet();
//            assertAll(() -> assertEquals(12, planet.multiply(12, 1), "12*1=12 should be true"), () -> assertEquals(0, planet.multiply(1, 0), "1*0=0 should be true"),
//                      () -> assertEquals(-10, planet.multiply(2, -5), "2*-5=-10 should be true"));

        }

        @EnabledOnOs(OS.WINDOWS)
        @Test
        void test2() {
            assertTrue(false);
            System.out.println("ok2");
        }

        @Test
        @DisplayName("Test Another Method")
        void testAnotherMethod() {
            assertEquals(10, 10, () -> "Hello");
        }
    }
}