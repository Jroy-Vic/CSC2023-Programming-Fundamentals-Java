import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class Demo5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");
        File f = new File(keyboard.nextLine());
        int result = StackUtils.reduce(f);
        if (result == 0) {
            System.out.println("Curly brackets are BALANCED");
        } else {
            System.out.println("Curly brackets are NOT BALANCED");
        }

    }
}
