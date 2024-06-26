import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Demo4 {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");
        File f = new File(keyboard.nextLine());

        Stack<Character> result = StackUtils.buildStack(f);
        System.out.println(result);
    }
}
