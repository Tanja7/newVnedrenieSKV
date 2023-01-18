public class Main {
    public static void main(String[] args) {
        long[] sales = {50, 28, 167};
        long[] sales1 = {150, 328, 67};
        long[] sales2 = {500, 208, 367};

        SalesManager manager = new SalesManager(sales);
        SalesManager manager1 = new SalesManager(sales1);
        SalesManager manager2 = new SalesManager(sales2);

        System.out.println("manager max - " + manager.max());
        System.out.println("manager1 max - " + manager1.max());
        System.out.println("manager2 max - " + manager2.max());

    }
}
