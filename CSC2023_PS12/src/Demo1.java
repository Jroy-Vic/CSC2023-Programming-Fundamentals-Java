import java.util.Queue;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an expression in prefix form (operator comes first)");
        String line = keyboard.nextLine();
        Queue<String> q = QueueUtils.build(line);
        System.out.println(q);
    }
}
