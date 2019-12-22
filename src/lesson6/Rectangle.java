package lesson6;

public class Rectangle {
    private int a;
    private int b;
    private String color;

    public void setColor(String newColor) {
        color = newColor;
    }
    public void setA(int A) {
        this.a = A;
    }
    public void setB(int B) {
        this.b = B;
    }
    public void print() {
        System.out.printf("Прямоугольник со сторонами: %d, %d, цвет: %s.", this.a, this.b, color);
        System.out.println();
    }
    public int square() {
        return this.a * this.b;
    }
    public int perimeter() {
        return 2 * (this.a + this.b);
    }

}
