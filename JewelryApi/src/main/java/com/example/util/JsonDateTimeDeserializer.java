
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
 * Custom JSON deserializer that deserializes json to {@link Date} in "yyyy-mm-dd hh:mm:ss" format.
 * Usage Guide:
 * 
 * @JsonSerialize(using = JsonDateTimeDeserializer.class)
 * private Date dateOfBirth;
 * 
 * @author 	Santosh Karna
 * @version 
 * @since	
 */
public class JsonDateTimeDeserializer extends JsonDeserializer<Date> {

	/* (non-Javadoc)
	 * @see com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
	 */
	@Override
	public Date deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		try {
			return dateFormat.parse(jp.getText());
		} catch (ParseException e) {
			throw new RuntimeException("Error when deserializing data and time.");
		}
	}
}