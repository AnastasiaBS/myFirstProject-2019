package lesson10;

import lesson10.Oleg.Matrix;

public class Main {
        public static void main(String[] args) {
            lesson10.Oleg.Matrix matrix = new lesson10.Oleg.Matrix(3, 4);
            matrix.setValueAt(0,0,2);
            matrix.setValueAt(1,0,3);
            matrix.setValueAt(2,0,4);

            lesson10.Oleg.Matrix matrix2 = new Matrix(3, 4);
            matrix.setValueAt(0,0,2);
            matrix.setValueAt(1,0,3);
            matrix.setValueAt(2,0,4);

            matrix2.add(matrix);

//            matrix.printToConsole();

        matrix.getRows();
        System.out.println(matrix);
//        matrix.getColumns();
//        System.out.println();
//        matrix.getValueAt(1, 1);
//        System.out.println();
    }
}
