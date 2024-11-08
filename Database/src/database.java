import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
	
	private static String DATABASE = "Checkpoin3.db";
	
	public static Connection conn = null;
	
    /**
     * Connects to the database if it exists, creates it if it does not, and returns the connection object.
     * 
     * @param databaseFileName the database file name
     * @return a connection object to the designated database
     */
    public static Connection initializeDB(String databaseFileName) {
    	/**
    	 * The "Connection String" or "Connection URL".
    	 * 
    	 * "jdbc:sqlite:" is the "subprotocol".
    	 * (If this were a SQL Server database it would be "jdbc:sqlserver:".)
    	 */
        String url = "jdbc:sqlite:" + databaseFileName;
        Connection conn = null; // If you create this variable inside the Try block it will be out of scope
        try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
            	// Provides some positive assurance the connection and/or creation was successful.
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("The connection to the database was successful.");
            } else {
            	// Provides some feedback in case the connection failed but did not throw an exception.
            	System.out.println("Null Connection");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("There was a problem connecting to the database.");
        }
        return conn;
    }

    public static void printlist(String[] options) {
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W' };
        for (int i = 0; i < options.length; i++) {
            System.out.println(letters[i] + ". " + options[i]);
        }
    }

    public static void main(String Args[]) throws IOException {
    	conn = initializeDB(DATABASE);
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
        try {
			conn.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Bye");
    }
}