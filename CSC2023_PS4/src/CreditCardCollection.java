import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CreditCardCollection implements Comparable<CreditCardCollection>{

    private int nameLength;
    private String name;
    private long accNum;
    private double balance;
    private boolean cashBack;
    public static double userBalance;
    private static FileInputStream file;
    private static DataInputStream data;

    private static DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private static ArrayList<CreditCardCollection> CCCList = new ArrayList<>();


    public static void createEntryList() {
        try {
            file = new FileInputStream("accounts-with-names.dat");
            data = new DataInputStream(file);

            boolean eof = false;
            while(!eof) {
                try {
                    int nameLength = data.readInt();
                    String name = "";
                    for(int i = 0; i < nameLength; i++) {
                        char letter = data.readChar();
                        name += letter;
                    }
                    long account = data.readLong();
                    double balance = data.readDouble();
                    boolean cashBack = data.readBoolean();

                    if(balance >= userBalance) {
                        CreditCardCollection CCC = new CreditCardCollection(nameLength, name, account, balance, cashBack);
                        CCCList.add(CCC);
                    }

                } catch (EOFException e) {
                    eof = true;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a balance");
        userBalance = keyboard.nextDouble();
        String userBalanceConvert = decimalFormat.format(userBalance);
        System.out.println("Accounts with a balance of at least $" + userBalanceConvert + " (sorted by balance)");
        System.out.println("                Name      Account Number   Balance Cash Back");
        createEntryList();

        Collections.sort(CCCList);
        for(CreditCardCollection CCC : CCCList) {
            String cashBackConvert = "No";
            if(CCC.cashBack) {
                cashBackConvert = "Yes";
            }
            System.out.println(String.format("%20s%20s%10s%10s", CCC.name,CCC.accNum,decimalFormat.format(CCC.balance),cashBackConvert));
        }
        System.out.println(CCCList.size() + " results");
    }

    public CreditCardCollection(int nameLength, String name, long accNum, double balance, boolean cashBack) {
        this.nameLength = nameLength;
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
        this.cashBack = cashBack;
    }

    @Override
    public int compareTo(CreditCardCollection o) {
        return Double.toString(o.balance).compareTo(Double.toString(this.balance));
    }
}
