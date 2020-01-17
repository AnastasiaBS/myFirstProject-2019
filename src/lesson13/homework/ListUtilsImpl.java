package lesson13.homework;

import lesson13.homework.ListUtils;

import java.util.*;

public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> list = Arrays.asList(strings);
        return list;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        LinkedList<Double> sorted = new LinkedList<>(data);
        Collections.sort(sorted, Collections.reverseOrder());

        return sorted;
    }
}
