import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Media> movies = MovieLoader.loadAllMovies();

        MediaReducer op = new MovieReducerLength();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a length");
        String length = keyboard.nextLine();
        System.out.println(op.reduce(movies, length));
    }

}
