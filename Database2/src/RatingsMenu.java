import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RatingsMenu {
    final static String[] MenuOptions = { "Add a Rating", "Delete Rating", "View Rating",
            "List 1 Star Ratings", "Return to Main Menu" };
    public static void runSubmenu() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        boolean inMenu = true;
        while (inMenu) {
            database.printlist(MenuOptions);
            input = reader.readLine().toUpperCase();
            switch (input) {
                case "A": //Add a Ratings

                    break;
                case "B": //Delete Rating

                    break;
                case "C": // View Rating

                    break;
                case "D": // List 1 Star Ratings

                    break;
                case "E": // Return to Main Menu
                    inMenu = false;
                    break;
                default:
                    System.out.println("Error, bad input. Try again");
            }
        }
    }
}