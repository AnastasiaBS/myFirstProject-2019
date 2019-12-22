package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];
        MassivUtils.printDoubleArray(mass);

        int[][] mass2 = {{1,4,6,3}, {4,5,7}, {2,5}};
        char[][] mass3 = {{'x', 'h'}, {'e', 'y'}};
        MassivUtils.printDoubleArray(mass2);

    }
}

//        System.out.print(mass[0][0] + " ");
//        System.out.print(mass[0][1] + " ");
//        System.out.print(mass[0][2] + " ");
//        System.out.print(mass[0][3] + " ");
//        System.out.println();
//
//        System.out.print(mass[1][0] + " ");
//        System.out.print(mass[1][1] + " ");
//        System.out.print(mass[1][2] + " ");
//        System.out.print(mass[1][3] + " ");
//        System.out.println();
//
//        System.out.print(mass[2][0] + " ");
//        System.out.print(mass[2][1] + " ");
//        System.out.print(mass[2][2] + " ");
//        System.out.print(mass[2][3] + " ");
//        System.out.println();

//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }

//    }
//}
