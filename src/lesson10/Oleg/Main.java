package lesson10.Oleg;

public class Main {
    public static void main(String[] args) {
        Matrix numbers = new Matrix(new double[2][3]);
        Matrix numbers2 = new Matrix(new double[3][1]);

        for (int i = 0; i < numbers.getRows(); i++) {
            for (int j = 0; j < numbers.getColumns(); j++) {
                numbers.setValueAt(i, j, i*j);
            }
        }

//        for (int i = 0; i < numbers2.getRows(); i++) {
//            for (int j = 0; j < numbers2.getColumns(); j++) {
//                numbers2.setValueAt(i, j, i*j);
//            }
//        }
//numbers2.transpose();
        numbers.mul(3);
        numbers.printToConsole();
    }
}

