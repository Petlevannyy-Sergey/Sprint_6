package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void getSoundIsCorrect() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodIsCorrect() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Мясо");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        assertEquals("Ошибка в методе getFood",
                cat.getFood(),
                expected
        );
    }
}
