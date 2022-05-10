package com.example;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;



public class FelineTest {

    Feline feline = new Feline();


    @Test
    public void felineEatMeatReturnsAnimalsBirdsFishTest() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = feline.getFood("Хищник");
        assertEquals(expected, actual);
    }


    @Test
    public void felineGetKittens() {
        int actual = feline.getKittens(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void felineGetFamilyReturnsFelineTest() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }
}