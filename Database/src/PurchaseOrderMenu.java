import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PurchaseOrderMenu {
    final static String[] MenuOptions = { "Create New Purchase Order",
            "Cancel Purchase Order", "View Purchase order",
            "View Orders Between Two Dates", "Return to Main Menu" };

    public static void runSubmenu() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        boolean inMenu = true;
        while (inMenu) {
            database.printlist(MenuOptions);
            input = reader.readLine().toUpperCase();
            switch (input) {
                case "A": //Create New Purchase Order

                    break;
                case "B": //Cancel Purchase Order

                    break;
                case "C": // View Purchase order

                    break;
                case "D": // View Orders Between Two Dates

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