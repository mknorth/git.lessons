package lesson13;

import java.util.Comparator;

public class MovieTitlesComparator implements Comparator<MovieExample> {
    @Override
    public int compare(MovieExample o1, MovieExample o2){
        return o1.title.compareTo(o2.title);
    }
}
