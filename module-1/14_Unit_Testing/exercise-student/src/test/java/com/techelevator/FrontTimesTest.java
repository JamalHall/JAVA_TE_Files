package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {
    private FrontTimes frontTimes;

// Arrange
// Act
// Assert

    @Before
    public void setup() {

        frontTimes = new FrontTimes();
    }

    @Test
    public void chocFrontTimes() {
// Arrange
// Act
// assert
        Assert.assertEquals("ChoChoCho", frontTimes.generateString("Chocolate", 3));
    }

    @Test
    public void itFrontTimes(){
// Arrange
// Act
// assert
        Assert.assertEquals ("ititit", frontTimes.generateString("it",3));
    }

}
