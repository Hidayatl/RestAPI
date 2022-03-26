package com.product.product.products;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            ProductRepository repository){
        return args -> {
           Product chicken = new Product(
                    1L,
                    "Chicken",
                    20000,
                    5,
                    LocalDate.of(2022, Month.JANUARY, 5)
            );
            Product Rice = new Product(
                    1L,
                    "Rice",
                    23000,
                    5,
                    LocalDate.of(2022, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(chicken, Rice)
            );
        };
    }

}
