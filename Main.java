import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2; //ternary Operator

        System.out.println("Maximum number: " + max);
    }
}
/*OUTPUT
 Enter first number: 19
Enter second number: 82
Maximum number: 82
 */