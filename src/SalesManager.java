public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    // расчёт обрезанного среднего
    public long trimmedAverage (){
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        sumSales = sumSales - max() - min();
        long trimmedAverage = sumSales / (sales.length - 2);
        return trimmedAverage;

    }

}