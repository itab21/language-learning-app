package com.learningapp.demo;

import com.learningapp.demo.model.Utilizator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Utilizator utilizator = context.getBean("utilizator1", Utilizator.class);
		System.out.println(utilizator);
		System.out.println("✅ Aplicația de învățare a limbilor străine a pornit!");
	}
}
