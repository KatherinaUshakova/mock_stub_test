package com.example;

import dataForTests.AnimalKindFoodType;
import dataForTests.FelineData;
import org.junit.Assert;
import org.junit.Test;

public class FelineTest {

    private int kittensNum = 3;

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        Assert.assertTrue(feline.eatMeat().equals(AnimalKindFoodType.PREDATOR_FOOD));
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals(FelineData.FELINE_FAMILY, feline.getFamily());
    }

    @Test
    public void getKittensWithoutArgumentsReturnsCorrectValue1() {
        Assert.assertEquals(FelineData.DEFAULT_KITTENS_NUMBER, feline.getKittens());
    }

    @Test
    public void testGetKittensReturnsCorrectValue3() {
        Assert.assertEquals(kittensNum, feline.getKittens(kittensNum));
    }
}

