import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackUtils {

    public static Stack<Character> buildStack(File f) {
        Stack<Character> stackList = new Stack<>();
        ArrayList<Character> list = new ArrayList<>();

        try {
            Scanner file = new Scanner(f);
            while (file.hasNext()) {
                String line = file.nextLine();
                for (int x = 0; x < line.length(); x++) {
                    if (line.charAt(x) == '{' || line.charAt(x) == '}') {
                        list.add(line.charAt(x));
                    }
                }
            }

            for (int x = 0; x < list.size(); x++) {
                stackList.push(list.get(x));
            }

            return stackList;


        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
            return null;
        }

    }

    public static int reduce(File f) {
        try {
            Scanner file = new Scanner(f);
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;

            while (file.hasNext()) {
                String line = file.nextLine();
                for (int x = 0; x < line.length(); x++) {
                    if (line.charAt(x) == '{') {
                        count1++;
                    }
                    else if(line.charAt(x) == '}' && count1 >= (count2 + 1)) {
                        count2++;
                    }
                    else if(line.charAt(x) == '}') {
                        count3++;
                    }
                }
            }

            if (count1 == count2 && count3 == 0) {
                return 0;
            }
            else {
                return -1;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
            return 0;
        }
    }

    public String toString(Stack<Character> s) {
        String output = "[";
        while (!s.isEmpty()) {
            Character current = s.pop();
            output += current + ", ";
        }
        output = output.substring(0, output.length() - 2);
        output += "]";

        return output;
    }
}
