package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {

   private NonStart nonStart;


        @Before
        public void setup() {
            nonStart = new NonStart();
        }

// Arrange

        String part1 = "Hello";
        String part2 = "There";
        String expected1 = "ellohere";

        String part3 = "java";
        String part4 = "code";
        String expected2 = "avaode";

        String part5 = "shotl";
        String part6 = "java";
        String expected3 = "hotlava";



        @Test
        public void helloNoStart() {

// assert
            Assert.assertEquals (expected1, nonStart.getPartialString(part1,part2));
        }

    @Test
    public void javaNoStart() {

// assert
        Assert.assertEquals (expected2, nonStart.getPartialString(part3,part4));
    }

    @Test
    public void shotlNoStart() {

// assert
        Assert.assertEquals (expected3, nonStart.getPartialString(part5,part6));
    }
}
