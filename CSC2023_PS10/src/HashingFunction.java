import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashingFunction {

    private final String userInput;
    private int hashCode;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public HashingFunction(String input) {
        this.userInput = input;
    }

    public int indexFind(char character) {
        int index = 0;
        for (int i = 0; i < this.alphabet.length; i++) {
            if (this.alphabet[i] == character) {
                index = i;
            }
        }

        return index + 1;
    }

    public void countCode() {
        for (int idx = 0; idx < this.userInput.length(); idx++) {
            char character = this.userInput.charAt(idx);
            if (Character.isAlphabetic(character)) {
                character = Character.toLowerCase(character);
                switch (character) {
                    case 'a' -> hashCode += 100;
                    case 'e' -> hashCode += 200;
                    case 'i' -> hashCode += 300;
                    case 'o' -> hashCode += 400;
                    case 'u' -> hashCode += 500;
                    default -> hashCode += (indexFind(character) * (idx + 1));
                }
            }
        }
    }

    public int getHashCode() {
        this.countCode();
        return this.hashCode;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter ten words");
        Set<String> stringSet = new TreeSet<>(new HashComparator());
        int count = 0;

        while (count < 10) {
            String input = keyboard.nextLine();
            stringSet.add(input);
            count++;
        }

        for (String current : stringSet) {
            HashingFunction test = new HashingFunction(current);
            System.out.println("Hash: " + test.getHashCode() + " Word: " + current);
        }
    }
}
