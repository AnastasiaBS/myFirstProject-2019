package lesson13.homework;

import lesson13.homework.CollectionUtils;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> collection = new ArrayList<>();
        collection.addAll(a);
        collection.addAll(b);

        return collection;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> collection = new ArrayList<>();
        for (Integer integer : a) {
            if (b.contains(integer)) {
                collection.add(integer);
            }
        }
        for (Integer integer : b) {
            if (a.contains(integer)) {
                collection.add(integer);
            }
        }

        return collection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> collection = new LinkedHashSet<>();
        collection.addAll(a);
        collection.addAll(b);

        return collection;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> collection = new LinkedHashSet<>();
        for (Integer integer : a) {
            if (b.contains(integer)) {
                collection.add(integer);
            }
        }
        return collection;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> collection = new ArrayList<>();
        for (Integer integer : a) {
            if (!b.contains(integer)) {
                collection.add(integer);
            }
        }
        for (Integer integer : b) {
            if (!a.contains(integer)) {
                collection.add(integer);
            }
        }
        return collection;
    }
}
