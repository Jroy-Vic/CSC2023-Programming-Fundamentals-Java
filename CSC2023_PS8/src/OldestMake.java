import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OldestMake extends OldCarSort{

    private ArrayList<Car> oldMakeList = new ArrayList<Car>();

    public OldestMake(String fileName) throws FileNotFoundException {
        super(fileName);
        super.quickSort(super.list);
    }

    public void oldSort(ArrayList<Car> list) {
        String currentMake = "";
        for (Car testCar : super.list) {
            if (!(currentMake.equals(testCar.getMake()))) {
                currentMake = testCar.getMake();
                oldMakeList.add(testCar);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter filename");
        String fileName = keyboard.nextLine();

        OldestMake test = new OldestMake(fileName);
        System.out.println("Oldest cars by make");
        test.oldSort(test.list);
        for (Car testCar : test.oldMakeList) {
            System.out.println(String.format("%15s%25s%5s%18s", testCar.getMake(), testCar.getModel(), testCar.getYear(), testCar.getVIN()));
        }
        System.out.println(test.oldMakeList.size() + " result(s)");
    }
}
