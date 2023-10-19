package decorator.movie;

import java.time.LocalDateTime;
import java.util.Date;

public class MoviePublishedDateDecorator extends Movie{
    private final Movie decoratedMovie;
    private final LocalDateTime publishedDate;

    public MoviePublishedDateDecorator(Movie decoratedMovie, LocalDateTime publishedDate) {
        super(decoratedMovie.getName(), decoratedMovie.getDescription(), decoratedMovie.getType());
        this.decoratedMovie = decoratedMovie;
        this.publishedDate = publishedDate;
    }

    @Override
    public String getMovieInfo() {
        return decoratedMovie.getMovieInfo().concat(" published date: ").concat(String.valueOf(publishedDate));
    }
}
