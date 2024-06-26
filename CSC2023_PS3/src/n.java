import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class n {

    private static FileInputStream file;
    private static DataInputStream data;
    private static ArrayList<Integer> integers = new ArrayList<>();

    private int Max;



    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a filename");
        String f = keyboard.nextLine();
        n data = new n(f);

        int numInt = data.allInt();
        int Max = data.maxInt();
        int Min = data.minInt();

        System.out.println("Found " + numInt + " integers.");
        System.out.println("Max: " + Max);
        System.out.println("Min: " + Min);

    }

    public n(String f){
        try {
            file = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public int allInt() throws IOException {
        data = new DataInputStream(file);
        int count = 0;

        while(data.available() > 0) {
            int number = data.readInt();
            integers.add(number);
            count++;
        }

        data.close();
        return count;
    }

    public int maxInt() {
        int maxInt = 0;

        for(int i = 0; i < integers.size(); i++) {
            int number = integers.get(i);
            if(number > maxInt) {
                maxInt = number;
            }
        }

        this.Max = maxInt;
        return maxInt;
    }

    public int minInt() {
        int minInt = this.Max;

        for(int i = 0; i < integers.size(); i++) {
            int number = integers.get(i);
            if(number < minInt) {
                minInt = number;
            }
        }

        return minInt;
    }
}
