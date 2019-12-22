package lesson4;

public class Homework2 {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];

        for (int i = mass.length - 1; i >= 0; i--) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    mass[2][2] = 1;
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


