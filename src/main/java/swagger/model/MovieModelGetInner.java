package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import swagger.model.MovieModelGetInnerRating;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MovieModelGetInner
 */
@Validated

public class MovieModelGetInner   {
  @JsonProperty("movieName")
  private String movieName = null;

  @JsonProperty("actor")
  private String actor = null;

  @JsonProperty("actress")
  private String actress = null;

  @JsonProperty("year")
  private Integer year = null;

  @JsonProperty("averageRating")
  private Double averageRating = null;

  @JsonProperty("rating")
  @Valid
  private List<MovieModelGetInnerRating> rating = null;

  public MovieModelGetInner movieName(String movieName) {
    this.movieName = movieName;
    return this;
  }

  /**
   * Get movieName
   * @return movieName
  **/
  @ApiModelProperty(value = "")


  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public MovieModelGetInner actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  **/
  @ApiModelProperty(value = "")


  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public MovieModelGetInner actress(String actress) {
    this.actress = actress;
    return this;
  }

  /**
   * Get actress
   * @return actress
  **/
  @ApiModelProperty(value = "")


  public String getActress() {
    return actress;
  }

  public void setActress(String actress) {
    this.actress = actress;
  }

  public MovieModelGetInner year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")


  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public MovieModelGetInner averageRating(Double averageRating) {
    this.averageRating = averageRating;
    return this;
  }

  /**
   * Get averageRating
   * @return averageRating
  **/
  @ApiModelProperty(value = "")


  public Double getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(Double averageRating) {
    this.averageRating = averageRating;
  }

  public MovieModelGetInner rating(List<MovieModelGetInnerRating> rating) {
    this.rating = rating;
    return this;
  }

  public MovieModelGetInner addRatingItem(MovieModelGetInnerRating ratingItem) {
    if (this.rating == null) {
      this.rating = new ArrayList<MovieModelGetInnerRating>();
    }
    this.rating.add(ratingItem);
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MovieModelGetInnerRating> getRating() {
    return rating;
  }

  public void setRating(List<MovieModelGetInnerRating> rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieModelGetInner movieModelGetInner = (MovieModelGetInner) o;
    return Objects.equals(this.movieName, movieModelGetInner.movieName) &&
        Objects.equals(this.actor, movieModelGetInner.actor) &&
        Objects.equals(this.actress, movieModelGetInner.actress) &&
        Objects.equals(this.year, movieModelGetInner.year) &&
        Objects.equals(this.averageRating, movieModelGetInner.averageRating) &&
        Objects.equals(this.rating, movieModelGetInner.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieName, actor, actress, year, averageRating, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieModelGetInner {\n");
    
    sb.append("    movieName: ").append(toIndentedString(movieName)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    actress: ").append(toIndentedString(actress)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

