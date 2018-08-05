package swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MovieModelGetInnerRating
 */
@Validated

public class MovieModelGetInnerRating   {
  @JsonProperty("movieRating")
  private Integer movieRating = null;

  @JsonProperty("comment")
  private String comment = null;

  public MovieModelGetInnerRating movieRating(Integer movieRating) {
    this.movieRating = movieRating;
    return this;
  }

  /**
   * Get movieRating
   * @return movieRating
  **/
  @ApiModelProperty(value = "")


  public Integer getMovieRating() {
    return movieRating;
  }

  public void setMovieRating(Integer movieRating) {
    this.movieRating = movieRating;
  }

  public MovieModelGetInnerRating comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieModelGetInnerRating movieModelGetInnerRating = (MovieModelGetInnerRating) o;
    return Objects.equals(this.movieRating, movieModelGetInnerRating.movieRating) &&
        Objects.equals(this.comment, movieModelGetInnerRating.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieRating, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieModelGetInnerRating {\n");
    
    sb.append("    movieRating: ").append(toIndentedString(movieRating)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

