package pl.pjatk.rentalService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalService.model.Movie;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public Movie getMovies(Long id) {
        return this.restTemplate.getForObject("http://127.0.0.1:8080/movies2/" + id, Movie.class);
    }
    public void returnMovie(Long id) {
        this.restTemplate.put("http://127.0.0.1:8080/movies/setTrueAvailable/" + id, null);
    }
}
