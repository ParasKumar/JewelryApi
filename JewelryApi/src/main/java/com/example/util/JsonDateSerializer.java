
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
 * Custom JSON Serializer that serializes java.util.Date to json in "mm-dd-yyyy" format.
 * Usage Guide:
 * 
 * @JsonSerialize(using = JsonDateSerializer.class)
 * private Date dateOfBirth;
 * 
 * @author 	Santosh Karna
 * @version 1.0
 * @since
 */
@Component
public class JsonDateSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date date, JsonGenerator gen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = dateFormat.format(date);
		gen.writeString(formattedDate);
	}
}
