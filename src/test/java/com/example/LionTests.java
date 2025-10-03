package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    @Mock
    Feline feline;

    @Test
    public void getFoodIsCorrect() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedListOfFood = List.of("Мясо");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedListOfFood);
        assertEquals("Ошибка в методе getFood", expectedListOfFood, lion.getFood());
    }

    @Test
    public void getKittensIsCorrect() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expectedKittensCount = 3;
        Mockito.when(feline.getKittens()).thenReturn(expectedKittensCount);
        assertEquals("Ошибка в методе getKittens", expectedKittensCount, lion.getKittens());

    }

    @Test
    public  void LionConstructorThrowsException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> new Lion(feline, "Undefined"));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
