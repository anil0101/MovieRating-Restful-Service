package swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swagger.entity.Movie;
import swagger.model.MovieModelPut;
import swagger.service.repository.MovieRepository;


@Service
public class MovieServicePut {

    @Autowired
    private MovieRepository moviesRepository;

    public void saveMovie(MovieModelPut movieModelPut)
    {
        Movie movie = new Movie();
        movie.setActor(movieModelPut.getActor());
        movie.setActress(movieModelPut.getActress());
        movie.setMovieName(movieModelPut.getMovieName());
        movie.setYear(movieModelPut.getYear());

        moviesRepository.save(movie);
    }
}
