import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardReader {

    private int Checksum;
    private String validity;
    public static ArrayList<Long> CreditCards = new ArrayList<>();
    public static ArrayList<Integer> CreditCardsSums = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a filename");
        String f = keyboard.nextLine();
        CreditCardReader test = new CreditCardReader(f);


        for(int idx = 0; idx < CreditCards.size(); idx++) {
            String CC = test.getCreditCard(idx);
            int CheckSum = test.getCheckSum(idx);
            String valid = test.getValidity();
            System.out.println("Credit card number: " + CC);
            System.out.println("Checksum: " + CheckSum);
            System.out.println("Card status: " + valid);
        }
    }

    public CreditCardReader(String filename) throws IOException {
        FileInputStream file = new FileInputStream(filename);
        DataInputStream data = new DataInputStream(file);

        while(data.available() > 0) {
            long num = data.readLong();
            String numString = Long.toString(num);
            int sum1 = 0;
            int sum2 = 0;

            for (int i = (numString.length() - 2); i >= 0; i = i - 2) {
                int value = Integer.parseInt(numString.charAt(i) + "");
                if (value * 2 > 9) {
                    int newNumChar = ((Integer.parseInt(numString.charAt(i) + "") * 2) - 9);
                    sum1 += newNumChar;
                } else {
                    sum1 += value * 2;
                }
            }

            if(numString.length() % 2 != 0) {
                for (int i = 0; i < numString.length(); i = i + 2) {
                    sum2 += Integer.parseInt(numString.charAt(i) + "");
                }
            }
            else {
                for(int i = 1; i < numString.length(); i = i + 2 ) {
                    sum2 += Integer.parseInt(numString.charAt(i) + "");
                }
            }

            this.Checksum = sum1 + sum2;
            CreditCards.add(num);
            CreditCardsSums.add(Checksum);
        }

        data.close();
    }

    public String getCreditCard(int i) {
        Long creditCard = CreditCards.get(i);
        int checkSum = CreditCardsSums.get(i);

        if(checkSum % 10 == 0) {
            this.validity = "VALID";
        }
        else {
            this.validity = "INVALID";
        }

        return String.format("%13d", creditCard).replaceAll("(\\d{4})(?!$)", "$1 ");
    }

    public int getCheckSum(int i) {
        return CreditCardsSums.get(i);
    }

    public String getValidity() {
        return validity;
    }
}
