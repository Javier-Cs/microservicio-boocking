package com.booking.MicroserviceBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBookingApplication.class, args);
	}

}
