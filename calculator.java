import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator!");
        }

        input.close();
    }
}

