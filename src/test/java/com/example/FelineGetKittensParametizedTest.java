package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensParametizedTest {

    private final int kittensCount;
    private final int expected;
    private final int actual;


    public FelineGetKittensParametizedTest(int kittensCount, int expected, int actual) {
        this.kittensCount = kittensCount;
        this.expected = expected;
        this.actual = actual;
    }


    @Parameterized.Parameters
    public static Object[][] hasMane() {
        return new Object[][]{
                {1, 1, 1},
                {0, 1, 1},
                {-5, 1, 1},
        };
    }


    @Test
    public void felineGetKittensKittensCountParametarizedTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}

