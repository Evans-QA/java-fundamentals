import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int generatedNumber = r.nextInt(100);

        int trials = 3;

        System.out.println("Hello user. This is random number generator.");
        System.out.println("You have 3 chances to guess a number. Pick a number between 0-100.");

        while (trials > 0) {

            int userGuess = sc.nextInt();

            trials--;
            System.out.println("Your guess is " + userGuess + ". You still have " + trials + " chance left");

            if (userGuess == generatedNumber) {
                System.out.println("Congratulions. You have guessed the number " + generatedNumber);
                break;
            }
        }

        sc.close();
    }
}
