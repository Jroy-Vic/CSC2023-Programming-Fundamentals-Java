import java.util.Scanner;

public class Palindrome extends Reverse {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        String userText = keyboard.nextLine();

        Palindrome test = new Palindrome(userText);
        boolean check = test.checkPalindrome();

        if(check) {
            System.out.println("That is a palindrome");
        }
        else {
            System.out.println("That is NOT a palindrome");
        }
    }

    public Palindrome(String text) {
        super(text);
        super.reverseText(0);
    }

    public boolean checkPalindrome() {
        if(super.getText().equalsIgnoreCase(super.getReversedText())) {
            return true;
        }
        else {
            return false;
        }
    }


}
