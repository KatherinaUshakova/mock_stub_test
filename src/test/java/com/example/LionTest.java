package com.example;

import dataForTests.AnimalKindFoodType;
import dataForTests.LionData;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class LionTest {
    String male = "Самец";

    public LionTest() throws Exception {
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    Feline feline = Mockito.mock(Feline.class);

    Lion lion = new Lion(male, feline);

    @Test
    public void getKittensReturnsCorrectValue() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(LionData.DEFAULT_LION_KITTENS, lion.getKittens());
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        Mockito.when(feline.getFood(AnimalKindFoodType.ANIMAL_KIND_PREDATOR)).thenReturn(AnimalKindFoodType.PREDATOR_FOOD);
        Assert.assertEquals(lion.getFood(), AnimalKindFoodType.PREDATOR_FOOD);
    }

    @Test
    public void lionConstructorThrowsExceptionWhenInitialisedWithWrongSex(){
        Assert.assertThrows(Exception.class, () -> new Lion("stone", feline));
    }

//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//    @Test
//    public void lionConstructorThrowsExceptionWhenInitialisedWithWrongSex2() throws Exception{
//        thrown.expect(Exception.class);
//        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");
//        new Lion("Самей", feline);
//    }
//
//    @Test(expected = Exception.class)
//    public void lionConstructorThrowsExceptionWhenInitialisedWithWrongSex3() throws Exception{
//        new Lion("Самеq", feline);
//    }
}