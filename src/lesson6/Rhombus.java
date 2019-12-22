package lesson6;

public class Rhombus {
    private int a;
    private int h;
    private String color;

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void print() {
        System.out.printf("Ромб с основанием %d, цвет: %s.", this.a, color);
        System.out.println();
    }
    public int square() {
       return this.a * this.h;
    }
    public int perimeter() {
        return this.a * 4;
    }
}