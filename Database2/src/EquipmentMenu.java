import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquipmentMenu {
    final static String[] MenuOptions = { "Add Equipment", "Update Equipment Information",
            "Change Equipment Status", "View Equipment","Total Number Of Equipment","Most frequent manufacturer", "Equipment by Type",
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
                case "A": //Add Equipment

                    break;
                case "B": //Update Equipment Information

                    break;
                case "C": // Change Equipment Status

                    break;
                case "D": // View Equipment

                        break;
                case "E": // Total Number Of Equipment
                	SQL.getTotalNumberEquipmentItems(reader);
                    break;
                case "F": // Most Frequent Manufacturer
                	SQL.ps_MostFrequentEquipmentManufacturer();
                    break;
                case "G": // Equipment by Type
                	SQL.ps_EquipmentbyType();
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
