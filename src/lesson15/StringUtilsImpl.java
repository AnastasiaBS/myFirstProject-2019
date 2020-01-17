package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Число 1 или число 2 - пусты");
        }

        double num1;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Первый параметр не является числом!");
        }

        double num2;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Второй параметр не является числом!");
        }

        if (num2 == 0.0) {
            throw new ArithmeticException("Деление на 0 запрещено!");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text == null || word == null");
        }
        ArrayList<Integer> indexes = new ArrayList<>();

        int counter = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
            indexes.add(counter);
        }
        int[] array = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            array[i] = indexes.get(i);
        }
        return array;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<String> doubles = new ArrayList<>();

        Pattern pattern = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            doubles.add(matcher.group());
        }
        if (doubles.size() == 0) {
            throw new CustomException("Not found!");
        }
        double[] numbers = new double[doubles.size()];
        for (int i = 0; i < doubles.size(); i++) {
            numbers[i] = Double.parseDouble(doubles.get(i));
        }
        return numbers;
    }
}