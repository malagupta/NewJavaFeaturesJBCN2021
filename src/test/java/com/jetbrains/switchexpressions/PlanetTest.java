package com.jetbrains.switchexpressions;

import com.jetbrains.sealedtypes.plants.Plant;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {
    Planet planet;

    @BeforeEach
    void init() {
        planet = new Planet();
    }

    @Nested
    @DisplayName("Test method getDamageToPlanet(SingleUsePlastic)")
    class TestGetDamageToPlanet {
        @Test
        @DisplayName("Get damage to Planet when CUP")
        void getDamageToPlanetWhenCUP() {
            assertEquals(Planet.DAMAGE_CUP,
                         planet.getDamageToPlanet(Planet.SingleUsePlastic.CUP));
        }

        @Test
        @DisplayName("Get damage to Planet when STRAW")
        void getDamageToPlanetWhenSTRAW() {
            assertEquals(Planet.DAMAGE_STRAW,
                         planet.getDamageToPlanet(Planet.SingleUsePlastic.STRAW));
        }

        @Test
        @DisplayName("Get damage to Planet when BOTTLE")
        void getDamageToPlanetWhenCUPWhenBottle() {
            assertEquals(Planet.DAMAGE_BOTTLE,
                         planet.getDamageToPlanet(Planet.SingleUsePlastic.BOTTLE));
        }
    }

}