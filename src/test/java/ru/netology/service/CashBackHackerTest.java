package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @Test
    public void remainAmount0() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 0;

        int actual = cashBackHacker.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void remainAmountRemains0() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 2000;

        int actual = cashBackHacker.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void remainAmountRemainsNot0() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1050;

        int actual = cashBackHacker.remain(amount);
        int expected = 950;

        assertEquals(actual, expected);
    }


}