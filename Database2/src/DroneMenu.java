import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DroneMenu {
    final static String[] MenuOptions = { "Add Drones", "Delete Drones", "Update Status",
            "Update Drone Information", "View Drone",
            "Show Employee Maintenance Records", "Most Popular Drone", "Return to Main Menu" };
    
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
	                SQL.addDrone(reader);
	                break;
	            case "B": //Delete Drone
	            	SQL.deleteDrone(reader);
	                
	                break;
	            case "C": //Update Status
		            // can set a drone to being on a delivery
		                
		            break;
	            case "D": // Update Drone Information
	            // can update the drone's schedule, and which delivery it is assigned to, as well as if it is picking up or delivering
	            	SQL.updateDrone(reader);
	                break;
	            case "E": // View Drone
	                SQL.searchDrone(reader);
	                break;
	            case "F": // Show Employee Maintenance Records
	            	break;
	            case "G": // Most Popular Drone
	            	SQL.ps_PopularDrone();
	            	break;
	            case "H": // Return to Main Menu
	                inMenu = false;
	                break;
            	default:
                    System.out.println("Error, bad input. Try again");
            }
        }
    }
}
