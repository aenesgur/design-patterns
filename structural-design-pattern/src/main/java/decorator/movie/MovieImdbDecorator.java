package decorator.movie;

public class MovieImdbDecorator extends Movie{

    private final Movie decoratedMovie;
    private final double imdb;


    public MovieImdbDecorator(Movie decoratedMovie, double imdb) {
        super(decoratedMovie.getName(), decoratedMovie.getMovieInfo(), decoratedMovie.getMovieInfo());
        this.decoratedMovie = decoratedMovie;
        this.imdb = imdb;
    }

    @Override
    public String getMovieInfo() {
        return decoratedMovie.getMovieInfo().concat(" imdb: ").concat(String.valueOf(imdb));
    }
}
