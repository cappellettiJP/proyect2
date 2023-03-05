package com.dhc9pros.proyect1;

import com.dhc9pros.proyect1.model.Country;
import com.dhc9pros.proyect1.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan( "com.dhc9pros.proyect1.model" )
@ComponentScan( "com.dhc9pros.proyect1.repository" )
public class Proyect1Application {

    public static void main( String[] args ) {
        SpringApplication.run( Proyect1Application.class, args );
    }

    @Bean
    CommandLineRunner run( CountryRepository repository ) {
        return args -> {
            var country = new Country();
            country.setName( "Argentina" );
            try {
                repository.save( country );
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        };
    }
}
