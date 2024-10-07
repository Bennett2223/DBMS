import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DroneMenu {
    final static String[] MenuOptions = { "Add Drones", "Update Status",
            "Update Drone Information", "View Drone",
            "Show Employee Maintenance Records", "Return to Main Menu" };

    public static void runSubmenu() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        boolean inMenu = true;
        while (inMenu) {
            database.printlist(MenuOptions);
            input = reader.readLine().toUpperCase();
            switch (input) {
                case "A": //Add Drones

                    break;
                case "B": //Update Status
                	// can set a drone to being on a delivery
                    break;
                case "C": // Update Drone Information
                	// can update the drone's schedule, and which delivery it is assigned to, as well as if it is picking up or delivering
                    break;
                case "D": // View Drone

                    break;
                case "E": // Show Employee Maintenance Records
                	
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
