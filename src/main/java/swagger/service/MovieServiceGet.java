package swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swagger.entity.Movie;
import swagger.entity.Rating;
import swagger.model.MovieModelGet;
import swagger.model.MovieModelGetInner;
import swagger.model.MovieModelGetInnerRating;
import swagger.model.RatingModel;
import swagger.service.repository.MovieRepository;
import swagger.service.repository.RatingRepository;


import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceGet {
    @Autowired
    private MovieRepository moviesRepository;

    @Autowired
    private RatingRepository ratingsRepository;



    public MovieModelGet outputMovieList()
    {
        MovieModelGet listMovieModelGet = new MovieModelGet();
        for(Movie movie: moviesRepository.findAll())
        {
            MovieModelGetInner movieModelGetInner = new MovieModelGetInner();
            movieModelGetInner.setActor(movie.getActor());
            movieModelGetInner.setActress(movie.getActress());
            movieModelGetInner.setMovieName(movie.getMovieName());
            movieModelGetInner.setYear(movie.getYear());

            movieModelGetInner.setAverageRating(averageRating(movie.getMovieId()));

            List<MovieModelGetInnerRating> ratingModelGet=new ArrayList<>();
            for(Rating rating: ratingsRepository.findAll())
            {
                if(rating.getMovie().getMovieId().equals(movie.getMovieId()))
                {
                    MovieModelGetInnerRating ratingModel = new MovieModelGetInnerRating();
                    ratingModel.setComment(rating.getComment());
                    ratingModel.setMovieRating(rating.getMovieRating());
                    ratingModelGet.add(ratingModel);
                }
            }
            movieModelGetInner.setRating(ratingModelGet);
            listMovieModelGet.add(movieModelGetInner);
        }
        return listMovieModelGet;
    }

    public double averageRating(Long movieId)
    {
        double average=0;
        Long count = 0L;
        for(Rating rating:ratingsRepository.findAll())
        {
            if(rating.getMovie().getMovieId().equals(movieId))
            {
                average += rating.getMovieRating();
                count+=1;
            }
        }
        return average/count;
    }
}
