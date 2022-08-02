package com.example;

import dataForTests.LionData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionWithParametersTest {
    String sex;
    boolean hasMane;

    public LionWithParametersTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getLionData() {
        return LionData.LION_HAS_MANE_DATA;
    }

    @Test
    public void doesHasManeTrue() throws Exception {
        Lion lion = new Lion(this.sex, new Feline());
        boolean doesHaveMane = lion.doesHaveMane();
        Assert.assertEquals("пол льва не соответствует заданному", this.hasMane, doesHaveMane);
    }
}