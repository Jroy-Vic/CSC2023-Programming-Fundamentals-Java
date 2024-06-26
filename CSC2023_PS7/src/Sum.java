import java.util.Scanner;

public class Sum {

    private int num;
    private int sum;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a maximum");
        int userInt = keyboard.nextInt();

        Sum test = new Sum(userInt);
        int finalSum = test.recursiveSum(1);
        System.out.println("The sum of number from 1 to " + test.getNum() + " is " + finalSum);
    }

    public Sum(int num) {
        this.num = num;
    }

    public int recursiveSum(int current) {
        if (current <= this.num) {
            recursiveSum(current + 1);
            return this.sum += current;
        }
        else {
            return 0;
        }
    }

    public int getNum() {
        return this.num;
    }

}
