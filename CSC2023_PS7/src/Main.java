// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private int total;
    public int recursive(int num) {
        if (num < 10) {
            recursive(num + 1);
            return total += num;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
       Main test = new Main();

       System.out.println(test.recursive(0));
    }
}