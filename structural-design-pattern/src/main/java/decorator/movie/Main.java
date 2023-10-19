package decorator.movie;


import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Movie1", "Movie 1 Desc", "Action");
        System.out.println(movie.getMovieInfo());

        Movie movieWithImdb = new MovieImdbDecorator(movie, 7.1);
        System.out.println(movieWithImdb.getMovieInfo());

        Movie movieWithPublishedDate = new MoviePublishedDateDecorator(movieWithImdb, LocalDateTime.now());
        System.out.println(movieWithPublishedDate.getMovieInfo());
    }
}
