package lesson6;

public class Main1 {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();

        triangle1.setColor("orange");
        triangle2.setColor("green");

        triangle1.setA(4);
        triangle1.setB(3);
        triangle1.setC(5);
        triangle1.setH(8);

        triangle1.print();
        triangle2.print();

        System.out.println(triangle1.perimeter());
        System.out.println(triangle1.square());



    }
    // объектно-ориентированное программирование (ООП)
    // 1 - полиморфизм
    // 2 - инкапсуляция - определение доспута к переменным, методам, конструкторам, классам
    // Модификатор доступа:
    // public (видимость внутри всего проекта)
    // private (видимость внутри текущего класса)
    // protected (видимость внутри текущего класса + наследники этого класса)
    // _ - (видимость внутри текущего пакета)
    // 3 - наследование
    // 4 - абстрактность
}
