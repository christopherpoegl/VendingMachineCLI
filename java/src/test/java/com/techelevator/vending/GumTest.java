package com.techelevator.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class GumTest {
    @Test
    public void doesMakeGum() {
        Gum gum = new Gum("D1", "U-Chews", "0.85", "Gum");
        String expectedPosition = "D1";
        String actualPosition = gum.getPosition();
        assertEquals(expectedPosition, actualPosition);
    }

}