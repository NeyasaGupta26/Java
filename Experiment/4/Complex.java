import java.util.Scanner;

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }

    Complex multiply(Complex c) {
        return new Complex(real * c.real - imag * c.imag,real * c.imag + imag * c.real);
    }

    void show() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first number: ");
        Complex c1 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.print("Enter real and imaginary part of second number: ");
        Complex c2 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.print("Sum: ");
        c1.add(c2).show();

        System.out.print("Difference: ");
        c1.subtract(c2).show();

        System.out.print("Product: ");
        c1.multiply(c2).show();
         System.out.println("Neyasa Gupta 24csu280 ");
    
    }
}