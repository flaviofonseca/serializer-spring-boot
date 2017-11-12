package com.example.demo.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Configuration
public class ObjectMapperConfiguration {

	@Bean
	public ObjectMapper objectMapper() {

		SimpleModule simpleModule = new SimpleModule();

		//simpleModule.addSerializer(LocalDate.class, new JsonLocalDateSerializer());
		simpleModule.addDeserializer(LocalDate.class, new JsonLocalDateDeserializer());

		return new ObjectMapper().registerModules(simpleModule);
	}
}
