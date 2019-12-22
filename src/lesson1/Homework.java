package lesson1;

public class Homework {
    public static void main(String[] args) {
        int a = 17;
        int b = 8;
        int c = 5;
        int d = 3;

        int roomArea = a * b;
        int tableArea = c * d;
        int tablesInTheRoom = roomArea / tableArea;

        System.out.println("В комнате поместится " + tablesInTheRoom + " столов.");
    }
}
