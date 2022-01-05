package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {
    private Less20 less20;

// Arrange
// Act
// Assert


    @Before
    public void setup() {
        less20 = new Less20();
    }

    @Test
    public void greater20(){
// Arrange
// Act
// assert
        Assert.assertEquals (false, less20.isLessThanMultipleOf20(21));
    }

    @Test
    public void less20(){
// Arrange
// Act
// assert
        Assert.assertEquals (true, less20.isLessThanMultipleOf20(19));
    }




}
