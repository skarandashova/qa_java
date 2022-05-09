package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;



@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Mock
    Predator predator;


    @Test
    public void catGetFoodReturnsAnimalBirdsFishTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }


    @Test
    public void catGetSoundReturnsMeowTest() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }
}