package lesson13;

public class MovieExample implements Comparable<MovieExample> {//<MovieExample - поставили так как убрали обжект>
    public String title;
    public double score;

    public MovieExample(String title, double score){
        this.title = title;
        this.score = score;
    }

    @Override
    public int compareTo(/*Object o*/MovieExample m){
        //MovieExample m = (MovieExample)o;
        return (score<m.score)?-1:((score==m.score)?0:1);
    }

    @Override
    public String toString() {
        return title + " score: " + score;
    }
}
