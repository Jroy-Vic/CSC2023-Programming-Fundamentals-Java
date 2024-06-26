import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDemo {
    private static ArrayList<Employee> list = new ArrayList<>();

    public static void printInfo(ArrayList<Employee> list) {
        System.out.println("        Name           ID   Department     Position");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.format("%12s%13s%13s%13s", list.get(i).getName(), list.get(i).getIdNumber(), list.get(i).getDepartment(), list.get(i).getPosition()));
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("-- Employee Entry Form --\nEnter name");
            String name = keyboard.nextLine();
            System.out.println("Enter ID");
            int ID = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter department");
            String department = keyboard.nextLine();
            System.out.println("Enter position");
            String position = keyboard.nextLine();

            Employee e = new Employee(name, ID, department, position);
            list.add(e);
        }

        printInfo(list);
    }
}
