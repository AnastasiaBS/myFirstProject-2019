package lesson4;

public class FiguresUtils {
    // 1 - модификатор доступа (область видимости метода - бывает 4 варианта)
    // 1.1 - static
    // 2 - возвращаемый тип (или указание типа или void если метод ничего не возвращает)
    // 3 - название метода (придумываем сами)
    // 4 - входящие параметры:
    public static void printTypeOfTriangle(int sideA, int sideB, int sideC) {
        if (sideA == sideB && sideB == sideC) {
            System.out.println("Это равносторонний треугольник");
        }
        if ((sideA == sideB && sideA != sideC) || (sideB == sideC && sideB != sideA) || (sideC == sideA && sideB != sideC)) {
            System.out.println("Это равнобедренный треугольник");
        }
        if (sideA != sideB && sideB != sideC && sideA != sideC) {
            System.out.println("Это разносторонний треугольник");
        }
    }

    public static void calculatePerimetrTriangle(int sideA, int sideB, int sideC) {


    }

}

