package com.grupo1.calendariovacinacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CalendarioVacinacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarioVacinacaoApplication.class, args);
	}

}
