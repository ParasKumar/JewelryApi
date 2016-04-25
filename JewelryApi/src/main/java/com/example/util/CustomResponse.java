package com.example.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * 
 * @author Santosh Karna
 * @version
 * @since
 */
public class CustomResponse {
	public static ResponseEntity<Object> responseBuilder(Object obj,
			ResponseStatus res) {

		HttpStatus status = HttpStatus.OK;
		switch (res) {
		case CREATED:
			status = HttpStatus.CREATED;
			break;
		case READ:
			status = HttpStatus.OK;
			break;
		case UPDATED:
			status = HttpStatus.NO_CONTENT;
			break;
		case DELETED:
			status = HttpStatus.NO_CONTENT;
			break;
		default:
			status = HttpStatus.OK;
			break;
		}
		if (null != obj) {
			return new ResponseEntity<Object>(obj, status);
		}
		return new ResponseEntity<Object>(status);

	}

	public static enum ResponseStatus {
		CREATED, READ, UPDATED, DELETED;
	}

}
