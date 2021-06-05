package pl.pjatk.rentalService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rentalService.model.Movie;
import pl.pjatk.rentalService.service.RentalService;

import java.util.Optional;
@RestController
@RequestMapping("/")
public class RentalServiceController {
    private final RentalService rentalService;
    public RentalServiceController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/getMovie/{id}")
    public ResponseEntity<Movie> addMovie(@PathVariable Long id) {
        return new ResponseEntity<Movie>(rentalService.getMovies(id), HttpStatus.OK);
    }
    @GetMapping("/returnMovie/{id}")
    public ResponseEntity<Void> retMovie(@PathVariable Long id) {
        return rentalService.returnMovie(id);
    }
}
