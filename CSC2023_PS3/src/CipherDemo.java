import java.util.Scanner;

public class CipherDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter some text to encrypt");
        String input = keyboard.nextLine();
        System.out.println("Enter a key");
        int key = keyboard.nextInt();

        try {
            Cipher c = new Cipher(input, key);
            System.out.println("Plain text: " + c.getPlainText());
            System.out.println("Cipher text: " + c.getCipherText());
            System.out.println("Key: " + c.getKey());
        } catch (EmptyPlainText e) {
            System.out.println(e.getMessage());
        } catch (UselessKeyException e) {
            System.out.println(e.getMessage());
            System.out.println("Useless key: " + e.getUselessKey());
        }
    }
}
