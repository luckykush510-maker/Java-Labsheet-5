public class Q18_ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle", 5),
            new Rectangle("Rectangle", 10, 5)
        };

        ShapeManager manager = new ShapeManager();
        manager.displayAreas(shapes);
    }
}

class Shape {
    protected String name;

    Shape(String name) {
        this.name = name;
    }

    void displayShapeName() {
        System.out.println("Shape: " + name);
    }
}

class Circle extends Shape {
    private double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class ShapeManager {
    void displayAreas(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayShapeName();

            if (shapes[i] instanceof Circle) {
                Circle circle = (Circle) shapes[i];
                System.out.println("Area: " + circle.calculateArea());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shapes[i];
                System.out.println("Area: " + rectangle.calculateArea());
            }

            System.out.println();
        }
    }
}
