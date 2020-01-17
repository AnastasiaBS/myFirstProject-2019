package lesson15;

public class Main2 {
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        try {
            System.out.println(utils.div("234", "900"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Исключение");
        }
        System.out.println("Конец примера");
        System.out.println();

        StringUtilsImpl utils0 = new StringUtilsImpl();
        String text = "Никола Тесла – гений. Изобретения Николы Тесла невероятны, Тесла, Тесла, Тесла.";
        String word = "Тесла";
        try {
            System.out.println("В тексте найдено слово - \"" + word + "\" под индексами:");
            int[] array1 = utils0.findWord(text, word);
            for (int i = 0; i < array1.length; i++) {
                System.out.println(array1[i]);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        StringUtilsImpl utils1 = new StringUtilsImpl();
        try {
            System.out.println("В тексте найдены числа: ");
            double[] array = utils1.findNumbers("Hello, World 2020, 45.5, 183");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
