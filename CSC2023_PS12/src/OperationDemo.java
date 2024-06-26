import java.util.Queue;
import java.util.Scanner;

public class OperationDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int result = 0;
        do {
            System.out.println("Enter an expression in prefix form (operator comes first)");
            String line = keyboard.nextLine();
            Queue<String> q = QueueUtils.build(line);
            result = QueueUtils.eval(q);
            System.out.println(result);
        } while (result != 0);

        System.out.println("Exiting");
    }
}
