package ru.netology.stats;

public class StatsService {

    public static int amountOfPurchasesAllMonth(int[] sales) {
        int amountOfPurchasesAllMonth = 0;
        for (int saleMonth : sales) {
            amountOfPurchasesAllMonth += saleMonth;
        }
        return amountOfPurchasesAllMonth;
    }

    public static long averageAllMonths(int[] sales) {
        long averageAllMonths = StatsService.amountOfPurchasesAllMonth(sales) / sales.length;
        return averageAllMonths;
    }

    public static int monthWithMaxAmountOfPurchases(int[] sales) {

        int monthWithMaxAmountOfPurchases = 0;
        for (int i = 1; i < (sales.length); i++) {
            if (sales[i] >= sales[monthWithMaxAmountOfPurchases]) {
                monthWithMaxAmountOfPurchases = i;
            }
        }
        return monthWithMaxAmountOfPurchases + 1;
    }

    public static int monthWithMinAmountOfPurchases(int[] sales) {

        int minMonth = 0;
        for (int i = 1; i < (sales.length); i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public static int countOfMonthsUnderAverage(int[] sales) {
        int countOfMonth = 0;
        long average = averageAllMonths(sales);
        for (int i = 0; i < (sales.length); i++) {
            if (sales[i] < average) {
                countOfMonth += 1;
            }
        }
        return countOfMonth;
    }

    public static int countOfMonthsOverAvg(int[] sales) {
        int countOfMonth = 0;
        long average = averageAllMonths(sales);
        for (int i = 0; i < (sales.length); i++) {
            if (sales[i] > average) {
                countOfMonth += 1;
            }
        }
        return countOfMonth;
    }
}