import java.util.ArrayList;

public class ToolBox implements GenericTools{

    @Override
    public <T> void swap(ArrayList<T> data, int p1, int p2) {
        T currentVal = data.get(p2);
        data.set(p2, data.get(p1));
        data.set(p1, currentVal);
    }

    @Override
    public <T extends Comparable<T>> void insertionSort(ArrayList<T> data) {
        for (int x = 0; x < data.size() - 1; x++) {
            if (data.get(x + 1).compareTo(data.get(x)) < 0) {
                swap(data, x, x + 1);
                insertionSort(data);
            }
        }
    }

    @Override
    public <T extends Comparable<T>> ArrayList<T> insertionSort(ArrayList<T> data, int start, int end) {
        ArrayList<T> outputList = new ArrayList<>();
        for (int x = start; x < end; x++) {
            outputList.add(data.get(x));
        }

        return outputList;
    }
}
