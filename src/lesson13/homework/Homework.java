package lesson13.homework;

import lesson13.homework.CollectionUtils;
import lesson13.homework.CollectionUtilsImpl;

import java.util.ArrayList;

public class Homework {
    public static void main(String[] args) {
        CollectionUtils collectionUtils = new CollectionUtilsImpl();

        ArrayList<Integer> a = new ArrayList<>();
        a.add(111);
        a.add(900);
        a.add(900);
        a.add(876);
        a.add(567);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(432);
        b.add(233);
        b.add(900);
        b.add(567);
        b.add(567);


        System.out.println("--------Объединение двух коллекций с дубликатами------");
        System.out.println(collectionUtils.union(a, b));
        System.out.println();

        System.out.println("--------Пересечение двух коллекций с дубликатами------");
        System.out.println(collectionUtils.intersection(a, b));
        System.out.println();

        System.out.println("-------Объединение двух коллекций без дубликатов------");
        System.out.println(collectionUtils.unionWithoutDuplicate(a, b));
        System.out.println();

        System.out.println("-------Пересечение двух коллекций без дубликатов------");
        System.out.println(collectionUtils.intersectionWithoutDuplicate(a, b));
        System.out.println();

        System.out.println("--------Разница двух коллекций----------");
        System.out.println(collectionUtils.difference(a, b));
        System.out.println();


    }
}