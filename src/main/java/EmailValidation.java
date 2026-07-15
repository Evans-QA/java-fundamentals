import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi user. Please type your email in the field.");

        boolean isValid = true;

        String email = scanner.nextLine();



        if (email == null || email.isEmpty()) {
            isValid = false;
            System.out.println("This is wrong email");
        }

        if (!email.contains("@")) {
            isValid = false;
            System.out.println("You are missing @ mark in the email");
        }

        if (email.contains(" ")){
            isValid = false;
            System.out.println("Email cannot contain spaces");
        }

        if (email.indexOf('@') != email.lastIndexOf('@')) {
            isValid = false;
            System.out.println("You have more than one @ in the email");
        }

        if (isValid) {
            System.out.println("You successfully wrote your email: " + email);
        }

        scanner.close();
    }
}
