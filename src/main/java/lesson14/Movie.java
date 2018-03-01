package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    public String title;
    public double rating;
    public int year;
    public String director;
    public List<String> actors = new ArrayList<>();

    @Override
    public String toString() {
        return "Movie{" + "title='" + title + '\'' + ", rating=" + rating + ", year=" + year + ", director='" + director + '\'' + ", actors=" + actors + '}';
    }
}
