package ru.netology.stats.StatSales.services;

public class StatsService {
    public long sum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }
        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        long saleMinimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];
            }
        }
        return monthMinimum + 1;
    }

    public int monthSummUnderAverageSale(long[] sales) {
        int monthSummUnderAverage = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                monthSummUnderAverage++;
            }
        }
        return monthSummUnderAverage;
    }

    public int monthSummOverAverageSale(long[] sales) {
        int monthSummOverAverage = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                monthSummOverAverage++;
            }
        }
        return monthSummOverAverage;
    }
}

