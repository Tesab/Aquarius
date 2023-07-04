import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    private static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
