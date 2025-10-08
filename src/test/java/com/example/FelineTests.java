package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {

    @Test
    public void eatMeatIsCorrect() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyIsCorrect() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Ошибка в методе getFamily", expected, actual);
    }

    @Test
    public void getKittensWithNoParametersIsCorrect() {
        Feline feline = new Feline();
        assertEquals("Ошибка в методе getKittens без параметров", 1, feline.getKittens());
    }

    @Test
    public void getKittensWithParametersIsCorrect() {
        Feline feline = new Feline();
        assertEquals("Ошибка в методе getKittens c параметрами", 10, feline.getKittens(10));
    }
}
