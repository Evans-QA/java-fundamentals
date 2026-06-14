import java.util.Scanner;

public class PassValidation {

    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi user. Write your password: ");
        String password = scanner.nextLine();

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;
        boolean hasMinLength = password.length() >= 8;

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (Character.isDigit(character)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(character)) {
                hasUpperCase = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecialChar = true;
            }
        }
            if (hasMinLength && hasDigit && hasUpperCase && hasSpecialChar) {
                System.out.println(GREEN + "Password is correct" + RESET);
            }
            else {
                System.out.println(RED + "Password is incorrect" + RESET);
            }

            scanner.close();
        }
    }

