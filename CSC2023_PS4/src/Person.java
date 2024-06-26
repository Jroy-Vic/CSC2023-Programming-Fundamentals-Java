import java.io.*;
import java.text.DecimalFormat;

public class Person implements Serializable, Comparable<Person> {

    private String name;
    private long accNum;
    private double balance;
    boolean cashBack;
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public Person(String name, long accNum, double balance, boolean cashBack) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
        this.cashBack = cashBack;
    }

    public void save() {
        try {
            FileOutputStream file = new FileOutputStream(accNum + ".dat");
            ObjectOutputStream account = new ObjectOutputStream(file);

            account.writeObject(new Person(this.name, this.accNum, this.balance, this.cashBack));

            account.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        String convertBool = "Yes";
        if(!(this.cashBack)) {
            convertBool = "No";
        }

        return String.format("%20s%20s%10s%10s",this.name, this.accNum, decimalFormat.format(this.balance), convertBool);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
