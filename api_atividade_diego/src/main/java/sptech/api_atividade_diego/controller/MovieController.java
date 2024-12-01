package sptech.api_atividade_diego.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import sptech.api_atividade_diego.model.Movie;
import sptech.api_atividade_diego.model.MovieResponse;
import sptech.api_atividade_diego.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;
    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        logger.info("Requisição recebida em GET /api/movies");
        return movieService.getAllMovies();
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        logger.info("Requisição recebida em POST /api/movies para criar o filme: {}", movie.getTitle());
        return movieService.createMovie(movie);
    }
}

