package org.compression;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CompressionTimeCalculatorTest {
    private CompressionTimeCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new CompressionTimeCalculator();
    }

    @Test
    void testCalculateExecutionTimeWithZero() {
        // Test 1: Verificar que el cálculo es correcto para tamaño 0
        double result = calculator.calculateExecutionTime(0);
        assertEquals(5.0, result, 0.0001,
                "Para n=0, el resultado debe ser igual al término constante (5)");
    }

    @Test
    void testCalculateExecutionTimeWithPositiveValue() {
        // Test 2: Verificar que el cálculo es correcto para un valor positivo
        double result = calculator.calculateExecutionTime(1);
        assertEquals(10.0, result, 0.0001,
                "Para n=1, el resultado debe ser 1 + 7 - 3 + 5 = 10");
    }

    @Test
    void testCalculateExecutionTimeWithNegativeValue() {
        // Test 3: Verificar que se lanza excepción para valores negativos
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateExecutionTime(-1),
                "Debe lanzar IllegalArgumentException para valores negativos");
    }
}