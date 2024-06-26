import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {
    private double balance;
    private int count = 0;
    private static DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        try {
            FileInputStream file = new FileInputStream("accounts.dat");
            DataInputStream data = new DataInputStream(file);

            System.out.println("Enter a balance");
            double balance = keyboard.nextDouble();
            Accounts creditCard = new Accounts(balance);
            String formattedValue = decimalFormat.format(balance);
            System.out.println("Accounts with a balance of at least $" + formattedValue);
            System.out.println("         Card Number   Balance  Cash Back?");

            boolean eof = false;
            while(!eof) {
                try {
                    long CardNumber = data.readLong();
                    double NewBalance = data.readDouble();
                    boolean CashBack = data.readBoolean();

                    creditCard.listCardInfo(CardNumber, NewBalance, CashBack);

                } catch (IOException e) {
                    eof = true;
                }
            }

            System.out.println(String.format("%34s results",creditCard.getCount()));

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Accounts(double balance) {
        this.balance = balance;
    }

    public int getCount() {
        return count;
    }

    public void listCardInfo(long cardNumber, double newBalance, boolean cashBack) {
        String cashBackState;
        if(cashBack == true) {
            cashBackState = "Yes";
        }
        else {
            cashBackState = "No";
        }

        String formattedValue = decimalFormat.format(newBalance);
        if(newBalance >= this.balance) {
            System.out.println(String.format("%20s%10s%12s",cardNumber,formattedValue,cashBackState));
            this.count++;
        }
    }


}
