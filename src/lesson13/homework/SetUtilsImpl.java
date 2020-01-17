package lesson13.homework;

import java.time.DayOfWeek;
import java.util.*;

public class SetUtilsImpl implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        TreeSet<String> treeSet = new TreeSet<>(set2);
        TreeSet<Integer> treeSet1 = new TreeSet<>(collection1);
        treeSet.add(treeSet1.toString());

        return treeSet.descendingSet();

    }


    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(val1);
        linkedHashSet.add(val2);
        linkedHashSet.add(val3);
        linkedHashSet.add(val4);
        linkedHashSet.add(val5);

        return linkedHashSet;
    }
    public Collection<DayOfWeek> sortDayOfWeek(Collection<DayOfWeek> dayOfWeekCollection) {
        TreeSet<DayOfWeek> dayOfWeeks = new TreeSet<>(dayOfWeekCollection);
        dayOfWeeks.add(DayOfWeek.MONDAY);
        dayOfWeeks.add(DayOfWeek.FRIDAY);
        dayOfWeeks.add(DayOfWeek.SATURDAY);
        dayOfWeeks.add(DayOfWeek.SUNDAY);
        dayOfWeeks.add(DayOfWeek.THURSDAY);
        dayOfWeeks.add(DayOfWeek.TUESDAY);
        dayOfWeeks.add(DayOfWeek.WEDNESDAY);
        return dayOfWeeks;

    }
}
