import java.util.Scanner;

public class Reverse {

    private String text;
    private int textLength;
    private int currentIdx;
    private String reversedText = "";

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String");
        String userString = keyboard.nextLine();

        Reverse test = new Reverse(userString);
        System.out.println("Here is that String in reverse");
        System.out.println(test.reverseText(0));
    }

    public Reverse(String text) {
        this.text = text;
        this.textLength = text.length();
        this.currentIdx = this.textLength - 1;
    }

    public String reverseText(int currentIdx) {
        if (currentIdx <= this.currentIdx) {
            reverseText(currentIdx + 1);
            return this.reversedText += this.text.charAt(currentIdx);
        }
        else {
            return "";
        }
    }

    public String getText() {
        return this.text;
    }

    public String getReversedText() {
        return this.reversedText;
    }
}
