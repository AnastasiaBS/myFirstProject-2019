package lesson4;

public class Homework {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];


        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i == j) {
                    mass[i][j] = 1;
                }
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
