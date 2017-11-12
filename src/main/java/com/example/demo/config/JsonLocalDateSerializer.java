package com.example.demo.config;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonLocalDateSerializer extends JsonSerializer<LocalDate> {

	@Override
	public void serialize(LocalDate date, 
							JsonGenerator gen, 
							SerializerProvider provider)
							throws IOException, JsonProcessingException {

		System.out.println("chegou no JsonLocalDateSerializer com o valor de " + date);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		gen.writeString(date.format(formatter));
	}
}
