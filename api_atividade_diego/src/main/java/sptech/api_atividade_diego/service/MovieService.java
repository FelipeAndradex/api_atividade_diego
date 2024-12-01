package sptech.api_atividade_diego.service;

import org.springframework.stereotype.Service;
import sptech.api_atividade_diego.model.Movie;
import sptech.api_atividade_diego.model.MovieResponse;
import sptech.api_atividade_diego.repository.MovieRepository;

import java.util.List;


@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}

