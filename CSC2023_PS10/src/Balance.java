import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Balance {

    private Set<String> account = new TreeSet<>(new BalanceComparator());

    public Balance(String last) {
        account.add(last);
    }

    public void addBal(String bal) {
        account.add(bal);
    }

    public String getLow() {
        return account.iterator().next();
    }

    public String getHigh() {
        String high = "";
        Iterator<String> iter = account.iterator();
        while (iter.hasNext()) {
            high = iter.next();
        }
        return high;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");

        String fileInput = keyboard.nextLine();
        Map<Integer, String> balanceMap = new HashMap<>();

        try {
            Scanner file = new Scanner(new File(fileInput));
            file.nextLine();
            while (file.hasNext()) {
                String inputLine = file.nextLine();
                String[] contents = inputLine.split("\t");

                int customerID = Integer.parseInt(contents[0]);
                balanceMap.put(customerID, contents[1]);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }

        for (int key : balanceMap.keySet()) {
            String balance = balanceMap.get(key);
            String lowBal = "";
            String highBal = "";

            Balance acc = new Balance(balance);
            try {
                Scanner file = new Scanner(new File(fileInput));
                file.nextLine();
                while (file.hasNext()) {
                    String inputLine = file.nextLine();
                    String[] contents = inputLine.split("\t");
                    int customerID = Integer.parseInt(contents[0]);

                    if (key == customerID) {
                        acc.addBal(contents[1]);
                    }
                }

                lowBal = acc.getLow();
                highBal = acc.getHigh();

            } catch (FileNotFoundException e) {
                System.out.println(e.getStackTrace());
            }


            System.out.println("Customer " + key + ": Last balance: " + balance + " High balance: " + highBal + " Low balance: " + lowBal);

        }
    }
}
