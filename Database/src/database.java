import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class database {

    public static void printlist(String[] options) {
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W' };
        for (int i = 0; i < options.length; i++) {
            System.out.println(letters[i] + ". " + options[i]);
        }
    }

    public static void main(String Args[]) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        boolean isRunning = true;
        boolean isMainMenu = true;
        String input = "";
        String[] mainMenu = { "Customers", "Equipment", "Drones",
                "Purchase Orders", "Warehouses", "ratings", "Rentals",
                "Employees", "Department", "Quit" };
        String[] Equipment = { "Add Equipment", "Update Equipment Information",
                "Change Equipment Status", "View Equipment",
                "Return to Main Menu" };
        String[] Drones = { "Add Drones", "Update Status",
                "Update Drone Information", "View Drone",
                "Show Employee Maintenance Records", "Return to Main Menu" };
        String[] Purchase_Orders = { "Create New Purchase Order",
                "Cancel Purchase Order", "View Purchase order",
                "View Orders Between Two Dates", "Return to Main Menu" };
        String[] Warehouses = { "Add a Warehouse", "Remove a Warehouse",
                "Update Warehouse Information", "View Warehouse Information",
                "Return to Main Menu" };
        String[] Ratings = { "Add a Rating", "Delete Rating", "View Rating",
                "List 1 Star Ratings", "Return to Main Menu" };
        String[] Rentals = { "Add Rental", "Remove Rental",
                "Update Rental Information", "View Rental Information",
                "Return to Main Menu" };
        String[] Employees = { "Add Employee", "Update Employee Information",
                "Delete Employee", "View Employee", "Return to Main Menu" };
        String[] Department = { "Add Department", "Remove Department",
                "Update Department Information", "View Department Information",
                "Employees", "Return to Main Menu" };

        while (isRunning) {
            if (isMainMenu) {
                System.out.println(
                        "For information pertaining to a topic below, press the corresponding key.");
                printlist(mainMenu);
                input = reader.readLine();
                switch (input) {
                    case "A": // Customers
                        CustomerMenu.runSubmenu();
                        break;
                    case "B": //Equipment
                        printlist(Equipment);
                        input = reader.readLine();
                        break;
                    case "C":// Drones
                        printlist(Drones);
                        input = reader.readLine();
                        break;
                    case "D": // Purchase Orders
                        printlist(Purchase_Orders);
                        input = reader.readLine();
                        break;
                    case "E": // Warehouses
                        printlist(Warehouses);
                        input = reader.readLine();
                        break;
                    case "F": // Ratings
                        printlist(Ratings);
                        input = reader.readLine();
                        break;
                    case "G": // Rentals
                        printlist(Rentals);
                        input = reader.readLine();
                        break;
                    case "H": // Employees
                        printlist(Employees);
                        input = reader.readLine();
                        break;
                    case "I": // Department
                        printlist(Department);
                        input = reader.readLine();
                        break;
                    case "J": // Quit
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Error, bad input. Try again");

                }
            }

        }
    }
}

// to copy paste for other menus
/*
 * switch (input) { case "A": //Add customer
 * 
 * break; case "B": //Equipment
 * 
 * break; case "C":// Drones
 * 
 * break; case "D": // Purchase Orders
 * 
 * break; case "E": // Warehouses
 * 
 * break; case "F": // Ratings break; case "G": // Rentals
 * 
 * break; case "H": // Employees
 * 
 * break; case "I": // Department
 * 
 * break; case "J": // Quit
 * 
 * break; default: System.out.println("Error, bad input. Try again");
 */