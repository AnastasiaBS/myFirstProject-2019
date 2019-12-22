package lesson6;

public class Main2 {
    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setColor("blue");
        circle.setOA(4);
        circle.setOB(4);

        circle.print();
        System.out.println(circle.diameter());
        System.out.println(circle.radius());

        Rectangle rectangle = new Rectangle();

        rectangle.setColor("red");
        rectangle.setA(2);
        rectangle.setB(4);

        rectangle.print();
        System.out.println(rectangle.square());
        System.out.println(rectangle.perimeter());

        Rhombus rhombus = new Rhombus();

        rhombus.setColor("pink");
        rhombus.setA(4);
        rhombus.setH(8);

        rhombus.print();
        System.out.println(rhombus.square());
        System.out.println(rhombus.perimeter());

    }
}
