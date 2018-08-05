package swagger.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swagger.entity.Rating;


@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
}
