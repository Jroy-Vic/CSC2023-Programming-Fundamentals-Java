import java.util.Scanner;
public class Demo5 {

    public static void List(String name, String number, String email, String neigbor) {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + number);
        System.out.println("Email: " + email);
        System.out.println("Telephone neighbor: " + neigbor);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("New number creation tool");
        System.out.println("Enter name");
        String name = keyboard.nextLine();

        System.out.println("Enter phone number");
        String number = keyboard.nextLine();

        System.out.println("Enter email");
        String email = keyboard.nextLine();

        SmartPhone p = new SmartPhone(name, number, email);
        String neigbor = p.getTelephoneNeighbor();

        List(name, number, email, neigbor);

    }

}
