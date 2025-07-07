package com.ejemplo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculadoraServiceTest {
    @Test
    void TestSumar(){
        CalculadoraService calc= new CalculadoraService();
        assertEquals(5, calc.sumar(3, 2));
    }

    @Test
    void TestRestar(){
        CalculadoraService calc= new CalculadoraService();
         assertEquals(2, calc.sustracc(5, 3));
    }

     @Test
    void testMultiplicar() {
        CalculadoraService calc = new CalculadoraService();
        assertEquals(15, calc.prod(3, 5));
    }

    @Test
    void testDividir() {
        CalculadoraService calc = new CalculadoraService();
        assertEquals(2, calc.div(10, 5));
    }

    @Test
    void testDivisionPorCero() {
        CalculadoraService calc = new CalculadoraService();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            calc.div(10, 0);
        });
        assertEquals("División por cero", ex.getMessage());
    }


}
