import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Movie extends Media {

    public Movie(String name, int year, String genre) {
        super(name, year, genre);
    }

    @Override
    public String getEra() {
       if(super.getYear() >= 2000) {
           return "New Millennium Era";
       }
       else if(super.getYear() >= 1977) {
           return "Modern Era";
       }
       else if(super.getYear() >= 1955) {
           return "Change Era";
       }
       else if(super.getYear() >= 1941) {
           return "Golden Era";
       }
       else {
           return "Pre-Golden Era";
       }
    }

    @Override
    public boolean wasReleasedAfter(Media other) {
        if(super.getYear() > other.getYear()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean wasReleasedBeforeOrInSameYear(Media other) {
        if(super.getYear() <= other.getYear()) {
            return true;
        }
        else {
            return false;
        }
    }

}

