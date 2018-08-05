package swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swagger.entity.Rating;
import swagger.model.RatingModel;
import swagger.service.repository.MovieRepository;
import swagger.service.repository.RatingRepository;
import swagger.service.repository.UserRepository;


@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    public void saveRating(RatingModel ratingModel)
    {
        Rating rating = new Rating();
        rating.setMovie(movieRepository.findBymovieId(ratingModel.getMovieId()));
        rating.setUser(userRepository.findByuserId(ratingModel.getUserId()));
        rating.setMovieRating(ratingModel.getMovieRating());
        rating.setComment(ratingModel.getComment());

        ratingRepository.save(rating);
    }
}
