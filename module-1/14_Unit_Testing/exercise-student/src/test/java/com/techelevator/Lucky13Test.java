package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {

    private Lucky13 lucky13;

// Arrange
// Act
// Assert


    @Before
    public void setup() {
        lucky13 = new Lucky13();
    }

    //Arrange
    int[] num1 = {0, 2, 4};  // should return lucky
    int[] num2 = {1, 2, 3};  // should return false
    int[] num3 = {1, 2, 4};  // should return false


    @Test
    public void noOnes() {

// assert
        Assert.assertEquals(false, lucky13.getLucky(num2));
    }

    @Test
    public void noOnesNoThrees() {
// assert
        Assert.assertEquals(true, lucky13.getLucky(num1));
    }

    @Test
    public void noThrees() {
// assert
        Assert.assertEquals(false, lucky13.getLucky(num3));
    }

}
