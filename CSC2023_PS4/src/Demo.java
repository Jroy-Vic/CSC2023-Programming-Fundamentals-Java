import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        Person test1 = new Person("Eachelle Balderstone",
                30526110612015L,
                9866.30,
                false);

        Person test2 = new Person("Brand Hallam",
                3573877643495486L,
                9985.21,
                false);

        Person test3 = new Person("Tiphanie Oland",
                5100172198301454L,
                9315.15,
                true);

        ArrayList<Person> list = new ArrayList<>();
        list.add(test1);
        list.add(test2);
        list.add(test3);
        Collections.sort(list);

        System.out.printf("%20s%20s%10s%10s\n", "Name", "Account Number", "Balance", "Cash Back");
        for (Person current : list) {
            System.out.println(current);
        }
    }
}
