
package com.example.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Custom JSON Serializer that serializes java.util.Date to json in "yyyy-mm-dd hh:mm:ss" format.
 * Usage Guide:
 * 
 * @JsonSerialize(using = JsonDateTimeSerializer.class)
 * private Date dateOfBirth;
 * 
 * @author Santosh Karna
 * @version 
 * @since	
 */
@Component
public class JsonDateTimeSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date date, JsonGenerator gen, SerializerProvider provider) throws IOException,
			JsonProcessingException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		String dateTime = dateFormat.format(date);
		gen.writeString(dateTime);
	}
}