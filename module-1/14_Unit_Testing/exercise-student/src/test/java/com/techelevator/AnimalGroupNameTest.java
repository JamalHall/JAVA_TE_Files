package com.techelevator;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalGroupNameTest {
    private AnimalGroupName animalGroupName;

    @Before
    public void setup() {
        animalGroupName = new AnimalGroupName();
    }

    @Test
    public void animalNameGroup() {
//    return the name of a group test
        // Arrange
        // Act
        // Assert
        Assert.assertEquals("Tower", animalGroupName.getHerd("GiRAFFe"));
    }

    @Test
    public void animalNameCase() {
        //    case-insensitive
        // Arrange
        // Act
        // Assert
        Assert.assertEquals("giraffe accepted", "Tower", animalGroupName.getHerd("GiRAFFe"));
    }


    @Test
    public void animalNameGroupNotFound() {
        //    name of the animal is not found
        // Arrange
        // Act
        // Assert
        Assert.assertEquals("giraffe accepted", "unknown", animalGroupName.getHerd("MOUse"));


    }


}
