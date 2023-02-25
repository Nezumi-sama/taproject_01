package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerTest {

    @Test
    public void remainAmountRemainsNotMultiple1000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 2050;

        int actual = cashBackHacker.remain(amount);
        int expected = 950;

        assertEquals(actual, expected);
    }


    @Test
    public void remainAmountRemains1000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void remainAmountRemainsMultiple1000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 5000;

        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }





}