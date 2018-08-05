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
 * MovieModelPut
 */
@Validated

public class MovieModelPut   {
  @JsonProperty("movieName")
  private String movieName = null;

  @JsonProperty("actor")
  private String actor = null;

  @JsonProperty("actress")
  private String actress = null;

  @JsonProperty("year")
  private Integer year = null;

  public MovieModelPut movieName(String movieName) {
    this.movieName = movieName;
    return this;
  }

  /**
   * Get movieName
   * @return movieName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public MovieModelPut actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public MovieModelPut actress(String actress) {
    this.actress = actress;
    return this;
  }

  /**
   * Get actress
   * @return actress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getActress() {
    return actress;
  }

  public void setActress(String actress) {
    this.actress = actress;
  }

  public MovieModelPut year(Integer year) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieModelPut movieModelPut = (MovieModelPut) o;
    return Objects.equals(this.movieName, movieModelPut.movieName) &&
        Objects.equals(this.actor, movieModelPut.actor) &&
        Objects.equals(this.actress, movieModelPut.actress) &&
        Objects.equals(this.year, movieModelPut.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieName, actor, actress, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieModelPut {\n");
    
    sb.append("    movieName: ").append(toIndentedString(movieName)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    actress: ").append(toIndentedString(actress)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

