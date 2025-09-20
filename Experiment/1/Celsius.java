import java.util.Scanner;

public class Celsius {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + c);
        System.out.println("Neyasa Gupta 24CSU280");
        sc.close();
    }
}
