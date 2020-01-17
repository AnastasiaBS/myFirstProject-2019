package lesson16.threads;

public class Maestro {
    public static void main(String[] args) {
        System.out.println("Концерт начат!");
        Singer1 singer1 = new Singer1();
        singer1.start();

        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer2.start();

        while (singer1.isAlive()) {
        }

        System.out.println("Концерт окончен!");
    }
}
