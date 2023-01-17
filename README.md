# Менеджер по продажам

## Ввод объемов продаж

В массивы **sales** вводятся объемы продаж. У каждого менеджера свой массив объемов продаж.

```java
        int[] sales = {50, 28, 167};
        int[] sales1 = {150, 328, 67};
        int[] sales2 = {500, 208, 367};
        ...
 ```
        
## Привязка объемов продаж к менеджеру

Привязка каждого менеджера к его массиву объемов продаж происходит следующим образом:

```java
        SalesManager manager = new SalesManager(sales);
        SalesManager manager1 = new SalesManager(sales1);
        SalesManager manager2 = new SalesManager(sales2);
        ...
```
где **manager** - менеджер, а **sales** - его массив объема продаж.

## Вывод максимального объема продаж у каждого менеджера

Расчет максимального объема продаж производится запуском метода **max**. Полученный результат выводится на экран:

```java
        System.out.println("manager max - " + manager.max());
        System.out.println("manager1 max - " + manager1.max());
        System.out.println("manager2 max - " + manager2.max());
        ...
 ```
При необходимости производится корректировка текстового сообщения с указанием имени конкретного менеджера.