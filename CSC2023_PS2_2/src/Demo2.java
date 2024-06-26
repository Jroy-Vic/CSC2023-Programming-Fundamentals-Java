import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Media> movies = MovieLoader.loadAllMovies();

        MediaReducer op = new MovieReducerEraCount();
        System.out.println(op.reduce(movies, "Silent Era"));
        System.out.println(op.reduce(movies, "Pre-Golden Era"));
        System.out.println(op.reduce(movies, "Golden Era"));
        System.out.println(op.reduce(movies, "Change Era"));
        System.out.println(op.reduce(movies, "Modern Era"));
        System.out.println(op.reduce(movies, "New Millennium Era"));

    }
}
