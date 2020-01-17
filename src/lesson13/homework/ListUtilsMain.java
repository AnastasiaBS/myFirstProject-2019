package lesson13.homework;

import java.util.LinkedList;
import java.util.TreeSet;

public class ListUtilsMain {
    public static void main(String[] args) {
        ListUtilsImpl listUtils = new ListUtilsImpl();

        LinkedList<Double> list = new LinkedList<>();
        list.add(2.30);
        list.add(8.76);
        list.add(4.50);
        list.add(5.80);
        list.add(9.87);

        System.out.println("---Конвертирует переменное число параметров в список строк---");
        System.out.println(listUtils.asList("Hello", "World", "Winter", "Snow"));

        System.out.println("----Возвращает отсортированный список в обратном порядке (по убыванию)---");
        System.out.println(listUtils.sortedList(list));


    }
}
