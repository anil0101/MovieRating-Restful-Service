package swagger.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;
    @NotNull
    private int movieRating;
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;

    public Rating() {
    }

    public Rating(@NotNull int movieRating, String comment, Movie movie, User user) {
        this.movieRating = movieRating;
        this.comment = comment;
        this.movie = movie;
        this.user = user;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public String getComment() {
        return comment;
    }

    public Movie getMovie() {
        return movie;
    }

    public User getUser() {
        return user;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
