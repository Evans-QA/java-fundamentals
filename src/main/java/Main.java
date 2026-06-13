import java.util.Scanner;

public class Main {
    public static void main(String args []) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Witaj użytkowniku, wpisz swoją ilość punktów z egzaminu: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Błąd: podaj liczbę całkowitą.");
            scanner.close();
            return;
        }

        int testResult = scanner.nextInt();

        if (testResult < 0 || testResult > 100) {
            System.out.println("Błąd: podaj wartość z zakresu od 0 do 100");
        }

        else if (testResult <= 49) {
            System.out.println("Niedostateczny");
        }

        else if (testResult <= 69) {
            System.out.println("Dostateczny");
        }

        else if (testResult <= 84) {
            System.out.println("Dobry");
        }

        else {
            System.out.println("Bardzo dobry");
        }


        scanner.close();

    }
}
