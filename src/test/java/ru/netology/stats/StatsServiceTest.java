package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

    @Test
    void shouldCalculateSum() {
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        int expected = 15;
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMaxSales() {
        int expected = 8;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMinSales() {
        int expected = 9;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthUnderAverage() {
        int expected = 5;
        int actual = service.countUnderAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthOverAverage() {
        int expected = 5;
        int actual = service.countOverAverage(sales);
        assertEquals(expected, actual);
    }
}