package ru.netology.stats.javaHW5.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void Test1() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //входящие параметры
        long sum = 180;                                                // ожидаемый результат
        long rezalt = service.sumOfAllSales(sales);
        Assertions.assertEquals(sum, rezalt);
    }

    @Test
    public void Test2() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //входящие параметрыы
        long avg = 15;                                                 // ожидаемый результат
        long rezalt = service.averageAmount(sales);
        Assertions.assertEquals(avg, rezalt);
    }

    @Test
    public void Test3() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //входящие параметрыы
        long month = 8;                                               // ожидаемый результат
        long rezalt = service.peakSales(sales);
        Assertions.assertEquals(month, rezalt);
    }

    @Test
    public void Test4() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //входящие параметрыы
        long month = 9;                                               // ожидаемый результат
        long rezalt = service.minimumSales(sales);
        Assertions.assertEquals(month, rezalt);
    }

    @Test
    public void Test5() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //входящие параметрыы
        long month = 5;                                               // ожидаемый результат
        long rezalt = service.belowTheAverage(sales);
        Assertions.assertEquals(month, rezalt);
    }

    @Test
    public void Test6() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; //входящие параметрыы
        long month = 5;                                               // ожидаемый результат
        long rezalt = service.aboveAverage(sales);
        Assertions.assertEquals(month, rezalt);
    }

}
