import java.util.Arrays;
import java.util.Comparator;

public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;
    private double profit;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public double getProfit() {
        return collectionAmount - budget;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }





    public static void main(String[] args) {
//        MovieByRatingandProfit mByRatingProfit = new MovieByRatingandProfit();
        Movie[] movies = {
                new Movie(2012, 3.5, 70.5, 120.0),
                new Movie(2016, 2.5, 72, 1200.0),
                new Movie(2011, 4.5, 80, 50.0)
        };
        Arrays.sort(movies, new MovieByRatingandProfit());
        for(Movie movie : movies)
            System.out.println(movie.getYearReleased());

//        if(compare(movies[0], movies[1]) == 0) {
//            System.out.println("Same");
//        }
//        else
//            System.out.println("Not same");


    }
}