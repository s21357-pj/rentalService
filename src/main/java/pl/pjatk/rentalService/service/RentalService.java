package pl.pjatk.rentalService.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalService.model.Movie;

import static java.lang.String.valueOf;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public Movie getMovies(Long id) {
        return this.restTemplate.getForObject("http://127.0.0.1:8080/movies/" + valueOf(id), Movie.class);
    }
    public ResponseEntity<Void> returnMovie(Long id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        return this.restTemplate.exchange("http://127.0.0.1:8080/movies/setTrueAvailable/" + valueOf(id), HttpMethod.PUT, httpEntity, Void.class);
    }
}
