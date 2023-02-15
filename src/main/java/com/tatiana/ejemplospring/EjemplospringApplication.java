package com.tatiana.ejemplospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class EjemplospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemplospringApplication.class, args);
	}

}
