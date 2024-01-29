import java.util.Comparator;

public  class MovieByRatingandProfit implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        int flag = Double.compare(o1.getRating(), o2.getRating());
        if(flag == 0)
            flag = Double.compare(o1.getProfit(), o2.getProfit());
        return flag;
    }
}