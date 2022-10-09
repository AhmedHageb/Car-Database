package edu.sdccu.cisc191;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class InsertVehicles {

    private static final Logger log = LoggerFactory.getLogger(InsertVehicles.class);

    public static void main(String[] args) {
        SpringApplication.run(InsertVehicles.class);
    }


    @Bean
    @Order(1)
    public CommandLineRunner demo(VehicleRepository repository)  {
        return (args) -> {
            Option[] option1 = { new Option("MoonRoof")};
            Option[] option2 = { new Option("Leather")};
            repository.save(new Vehicle("GMC", 80000, 7995, 4, option2));
            repository.save(new Vehicle("BMW", 90000, 20999, 4, option1));
            repository.save(new Vehicle("Toyota", 65090, 10995, 2, option1));
        };
    }
}