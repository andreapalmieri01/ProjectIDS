package it.unicam.cs.ids.loyalty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class LoyaltyProjectApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(LoyaltyProjectApplication.class, args);

	}

}
