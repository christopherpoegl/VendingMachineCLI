package com.techelevator.vending;

import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

    @Test
    public void makeCandy() {
        Candy candy = new Candy("B1", "Moonpie", "1.80", "Candy");

        String expectedPosition = "B1";
        String actualPosition = candy.getPosition();
        Assert.assertEquals(expectedPosition, actualPosition);
    }
    @Test
    public void purchaseMessageTest() {
    }

}