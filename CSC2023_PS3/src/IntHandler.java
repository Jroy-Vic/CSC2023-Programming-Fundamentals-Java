import java.util.Scanner;

public class IntHandler{

    private int sum;
    public static boolean change = true;

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        IntHandler test = new IntHandler();

        while(change) {
            System.out.println("Enter a integer");
            String num = keyboard.nextLine();
            test.result(num);
        }
    }

    public void result(String num) {
        try {
            String modNum = "";

            for(int i = 0; i < num.length(); i++) {
                if(Character.isDigit(num.charAt(i))) {
                    char letter = num.charAt(i);
                    modNum += letter;
                }
            }

            int newNum = Integer.parseInt(modNum);
            if(!(modNum.equals(num))) {
                System.out.println("Well, that's not a number but here's what I extracted: " + modNum);
            }
            sum += newNum;
            System.out.println("Current sum: " + sum);

        } catch (NumberFormatException e) {

            System.out.println("There were no digits in that input.");
            change = false;
            System.out.println("Final sum: " + sum);
        }

    }
}
