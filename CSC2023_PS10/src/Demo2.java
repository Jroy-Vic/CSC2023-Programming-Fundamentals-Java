import java.util.Map;
import java.util.Scanner;

public class Demo2 {

  public static void main(String[] args)
  {
    Map<String, Employee> data = Employee.load();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter ID of employee you're looking for");
    String id = keyboard.nextLine();
    System.out.println(data.get(id));
  }

}
