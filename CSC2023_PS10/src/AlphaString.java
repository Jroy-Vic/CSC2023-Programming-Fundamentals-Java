import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AlphaString {
    private Set<String> alphaSet = new TreeSet<>(new AlphaComparator());

    public void Alphabetize(String input) {
        alphaSet.add(input);
        alphaSet.removeIf(current -> current.equalsIgnoreCase("exit"));
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        AlphaString test = new AlphaString();
        System.out.println("Enter a line of text");
        String input = keyboard.nextLine();
        test.Alphabetize(input);

        while (!(input.equalsIgnoreCase("exit"))) {
            System.out.println("Enter a line of text");
            input = keyboard.nextLine();
            test.Alphabetize(input);
        }

        test.alphaSet.forEach(current -> System.out.println(current));

    }
}
