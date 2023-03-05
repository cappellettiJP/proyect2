package com.dhc9pros.proyect1.controller;

import com.dhc9pros.proyect1.model.Country;
import com.dhc9pros.proyect1.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/country" )
public class CountryController {
    private final CountryRepository repository;

    public CountryController( CountryRepository repository ) {
        this.repository = repository;
    }

    @GetMapping
    String hello() {
        return "Hello";
    }

    @PostMapping
    Country create() {
        var country = new Country();
        country.setName( "Argentina" );
        return repository.save( country );
    }
}
