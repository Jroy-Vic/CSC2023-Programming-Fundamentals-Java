import java.util.ArrayList;

public class MovieReducerLength implements MediaReducer{
    @Override
    public String reduce(ArrayList<Media> list, String key) {
        String result = "";
        for(Media m : list) {
            if(m.getName().length() == Integer.parseInt(key)) {
                result += String.format(" %s %-55s %-15s\n", m.getYear(), m.getName(), m.getGenre());
            }
        }

        return result;
    }
}
