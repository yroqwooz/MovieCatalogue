package org.example.moviecatalogue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogueController {

    @GetMapping("/hello")
    public String hello() {
        return "Привет!";
    }
}
