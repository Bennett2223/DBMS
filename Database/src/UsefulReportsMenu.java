import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsefulReportsMenu {
    final static String[] MenuOptions = { "Report A", "Report B",
            "Report C", "Report D", "Report F", "Return to Main Menu" };

    public static void runSubmenu() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        boolean inMenu = true;
        while (inMenu) {
            database.printlist(MenuOptions);
            input = reader.readLine().toUpperCase();
            switch (input) {
                case "A": //Report A

                    break;
                case "B": //Report B

                    break;
                case "C": // Report C

                    break;
                case "D": // Report D

                    break;
                case "E": // Report E

                    break;
                case "F": // 
                    inMenu = false;
                    break;
                default:
                    System.out.println("Error, bad input. Try again");
            }
        }
    }
}