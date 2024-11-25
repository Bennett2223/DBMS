import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseMenu {
    final static String[] MenuOptions = { "Add a Warehouse", "Remove a Warehouse",
            "Update Warehouse Information", "View Warehouse Information",
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
                case "A": //Add a Warehouse

                    break;
                case "B": //Remove a Warehouse

                    break;
                case "C": // Update Warehouse Information

                    break;
                case "D": // View Warehouse Information

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