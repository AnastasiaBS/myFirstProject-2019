package lesson10;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("111");
        texts.add("222");
        texts.add("333");
        texts.add("444");
        texts.add("555");

        texts.add(1, "!!!!!!!!!!!!!");
        texts.set(5, "&&&&&");
        texts.get(2);

        texts.remove(1);

        System.out.println(texts);
        System.out.println(texts.size());


    }
}
