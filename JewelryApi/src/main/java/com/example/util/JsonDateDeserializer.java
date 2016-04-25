
package com.example.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Custom JSON deserializer that deserializes json to {@link Date} in "mm-dd-yyyy" format.
 * Usage Guide:
 * 
 * @JsonSerialize(using = JsonDateDeserializer.class)
 * private Date dateOfBirth;
 * 
 * @author 	Santosh Karna
 * @version 
 * @since	
 */
public class JsonDateDeserializer extends JsonDeserializer<Date> {

	@Override
	public Date deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return format.parse(jp.getText());
		} catch (ParseException e) {
			throw new RuntimeException();
		}
	}
}