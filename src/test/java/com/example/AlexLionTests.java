package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTests {
    AlexLion alexLion;

    @Before //этот код выполнятся перед каждым тестом
    public void initialize() throws Exception {
        alexLion = new AlexLion(feline);
    }
    @Mock
    Feline feline;

    @Test
    public void getKittensIsCorrect() throws Exception {
        int expectedKittensCount = 0;
        assertEquals("Ошибка в методе getKittens", expectedKittensCount, alexLion.getKittens());
    }

    @Test
    public void getPlaceOfLivingIsCorrect() throws Exception {
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        assertEquals("Ошибка в методе getPlaceOfLiving", expectedPlaceOfLiving, alexLion.getPlaceOfLiving());
    }

    @Test
    public void getFriendsIsCorrect() throws Exception {
        List<String> expectedListOfFriends = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        assertEquals("Ошибка в методе getFriends",expectedListOfFriends, alexLion.getFriends());
    }
}
