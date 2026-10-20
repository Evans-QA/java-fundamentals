import java.util.Scanner;

public class Calculator_Java {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello user. This is calculator program.");
        System.out.println("Choose which a number of action you would like to take");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Diversify (/)");

        int userChoice = scanner.nextInt();

        System.out.println("Please write first number that is greater than 0");

        int firstNumber = scanner.nextInt();

        System.out.println("Now please write second number that is greater than 0");

        int secondNumber = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println(firstNumber + secondNumber);
        }

        else if (userChoice == 2) {
            System.out.println(firstNumber - secondNumber);
        }

        else if (userChoice == 3) {
            System.out.println(firstNumber * secondNumber);
        }

        else if (userChoice == 4) {
            System.out.println(firstNumber / secondNumber);
        }

        else {
            System.out.println("Your number must be greater than 0");
        }
    }



}
