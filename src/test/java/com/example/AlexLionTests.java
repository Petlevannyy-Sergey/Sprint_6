package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTests {
    @Mock
    Feline feline;

    @Test
    public void getKittensIsCorrect() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        int expectedKittensCount = 0;
        assertEquals("Ошибка в методе getKittens", expectedKittensCount, alexLion.getKittens());
    }

    @Test
    public void getPlaceOfLivingIsCorrect() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        assertEquals("Ошибка в методе getPlaceOfLiving", expectedPlaceOfLiving, alexLion.getPlaceOfLiving());
    }

    @Test
    public void getFriendsIsCorrect() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        List<String> expectedListOfFriends = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        assertEquals("Ошибка в методе getFriends",expectedListOfFriends, alexLion.getFriends());
    }
}
