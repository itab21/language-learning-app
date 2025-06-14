package com.learningapp.demo.config;

import com.learningapp.demo.model.Curs;
import com.learningapp.demo.model.Utilizator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Curs curs() {
        return new Curs("Engleza", "Intermediar", null, null);
    }

    @Bean
    public Utilizator utilizator1() {
        return new Utilizator("Alex", 25, "Engleza", 50.0, curs());
    }
}
