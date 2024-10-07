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
                "Employees", "Department","Useful Reports", "Quit" };

        while (isRunning) {
            if (isMainMenu) {
                System.out.println(
                        "For information pertaining to a topic below, press the corresponding key.");
                printlist(mainMenu);
                input = reader.readLine().toUpperCase();
                switch (input) {
                    case "A": // Customers
                        CustomerMenu.runSubmenu();
                        break;
                    case "B": //Equipment
                        EquipmentMenu.runSubmenu();
                        break;
                    case "C":// Drones
                        DroneMenu.runSubmenu();
                        break;
                    case "D": // Purchase Orders
                        PurchaseOrderMenu.runSubmenu();
                        break;
                    case "E": // Warehouses
                        WarehouseMenu.runSubmenu();
                        break;
                    case "F": // Ratings
                        RatingsMenu.runSubmenu();
                        break;
                    case "G": // Rentals
                        RentalMenu.runSubmenu();
                        break;
                    case "H": // Employees
                        EmployeeMenu.runSubmenu();
                        break;
                    case "I": // Department
                        DepartmentMenu.runSubmenu();
                        break;
                    case "J": // Useful Reports
                        UsefulReportsMenu.runSubmenu();
                        break;
                    case "K": // Quit
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Error, bad input. Try again");

                }
            }

        }
    }
}