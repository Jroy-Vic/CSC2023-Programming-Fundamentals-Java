import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Demo3 {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Media> movies = MovieLoader.loadAllMovies();

        MediaReducer op = new MovieReducerExtremes();

        System.out.println("Newest");
        System.out.println(op.reduce(movies, "Newest"));
        System.out.println("Oldest");
        System.out.println(op.reduce(movies, "Oldest"));

    }
}
