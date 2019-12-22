package lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] massive = new int[16];
        int[] m2 = massive;
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
    }
}
