package swagger.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swagger.entity.Movie;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    public Movie findBymovieId(Long movieId);
}
