import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    private String ID, name, email;

    private Employee(String ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    public static Map<String, Employee> load() {
        Map<String, Employee> loadMap = new HashMap<>();
        try {
            Scanner file = new Scanner(new File("employees.txt"));
            while (file.hasNext()) {
                String inputLine = file.nextLine();
                String[] inputSplit = inputLine.split("\t");

                Employee Emp = new Employee(inputSplit[0],inputSplit[1] + " " + inputSplit[2], inputSplit[3]);
                loadMap.put(inputSplit[0], Emp);
            }

            return loadMap;

        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
            return null;
        }
    }

    public String toString() {
        return this.ID + " -> " + this.name + " " + this.email;
    }
}
