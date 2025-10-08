package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTests {
    @Test
    public void getFamilyIsCorrect() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals("Ошибка в методе getFamily",
                expected,
                new Animal().getFamily()
        );
    }

    @Test
    public void getFoodThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> new Animal().getFood("undefined"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}