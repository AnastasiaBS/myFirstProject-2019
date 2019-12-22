package lesson13;

import java.util.ArrayList;
import java.util.Collection;

public class Homework {
    public static void main(String[] args) {


        Collection a = new ArrayList();
        a.add(111);
        a.add(900);
        a.add(876);
        Collection b = new ArrayList();
        b.add(432);
        b.add(233);
        b.add(567);
        CollectionUtilsImpl collectionUtils = new CollectionUtilsImpl();
        collectionUtils.union(a, b);


        System.out.println();
    }
}