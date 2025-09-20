import java.util.Scanner;
class main 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of tyres");
		int N = s.nextInt();

		Vehicle v;

        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
                break;
        }

        v.display();
        s.close();
        System.out.println("Neyasa Gupta 24csu280");
	}
}