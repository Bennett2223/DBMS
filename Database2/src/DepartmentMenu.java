import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepartmentMenu {
    final static String[] MenuOptions = { "Add Department", "Remove Department",
            "Update Department Information", "View Department Information",
            "List Department Employees", "Return to Main Menu" };

    public static void runSubmenu() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        boolean inMenu = true;
        while (inMenu) {
            database.printlist(MenuOptions);
            input = reader.readLine().toUpperCase();
            switch (input) {
                case "A": //Add Department

                    break;
                case "B": //Delete Department

                    break;
                case "C": // Update Department Information

                    break;
                case "D": // View Department Information

                    break;
                case "E": // List Department Employees

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