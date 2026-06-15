import java.util.ArrayList;
import java.util.List;

public class ErrorList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("User logged in");
        list.add("Error: wrong password");
        list.add("User logged out");
        list.add("Error: wrong login");


        int errorCount = 0;

        for (String l : list) {

            if (l.contains("Error")) {
                errorCount++;
            }
        }
            System.out.println("Number of errors: " + errorCount);
        }

    }

