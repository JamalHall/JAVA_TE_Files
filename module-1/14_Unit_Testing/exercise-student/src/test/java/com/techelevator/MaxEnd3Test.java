package com.techelevator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

    public class MaxEnd3Test {

        private MaxEnd3 maxEnd3;


        @Before
        public void setup() {
            maxEnd3 = new MaxEnd3();
        }

// Arrange

        int[] array1 = { 1, 2, 3 };
        int[] expected1 = { 3, 3, 3 };

        int[] array2 = { 11, 5, 9 };
        int[] expected2 = { 11, 11, 11 };

        int[] array3 = { 2, 11, 3 };
        int[] expected3 = { 3, 3, 3 };



        @Test
        public void makeArray1test() {

// assert
            Assert.assertArrayEquals (expected1, maxEnd3.makeArray(array1));
        }

        @Test
        public void makeArray2test() {
// assert
            Assert.assertArrayEquals(expected2, maxEnd3.makeArray(array2));
        }

        @Test
        public void makeArray3test() {
// assert
            Assert.assertArrayEquals(expected3, maxEnd3.makeArray(array3));
        }


    }








