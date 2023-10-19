package decorator.movie;

public class Movie {

    private final String name;
    private final String description;
    private final String type;

    public Movie(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getMovieInfo() {
        return "Movie name: ".concat(name).concat(" description: ").concat(description).concat(" type: ").concat(type);
    }
}
