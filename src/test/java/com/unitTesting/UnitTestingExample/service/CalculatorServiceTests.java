package com.unitTesting.UnitTestingExample.service;

import org.junit.jupiter.api.*;
import org.mockito.*;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@MockitoSettings(strictness = Strictness.LENIENT)
public class CalculatorServiceTests {

    @InjectMocks
    CalculatorService calculatorService;

    @Mock
    ExampleCollaborator collaborator;

    @Test
    public void addReturnsSumOfTwoNumbers() {
        Integer number1 = 5;
        Integer number2 = 10;
        when(collaborator.add(number1,number2)).thenReturn(15);

        Integer answer = calculatorService.add(number1, number2);

        assertEquals(15, answer);
    }

    @Test
    public void subtractReturnsDifferenceOfTwoNumbers() {
        when(collaborator.subtract(any(),any())).thenReturn(-5);

        Integer answer = calculatorService.subtract(5, 10);

        assertEquals(-5, answer);
    }

    @Test
    public void multiplyReturnsProductOfTwoNumbers() {
        Integer number1 = 5;
        Integer number2 = 10;
        when(collaborator.multiply(number1, number2)).thenReturn(50);

        Integer answer = calculatorService.multiply(number1, number2);

        assertEquals(50, answer);
    }

    @Test
    public void divideReturnsQuotientOfTwoNumbers() {
        Integer number1 = 5;
        Integer number2 = 5;
        when(collaborator.divide(number1, number2)).thenReturn(1);

        Integer answer = calculatorService.divide(number1, number2);

        assertEquals(1, answer);
    }
}
