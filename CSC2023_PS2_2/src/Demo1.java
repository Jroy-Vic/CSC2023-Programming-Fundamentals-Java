import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Demo1 {

    public static void test(ArrayList<Media> movies, int firstSubscript, int secondSubscript) throws FileNotFoundException {
        Media m1 = movies.get(firstSubscript);
        Media m2 = movies.get(secondSubscript);

        System.out.println("Analyzing the following two movies");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println("-- Era Test --");
        System.out.println(m1.getEra());
        System.out.println(m2.getEra());
        System.out.println("-- Released After Test --");
        if (m1.wasReleasedAfter(m2)) {
            System.out.println(m1 + "\nwas released after\n" + m2);
        } else {
            System.out.println(m1 + "\nwas NOT released after\n" + m2);
        }
        System.out.println("-- Released Before or in Same Year Test --");
        if (m1.wasReleasedBeforeOrInSameYear(m2)) {
            System.out.println(m1 + "\nwas released before or in same year as\n" + m2);
        } else {
            System.out.println(m1 + "\nwas NOT released before or in same year as\n" + m2);
        }

        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Media> movies = MovieLoader.loadAllMovies();

        test(movies, 0, 20);
        test(movies, 888, 947);
        test(movies, 5000, 99);
        test(movies, 1001, 101);
        test(movies, 6000, 738);
    }
}
