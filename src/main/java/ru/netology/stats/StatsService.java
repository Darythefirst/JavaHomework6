package ru.netology.stats;

public class StatsService {

    public long summarySales(long[] sales) { //п.1 - метод для определения суммы всех продаж за весь период
        long amountSales = 0; // начальная сумма всех продаж за период
        for (long i : sales) {
            amountSales += i;
        }
        return amountSales;
    }

    public long averageSales(long[] sales) { //п.2 - метод для определения средней суммы продаж в месяц
        return summarySales(sales) / sales.length;
    }

    public int maxSales(long[] sales) { //п.3 - метод для определения месяца максимальных продаж
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { //п.4 - метод для определения месяца минимальных продаж
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesUnderAverage(long[] sales) { // п.5 - метод для определения кол-ва месяцев,в которых продажи были ниже среднего
        int monthUnderAverage = 0; // кол-во месяцев, в которых продажи были выше среднего

        for (long i : sales) {
            if (i < averageSales(sales)) {
                monthUnderAverage++;
            }
        }
        return monthUnderAverage;

    }

    public int salesAboveAverage(long[] sales) { //п.6 - метод для определения кол-ва месяцев,в которых продажи были выше среднего
        int monthAboveAverage = 0; // кол-во месяцев, в котрых продажи были выше среднего

        for (long i : sales) {
            if (i > averageSales(sales)) {
                monthAboveAverage++;
            }
        }
        return monthAboveAverage;
    }
}
