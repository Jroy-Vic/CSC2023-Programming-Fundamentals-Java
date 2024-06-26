import java.util.Scanner;

public class Question1 {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");
        String filename = keyboard.nextLine();
        System.out.println("Enter a lower bound");
        int lowerBound = keyboard.nextInt();

        FileSumWrapper.handle(filename, lowerBound);
    }
}
