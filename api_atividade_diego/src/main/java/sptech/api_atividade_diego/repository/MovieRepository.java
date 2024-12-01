package sptech.api_atividade_diego.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import sptech.api_atividade_diego.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {
}

