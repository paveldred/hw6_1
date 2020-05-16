package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void amountOfPurchasesAllMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = StatsService.amountOfPurchasesAllMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageAllMonths() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = StatsService.averageAllMonths(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthWithMaxAmountOfPurchases() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = StatsService.monthWithMaxAmountOfPurchases(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthWithMinAmountOfPurchases() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = StatsService.monthWithMinAmountOfPurchases(sales);

        assertEquals(expected, actual);
    }

    @Test
    void countOfMonthsUnderAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = StatsService.countOfMonthsUnderAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void countOfMonthsOverAvg() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = StatsService.countOfMonthsOverAvg(sales);

        assertEquals(expected, actual);
    }
}