package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSum (sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int numberMax = 0;
        int maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                numberMax = i + 1;
            }
        }
        return numberMax;
    }

    public int findMin(int[] sales) {
        int numberMin = 0;
        int minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                numberMin = i + 1;
            }
        }
        return numberMin;
    }

    public int countUnderAverage(int[] sales) {
        int average = calculateAverage(sales);
        int quantityUnder = 0;
        for (int sale : sales) {
            if (sale < average) {
                sale = 1;
                quantityUnder += sale;
            }
        }
        return quantityUnder;
    }

    public int countOverAverage(int[] sales) {
        int average = calculateAverage(sales);
        int month = 0;
        int quantityOver = 0;
        for (int sale : sales) {
            if (sale > average) {
                sale = 1;
                quantityOver += sale;
            }
        }
        return quantityOver;
    }
}
