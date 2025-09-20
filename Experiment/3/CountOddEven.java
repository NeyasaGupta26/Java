import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        // First pass: count the number of even and odd numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];

        evenCount = 0;
        oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenCount++] = numbers[i];
            } else {
                oddNumbers[oddCount++] = numbers[i];
            }
        }

        System.out.println("Number of even numbers: " + evenNumbers.length);
        System.out.println("Number of odd numbers: " + oddNumbers.length);
         System.out.println("Neyasa Gupta 24csu280");
    }
}