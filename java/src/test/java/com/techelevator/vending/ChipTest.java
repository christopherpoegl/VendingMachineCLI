package com.techelevator.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChipTest {
    @Test
    public void doesMakeChip() {
        Chip chip = new Chip("A1", "Potato Crisps", "3.05", "Chip");
        String expectedPosition = "A1";
        String actualPosition = chip.getPosition();
        assertEquals(expectedPosition, actualPosition);
    }

}