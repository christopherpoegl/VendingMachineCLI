package com.techelevator.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class DrinkTest {
    @Test
    public void doesMakeDrink() {

        Drink drink = new Drink("C1", "Cola", "1.25", "Drink");
        String expectedPosition = "C1";
        String actualPosition = drink.getPosition();
        assertEquals(expectedPosition, actualPosition);
    }

}

