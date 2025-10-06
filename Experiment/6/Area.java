abstract class Shape {
    abstract void RectangleArea(double l, double b);
    abstract void SquareArea(double s);
    abstract void CircleArea(double r);
}

class Area extends Shape {
    void RectangleArea(double l, double b) {
        System.out.println("Rectangle Area: " + (l * b));
    }
    void SquareArea(double s) {
        System.out.println("Square Area: " + (s * s));
    }
    void CircleArea(double r) {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
    public static void main(String[] args) {
        Area a = new Area();
        a.RectangleArea(5, 4);
        a.SquareArea(6);
        a.CircleArea(3);
        System.out.println("Neyasa Gupta 24csu280");
    }
}