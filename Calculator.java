import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("\nChoose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;

            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;

            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;

            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}