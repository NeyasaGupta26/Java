import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for first point
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Taking input for second point
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Creating objects
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        // Display points
        System.out.println("Points:");
        p1.display();
        p2.display();

        // Calculate distance
        double dist = Point.distance(p1, p2);
        System.out.printf("Distance: %.2f\n", dist);
    }
}