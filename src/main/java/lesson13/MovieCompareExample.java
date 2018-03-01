package lesson13;

import java.util.*;

public class MovieCompareExample {
    public static void main(String[] args) {


        List<MovieExample> list = new ArrayList<>();
        list.add(new MovieExample("A film", 2.4));
        list.add(new MovieExample("B film", 2.1));
        list.add(new MovieExample("C film", 3.1));
        Collections.sort(list, new MovieTitlesComparator());
        System.out.println(list);


        Set<MovieExample> moviesSet = new TreeSet<>(); // TreeSet по умолчанию сортирует с помощью метода compareTo
        moviesSet.add(new MovieExample("Z film", 2.4));
        moviesSet.add(new MovieExample("B film", 2.1));
        System.out.println(moviesSet);





        //list.add(...)
//        Collections.sort(list);
//        System.out.println(list);

    }
}
