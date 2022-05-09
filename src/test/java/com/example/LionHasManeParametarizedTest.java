package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeTest {

    private final String sex;
    private final boolean hasMane;
    private final boolean expectedLionHasMane;
    private final List<String> actualLionGetFood;
    private final List<String> expectedLionGetFood;


    public LionHasManeTest(String sex, boolean hasMane, boolean expectedLionHasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
        this.expectedLionHasMane = expectedLionHasMane;
    }


    @Parameterized.Parameters
    public static Object[][] hasMane() {
        return new Object[][]{
                {"Самец", true, true},
                {"Cамка", false, false},
        };
    }


    @Test
    public void lionDoesHaveManeReturnsBooleanHasManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedLionHasMane, hasMane);
    }


    public lionFoodTest(String sex, List<String> actualLionGetFood, List<String> expectedLionGetFood) {
        this.sex = sex;
        this.actualLionGetFood = actualLionGetFood;
        this.expectedLionGetFood = expectedLionGetFood;
    }


    @Parameterized.Parameters
    public static Object[][] getFood() {
        return new Object[][]{
                {"Самец", List.of("Животные", "Птицы", "Рыба"), List.of("Животные", "Птицы", "Рыба")},
                {"Cамка", List.of("Животные", "Птицы", "Рыба"), List.of("Животные", "Птицы", "Рыба")},
        };
    }


    @Test
    public void lionFoodReturnsAnimalsBirdsFishTest() throws Exception {
        Lion lion = new Lion(sex);
        List<String> actual = lion.getFood();
        Assert.assertEquals(expectedLionGetFood, actualLionGetFood);
    }
}

