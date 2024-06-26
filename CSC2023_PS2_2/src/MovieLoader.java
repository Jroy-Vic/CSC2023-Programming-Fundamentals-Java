import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieLoader {
    public static ArrayList<Media> loadAllMovies() throws FileNotFoundException {
        File f = new File("movie_list.txt");
        Scanner inputFile = new Scanner(f);
        ArrayList<Media> result = new ArrayList<>();
        while (inputFile.hasNextLine()) {
            String name = inputFile.nextLine();
            int year = inputFile.nextInt();
            //skip new line
            inputFile.nextLine();
            String genre = inputFile.nextLine();
            Media m = new Movie(name, year, genre);
            result.add(m);
        }
        return result;
    }
}
