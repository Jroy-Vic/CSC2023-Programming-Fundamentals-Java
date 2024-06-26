import java.util.Comparator;

public class HashComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        HashingFunction o1Hash = new HashingFunction(o1);
        HashingFunction o2Hash = new HashingFunction(o2);

        if (o1Hash.getHashCode() > o2Hash.getHashCode()) {
            return 1;
        }
        else if (o1Hash.getHashCode() < o2Hash.getHashCode()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
