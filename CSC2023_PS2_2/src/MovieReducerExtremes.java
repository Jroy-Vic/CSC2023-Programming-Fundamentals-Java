import java.util.ArrayList;

public class MovieReducerExtremes implements MediaReducer{
    @Override
    public String reduce(ArrayList<Media> list, String key) {
        Media currentMovie = list.get(0);
        for(Media m : list) {
            if(key.equals("Newest")) {
                if(currentMovie.getYear() < m.getYear()) {
                    currentMovie = m;
                }
            }

            else if(key.equals("Oldest")) {
                if(currentMovie.getYear() > m.getYear()) {
                    currentMovie = m;
                }
                else if(currentMovie.getYear() == m.getYear()) {
                    currentMovie = m;
                }
            }
        }

        return String.format(" %s %-56s%-15s", currentMovie.getYear(), currentMovie.getName(), currentMovie.getGenre());
    }
}
