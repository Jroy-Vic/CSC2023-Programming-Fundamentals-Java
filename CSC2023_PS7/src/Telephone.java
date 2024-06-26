import java.util.ArrayList;
import java.util.Scanner;

public class Telephone {

    private String phoneNumber;
    private int phoneLength;
    private ArrayList<String> list = new ArrayList<String>();


    public Telephone(String number) {
        this.phoneNumber = number;
        this.phoneLength = this.phoneNumber.length();
    }


    private void inputChar(String input, int idx) {
        if (input.length() < this.phoneLength) {
            switch (this.phoneNumber.charAt(idx)) {
                case '1':
                    inputChar(input + "1", idx + 1);
                    break;
                case '2':
                    inputChar(input + "A", idx + 1);
                    inputChar(input + "B", idx + 1);
                    inputChar(input + "C", idx + 1);
                    break;
                case '3':
                    inputChar(input + "D", idx + 1);
                    inputChar(input + "E", idx + 1);
                    inputChar(input + "F", idx + 1);
                    break;
                case '4':
                    inputChar(input + "G", idx + 1);
                    inputChar(input + "H", idx + 1);
                    inputChar(input + "I", idx + 1);
                    break;
                case '5':
                    inputChar(input + "J", idx + 1);
                    inputChar(input + "K", idx + 1);
                    inputChar(input + "L", idx + 1);
                    break;
                case '6':
                    inputChar(input + "M", idx + 1);
                    inputChar(input + "N", idx + 1);
                    inputChar(input + "O", idx + 1);
                    break;
                case '7':
                    inputChar(input + "P", idx + 1);
                    inputChar(input + "Q", idx + 1);
                    inputChar(input + "R", idx + 1);
                    inputChar(input + "S", idx + 1);
                    break;
                case '8':
                    inputChar(input + "T", idx + 1);
                    inputChar(input + "U", idx + 1);
                    inputChar(input + "V", idx + 1);
                    break;
                case '9':
                    inputChar(input + "W", idx + 1);
                    inputChar(input + "X", idx + 1);
                    inputChar(input + "Y", idx + 1);
                    inputChar(input + "Z", idx + 1);
                    break;
                case '0':
                    inputChar(input + "0", idx + 1);
                    break;
                default:
                    inputChar(input + this.phoneNumber.charAt(idx), idx + 1);
                    break;
            }
        } else {
            this.list.add(input);
        }
    }

//    private void printList(ArrayList<String> list, int idx) {
//        if (idx < list.size()) {
//            System.out.println(list.get(idx));
//            printList(list, idx + 1);
//        }
//    }

    public ArrayList<String> getPossibilities() {
        inputChar("", 0);

        return list;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a phone number");
        String userNumber = keyboard.nextLine();

        Telephone test = new Telephone(userNumber);
        test.getPossibilities();
    }
}
