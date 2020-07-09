package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 15;
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 8;
        int actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 9;
        int actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthUnderAverage() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        int actual = service.countUnderAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthOverAverage() {
        StatsService service = new StatsService();
        int [] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;
        int actual = service.countOverAverage(sales);
        assertEquals(expected, actual);
    }
}