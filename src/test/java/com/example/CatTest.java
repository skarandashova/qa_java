package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Mock
    Predator predator;

    Cat cat = new Cat(feline);

    @Test
    public void catGetFoodReturnsAnimalBirdsFishTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }


    @Test
    public void catGetSoundReturnsMeowTest() {
        assertEquals("Мяу", cat.getSound());
    }
}