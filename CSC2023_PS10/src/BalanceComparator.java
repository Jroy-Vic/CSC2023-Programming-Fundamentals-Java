import java.util.Comparator;

public class BalanceComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        o1 = o1.substring(1);
        float o1f = Float.parseFloat(o1);
        o2 = o2.substring(1);
        float o2f = Float.parseFloat(o2);
        return Float.compare(o1f, o2f);
    }
}
