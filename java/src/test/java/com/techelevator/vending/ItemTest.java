package com.techelevator.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void doesMakeGetters() {
        Item item = new Item("A2", "Stackers", "1.45", "Chip");
        String positionExpected = "A2";
        String positionActual = item.getPosition();
        assertEquals(positionExpected, positionActual);

        String nameExpected = "Stackers";
        String nameActual = item.getName();
        assertEquals(nameExpected, nameActual);

        String priceExpected = "1.45";
        String priceActual = item.getPrice();
        assertEquals(priceExpected, priceActual);

        String typeExpected = "Chip";
        String typeActual = item.getType();
        assertEquals(typeExpected, typeActual);

        String stockExpected = "5";
        String stockActual = item.getStock();
        assertEquals(stockExpected, stockActual);

        String expectedGetItemInfo = "A2, Stackers, 1.45, Remaining Stock=5";
        String actualGetItemInfo = item.getItemInfoToString();
        assertEquals(expectedGetItemInfo, actualGetItemInfo);
    }

}
