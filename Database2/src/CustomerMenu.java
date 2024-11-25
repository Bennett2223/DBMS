import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerMenu {
    final static String[] MenuOptions = { "Add a customer", "Remove a customer",
            "Update Customer Information", "View Customer information", "Most Frequent Customer",
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
                case "A": //Add customer

                    break;
                case "B": //Remove a customer

                    break;
                case "C":// Update Customer Information

                    break;
                case "D": // View Customer information

                    break;
                case "E": // View Customer information
                	SQL.ps_MostFrequentMember();
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
