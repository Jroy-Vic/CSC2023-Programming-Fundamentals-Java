import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserCar extends CarSort{

    protected ArrayList<Car> userList = new ArrayList<Car>();
    public UserCar(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public ArrayList<Car> userSort(String userMake) {
        for(Car testCar : super.list) {
            if (testCar.getMake().equals(userMake)) {
                userList.add(testCar);
            }
        }
        super.quickSort(userList);

        return userList;
    }

}
