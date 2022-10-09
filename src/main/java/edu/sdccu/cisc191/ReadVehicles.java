package edu.sdccu.cisc191;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class ReadVehicles {

    private static final Logger log = LoggerFactory.getLogger(ReadVehicles.class);

    public static void main(String[] args) {
        SpringApplication.run(ReadVehicles.class);
    }

    @Bean
    @Order(2)
    public CommandLineRunner findAllVehicles(VehicleRepository vehicleRepository) {
        return (args) -> {
            log.info("Vehicles found with findAll()");
            log.info("--------------------");
            for (Vehicle vehicle : vehicleRepository.findAll()) {
                log.info(vehicle.toString());
            }
            log.info("Done");
        };
    }
}