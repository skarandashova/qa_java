package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Feline feline ;


    @Test
    public void lionDoesHaveManeErrorSexExceptionTest() {
        Exception e = assertThrows("текст проверки", Exception.class, () -> new Lion("самецсамка"));
        assertEquals(e.getMessage(), "Используйте допустимые значения пола животного - самец или самка");
    }


    @Test
    public void lionMaleGetKittensShouldReturnsKittensCountTest() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionGetFoodReturnsAnimalsBirdsFishTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}



