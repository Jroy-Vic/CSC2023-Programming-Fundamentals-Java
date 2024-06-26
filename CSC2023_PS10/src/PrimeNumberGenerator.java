import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeNumberGenerator {

    public static List<Long> generate(int num) {
        ArrayList<Long> list = new ArrayList<>();
        long currentLong = 2;
        while (list.size() < num) {
            if (currentLong == 2) {
                list.add(currentLong);
            } else {
                Iterator<Long> iter = list.iterator();
                int count = 0;
                while (iter.hasNext()) {
                    if (currentLong % iter.next() == 0) {
                        count++;
                    }
                }

                if (count == 0) {
                    list.add(currentLong);
                }

            }
            currentLong++;
        }

        return list;
    }
}
