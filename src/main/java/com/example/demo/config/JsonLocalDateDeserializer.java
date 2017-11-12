package com.example.demo.config;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class JsonLocalDateDeserializer extends JsonDeserializer<LocalDate> {

	@Override
	public LocalDate deserialize(JsonParser jsonParser, 
									DeserializationContext deserializationContext) 
											throws IOException, JsonProcessingException {
		
		String value = jsonParser.getText();
		
		System.out.println("chegou no JsonLocalDateDeserializer com o valor de " + value);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");;
		LocalDate data = LocalDate.parse(value, formatter);

		return data;
	}
	
}
