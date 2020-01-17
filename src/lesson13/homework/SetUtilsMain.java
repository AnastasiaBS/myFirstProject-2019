package lesson13.homework;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.*;

public class SetUtilsMain {
    public static void main(String[] args) {
        SetUtilsImpl setUtils = new SetUtilsImpl();

        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Strawberry");
        set.add("Pineapple");
        set.add("Pear");
        set.add("Lemon");
        System.out.println("Отсортированное множество двух коллекций в обратном порядке");
        System.out.println(set.descendingSet());

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(9);
        set1.add(6);
        set1.add(1);
        set1.add(4);
        System.out.println(set1.descendingSet());
        System.out.println();

        System.out.println(setUtils.orderedSet(set1, set));
        System.out.println();

        System.out.println("Возвращает множество чисел val1,val2,val3,val4,val5 в таком же порядке");
        System.out.println(setUtils.customOrderSet(2, 4, 7, 5, 8));
        System.out.println();


        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(2019, Calendar.DECEMBER, 26);
        calendar.set(Calendar.HOUR_OF_DAY, 19);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println();

        ArrayList<DayOfWeek> dayOfWeeks = new ArrayList<>();
        dayOfWeeks.addAll(dayOfWeeks);
        System.out.println(setUtils.sortDayOfWeek(dayOfWeeks));


    }
}
