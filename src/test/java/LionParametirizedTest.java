package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeParametarizedTest {

    private final String sex;
    private final boolean hasMane;
    private final boolean expectedLionHasMane;


    public LionHasManeParametarizedTest(String sex, boolean hasMane, boolean expectedLionHasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
        this.expectedLionHasMane = expectedLionHasMane;
    }


    @Parameterized.Parameters
    public static Object[] hasMane() {
        return new Object[][]{
                {"Самец", true, true},
                {"Самка", false, false},
        };
    }


    @Test
    public void lionDoesHaveManeReturnsBooleanHasManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedLionHasMane, hasMane);
    }
}

