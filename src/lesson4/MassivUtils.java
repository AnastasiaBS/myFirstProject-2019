package lesson4;

public class MassivUtils {
    public static void printDoubleArray(int[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arrayToPrint[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printDoubleArray(char[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arrayToPrint[i][j] + " ");
            }
            System.out.println();
        }
    }
}