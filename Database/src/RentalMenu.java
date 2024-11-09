import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RentalMenu {
    final static String[] MenuOptions = { "Add Rental", "Remove Rental",
            "Update Rental Information", "View Rental Information","Most Popular Item",
            "Return to Main Menu" };
    public static void runSubmenu() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        boolean inMenu = true;
        while (inMenu) {
            database.printlist(MenuOptions);
            input = reader.readLine().toUpperCase();
            switch (input) {
                case "A": //Add Rental 
                	// Is linked to a user through a userID stored in the rental info 
                    break;
                case "B": //Delete Rental

                    break;
                case "C": // Update Rental Information
                	// Allows you to flag a rental as returned
                    break;
                case "D": // View Rental Information

                    break;
                case "E": // Most Popular Item
                	SQL.ps_MostPopularItem();
                    break;
                case "F": // Return to Main Menu
                    inMenu = false;
                    break;
                default:
                    System.out.println("Error, bad input. Try again");
            }
        }
    }
}