package ru.netology.stats.javaHW5.servises;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageAmount(long[] sales) {
        return sumOfAllSales(sales) / sales.length;
    }

    public long peakSales(long[] sales) {
        long month = 0;
        long max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (max <= sales[i]) {
                max = sales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public long minimumSales(long[] sales) {
        long month = 0;
        long min = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (min >= sales[i]) {
                min = sales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public long belowTheAverage(long[] sales) {
        long month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount(sales)) {
                month++;
            }
        }
        return month;
    }

    public long aboveAverage(long[] sales) {
        long month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount(sales)) {
                month++;
            }
        }
        return month;
    }

}
