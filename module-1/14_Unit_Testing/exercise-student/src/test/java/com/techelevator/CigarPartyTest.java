package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

        private CigarParty cigarParty;

// Arrange
// Act
// Assert

        @Before
        public void setup() {
            cigarParty = new CigarParty();
        }

        @Test
        public void cigarParty30false(){
// Arrange
// Act
// assert
            Assert.assertEquals (false, cigarParty.haveParty(30,false));
        }


    @Test
    public void cigarParty50false(){
// Arrange
// Act
// assert
        Assert.assertEquals (true, cigarParty.haveParty(50,false));
    }


    @Test
    public void cigarParty70true(){
// Arrange
// Act
// assert
        Assert.assertEquals (true, cigarParty.haveParty(50,false));
    }





    }
