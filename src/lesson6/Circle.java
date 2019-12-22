package lesson6;
// создать три типа объектов круг, прямоугольник и ромб
// стороны, периметр, площадь
// один main и в нём можно 3 класса

public class Circle {
    private int OA;
    private int OB;
    private String color;

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setOA(int OA) {
        this.OA = OA;
    }

    public void setOB(int OB) {
        this.OB = OB;
    }

    public void print() {
        System.out.printf("Круг с отрезками: %d, %d.", this.OA, this.OB);
        System.out.println();

    }

    public int diameter() {
        return this.OA + this.OB;
    }

    public int radius() {
        return (this.OA + this.OB) / 2;
    }
}
