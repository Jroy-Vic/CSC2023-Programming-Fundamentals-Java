import java.io.FileNotFoundException;
import java.rmi.UnexpectedException;
import java.util.InputMismatchException;

public class FileSumWrapper extends Exception {
    public static void handle(String filename, int lowerBound) {
        try {
            int acc = FileSum.read(filename, lowerBound);
            System.out.println("Sum of all numbers in " + filename + " is " + acc);
        }
        catch (FileNotFoundException e) {
            System.out.println("CS112 error: Couldn't open " + filename);
        }
        catch (InputMismatchException e) {
            System.out.println("CS112 error: Was reading integers but found something else");
        }
        catch (Exception e) {
            System.out.println("CS112 error: Found no numbers above " + lowerBound);
        }
    }
}
