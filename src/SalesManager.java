public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    // расчёт обрезанного среднего
    public int trimmedAverage (){
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        sumSales = sumSales - max() - min();
        int trimmedAverage = sumSales / (sales.length - 2);
        return trimmedAverage;

    }

}
// Добавьте расчёт обрезанного среднего - это среднее количество продаж среди всех продаж,
// за исключением самой максимальной и самой минимальной. Это иногда используется в статистике
// для того, чтобы снизить влияение единичных скачков. При этом считать вы можете всё в целых числах.

