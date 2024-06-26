import java.util.Scanner;


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
        return this.hashCode;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any text");
        String user = keyboard.nextLine();

        HashingFunction test = new HashingFunction(user);
        test.countCode();

        System.out.println("The CS112 hashcode for that string is " + test.getHashCode());
    }
}
