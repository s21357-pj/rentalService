package movie.model;

public class Movie {
    private Long id;
    private String name;
    private Category category;
    private Integer imdb_rate;
    private boolean isAvailable;

    public Movie() {

    }

    public enum Category {
        ANIMATED,
        COMEDY,
        FANTASY,
        HISTORICAL,
        HORROR,
        MUSICAL

    }

    public Movie(String name, Category category, Integer imdb_rate) {
        this.name = name;
        this.category = category;
        this.imdb_rate = imdb_rate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getImdb_rate() {
        return imdb_rate;
    }

    public void setImdb_rate(Integer imdb_rate) {
        this.imdb_rate = imdb_rate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
