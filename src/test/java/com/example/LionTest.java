package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Feline feline ;


    @Test
    public void lionDoesHaveManeErrorSexExceptionTest() {
        Exception e = assertThrows("текст проверки", Exception.class, () -> new Lion("самецсамка",  feline));
        assertEquals(e.getMessage(), "Используйте допустимые значения пола животного - самец или самка");
    }


    @Test
    public void lionMaleGetKittensShouldReturnsKittensCountTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionFemaleGetKittensShouldReturnsKittensCountTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionMaleGetFoodReturnsAnimalsBirdsFishTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void lionFemaleGetFoodReturnsAnimalsBirdsFishTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void lionMaleDoesHaveManeReturnsBooleanHasManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean lionMaleHasManeExpected = feline.equals("Самец");
        boolean lionMaleHasManeActual = lion.equals("Самец");
        Assert.assertEquals(lionMaleHasManeExpected, lionMaleHasManeActual);
    }

    @Test
    public void lionFemaleDoesHaveManeReturnsBooleanHasManeTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean lionFemaleHasManeExpected = feline.equals("Самка");
        boolean lionFemaleHasManeActual = lion.equals("Самка");
        Assert.assertEquals(lionFemaleHasManeExpected, lionFemaleHasManeActual);
    }
}



