package lesson10.Oleg;

import lesson10.IMatrix;

public class Matrix implements IMatrix {

    private double[][] numbers;
    private Matrix result;


    public Matrix() {
        numbers = new double[1][1];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    public Matrix(int colRow, int colCol) {
        this.numbers = new double[colRow][colCol];
    }

    @Override
    public int getRows() {
        return this.numbers.length;
    }

    @Override
    public int getColumns() {
        return this.numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return this.numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (numbers.length <= rowIndex) {
            System.out.println("Ошибка, индекс больше количества строк!!!");
        } else if (numbers[0].length <= colIndex) {
            System.out.println("Ошибка, индекс больше количества столбцов!!!");
        } else if (numbers.length <= rowIndex && numbers[0].length <= colIndex)

            this.numbers[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (numbers.length == otherMatrix.getRows() && numbers[0].length == otherMatrix.getColumns()) {
            for (int i = 0; i <= numbers.length; i++) {
                for (int j = 0; j <= numbers[0].length; j++) {
                    this.numbers[i][j] += otherMatrix.getValueAt(i, j);
                }
            }
            return result = new Matrix(numbers);
        } else {
            System.out.println("Ошибка! Размеры матриц не равны!");
            return null;
        }
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (numbers.length == otherMatrix.getRows() && numbers[0].length == otherMatrix.getColumns()) {
            for (int i = 1; i <= this.numbers.length; i++) {
                for (int j = 1; j <= this.numbers[i].length; j++) {
                    this.numbers[i][j] -= otherMatrix.getValueAt(i, j);
                }
            }
            return result = new Matrix(numbers);
        } else {
            System.out.println("Ошибка! Размеры матриц не равны!");
            return null;
        }
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        double x;
        if (numbers.length == otherMatrix.getRows())
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[0].length; j++) {

                    numbers[i][j] *= otherMatrix.getValueAt(j, i);

                }
            }
        return result = new Matrix(numbers);
    }

    @Override
    public IMatrix mul(double value) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                this.numbers[i][j] *= value;
            }
        }
        return result = new Matrix(numbers);
    }

    @Override
    public IMatrix transpose() {

        double trans[][] = new double[numbers[0].length][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                trans[j][i] = numbers[i][j];
            }
        }
        return result = new Matrix(numbers);
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.numbers.length; i++) {
            for (int j = 0; j < this.numbers[i].length; j++) {
                this.numbers[i][j] = value;
            }
        }

    }

    @Override
    public double determinant() {
        if (!this.isSquareMatrix()) {
        }
        return determinant();
    }


    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] != 0) {
                    System.out.println("Матрица не нулевая!");
                    return false;
                } else {
                    System.out.println("Матрица нулевая, отвечаю!");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        int i = 0;
        int j = 0;
        boolean check = true;
        for (i = 0; i < numbers.length; i++) ;
        {
            for (j = 0; j < numbers[0].length; j++) {
                if (i == j) {
                    if (numbers[i][j] != 1) {
                        return false;
                    } else {
                        if (numbers[i][j] != 0) {
                            return false;
                        }
                    }
                }

            }
            return true;
        }
    }

    @Override
    public boolean isSquareMatrix() {
        if (numbers.length == numbers[0].length) {
            System.out.println("Матрица квадратная");
            return true;
        } else {
            System.out.println("Матрица не квадратная");
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


    }


}
