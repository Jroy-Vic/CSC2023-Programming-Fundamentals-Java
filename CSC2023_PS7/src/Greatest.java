import java.util.ArrayList;
import java.util.Scanner;

public class Greatest {

    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int firstNum;

    private String output = "";

    public static void main(String[] args) {
        System.out.println("Enter several numbers. Enter a non-integer to end.");
        Greatest test = new Greatest();

        String line = test.getInput();
        test.getNumbers(line);
        int bigNum = test.findBigNum(1);
        System.out.println("Greatest number in that sequence is " + bigNum);
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        return input;
    }

    private String cutString(int baseIDX, int inputLength, String input) {
        if (inputLength < (baseIDX + 1)) {
            return "";
        }
        else {
            cutString(baseIDX, inputLength - 1, input);
            return output += input.charAt(inputLength);
        }
    }

    public void getNumbers(String input) {
        Scanner inputText = new Scanner(input);
        if (inputText.hasNextInt()) {
            int num = inputText.nextInt();
            list.add(num);
            int numlength = Integer.toString(num).length();
            int inputLength = input.length() - 1;
            String newInput = cutString(numlength, inputLength, input);
            output = "";
            getNumbers(newInput);
        }
        else if (input.isEmpty()) {
            getNumbers(getInput());
        }
        else {
            firstNum = list.get(0);
        }
    }

    public int findBigNum(int current) {
        if (current <= (list.size() - 1)) {
            findBigNum(current + 1);
            if (list.get(current) > firstNum) {
                firstNum = list.get(current);
            }

            return firstNum;
        }
        else {
            return firstNum;
        }
    }
}
