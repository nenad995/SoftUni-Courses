package shapes;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(2D, 3D);
        Shape circle = new Circle(5D);

        printInfo(rectangle);
        printInfo(circle);

    }

    public static void printInfo(Shape shape){
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateArea());
    }
}
