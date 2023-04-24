package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalcSummarySales() {
        StatsService service = new StatsService();
        long actual = service.summarySales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        long actual = service.averageSales(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMaxSales() {
        StatsService service = new StatsService();
        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMinSales() {
        StatsService service = new StatsService();
        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSalesUnderAverage() {
        StatsService service = new StatsService();
        int actual = service.salesUnderAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcSalesAboveAverage() {
        StatsService service = new StatsService();
        int actual = service.salesAboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
