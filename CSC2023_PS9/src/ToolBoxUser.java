import java.util.ArrayList;
import java.util.Collections;

public class ToolBoxUser extends User{

    public <T> void swap(ArrayList<T> data, int p1, int p2) {
        T currentVal = data.get(p2);
        data.set(p2, data.get(p1));
        data.set(p1, currentVal);
    }

    public int partition(ArrayList<User> list, int start, int end) {
        int mid = (start + end) / 2;
        User pivot = list.get(mid);
        swap(list, start, mid);
        int endOfList = start;

        for (int x = start + 1; x <= end; x++) {
            if (list.get(x).compareTo(pivot) < 0) {
                endOfList++;
                Collections.swap(list, x, endOfList);
            }
        }

        swap(list, start, endOfList);
        return endOfList;
    }

    public void quickSort(ArrayList<User> list, int start, int end) {
        if (start < end) {
            int result = partition(list, start, end);
            quickSort(list, start, result - 1);
            quickSort(list, result + 1, end);
        }
    }

    public void quickSort(ArrayList<User> list) {
        quickSort(list, 0, list.size() - 1);
    }


    public <T extends Comparable<T>> ArrayList<T> selectElements(ArrayList<T> data, int start, int end) {
        ArrayList<T> outputList = new ArrayList<>();
        for (int x = start; x < end; x++) {
            outputList.add(data.get(x));
        }

        return outputList;
    }

}
