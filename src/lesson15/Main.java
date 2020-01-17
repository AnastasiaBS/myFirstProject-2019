package lesson15;

public class Main {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Какое-то исключение");
        }

    }
}
