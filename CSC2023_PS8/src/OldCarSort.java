import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class OldCarSort extends Display {

    protected ArrayList<Car> list = new ArrayList<Car>();

    public OldCarSort(String fileName) throws FileNotFoundException {
        super(fileName);
        Scanner readFile = new Scanner(super.carFile);
        readFile.nextLine();
        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            super.getVar(line);
            Car testCar = new Car(super.make, super.model, super.year, super.VIN);
            list.add(testCar);
        }
    }

    public int partition(ArrayList<Car> list, int start, int end) {
        int mid = (start + end) / 2;
        Car pivotCar = list.get(mid);
        Collections.swap(list, start, mid);
        int endOfList = start;

        for (int x = start + 1; x <= end; x++) {
            if (list.get(x).compareToMake(pivotCar) < 0) {
                endOfList++;
                Collections.swap(list, x, endOfList);
            }
            else if (list.get(x).compareToMake(pivotCar) == 0 && list.get(x).compareToYear(pivotCar) < 0) {
                endOfList++;
                Collections.swap(list, x, endOfList);
            }
            else if (list.get(x).compareToMake(pivotCar) == 0 && list.get(x).compareToYear(pivotCar) == 0 && list.get(x).compareToVIN(pivotCar) <= 0) {
                endOfList++;
                Collections.swap(list, x, endOfList);
            }
        }

        Collections.swap(list, start, endOfList);
        return endOfList;
    }

    public void quickSort(ArrayList<Car> list, int start, int end) {
        if (start < end) {
            int result = partition(list, start, end);
            quickSort(list, start, result - 1);
            quickSort(list, result + 1, end);
        }
    }

    public void quickSort(ArrayList<Car> list) {
        quickSort(list, 0, list.size() - 1);
    }


}

