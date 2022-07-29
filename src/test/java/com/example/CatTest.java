package com.example;

import dataForTests.AnimalKindFoodType;
import dataForTests.CatData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    Feline feline = Mockito.mock(Feline.class);

    Cat cat = new Cat(feline);

    @Test
    public void getSound() {
        Assert.assertEquals(CatData.MYAW, cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(AnimalKindFoodType.PREDATOR_FOOD);
        Assert.assertEquals(cat.getFood(), AnimalKindFoodType.PREDATOR_FOOD);
    }
}