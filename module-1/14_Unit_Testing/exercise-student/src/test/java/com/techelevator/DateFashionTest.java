package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {
    private DateFashion dateFashion;

// Arrange
// Act
// Assert


    @Before
    public void setup() {
        dateFashion = new DateFashion();
    }

    @Test
    public void dateFashionYes10(){
// Arrange
// Act
// assert
        Assert.assertEquals (2, dateFashion.getATable(5,10));
    }

    @Test
    public void dateFashionLowNo2(){
// Arrange
// Act
// assert
        Assert.assertEquals (0, dateFashion.getATable(5,2));
    }

    @Test
    public void dateFashion55Maybe(){
// Arrange
// Act
// assert
        Assert.assertEquals (1, dateFashion.getATable(5,5));
    }

}


