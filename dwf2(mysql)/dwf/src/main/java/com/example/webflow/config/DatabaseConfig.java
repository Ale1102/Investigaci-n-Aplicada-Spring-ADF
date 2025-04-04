package com.example.webflow.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;

@Configuration
public class DatabaseConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public CommandLineRunner testDatabaseConnection() {
        return args -> {
            System.out.println("Probando conexión a la base de datos...");
            try (Connection connection = dataSource.getConnection()) {
                System.out.println("¡Conexión a la base de datos exitosa!");
                System.out.println("Conectado a: " + connection.getMetaData().getURL());
                System.out.println("Base de datos: " + connection.getCatalog());
            } catch (Exception e) {
                System.err.println("¡Falló la conexión a la base de datos!");
                e.printStackTrace();
            }
        };
    }
}