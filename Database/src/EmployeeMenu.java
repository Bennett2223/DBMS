import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMenu {
    final static String[] MenuOptions = { "Add Employee", "Delete Employee",
            "Update Employee Information", "View Employee", "Return to Main Menu" };

    public static void runSubmenu() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        boolean inMenu = true;
        while (inMenu) {
            database.printlist(MenuOptions);
            input = reader.readLine().toUpperCase();
            switch (input) {
                case "A": //Add Employee

                    break;
                case "B": //Delete Employee

                    break;
                case "C": // Update Employee Information

                    break;
                case "D": // View Employee

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