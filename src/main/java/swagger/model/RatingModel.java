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
 * RatingModel
 */
@Validated

public class RatingModel   {
  @JsonProperty("userId")
  private Long userId = null;

  @JsonProperty("movieId")
  private Long movieId = null;

  @JsonProperty("movieRating")
  private Integer movieRating = null;

  @JsonProperty("comment")
  private String comment = null;

  public RatingModel userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public RatingModel movieId(Long movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Get movieId
   * @return movieId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getMovieId() {
    return movieId;
  }

  public void setMovieId(Long movieId) {
    this.movieId = movieId;
  }

  public RatingModel movieRating(Integer movieRating) {
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

  public RatingModel comment(String comment) {
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
    RatingModel ratingModel = (RatingModel) o;
    return Objects.equals(this.userId, ratingModel.userId) &&
        Objects.equals(this.movieId, ratingModel.movieId) &&
        Objects.equals(this.movieRating, ratingModel.movieRating) &&
        Objects.equals(this.comment, ratingModel.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, movieId, movieRating, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingModel {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
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

