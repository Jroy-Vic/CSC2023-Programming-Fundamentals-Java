import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserCarSort extends UserCar {
    public UserCarSort(String fileName, String userMake) throws FileNotFoundException {
        super(fileName);
        super.userList = super.userSort(userMake);
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What car make are you looking for?");
        String userMake = keyboard.nextLine();

        UserCarSort test = new UserCarSort("car-list.txt", userMake);
        Car oldest = test.userList.get(0);
        Car newest = test.userList.get(test.userList.size() - 1);

        System.out.println("Oldest " + userMake);
        System.out.println(String.format("%15s%25s%5s%18s", oldest.getMake(), oldest.getModel(), oldest.getYear(), oldest.getVIN()));
        System.out.println("Newest " + userMake);
        System.out.println(String.format("%15s%25s%5s%18s", newest.getMake(), newest.getModel(), newest.getYear(), newest.getVIN()));
        }
}

