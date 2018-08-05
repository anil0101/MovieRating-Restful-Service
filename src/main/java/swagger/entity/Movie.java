package swagger.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;
    @NotNull
    private String movieName;
    @NotNull
    private String actor;
    @NotNull
    private String actress;
    private int year;


    public Movie() {
    }

    public Movie(@NotNull String movieName, @NotNull String actor, @NotNull String actress, int year) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.year = year;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
