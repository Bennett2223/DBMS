

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 
 * All database connectivity should be handled from within here.
 *
 */
public class SQL {
	
	private static PreparedStatement ps;
	
    /**
     * Queries the database and prints the results.
     * 
     * @param conn a connection object
     * @param sql a SQL statement that returns rows:
     * 		this query is written with the Statement class, typically 
     * 		used for static SQL SELECT statements.
     */
    public static void sqlQuery(Connection conn, String sql){
        try {
        	Statement stmt = conn.createStatement();
        	ResultSet rs = stmt.executeQuery(sql);
        	ResultSetMetaData rsmd = rs.getMetaData();
        	int columnCount = rsmd.getColumnCount();
        	for (int i = 1; i <= columnCount; i++) {
        		String value = rsmd.getColumnName(i);
        		System.out.print(value);
        		if (i < columnCount) System.out.print(",  ");
        	}
			System.out.print("\n");
        	while (rs.next()) {
        		for (int i = 1; i <= columnCount; i++) {
        			String columnValue = rs.getString(i);
            		System.out.print(columnValue);
            		if (i < columnCount) System.out.print(",  ");
        		}
    			System.out.print("\n");
        	}
        	rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    /**
     * Queries the database and prints the results.
     * 
     * @param conn a connection object
     * @param sql a SQL statement that returns rows:
     * 		this query is written with the PrepareStatement class, typically 
     * 		used for dynamic SQL SELECT statements.
     */
    public static void sqlQuery(Connection conn, PreparedStatement sql){
        try {
        	ResultSet rs = sql.executeQuery();
        	ResultSetMetaData rsmd = rs.getMetaData();
        	int columnCount = rsmd.getColumnCount();
        	for (int i = 1; i <= columnCount; i++) {
        		String value = rsmd.getColumnName(i);
        		System.out.print(value);
        		if (i < columnCount) System.out.print(",  ");
        	}
			System.out.print("\n");
        	while (rs.next()) {
        		for (int i = 1; i <= columnCount; i++) {
        			String columnValue = rs.getString(i);
            		System.out.print(columnValue);
            		if (i < columnCount) System.out.print(",  ");
        		}
    			System.out.print("\n");
        	}
        	rs.close();
        	ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    public static void addDrone(BufferedReader reader) throws IOException {
        System.out.println("Enter Drone ID");
    	String id = (database.getUserInput(reader));
    	System.out.println("Enter Drone Max Speed: ");
        int speed = Integer.parseInt(database.getUserInput(reader));
        System.out.println("Enter Warrenty Expiration Date: ");
        String date = database.getUserInput(reader);
        System.out.println("Enter Drone Manufacturer: ");
        String manufacturer =database.getUserInput(reader);
        System.out.println("Enter Drone Model: ");
        String model = database.getUserInput(reader);
        System.out.println("Enter Drone Capacity (in kg): ");
        double capacity = Double.parseDouble(database.getUserInput(reader));
        System.out.println("Enter Drone Location: ");
        String location = database.getUserInput(reader);
        System.out.println("Enter Drone Range (in kg): ");
        double range = Double.parseDouble(database.getUserInput(reader));
        System.out.println("Enter Drone Name: ");
        String name = database.getUserInput(reader);
        System.out.println("Enter Drone Year: ");
        String year = database.getUserInput(reader);
        System.out.println("Enter Drone status: ");
        String status = database.getUserInput(reader);
        System.out.println("Enter Drone address: ");
        String address = database.getUserInput(reader);


        String droneAdditionSql = "INSERT INTO Drone VALUES("+id+","+speed+","+date+","+manufacturer+","+model+","+capacity+","+location+","+range+","+name+","+year+","+status+","+address+");";

        try {
    		ps = database.conn.prepareStatement(droneAdditionSql);
    	} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    	
    	sqlQuery(database.conn, ps);
    	
        System.out.println("Drone added successfully!");
    }
    
    public static void updateDrone(BufferedReader reader) throws IOException {
    	System.out.println("Enter Drone ID to update");
    	String id = (database.getUserInput(reader));
    	System.out.println("Enter Drone Max Speed: ");
        int speed = Integer.parseInt(database.getUserInput(reader));
        System.out.println("Enter Warrenty Expiration Date: ");
        String date = database.getUserInput(reader);
        System.out.println("Enter Drone Manufacturer: ");
        String manufacturer =database.getUserInput(reader);
        System.out.println("Enter Drone Model: ");
        String model = database.getUserInput(reader);
        System.out.println("Enter Drone Capacity (in kg): ");
        double capacity = Double.parseDouble(database.getUserInput(reader));
        System.out.println("Enter Drone Location: ");
        String location = database.getUserInput(reader);
        System.out.println("Enter Drone Range (in kg): ");
        double range = Double.parseDouble(database.getUserInput(reader));
        System.out.println("Enter Drone Name: ");
        String name = database.getUserInput(reader);
        System.out.println("Enter Drone Year: ");
        String year = database.getUserInput(reader);
        System.out.println("Enter Drone status: ");
        String status = database.getUserInput(reader);
        System.out.println("Enter Drone address: ");
        String address = database.getUserInput(reader);


        String droneAdditionSql = "UPDATE Drone SET Max_speed = "+speed+", Warranty_exp = "+date+", Manufacturer = "+manufacturer+", Model = "+model+", Weight_capacity = "+capacity+",Location ="+location+", Range= "+range+",Name ="+name+",Year ="+year+",Status = "+status+", Address = "+address+" WHERE Serial_no ="+id+";";

        try {
    		ps = database.conn.prepareStatement(droneAdditionSql);
    	} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    	
    	sqlQuery(database.conn, ps);
    	
        System.out.println("Drone edited successfully!");

    }
    public static void deleteDrone(BufferedReader reader) throws IOException {
        System.out.println("Enter Drone ID to delete: ");
        String id = database.getUserInput(reader);
        String sql = "DELETE FROM Drone WHERE Serial_no ="+ id + ";";
        
        try {
    		ps = database.conn.prepareStatement(sql);
    	} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    	
    	sqlQuery(database.conn, ps);
    	
    	System.out.println("Drone deleted successfully!");
    }

    //User Search
    public static void searchDrone(BufferedReader reader) throws IOException {
	    System.out.print("Enter serial number: ");
	    String serialNumber = database.getUserInput(reader);       
	    String sql = "SELECT * FROM Drone WHERE Serial_no = " + serialNumber;
	    try {
	        ps = database.conn.prepareStatement(sql);
	        ps.setString(1, serialNumber);
	        sqlQuery(database.conn, ps);
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	   }
	}

    
    
    
    ///////////////////////////////////////////////////////////////////////////////////
    // Total Number Equipment Items
    public static void getTotalNumberEquipmentItems(BufferedReader reader) throws IOException {
    	System.out.println("Enter the Customer ID of the Customer you would like the information on");
    	int userId = Integer.parseInt(database.getUserInput(reader));
        String sql = """
            SELECT Customers.User_id, First_name, Last_name, COUNT(Rental_Items.Serial_no) AS Rental_Count
            FROM Customers
            JOIN Rentals ON Customers.User_id = Rentals.User_id
            JOIN Rental_Items ON Rentals.Rental_id = Rental_Items.Rental_id
            WHERE Customers.User_id = ?
            GROUP BY Customers.User_id, First_name, Last_name;
            """;
        try {
            ps = database.conn.prepareStatement(sql);
            ps.setInt(1, userId);
            sqlQuery(database.conn, ps);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

 // Most Popular Item
    public static void ps_MostPopularItem() {
        String sql = """
            SELECT Rentals.Rental_ID, julianday(Due_date) - julianday(Checkout_date) AS running_rented_time
            FROM Rentals
            GROUP BY Rentals.Rental_ID
            ORDER BY running_rented_time DESC
            LIMIT 1;
            """;
        try {
            ps = database.conn.prepareStatement(sql);
            sqlQuery(database.conn, ps);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


 // Most Frequent Equipment Manufacturer
    public static void ps_MostFrequentEquipmentManufacturer(){
        String sql = """
                SELECT E.Manufacturer, Count(RI.Serial_no) as Rented_Count
                FROM Equipment AS E
                JOIN Rental_Items AS RI ON E.Serial_no = RI.Serial_no
                GROUP BY E.Manufacturer
                ORDER BY Rented_Count DESC
                LIMIT 1;
                """;
        try {
            ps = database.conn.prepareStatement(sql);
            sqlQuery(database.conn, ps);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns the serial number, the total mileage,
     * and the number of deliveries made my the most popular drone
     */
    public static void ps_PopularDrone(){
    	String sql = "SELECT D.Serial_no, D.Total_mileage, COUNT(Del.Rental_id)"
    			+ "FROM Drones AS D"
    			+ "JOIN Deliveries AS Del ON D.Serial_no = Del.Serial_no"
    			+ "GROUP BY D.Serial_no"
    			+ "ORDER BY COUNT(Del.Rental_id) DESC"
    			+ "LIMIT 1;";
    	try {
    		ps = database.conn.prepareStatement(sql);
    	} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    	
    	sqlQuery(database.conn, ps);
    }

 // Most Frequent Member and Total Items checked out
    public static void ps_MostFrequentMember(){
        String sql = """
                SELECT Customers.User_id, First_name, Last_name, COUNT(Rental_Items.Serial_no) AS Rental_Count
        		FROM Customers
        		JOIN Rentals ON Customers.User_id = Rentals.User_id
        		JOIN Rental_Items ON Rentals.Rental_id = Rental_Items.Rental_id
        		GROUP BY Customers.User_id, First_name, Last_name
        		ORDER BY Rental_Count DESC
        		LIMIT 1;
                """;
        try {
            ps = database.conn.prepareStatement(sql);
            sqlQuery(database.conn, ps);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


  //Equipment by type of equipment
    public static void ps_EquipmentbyType(){
        String sql = "SELECT Type FROM Equipment WHERE Year < ?";
        try {
            ps = database.conn.prepareStatement(sql);
            sqlQuery(database.conn, ps);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}




