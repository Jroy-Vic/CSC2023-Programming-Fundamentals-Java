import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sort extends ToolBoxUser {

    private ArrayList<User> list = new ArrayList<>(), newList = new ArrayList<>();

    public void createList() {
        try {
            Scanner file = new Scanner(new File("user-database.txt"));
            file.nextLine();
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] elements = line.split("\t");
                String username = elements[0];
                String password = elements[1];
                User user = new User();
                user.setData(username, password);

                list.add(user);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sortList(int start, int end) {
        createList();
        quickSort(list);
        newList = super.selectElements(list, start, end);
    }

    public void displayList() {
        for (User entry : newList) {
            System.out.println(entry);
        }
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a starting point and ending point");

        String input = keyboard.nextLine();
        String[] idx = input.split(" ");
        int start = Integer.valueOf(idx[0]);
        int end = Integer.valueOf(idx[1]);

        Sort test = new Sort();
        test.sortList(start, end);
        test.displayList();
    }
}
