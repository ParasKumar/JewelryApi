package com.example.util;

import java.io.Serializable;

/**
 * <<Description Here>>
 * 
 * @author Santosh
 * @version
 * @since
 */
public class IdJsonUtil implements Serializable {
	private static final long serialVersionUID = 3534117387103503996L;

	private Long id;

	public IdJsonUtil(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
